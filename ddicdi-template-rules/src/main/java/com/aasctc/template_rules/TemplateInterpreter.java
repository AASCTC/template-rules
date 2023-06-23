package com.aasctc.template_rules;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.sf.saxon.TransformerFactoryImpl;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

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
