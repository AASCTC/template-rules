package com.aasctc.template_rules;

import org.apache.commons.cli.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class TemplateRules {

    private static final String DIRBASE = "src/test/resources/";

    private static final Logger logger = LogManager.getLogger(TemplateRules.class);

    private static void printHelp(Options options) {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java -jar TemplateInterpreter.jar [options]", options);
    }

    private static void printVersion() {
        String version = "1.0.0"; // Replace with your application's version
        System.out.println("TemplateInterpreter version " + version);
    }
    
    public static void main(String[] args) throws IOException, SQLException {
        // Create the command-line options
        Options options = new Options();
        options.addOption("h", "help", false, "Print the help message");
        options.addOption("v", "version", false, "Print the version information");
        options.addOption("",  "index", true, "Populate the cross-domain files into the Lucene index");
        options.addOption("", "preprocess", false, "Preprocess each XMLNS type into an SQLite database (pre-index)");

        // Create the command-line parser
        CommandLineParser cliParser = new DefaultParser();

        // Parse the command-line arguments
        CommandLine cmd;
		try {
			cmd = cliParser.parse(options, args);
		} catch (ParseException e) {
			logger.warn("Failed to parse arguments, defaulting to starting Spring Boot Application server");
			TemplateRulesWebServer.main(args);
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
        
        else if (cmd.hasOption("index")) {
        	String rulesFilePath = cmd.getOptionValue("index");
        	
        	CharStream in = CharStreams.fromFileName(DIRBASE + rulesFilePath);
            TemplateRulesLexer lexer = new TemplateRulesLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TemplateRulesParser parser = new TemplateRulesParser(tokens);
            TemplateRulesParser.CompilationUnitContext tree = parser.compilationUnit();
            TemplateRulesCustomVisitor visitor = new TemplateRulesCustomVisitor();
            visitor.visit(tree);
            
            List<String> fileFolderList = visitor.getFiles();
            Indexer indexer = new Indexer();
            indexer.indexXMLDocuments(fileFolderList);
        }
        
        else if (cmd.hasOption("preprocess")) {
        	logger.info("Please wait while the database is initialized...");
        	new LabelTranslator();
        	logger.info("Database initialization complete.");
        	return;
        }
        
        else {
        	logger.info("Starting the Spring Boot Application");
        	TemplateRulesWebServer.main(args);
        }
        	
        //  List<String> fileFolderList = new ArrayList<String>();
        //  fileFolderList.add(System.getProperty("user.dir") + "/input");
        //  Indexer indexer = new Indexer();
        //  indexer.indexXMLDocuments(fileFolderList);
    }
}
