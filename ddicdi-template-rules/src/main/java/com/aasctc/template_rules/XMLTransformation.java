package com.aasctc.template_rules;

import org.apache.commons.cli.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import java.io.IOException;

public class TemplateInterpreterMain {

    private static final Logger logger = LogManager.getLogger(TemplateInterpreterMain.class);

    public static void main(String[] args) {
        // Initialize Log4j with the configuration file
        Configurator.initialize(null, "log4j2.xml");

        // Create the command-line options
        Options options = new Options();
        options.addOption("h", "help", false, "Print the help message");
        options.addOption("v", "version", false, "Print the version information");
        options.addOption("i", "input", true, "Input XML file path");
        options.addOption("o", "output", true, "Output XML file path");

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

            // Check if the input and output options are provided
            if (!cmd.hasOption("i") || !cmd.hasOption("o")) {
                logger.error("Input and output options are required");
                printHelp(options);
                return;
            }

            // Get the input and output file paths
            String inputFilePath = cmd.getOptionValue("i");
            String outputFilePath = cmd.getOptionValue("o");

            // Run the XML transformation
            TemplateInterpreter.transform(inputFilePath, outputFilePath);

            logger.info("XML transformation completed successfully");

        } catch (ParseException e) {
            logger.error("Error parsing command-line arguments: {}", e.getMessage());
            printHelp(options);
        } catch (IOException e) {
            logger.error("Error reading or writing files: {}", e.getMessage());
        } catch (TemplateInterpretationException e) {
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
}
