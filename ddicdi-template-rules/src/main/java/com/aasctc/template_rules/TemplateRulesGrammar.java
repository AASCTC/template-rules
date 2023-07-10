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
import com.aasctc.template_rules.methods.XMLMethodProgram;

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
	public List<XMLMethod> methods;
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
        
        for (MethodContext method: template.methods().method()) {        	
        	try {
        		Type t = new Type(method.methodType().getText(), namespaces);
        		List<String> parameters = new ArrayList<String>();
				method.methodParameters().methodParameter().forEach(
						parameter -> parameters.add(parameter.getText()));

				methods.add(new XMLMethod(
						method.methodName().getText(), t,
						parameters, new XMLMethodProgram(method.methodProgram())));
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
        	String methodName = rule.method().getText();
			
        	Optional<XMLMethod> optionalMethod = Optional.empty();
        	for (XMLMethod method: methods) {
        		if (method.name == methodName) {
        			optionalMethod = Optional.of(method);
        			break;
        		}
        	}
        	
        	String outputElement = rule.ruleOutputElement().getText();
        	
        	targetRules.add(new Rule(outputElement, optionalMethod.get(), location));
        }
	}
	
	
}
