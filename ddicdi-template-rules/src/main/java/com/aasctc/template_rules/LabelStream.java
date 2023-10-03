package com.aasctc.template_rules;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * For processing the downloaded labels of Wikidata.
 */
public class LabelStream {

	private String inputFilePath;
	private String outputFilePath;
	
	private boolean first;

	public LabelStream(String inputFilePath, String outputFilePath) {
		this.inputFilePath = inputFilePath;
		this.outputFilePath = outputFilePath;
		first = false;
	}

	public void stream() {
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			// Create a BufferedWriter for the output file
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

			writer.write("[");

			// Read the JSON file line by line
			Files.lines(Paths.get(inputFilePath), StandardCharsets.UTF_8).forEach(line -> {
				try {
					JsonNode jsonNode = objectMapper.readTree(line);

					// Check if the data is an entity with a non-blank English title
					if (jsonNode.has("id") && jsonNode.has("labels") && jsonNode.get("labels").has("en")) {
						String title = jsonNode.get("labels").get("en").get("value").asText();
						if (!title.trim().isEmpty()) {
							JsonNode entity = objectMapper.createObjectNode().put(jsonNode.get("id").asText(), title);

							if (this.first) {
								writer.write("\n" + objectMapper.writeValueAsString(entity));
								this.first = false;
							} else {
								writer.write(",\n" + objectMapper.writeValueAsString(entity));
							}
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			});

			writer.write("\n]");
			writer.close();

			System.out.println("Processing complete.");
			System.out.println("Output file created: " + outputFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
