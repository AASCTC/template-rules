/**
 * 
 */
package com.aasctc.template_rules;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.aasctc.template_rules.antlr.TemplateRulesLexer;
import com.aasctc.template_rules.antlr.TemplateRulesParser;
import com.aasctc.template_rules.antlr.TemplateRulesParser.*;

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
	
	public TemplateRulesGrammar(StringBuffer grammarContent)
			throws UnknownNamespaceException, IllegalArgumentException, NoSuchElementException {
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
        HeaderContext header = tree.header();
        TemplatesContext template = tree.templates();
        RulesContext rules = tree.rules();
        
        HeaderFieldsContext headerFields = header.headerFields();
        name = headerFields.headerName().getText();
        date = LocalDateTime.parse(headerFields.headerDate().getText());
        description = headerFields.headerDescription().getText();

        for (HeaderAuthorContext author: headerFields.headerAuthorList().headerAuthor()) {
        	authors.add(new Author(
        			author.headerAuthorName().getText(),
        			author.headerAuthorEmail().getText()));
        }
        
        for (NamespaceContext namespace: template.namespaces().namespace()) {
        	namespaces.add(new Namespace(
        			namespace.namespaceName().getText(),
        			namespace.namespaceAlias().getText()));
        }
        
        for (SourceContext source: template.sources().source()) {        	
        	try {
        		Type t = new Type(source.sourceLabel().getText()); 
				sources.add(new Source(
						source.sourceName().getText(), t));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				throw e;
			} catch (UnknownNamespaceException e) {
				e.printStackTrace();
				throw e;
			}
        }
        
        for (SinkContext sink: template.sinks().sink()) {
        	try {
        		Type t = new Type(sink.sinkLabel().getText());
        		SinkMethodContext method = sink.sinkMethod();
        		List<String> parameters = new ArrayList<String>();
        				method.sinkMethodParameters().sinkMethodParameter().forEach(
        						parameter -> parameters.add(parameter.getText()));
        		Method m = new Method(method.sinkMethodName().getText(), parameters);
        		sinks.add(new Sink(sink.sinkName().getText(), t, m));
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				throw e;
			} catch (UnknownNamespaceException e) {
				e.printStackTrace();
				throw e;
			}
        }
        
        List<Rule> targetRules = new ArrayList<Rule>();
        for (RuleContext rule: rules.rule_()) {
        	String location = rule.ruleLocation().getText();
        	String source = rule.ruleSource().getText();
        	String sink = rule.ruleSink().getText();
        	Boolean pruneChildren = Boolean.valueOf(rule.rulePruneChildren().getText());
        	
        	// Now find the appropriate source and sink respectively
			Optional<Source> optionalSource = Optional.empty();
        	for (Source inputSource: sources) {
        		if (inputSource.name == source) {
        			optionalSource = Optional.of(inputSource);
        			break;
        		}
        	}
			Optional<Sink> optionalSink = Optional.empty();
        	for (Sink inputSink: sinks) {
        		if (inputSink.name == sink) {
        			optionalSink = Optional.of(inputSink);
        			break;
        		}
        	}
        	targetRules.add(new Rule(optionalSource.get(), optionalSink.get(),
        			location, pruneChildren));
        }
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
		public Type(String input) throws UnknownNamespaceException {
			namespace = new Namespace();
			String[] inputs = input.split(":");
			if (inputs.length != 2) {
				throw new IllegalArgumentException();
			}
			for (Namespace n: namespaces) {
				if (n.name == inputs[0] || n.alias == inputs[0]) {
					namespace = n;
				}
			}
			if (namespace == new Namespace()) {
				throw new UnknownNamespaceException();
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
	
	//FIXME this has got to support types. But I am not sure how to
	//define allowed operations for each type.
	public class Method {
		String name;
		List<String> parameters;
		//String body; //TODO how will this work?
		
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
	
	public class Rule {
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
		
		public Rule(Source inputSource, Sink inputSink, String inputLocation,
				Boolean inputPruneChildren) {
			source = inputSource;
			sink = inputSink;
			location = inputLocation;
			pruneChildren = inputPruneChildren;
		}
	}
}
