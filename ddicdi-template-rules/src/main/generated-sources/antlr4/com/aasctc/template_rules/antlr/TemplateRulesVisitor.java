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
	 * Visit a parse tree produced by {@link TemplateRulesParser#headerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderName(TemplateRulesParser.HeaderNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#headerDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderDate(TemplateRulesParser.HeaderDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#headerAuthorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderAuthorList(TemplateRulesParser.HeaderAuthorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#headerAuthor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderAuthor(TemplateRulesParser.HeaderAuthorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#headerAuthorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderAuthorName(TemplateRulesParser.HeaderAuthorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#headerAuthorEmail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderAuthorEmail(TemplateRulesParser.HeaderAuthorEmailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#headerDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderDescription(TemplateRulesParser.HeaderDescriptionContext ctx);
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
	 * Visit a parse tree produced by {@link TemplateRulesParser#namespaceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceName(TemplateRulesParser.NamespaceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#namespaceAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAlias(TemplateRulesParser.NamespaceAliasContext ctx);
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
	 * Visit a parse tree produced by {@link TemplateRulesParser#sourceName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceName(TemplateRulesParser.SourceNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#sourceLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceLabel(TemplateRulesParser.SourceLabelContext ctx);
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
	 * Visit a parse tree produced by {@link TemplateRulesParser#sinkName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinkName(TemplateRulesParser.SinkNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#sinkLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinkLabel(TemplateRulesParser.SinkLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#sinkMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinkMethod(TemplateRulesParser.SinkMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#sinkMethodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinkMethodName(TemplateRulesParser.SinkMethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#sinkMethodParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinkMethodParameters(TemplateRulesParser.SinkMethodParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#sinkMethodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinkMethodParameter(TemplateRulesParser.SinkMethodParameterContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#ruleLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleLocation(TemplateRulesParser.RuleLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#ruleSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSource(TemplateRulesParser.RuleSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#ruleSink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleSink(TemplateRulesParser.RuleSinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#rulePruneChildren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRulePruneChildren(TemplateRulesParser.RulePruneChildrenContext ctx);
}