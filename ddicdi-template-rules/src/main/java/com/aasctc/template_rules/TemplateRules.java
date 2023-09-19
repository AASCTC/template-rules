package com.aasctc.template_rules;

import org.apache.commons.cli.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class TemplateRules {

    private static final String EXTENSION = "lang";
    private static final String DIRBASE = "src/test/resources/";

    private static final Logger logger = LogManager.getLogger(TemplateRules.class);
    
    private static Optional<String> outputFilePath;

    private static void printHelp(Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -jar TemplateInterpreter.jar [options]", options);
    }

    private static void printVersion() {
        String version = "1.0.0"; // Replace with your application's version
        System.out.println("TemplateInterpreter version " + version);
    }
    
    public static void main(String[] args) throws IOException {
        // Create the command-line options
        Options options = new Options();
        options.addOption("h", "help", false, "Print the help message");
        options.addOption("v", "version", false, "Print the version information");
        options.addOption("r", "rules", true, "Input template rules file");
        options.addOption("o", "output", true, "Output XML file path");
        options.addOption("s", "server", false, "Start the Spring Boot server");

        // Create the command-line parser
        CommandLineParser cliParser = new DefaultParser();

        // Parse the command-line arguments
        CommandLine cmd;
		try {
			cmd = cliParser.parse(options, args);
		} catch (ParseException e) {
			logger.error("Failed to parse arguments");
			e.printStackTrace();
			return;
		}

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

        else if (!cmd.hasOption("r")) {
        	logger.error("--rules is required but not specified.");
        	printHelp(options);
        	return;
        }
            
        // Get the file paths
        List<String> inputFilesPath = cmd.getArgList();
        try {
        	outputFilePath = Optional.of(cmd.getOptionValue("o"));
        }
        catch (NullPointerException e) {
        	outputFilePath = Optional.empty();
        }
        String rulesFilePath = cmd.getOptionValue("r");
	
        System.out.println("Dirbase: " + DIRBASE);

        CharStream in = CharStreams.fromFileName(DIRBASE + rulesFilePath);
        TemplateRulesLexer lexer = new TemplateRulesLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TemplateRulesParser parser = new TemplateRulesParser(tokens);
        TemplateRulesParser.CompilationUnitContext tree = parser.compilationUnit();
        TemplateRulesCustomVisitor visitor = new TemplateRulesCustomVisitor();
        visitor.visit(tree);
    }
}
