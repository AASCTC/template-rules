package com.aasctc.template_rules;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.aasctc.template_rules.antlr.TemplateRulesLexer;
import com.aasctc.template_rules.antlr.TemplateRulesParser;
import com.aasctc.template_rules.antlr.TemplateRulesParser.*;

import net.sf.saxon.TransformerFactoryImpl;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.List;

public class TemplateInterpreter {

    private static final Logger logger = LogManager.getLogger(TemplateInterpreter.class);

    public void interpretAndTransform(String inputFilePath, String outputFilePath) throws TemplateException {
        try {
            // Interpret the input XML and transform it to XSLT
            String xslt = interpretInput(inputFilePath);

            // Transform the XML documents using SAXON
            transformXML(inputFilePath, outputFilePath, xslt);

        } catch (IOException e) {
            logger.error("Error reading the input XML file: {}", e.getMessage());
            throw new TemplateException("Failed to read the input XML file");
        } catch (TransformerException e) {
            logger.error("Error transforming XML using XSLT: {}", e.getMessage());
            throw new TemplateException("Failed to transform XML using XSLT");
        }
    }
    
    public void interpretTemplateRules(StringBuffer grammarContent) throws IOException {
        // Create an ANTLR input stream from the grammar content
        CharStream input = CharStreams.fromString(grammarContent.toString());

        // Create a lexer using the input stream
        TemplateRulesLexer lexer = new TemplateRulesLexer(input);

        // Create a token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser using the token stream
        TemplateRulesParser parser = new TemplateRulesParser(tokens);

        // Invoke the parser starting from the root rule
        TemplateRulesDocumentContext tree = parser.templateRulesDocument();

        // Implement your interpretation logic based on the parsed parse tree
        // ...
        // TODO Your interpretation logic goes here
        HeaderContext header = tree.header();
        TemplatesContext template = tree.templates();
        RulesContext rules = tree.rules();
        
        HeaderFieldsContext headerFields = header.headerFields();
        HeaderNameContext headerName = headerFields.headerName();
        HeaderAuthorListContext headerAuthorList = headerFields.headerAuthorList();
        HeaderDateContext headerDate = headerFields.headerDate();
        HeaderDescriptionContext headerDescription = headerFields.headerDescription();
        List<NamespaceContext> x = template.namespaces().get(0).namespace();
        // TODO finish this
    }
    private String interpretInput(String inputFilePath) throws IOException, TemplateException {
        String inputXml = readFile(inputFilePath);

        // TODO: Implement the logic to interpret the input XML and generate XSLT
        // For now, let's use a sample XSLT
        String xslt = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<xsl:stylesheet version=\"2.0\" xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\">\n" +
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

    private void transformXML(String inputFilePath, String outputFilePath, String xslt)
            throws TransformerException, IOException {

        // Create the transformer
        TransformerFactory transformerFactory = new TransformerFactoryImpl();
        Transformer transformer = transformerFactory.newTransformer(new StreamSource(new StringReader(xslt)));

        // Set up the input source and result
        Source inputSource = new StreamSource(new File(inputFilePath));
        Result outputResult = new StreamResult(new FileWriter(outputFilePath));

        // Perform the XML transformation
        transformer.transform(inputSource, outputResult);
    }

    private String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));

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
