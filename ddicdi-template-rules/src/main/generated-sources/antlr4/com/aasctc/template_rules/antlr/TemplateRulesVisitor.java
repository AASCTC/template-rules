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
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodProgram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodProgram(TemplateRulesParser.MethodProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodStatement(TemplateRulesParser.MethodStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodAssignment(TemplateRulesParser.MethodAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodReturn(TemplateRulesParser.MethodReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodExpression(TemplateRulesParser.MethodExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodPrimaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodPrimaryExpression(TemplateRulesParser.MethodPrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodFunctionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodFunctionCall(TemplateRulesParser.MethodFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodArgumentList(TemplateRulesParser.MethodArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodPropertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodPropertyAccess(TemplateRulesParser.MethodPropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodConditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodConditional(TemplateRulesParser.MethodConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodIfBlock(TemplateRulesParser.MethodIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodElseIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodElseIfBlock(TemplateRulesParser.MethodElseIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodElseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodElseBlock(TemplateRulesParser.MethodElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodForEachLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodForEachLoop(TemplateRulesParser.MethodForEachLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodRange(TemplateRulesParser.MethodRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(TemplateRulesParser.MethodTypeContext ctx);
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
	 * Visit a parse tree produced by {@link TemplateRulesParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(TemplateRulesParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(TemplateRulesParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(TemplateRulesParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameters(TemplateRulesParser.MethodParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameter(TemplateRulesParser.MethodParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodParameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameterType(TemplateRulesParser.MethodParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#methodParameterValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParameterValue(TemplateRulesParser.MethodParameterValueContext ctx);
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
	 * Visit a parse tree produced by {@link TemplateRulesParser#ruleOutputElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleOutputElement(TemplateRulesParser.RuleOutputElementContext ctx);
}