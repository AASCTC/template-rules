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
	 * Visit a parse tree produced by {@link TemplateRulesParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(TemplateRulesParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(TemplateRulesParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(TemplateRulesParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(TemplateRulesParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(TemplateRulesParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(TemplateRulesParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(TemplateRulesParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(TemplateRulesParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(TemplateRulesParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(TemplateRulesParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(TemplateRulesParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(TemplateRulesParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(TemplateRulesParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(TemplateRulesParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(TemplateRulesParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(TemplateRulesParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(TemplateRulesParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(TemplateRulesParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(TemplateRulesParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(TemplateRulesParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(TemplateRulesParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TemplateRulesParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(TemplateRulesParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TemplateRulesParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(TemplateRulesParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(TemplateRulesParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(TemplateRulesParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(TemplateRulesParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(TemplateRulesParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(TemplateRulesParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(TemplateRulesParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(TemplateRulesParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(TemplateRulesParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(TemplateRulesParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(TemplateRulesParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(TemplateRulesParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(TemplateRulesParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(TemplateRulesParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(TemplateRulesParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(TemplateRulesParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(TemplateRulesParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(TemplateRulesParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(TemplateRulesParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(TemplateRulesParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(TemplateRulesParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(TemplateRulesParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(TemplateRulesParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(TemplateRulesParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(TemplateRulesParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(TemplateRulesParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(TemplateRulesParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(TemplateRulesParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(TemplateRulesParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(TemplateRulesParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(TemplateRulesParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(TemplateRulesParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(TemplateRulesParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(TemplateRulesParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(TemplateRulesParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(TemplateRulesParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(TemplateRulesParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(TemplateRulesParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(TemplateRulesParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(TemplateRulesParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(TemplateRulesParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TemplateRulesParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(TemplateRulesParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(TemplateRulesParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(TemplateRulesParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(TemplateRulesParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(TemplateRulesParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(TemplateRulesParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(TemplateRulesParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(TemplateRulesParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(TemplateRulesParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(TemplateRulesParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(TemplateRulesParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(TemplateRulesParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(TemplateRulesParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(TemplateRulesParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(TemplateRulesParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(TemplateRulesParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#namespaceAliasLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceAliasLiteral(TemplateRulesParser.NamespaceAliasLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainHeader(TemplateRulesParser.CrossDomainHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainHeaderName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainHeaderName(TemplateRulesParser.CrossDomainHeaderNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainHeaderDate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainHeaderDate(TemplateRulesParser.CrossDomainHeaderDateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainHeaderDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainHeaderDescription(TemplateRulesParser.CrossDomainHeaderDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainAuthorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainAuthorList(TemplateRulesParser.CrossDomainAuthorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainAuthor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainAuthor(TemplateRulesParser.CrossDomainAuthorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainNamespaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainNamespaceType(TemplateRulesParser.CrossDomainNamespaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainNamespaces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainNamespaces(TemplateRulesParser.CrossDomainNamespacesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainNamespace(TemplateRulesParser.CrossDomainNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainMethods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainMethods(TemplateRulesParser.CrossDomainMethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainMethod(TemplateRulesParser.CrossDomainMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainCouplings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainCouplings(TemplateRulesParser.CrossDomainCouplingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainCoupling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainCoupling(TemplateRulesParser.CrossDomainCouplingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TemplateRulesParser#crossDomainCouplingInputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrossDomainCouplingInputs(TemplateRulesParser.CrossDomainCouplingInputsContext ctx);
}