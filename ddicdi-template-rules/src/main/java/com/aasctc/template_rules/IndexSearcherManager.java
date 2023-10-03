package com.aasctc.template_rules;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class IndexSearcherManager {
    private Directory indexDirectory;
    private IndexReader indexReader;
    private IndexSearcher indexSearcher;
    private QueryParser queryParser;

    public IndexSearcherManager() throws IOException {
        indexDirectory = FSDirectory.open(Paths.get("data/lucene").toAbsolutePath());
        indexReader = DirectoryReader.open(indexDirectory);
        indexSearcher = new IndexSearcher(indexReader);

        // Use MultiFieldQueryParser to search multiple fields (e.g., "content" and "label")
        queryParser = new MultiFieldQueryParser(new String[]{"content", "label"}, new StandardAnalyzer());	
    }

    public IndexSearcherManager(String indexPath) throws IOException {
        indexDirectory = FSDirectory.open(Paths.get(indexPath));
        indexReader = DirectoryReader.open(indexDirectory);
        indexSearcher = new IndexSearcher(indexReader);

        // Use MultiFieldQueryParser to search multiple fields (e.g., "content" and "label")
        queryParser = new MultiFieldQueryParser(new String[]{"content", "label"}, new StandardAnalyzer());
    }

    public List<ResultSet> searchByQuery(String queryText) throws ParseException, IOException {
        List<ResultSet> results = new ArrayList<>();

        // Create a query to search for the query text in multiple fields
        Query query = queryParser.parse(queryText);

        // Perform the search and retrieve the top matching documents
        TopDocs topDocs = indexSearcher.search(query, 10); // Limit to the top 10 results
        for (ScoreDoc scoreDoc : topDocs.scoreDocs) {
            int docId = scoreDoc.doc;
            Document document = indexReader.document(docId);
            ResultSet result = new ResultSet();
            result.setContent(document.get("content"));
            result.setFilename(document.get("filename"));
            results.add(result);
        }

        return results;
    }

    public void close() throws IOException {
        indexReader.close();
        indexDirectory.close();
    }
}
