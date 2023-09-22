package com.aasctc.template_rules;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LabelTranslator {
    private Connection connection;
    
    private static final String dbFilePath = "data/database.db";
    private static final String jsonFilePath = "data/entities.json";

    private static final int bufferSize = 100000;
    
    public LabelTranslator() {
        try {
            // Check if the database file exists
            File dbFile = new File(dbFilePath);

            if (!dbFile.exists()) {
                // If the database file doesn't exist, create it
                connection = DriverManager.getConnection("jdbc:sqlite:" + dbFilePath);
                initializeDatabase();
            } else {
                // If the database file exists, connect to it
                connection = DriverManager.getConnection("jdbc:sqlite:" + dbFilePath);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void initializeDatabase() {
        try {
            // Create a table to store label mappings
            String createTableSQL = "CREATE TABLE IF NOT EXISTS label_mapping (structured_label TEXT, english_label TEXT)";
            connection.createStatement().executeUpdate(createTableSQL);
            populateDatabaseFromJson(jsonFilePath);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void insertLabelMappings(List<String> structuredLabels, List<String> englishLabels) {
        try {
            // Define a maximum SQL string length of 1,000,000 bytes
            int maxSqlLength = 1000000;
            
            // Create the INSERT SQL statement with multiple value lists
            StringBuilder insertSQL = new StringBuilder();
            insertSQL.append("INSERT INTO label_mapping (structured_label, english_label) VALUES");
            
            int totalSqlLength = insertSQL.length();

            // Loop through label mappings and add value lists to the SQL statement
            for (int i = 0; i < structuredLabels.size(); i++) {
                String structuredLabel = structuredLabels.get(i);
                String englishLabel = englishLabels.get(i).replace("'", "''");
                
                // Calculate the length of the current SQL fragment
                int fragmentLength = structuredLabel.length() + englishLabel.length() + 16; // Assuming each value list has additional characters
                
                // Check if adding the current fragment exceeds the maximum SQL string length
                if (totalSqlLength + fragmentLength >= maxSqlLength) {
                    // Remove the trailing comma
                    insertSQL.setLength(insertSQL.length() - 1);
                    
                    // Execute the current batch insert
                    try (Statement statement = connection.createStatement()) {
                        statement.executeUpdate(insertSQL.toString());
                    }

                    // Reset the SQL statement and total length
                    insertSQL.setLength(0);
                    insertSQL.append("INSERT INTO label_mapping (structured_label, english_label) VALUES");
                    totalSqlLength = insertSQL.length();
                }

                // Append the current value list to the SQL statement
                insertSQL.append(" ('").append(structuredLabel).append("', '").append(englishLabel).append("'),");
                totalSqlLength += fragmentLength;
            }

            // Check if there are remaining records to insert
            if (insertSQL.length() > "INSERT INTO label_mapping (structured_label, english_label) VALUES".length()) {
                // Remove the trailing comma
                insertSQL.setLength(insertSQL.length() - 1);
                
                // Execute the final batch insert
                try (Statement statement = connection.createStatement()) {
                    statement.executeUpdate(insertSQL.toString());
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void populateDatabaseFromJson(String jsonFilePath) {
        try {
            // Create a JSON parser
            JsonFactory factory = new JsonFactory();
            ObjectMapper mapper = new ObjectMapper();
            
            List<String> structuredLabels = new ArrayList<>();
            List<String> englishLabels = new ArrayList<>();
            
            try (JsonParser parser = factory.createParser(new File(jsonFilePath))) {
                // Initialize the parser
                int elementCount = 0;
                
                parser.nextToken(); // skip opening array
                
                while (parser.nextToken() != JsonToken.END_ARRAY) {
                    // Read each object in the array
                    String structuredLabel = null;
                    String englishLabel = null;

                    while (parser.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = parser.getCurrentName();
                        parser.nextToken(); // Move to the value

                        // Read values based on field names
                        if (structuredLabel == null) {
                            structuredLabel = fieldName; // Use the field name as the structured label
                        }
                        englishLabel = parser.getValueAsString();
                    }

                    // Add labels to the lists
                    structuredLabels.add(structuredLabel);
                    englishLabels.add(englishLabel);
                    
                    elementCount++;
                    
                    // Check if the maximum cache size is reached, and insert into the database
                    if (elementCount >= LabelTranslator.bufferSize) {
                        insertLabelMappings(structuredLabels, englishLabels);
                        
                        // Clear the lists and reset the count
                        structuredLabels.clear();
                        englishLabels.clear();
                        elementCount = 0;
                    }
                }
            }
            
            // Insert any remaining labels into the database
            if (!structuredLabels.isEmpty()) {
                insertLabelMappings(structuredLabels, englishLabels);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Other methods for label translation and database operations as needed

    public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
