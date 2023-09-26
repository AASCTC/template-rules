package com.aasctc.template_rules;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Indexer {
	
    private static final String DATABASE_URL = "jdbc:sqlite:data/database.db";
    Connection databaseConnection;
    
    public Indexer() throws SQLException {
    	databaseConnection = getConnection();
    }
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL);
    }
    
    
	/**
	 * 
	 * @param indexFilesFolders A list of files to index, or folders
	 * containing files to index, or both.
	 */
    public void indexXMLDocuments(List<String> indexFilesFolders) {
    	Path rootPath = Paths.get(System.getProperty("user.dir"));

        try {
            Directory directory = FSDirectory.open(Paths.get("data/lucene"));
            StandardAnalyzer analyzer = new StandardAnalyzer();
            IndexWriterConfig config = new IndexWriterConfig(analyzer);
            IndexWriter indexWriter = new IndexWriter(directory, config);

            for (String indexFileFolder: indexFilesFolders) {
	        	Path indexPath = Paths.get(indexFileFolder);
	        	if (!indexPath.normalize().startsWith(rootPath.normalize())) {
	        		throw new SecurityException("Input files must be inside the current working directory.");
	        	}

                // Check if indexPath is a directory
                if (Files.isDirectory(indexPath)) {
                    // If it's a directory, open all XML files in it
                    try (DirectoryStream<Path> stream = Files.newDirectoryStream(indexPath, "*.xml")) {
                        for (Path file : stream) {
                            // Read the content of the XML file
                            String content = new String(Files.readAllBytes(file));

                            // Parse the XML file to extract the label (templaterules-keyword)
                            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                            org.w3c.dom.Document xmlDoc = dBuilder.parse(file.toFile());
                            String label = xmlDoc.getDocumentElement().getAttribute("templaterules-keyword");

                            // Retrieve the English keyword from the SQLite database based on the label
                            String englishKeyword = getEnglishKeywordFromDatabase(label);

                            // Create a Lucene document and add it to the index
                            Document luceneDoc = new Document();
                            luceneDoc.add(new TextField("content", content, Field.Store.YES));
                            luceneDoc.add(new StringField("filename", file.getFileName().toString(), Field.Store.YES));
                            luceneDoc.add(new StringField("label", label, Field.Store.YES));
                            if (englishKeyword != null && !englishKeyword.isEmpty()) {
                            	luceneDoc.add(new StringField("en_keyword", englishKeyword, Field.Store.YES));
                            }
                            indexWriter.addDocument(luceneDoc);
                        }
                    }
                } else {
                    // If it's a file, proceed as usual
                    // Read the content of the file
                    String content = new String(Files.readAllBytes(indexPath));

                    // Create a Lucene document and add it to the index
                    Document luceneDoc = new Document();
                    luceneDoc.add(new TextField("content", content, Field.Store.YES));
                    indexWriter.addDocument(luceneDoc);
                }

                // Close the index writer
                indexWriter.close();

                System.out.println("Indexing complete.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private String getEnglishKeywordFromDatabase(String label) {
    	try {
    		label = label.substring(3); // remove wd: prefix
    	}
    	catch (StringIndexOutOfBoundsException e) {
    		return ""; // There's no index at all
    	}
        try {
            String sql = "SELECT english_label FROM label_mapping WHERE structured_label = ? LIMIT 1";
            try (PreparedStatement statement = databaseConnection.prepareStatement(sql)) {
                statement.setString(1, label);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getString("english_label");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; // Handle the case where the label doesn't have an associated English keyword
    }
}
