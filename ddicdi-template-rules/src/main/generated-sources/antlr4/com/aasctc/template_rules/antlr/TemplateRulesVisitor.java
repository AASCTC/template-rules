// Generated from TemplateRules.g4 by ANTLR 4.13.0
package com.aasctc.template_rules.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TemplateRulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TemplateRulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#templateRulesDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateRulesDocument(TemplateRulesParser.TemplateRulesDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(TemplateRulesParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#headerFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderFields(TemplateRulesParser.HeaderFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#authorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorList(TemplateRulesParser.AuthorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#author}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthor(TemplateRulesParser.AuthorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#templates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplates(TemplateRulesParser.TemplatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#namespaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaces(TemplateRulesParser.NamespacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(TemplateRulesParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#sources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSources(TemplateRulesParser.SourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(TemplateRulesParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#sinks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinks(TemplateRulesParser.SinksContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#sink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSink(TemplateRulesParser.SinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(TemplateRulesParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(TemplateRulesParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(TemplateRulesParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(TemplateRulesParser.RuleContext ctx);
}