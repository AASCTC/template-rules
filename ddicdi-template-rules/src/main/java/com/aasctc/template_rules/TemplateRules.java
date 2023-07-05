
package com.aasctc.template_rules;

import org.apache.commons.cli.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.springframework.boot.SpringApplication;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import net.sf.saxon.TransformerFactoryImpl;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.nio.charset.StandardCharsets;

import java.util.ArrayList;
import java.util.List;

public class TemplateRules {

    private static final Logger logger = LogManager.getLogger(TemplateRules.class);

    private static StringBuffer processFileContents(File inputFile) throws IOException {
    	try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
			StringBuffer content = new StringBuffer();
			String line;
			while ((line = reader.readLine()) != null) {
			    content.append(line).append(System.lineSeparator());
			}
			return content;
		}
    }
    
    public static void main(String[] args) {
        // Initialize Log4j with the configuration file
        Configurator.initialize(null, "log4j2.xml");

        // Create the command-line options
        Options options = new Options();
        options.addOption("h", "help", false, "Print the help message");
        options.addOption("v", "version", false, "Print the version information");
        options.addOption("r", "rules", true, "Input template rules file");
        options.addOption("i", "input", true, "Input XML file, or directory path containing input XML files");
        options.addOption("o", "output", true, "Output XML file path");
        options.addOption("s", "server", false, "Start the Spring Boot server");

        // Create the command-line parser
        CommandLineParser parser = new DefaultParser();

        try {
            // Parse the command-line arguments
            CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("h")) {
                // Print the help message and exit
                printHelp(options);
                return;
            }

            if (cmd.hasOption("v")) {
                // Print the version information and exit
                printVersion();
                return;
            }

            // Check if the required options are provided
            if (!(cmd.hasOption("s") ^
            		(cmd.hasOption("i") &&
            		 cmd.hasOption("o") &&
            		 cmd.hasOption("r")))) {
                logger.error("You must either specify --server, or --input, --output, and --rules");
                printHelp(options);
                return;
            }
            
         // Check if the server option is present
            if (cmd.hasOption("server")) {
                // Start the Spring Boot server
                SpringApplication.run(TemplateRulesServer.class, args);
            }
            else {
	            // Get the file paths
	            String inputFilePath = cmd.getOptionValue("i");
	            String outputFilePath = cmd.getOptionValue("o");
	            String rulesFilePath = cmd.getOptionValue("r");
	
	            List<StringBuffer> fileContents = new ArrayList<>();
	            StringBuffer rulesContents = new StringBuffer();
	            
	            if (cmd.hasOption("input")) {
	                String inputDirectory = cmd.getOptionValue("input");
	                File directory = new File(inputDirectory);
	                
	                if (directory.isDirectory()) {
	                    File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".xml"));
	                    if (files != null) {
	                        for (File file : files) {
	                            try {
	                                fileContents.add(TemplateRules.processFileContents(file));
	                            } catch (IOException e) {
	                            	logger.error("Error reading input XML: {}", e.getMessage());
	                            }
	                        }
	
	                    }
	                } else {
	                    try {
	                        fileContents.add(TemplateRules.processFileContents(new File(inputFilePath)));
	                    } catch (IOException e) {
	                    	logger.error("Error reading input XML: {}", e.getMessage());
	                    }
	                }
	            }
	            
	
	            try {
	                rulesContents = TemplateRules.processFileContents(new File(rulesFilePath));
	            } catch (IOException e) {
	            	logger.error("Error reading input XML: {}", e.getMessage());
	            }
	
	            // Interpret the input XML and transform it to XSLT
	            String xslt = interpretInput(inputFilePath);
	
	            // Transform the XML documents using SAXON
	            transformXML(inputFilePath, outputFilePath, xslt);
	
	            logger.info("XML transformation completed successfully");
            }
        } catch (ParseException e) {
            logger.error("Error parsing command-line arguments: {}", e.getMessage());
            printHelp(options);
        } catch (IOException e) {
            logger.error("Error reading or writing files: {}", e.getMessage());
        } catch (TemplateException e) {
            logger.error("Error interpreting input XML: {}", e.getMessage());
        } catch (TransformerException e) {
            logger.error("Error transforming XML: {}", e.getMessage());
        }
    }

    private static void printHelp(Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -jar TemplateInterpreter.jar [options]", options);
    }

    private static void printVersion() {
        String version = "1.0.0"; // Replace with your application's version
        System.out.println("TemplateInterpreter version " + version);
    }

    private static String interpretInput(String inputFilePath) throws IOException, TemplateException {
        // Read the input XML file
        String inputXml = readFile(inputFilePath);

        // TODO: Implement the interpretation logic
        // ...

        // For demonstration purposes, let's assume the interpretation results in an XSLT string
        String xslt = "<xsl:stylesheet version=\"2.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n" +
                "    <xsl:template match=\"/\">\n" +
                "        <output>\n" +
                "            <xsl:apply-templates/>\n" +
                "        </output>\n" +
                "    </xsl:template>\n" +
                "    <xsl:template match=\"node()\">\n" +
                "        <xsl:copy>\n" +
                "            <xsl:apply-templates select=\"node()\"/>\n" +
                "        </xsl:copy>\n" +
                "    </xsl:template>\n" +
                "</xsl:stylesheet>";

        return xslt;
    }

    private static void transformXML(String inputFilePath, String outputFilePath, String xslt) throws TransformerException, IOException {
        // Create the transformer
        TransformerFactory transformerFactory = new TransformerFactoryImpl();
        Transformer transformer = transformerFactory.newTransformer(new StreamSource(new StringReader(xslt)));

        // Set up the input source and result
        Source inputSource = new StreamSource(new File(inputFilePath));
        Result outputResult = new StreamResult(new FileWriter(outputFilePath));

        // Perform the XML transformation
        transformer.transform(inputSource, outputResult);
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8));

            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    logger.warn("Error closing file: {}", e.getMessage());
                }
            }
        }

        return content.toString();
    }
}
