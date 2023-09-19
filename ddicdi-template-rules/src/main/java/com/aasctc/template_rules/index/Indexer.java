package com.aasctc.template_rules.index;

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
import java.util.List;

public class Indexer {
	/**
	 * 
	 * @param indexFilesFolders A list of files to index, or folders
	 * containing files to index, or both.
	 */
    public static void indexXMLDocuments(List<String> indexFilesFolders) {
    	Path rootPath = Paths.get(System.getProperty("user.dir"));
        for (String indexFileFolder: indexFilesFolders) {
        	Path indexPath = Paths.get(indexFileFolder);
        	if (!indexPath.normalize().startsWith(rootPath.normalize())) {
        		throw new SecurityException("Input files must be inside the current working directory.;");
        	}
        	
            try {
                Directory directory = FSDirectory.open(indexPath);
                StandardAnalyzer analyzer = new StandardAnalyzer();
                IndexWriterConfig config = new IndexWriterConfig(analyzer);
                IndexWriter indexWriter = new IndexWriter(directory, config);

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

                            // Create a Lucene document and add it to the index
                            Document luceneDoc = new Document();
                            luceneDoc.add(new TextField("content", content, Field.Store.YES));
                            luceneDoc.add(new StringField("filename", file.getFileName().toString(), Field.Store.YES));
                            luceneDoc.add(new StringField("label", label, Field.Store.YES));
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
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
