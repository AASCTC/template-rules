package com.aasctc.template_rules.methods;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.javatuples.Pair;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.aasctc.template_rules.antlr.TemplateRulesParser.MethodProgramContext;
import com.aasctc.template_rules.Namespace;
import com.aasctc.template_rules.Type;

public class XMLMethodProgram extends MethodProgram {
    public XMLMethodProgram(MethodProgramContext context, List<Namespace> namespaces,
			List<VolatileVariable> parameters, VolatileVariable input) {
		super(context, namespaces, parameters, input);
	}

	private static String convertXmlToString(Document doc) {
        DOMSource domSource = new DOMSource(doc);
        StringWriter writer = new StringWriter();
        StreamResult result = new StreamResult(writer);
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = null;
        try {
            transformer = tf.newTransformer();
            transformer.transform(domSource, result);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
        return writer.toString();
    }

    private static Document convertStringToXml(String xmlString) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {

            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            DocumentBuilder builder = dbf.newDocumentBuilder();

            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));

            return doc;

        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }
    }

	public static VolatileVariable function_index(
			VolatileVariable op,
			VolatileVariable op2) throws IllegalArgumentException {

		if (!MethodProgram.isIntegerNumber(op2.getValue0())) {
			throw new IllegalArgumentException("Second argument must be an integer");
		}
		try {
			Document doc1 = XMLMethodProgram.convertStringToXml(op.getValue1());
			int index = Integer.parseInt(op2.getValue1());
			// We should not be doing this. We have to consider this as XML and
			// extract the first node.
			doc1.getChildNodes().item(index);
			String result = XMLMethodProgram.convertXmlToString(doc1);
			return new VolatileVariable(op.getValue0(), result);
		}
		catch(RuntimeException e) {
			throw new IllegalArgumentException("Failed to parse XML");
		}
	}

	public static VolatileVariable function_delete(
			VolatileVariable op,
			VolatileVariable op2) throws IllegalArgumentException {

		if (!MethodProgram.isIntegerNumber(op2.getValue0())) {
			throw new IllegalArgumentException("Second argument must be an integer");
		}
		try {
			Document doc1 = XMLMethodProgram.convertStringToXml(op.getValue1());
			int index = Integer.parseInt(op2.getValue1());
			// We should not be doing this. We have to consider this as XML and
			// extract the first node.
			doc1.removeChild(doc1.getChildNodes().item(index));
			String result = XMLMethodProgram.convertXmlToString(doc1);
			return new VolatileVariable(op.getValue0(), result);
		}
		catch(RuntimeException e) {
			throw new IllegalArgumentException("Failed to parse XML");
		}
	}
}