/**
 * 
 */
package com.aasctc.template_rules;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Map;

import javax.xml.xpath.XPath;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.aasctc.template_rules.antlr.TemplateRulesLexer;
import com.aasctc.template_rules.antlr.TemplateRulesParser;
import com.aasctc.template_rules.antlr.TemplateRulesParser.HeaderAuthorListContext;
import com.aasctc.template_rules.antlr.TemplateRulesParser.HeaderContext;
import com.aasctc.template_rules.antlr.TemplateRulesParser.HeaderDateContext;
import com.aasctc.template_rules.antlr.TemplateRulesParser.HeaderDescriptionContext;
import com.aasctc.template_rules.antlr.TemplateRulesParser.HeaderFieldsContext;
import com.aasctc.template_rules.antlr.TemplateRulesParser.HeaderNameContext;
import com.aasctc.template_rules.antlr.TemplateRulesParser.NamespaceContext;
import com.aasctc.template_rules.antlr.TemplateRulesParser.RulesContext;
import com.aasctc.template_rules.antlr.TemplateRulesParser.TemplateRulesDocumentContext;
import com.aasctc.template_rules.antlr.TemplateRulesParser.TemplatesContext;

/**
 * @author Ali Sherief
 *
 */
public class TemplateRulesGrammar {
	
	List<Author> authors;
	String name;
	LocalDateTime date;
	String description;
	List<Namespace> namespaces;
	public List<Source> sources;
	public List<Sink> sinks;
	public List<Rule> rules;
	
	public TemplateRulesGrammar(StringBuffer grammarContent) {
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
        //List<NamespaceContext> x = template.namespaces().get(0).namespace();
        // TODO finish this
	}
	
	public class Author {
		String name;
		String email;
		public Author() {
			name = "";
			email = "";
		}
		public Author(String inputName, String inputEmail) {
			name = inputName;
			email = inputEmail;
		}
	}

	public class Namespace {
		String name;
		String alias;
		public Namespace() {
			name = "";
			alias = "";
		}
		public Namespace(String inputName, String inputAlias) {
			name = inputName;
			alias = inputAlias;
		}
		
		public Namespace(String inputName) {
			name = inputName;
			alias = inputName;
		}
	} 
	
	public class Type {
		Namespace namespace;
		String label;
		public Type() {
			namespace = new Namespace();
			label = "";
		}
		public Type(Namespace inputNamespace, String inputLabel) {
			namespace = inputNamespace;
			label = inputLabel;
		}
		
		// Uses the list of namespaces in parent class to determine the
		// type denoted in the prefix.
		public Type(String input) throws Exception {
			namespace = new Namespace();
			String[] inputs = input.split(":");
			if (inputs.length != 2) {
				throw new Exception();
			}
			for (Namespace n: namespaces) {
				if (n.name == inputs[0] || n.alias == inputs[0]) {
					namespace = n;
				}
			}
			if (namespace == new Namespace()) {
				throw new Exception(); //TODO make better exception.
			}
			label = inputs[1];
			
		}
	}
	
	public class Source {
		String name;
		Type label;
		
		public Source() {
			name = "";
			label = new Type();
		}
		
		public Source(String inputName, Type inputLabel) {
			name = inputName;
			label = inputLabel;
		}
	}
	
	public class Method {
		String name;
		List<String> parameters;
		
		public Method() {
			name = "";
			parameters = new ArrayList<String>();
		}
		public Method(String inputName, List<String> inputParameters) {
			name = inputName;
			parameters = inputParameters;
		}
		
		public Method(String inputName) {
			name = inputName;
			parameters = new ArrayList<String>();
		}
	}
	
	public class Sink {
		String name;
		Type label;
		Method method;
		
		public Sink() {
			name = "";
			label = new Type();
			method = new Method();
		}
		
		public Sink(String inputName, Type inputLabel, Method inputMethod) {
			name = inputName;
			label = inputLabel;
			method = inputMethod;
		}
	}
	
	public abstract class Rule {
		Source source;
		Sink sink;
		String location;
		Boolean pruneChildren;

		public Rule() {
			source = new Source();
			sink = new Sink();
			location = new String();
			pruneChildren = false;
		}
	}
	
	public class XMLRule extends Rule {
		XPath xmlLocation;
		public XMLRule() {
			source = new Source();
			sink = new Sink();
			location = new String();
			//xmlLocation = new XPath(); //FIXME I don't think you can init this class.
			pruneChildren = false;
		}
		
		public XMLRule(Source inputSource, Sink inputSink, XPath inputXmlLocation,
				Boolean inputPruneChildren) {
			source = inputSource;
			sink = inputSink;
			xmlLocation = inputXmlLocation;
			//TODO figure out how to get a String out of an XPath
			pruneChildren = inputPruneChildren;
		}
	}	
}
