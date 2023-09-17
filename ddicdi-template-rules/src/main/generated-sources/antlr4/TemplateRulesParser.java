// Generated from TemplateRules.g4 by ANTLR 4.13.0
package com.aasctc.template_rules.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TemplateRulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Auto=16, Break=17, 
		Case=18, Char=19, Const=20, Continue=21, Default=22, Do=23, Double=24, 
		Else=25, Enum=26, Extern=27, Float=28, For=29, Goto=30, If=31, Inline=32, 
		Int=33, Long=34, Register=35, Restrict=36, Return=37, Short=38, Signed=39, 
		Sizeof=40, Static=41, Struct=42, Switch=43, Typedef=44, Union=45, Unsigned=46, 
		Void=47, Volatile=48, While=49, Alignas=50, Alignof=51, Atomic=52, Bool=53, 
		Complex=54, Generic=55, Imaginary=56, Noreturn=57, StaticAssert=58, ThreadLocal=59, 
		LeftParen=60, RightParen=61, LeftBracket=62, RightBracket=63, LeftBrace=64, 
		RightBrace=65, Less=66, LessEqual=67, Greater=68, GreaterEqual=69, LeftShift=70, 
		RightShift=71, Plus=72, PlusPlus=73, Minus=74, MinusMinus=75, Star=76, 
		Div=77, Mod=78, And=79, Or=80, AndAnd=81, OrOr=82, Caret=83, Not=84, Tilde=85, 
		Question=86, Colon=87, Semi=88, Comma=89, Assign=90, StarAssign=91, DivAssign=92, 
		ModAssign=93, PlusAssign=94, MinusAssign=95, LeftShiftAssign=96, RightShiftAssign=97, 
		AndAssign=98, XorAssign=99, OrAssign=100, Equal=101, NotEqual=102, Arrow=103, 
		Dot=104, Ellipsis=105, Identifier=106, Email=107, Constant=108, DigitSequence=109, 
		StringLiteral=110, NamespaceLiteral=111, MultiLineMacro=112, Directive=113, 
		Whitespace=114, Newline=115, BlockComment=116, LineComment=117;
	public static final int
		RULE_primaryExpression = 0, RULE_genericAssocList = 1, RULE_genericAssociation = 2, 
		RULE_postfixExpression = 3, RULE_argumentExpressionList = 4, RULE_unaryExpression = 5, 
		RULE_unaryOperator = 6, RULE_castExpression = 7, RULE_multiplicativeExpression = 8, 
		RULE_additiveExpression = 9, RULE_shiftExpression = 10, RULE_relationalExpression = 11, 
		RULE_equalityExpression = 12, RULE_andExpression = 13, RULE_exclusiveOrExpression = 14, 
		RULE_inclusiveOrExpression = 15, RULE_logicalAndExpression = 16, RULE_logicalOrExpression = 17, 
		RULE_conditionalExpression = 18, RULE_assignmentExpression = 19, RULE_assignmentOperator = 20, 
		RULE_expression = 21, RULE_constantExpression = 22, RULE_declaration = 23, 
		RULE_declarationSpecifiers = 24, RULE_declarationSpecifiers2 = 25, RULE_declarationSpecifier = 26, 
		RULE_initDeclaratorList = 27, RULE_initDeclarator = 28, RULE_storageClassSpecifier = 29, 
		RULE_typeSpecifier = 30, RULE_structOrUnionSpecifier = 31, RULE_structOrUnion = 32, 
		RULE_structDeclarationList = 33, RULE_structDeclaration = 34, RULE_specifierQualifierList = 35, 
		RULE_structDeclaratorList = 36, RULE_structDeclarator = 37, RULE_enumSpecifier = 38, 
		RULE_enumeratorList = 39, RULE_enumerator = 40, RULE_enumerationConstant = 41, 
		RULE_atomicTypeSpecifier = 42, RULE_typeQualifier = 43, RULE_functionSpecifier = 44, 
		RULE_alignmentSpecifier = 45, RULE_declarator = 46, RULE_directDeclarator = 47, 
		RULE_nestedParenthesesBlock = 48, RULE_pointer = 49, RULE_typeQualifierList = 50, 
		RULE_parameterTypeList = 51, RULE_parameterList = 52, RULE_parameterDeclaration = 53, 
		RULE_identifierList = 54, RULE_typeName = 55, RULE_abstractDeclarator = 56, 
		RULE_directAbstractDeclarator = 57, RULE_typedefName = 58, RULE_initializer = 59, 
		RULE_initializerList = 60, RULE_designation = 61, RULE_designatorList = 62, 
		RULE_designator = 63, RULE_staticAssertDeclaration = 64, RULE_statement = 65, 
		RULE_labeledStatement = 66, RULE_compoundStatement = 67, RULE_blockItemList = 68, 
		RULE_blockItem = 69, RULE_expressionStatement = 70, RULE_selectionStatement = 71, 
		RULE_iterationStatement = 72, RULE_forCondition = 73, RULE_forDeclaration = 74, 
		RULE_forExpression = 75, RULE_jumpStatement = 76, RULE_compilationUnit = 77, 
		RULE_translationUnit = 78, RULE_externalDeclaration = 79, RULE_functionDefinition = 80, 
		RULE_declarationList = 81, RULE_namespaceAliasLiteral = 82, RULE_crossDomainHeader = 83, 
		RULE_crossDomainHeaderName = 84, RULE_crossDomainHeaderDate = 85, RULE_crossDomainHeaderDescription = 86, 
		RULE_crossDomainAuthorList = 87, RULE_crossDomainAuthor = 88, RULE_crossDomainNamespaceType = 89, 
		RULE_crossDomainNamespaces = 90, RULE_crossDomainNamespace = 91, RULE_crossDomainMethods = 92, 
		RULE_crossDomainMethod = 93, RULE_crossDomainCouplings = 94, RULE_crossDomainCoupling = 95, 
		RULE_crossDomainCouplingInputs = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "genericAssocList", "genericAssociation", "postfixExpression", 
			"argumentExpressionList", "unaryExpression", "unaryOperator", "castExpression", 
			"multiplicativeExpression", "additiveExpression", "shiftExpression", 
			"relationalExpression", "equalityExpression", "andExpression", "exclusiveOrExpression", 
			"inclusiveOrExpression", "logicalAndExpression", "logicalOrExpression", 
			"conditionalExpression", "assignmentExpression", "assignmentOperator", 
			"expression", "constantExpression", "declaration", "declarationSpecifiers", 
			"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
			"initDeclarator", "storageClassSpecifier", "typeSpecifier", "structOrUnionSpecifier", 
			"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
			"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
			"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
			"functionSpecifier", "alignmentSpecifier", "declarator", "directDeclarator", 
			"nestedParenthesesBlock", "pointer", "typeQualifierList", "parameterTypeList", 
			"parameterList", "parameterDeclaration", "identifierList", "typeName", 
			"abstractDeclarator", "directAbstractDeclarator", "typedefName", "initializer", 
			"initializerList", "designation", "designatorList", "designator", "staticAssertDeclaration", 
			"statement", "labeledStatement", "compoundStatement", "blockItemList", 
			"blockItem", "expressionStatement", "selectionStatement", "iterationStatement", 
			"forCondition", "forDeclaration", "forExpression", "jumpStatement", "compilationUnit", 
			"translationUnit", "externalDeclaration", "functionDefinition", "declarationList", 
			"namespaceAliasLiteral", "crossDomainHeader", "crossDomainHeaderName", 
			"crossDomainHeaderDate", "crossDomainHeaderDescription", "crossDomainAuthorList", 
			"crossDomainAuthor", "crossDomainNamespaceType", "crossDomainNamespaces", 
			"crossDomainNamespace", "crossDomainMethods", "crossDomainMethod", "crossDomainCouplings", 
			"crossDomainCoupling", "crossDomainCouplingInputs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'__extension__'", "'bool'", "'complex'", "'__typeof__'", "'__inline__'", 
			"'__stdcall'", "'__declspec'", "'crossdomain'", "'name'", "'date'", "'description'", 
			"'authors'", "'namespaces'", "'methods'", "'couplings'", "'auto'", "'break'", 
			"'case'", "'char'", "'const'", "'continue'", "'default'", "'do'", "'double'", 
			"'else'", "'enum'", "'extern'", "'float'", "'for'", "'goto'", "'if'", 
			"'inline'", "'int'", "'long'", "'register'", "'restrict'", "'return'", 
			"'short'", "'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", 
			"'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", "'while'", 
			"'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", 
			"'_Imaginary'", "'_Noreturn'", "'_Static_assert'", "'_Thread_local'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", 
			"'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", 
			"'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", 
			"'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", 
			"'^='", "'|='", "'=='", "'!='", "'->'", "'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Auto", "Break", "Case", "Char", "Const", "Continue", 
			"Default", "Do", "Double", "Else", "Enum", "Extern", "Float", "For", 
			"Goto", "If", "Inline", "Int", "Long", "Register", "Restrict", "Return", 
			"Short", "Signed", "Sizeof", "Static", "Struct", "Switch", "Typedef", 
			"Union", "Unsigned", "Void", "Volatile", "While", "Alignas", "Alignof", 
			"Atomic", "Bool", "Complex", "Generic", "Imaginary", "Noreturn", "StaticAssert", 
			"ThreadLocal", "LeftParen", "RightParen", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", 
			"Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", 
			"Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
			"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", 
			"Arrow", "Dot", "Ellipsis", "Identifier", "Email", "Constant", "DigitSequence", 
			"StringLiteral", "NamespaceLiteral", "MultiLineMacro", "Directive", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TemplateRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TemplateRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(TemplateRulesParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(TemplateRulesParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(TemplateRulesParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(Identifier);
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(Constant);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(196);
					match(StringLiteral);
					}
					}
					setState(199); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(LeftParen);
				setState(202);
				expression();
				setState(203);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericAssocListContext extends ParserRuleContext {
		public List<GenericAssociationContext> genericAssociation() {
			return getRuleContexts(GenericAssociationContext.class);
		}
		public GenericAssociationContext genericAssociation(int i) {
			return getRuleContext(GenericAssociationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitGenericAssocList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_genericAssocList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			genericAssociation();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(208);
				match(Comma);
				setState(209);
				genericAssociation();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericAssociationContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Default() { return getToken(TemplateRulesParser.Default, 0); }
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitGenericAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_genericAssociation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Identifier:
			case NamespaceLiteral:
				{
				setState(215);
				typeName();
				}
				break;
			case Default:
				{
				setState(216);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(219);
			match(Colon);
			setState(220);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<TerminalNode> LeftParen() { return getTokens(TemplateRulesParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(TemplateRulesParser.LeftParen, i);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(TemplateRulesParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(TemplateRulesParser.RightParen, i);
		}
		public TerminalNode LeftBrace() { return getToken(TemplateRulesParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(TemplateRulesParser.RightBrace, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(TemplateRulesParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(TemplateRulesParser.LeftBracket, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(TemplateRulesParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(TemplateRulesParser.RightBracket, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(TemplateRulesParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TemplateRulesParser.Identifier, i);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(TemplateRulesParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(TemplateRulesParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(TemplateRulesParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(TemplateRulesParser.MinusMinus, i);
		}
		public List<TerminalNode> Dot() { return getTokens(TemplateRulesParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(TemplateRulesParser.Dot, i);
		}
		public List<TerminalNode> Arrow() { return getTokens(TemplateRulesParser.Arrow); }
		public TerminalNode Arrow(int i) {
			return getToken(TemplateRulesParser.Arrow, i);
		}
		public TerminalNode Comma() { return getToken(TemplateRulesParser.Comma, 0); }
		public List<ArgumentExpressionListContext> argumentExpressionList() {
			return getRuleContexts(ArgumentExpressionListContext.class);
		}
		public ArgumentExpressionListContext argumentExpressionList(int i) {
			return getRuleContext(ArgumentExpressionListContext.class,i);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(222);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(223);
					match(T__0);
					}
				}

				setState(226);
				match(LeftParen);
				setState(227);
				typeName();
				setState(228);
				match(RightParen);
				setState(229);
				match(LeftBrace);
				setState(230);
				initializerList();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(231);
					match(Comma);
					}
				}

				setState(234);
				match(RightBrace);
				}
				break;
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 26388279107589L) != 0)) {
				{
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftBracket:
					{
					setState(238);
					match(LeftBracket);
					setState(239);
					expression();
					setState(240);
					match(RightBracket);
					}
					break;
				case LeftParen:
					{
					setState(242);
					match(LeftParen);
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1155174403932160002L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 498216219295L) != 0)) {
						{
						setState(243);
						argumentExpressionList();
						}
					}

					setState(246);
					match(RightParen);
					}
					break;
				case Arrow:
				case Dot:
					{
					setState(247);
					_la = _input.LA(1);
					if ( !(_la==Arrow || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(248);
					match(Identifier);
					}
					break;
				case PlusPlus:
					{
					setState(249);
					match(PlusPlus);
					}
					break;
				case MinusMinus:
					{
					setState(250);
					match(MinusMinus);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			assignmentExpression();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(257);
				match(Comma);
				setState(258);
				assignmentExpression();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public TerminalNode AndAnd() { return getToken(TemplateRulesParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public List<TerminalNode> Sizeof() { return getTokens(TemplateRulesParser.Sizeof); }
		public TerminalNode Sizeof(int i) {
			return getToken(TemplateRulesParser.Sizeof, i);
		}
		public TerminalNode Alignof() { return getToken(TemplateRulesParser.Alignof, 0); }
		public List<TerminalNode> PlusPlus() { return getTokens(TemplateRulesParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(TemplateRulesParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(TemplateRulesParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(TemplateRulesParser.MinusMinus, i);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(264);
					_la = _input.LA(1);
					if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & 42949672961L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case LeftParen:
			case Identifier:
			case Constant:
			case StringLiteral:
				{
				setState(270);
				postfixExpression();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
				{
				setState(271);
				unaryOperator();
				setState(272);
				castExpression();
				}
				break;
			case Sizeof:
			case Alignof:
				{
				setState(274);
				_la = _input.LA(1);
				if ( !(_la==Sizeof || _la==Alignof) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(275);
				match(LeftParen);
				setState(276);
				typeName();
				setState(277);
				match(RightParen);
				}
				break;
			case AndAnd:
				{
				setState(279);
				match(AndAnd);
				setState(280);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(TemplateRulesParser.And, 0); }
		public TerminalNode Star() { return getToken(TemplateRulesParser.Star, 0); }
		public TerminalNode Plus() { return getToken(TemplateRulesParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(TemplateRulesParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(TemplateRulesParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(TemplateRulesParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 12437L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(TemplateRulesParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_castExpression);
		int _la;
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(285);
					match(T__0);
					}
				}

				setState(288);
				match(LeftParen);
				setState(289);
				typeName();
				setState(290);
				match(RightParen);
				setState(291);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(TemplateRulesParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(TemplateRulesParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(TemplateRulesParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(TemplateRulesParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(TemplateRulesParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(TemplateRulesParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			castExpression();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 7L) != 0)) {
				{
				{
				setState(298);
				_la = _input.LA(1);
				if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 7L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(299);
				castExpression();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(TemplateRulesParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(TemplateRulesParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(TemplateRulesParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(TemplateRulesParser.Minus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			multiplicativeExpression();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				multiplicativeExpression();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> LeftShift() { return getTokens(TemplateRulesParser.LeftShift); }
		public TerminalNode LeftShift(int i) {
			return getToken(TemplateRulesParser.LeftShift, i);
		}
		public List<TerminalNode> RightShift() { return getTokens(TemplateRulesParser.RightShift); }
		public TerminalNode RightShift(int i) {
			return getToken(TemplateRulesParser.RightShift, i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			additiveExpression();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftShift || _la==RightShift) {
				{
				{
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==LeftShift || _la==RightShift) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(315);
				additiveExpression();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(TemplateRulesParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(TemplateRulesParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(TemplateRulesParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(TemplateRulesParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(TemplateRulesParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(TemplateRulesParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(TemplateRulesParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(TemplateRulesParser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			shiftExpression();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 15L) != 0)) {
				{
				{
				setState(322);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(323);
				shiftExpression();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(TemplateRulesParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(TemplateRulesParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(TemplateRulesParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(TemplateRulesParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			relationalExpression();
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(330);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(331);
				relationalExpression();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(TemplateRulesParser.And); }
		public TerminalNode And(int i) {
			return getToken(TemplateRulesParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			equalityExpression();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(338);
				match(And);
				setState(339);
				equalityExpression();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(TemplateRulesParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(TemplateRulesParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			andExpression();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(346);
				match(Caret);
				setState(347);
				andExpression();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(TemplateRulesParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(TemplateRulesParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			exclusiveOrExpression();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(354);
				match(Or);
				setState(355);
				exclusiveOrExpression();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(TemplateRulesParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(TemplateRulesParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			inclusiveOrExpression();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(362);
				match(AndAnd);
				setState(363);
				inclusiveOrExpression();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(TemplateRulesParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(TemplateRulesParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			logicalAndExpression();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(370);
				match(OrOr);
				setState(371);
				logicalAndExpression();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(TemplateRulesParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			logicalOrExpression();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(378);
				match(Question);
				setState(379);
				expression();
				setState(380);
				match(Colon);
				setState(381);
				conditionalExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(TemplateRulesParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignmentExpression);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				unaryExpression();
				setState(387);
				assignmentOperator();
				setState(388);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(TemplateRulesParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(TemplateRulesParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(TemplateRulesParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(TemplateRulesParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(TemplateRulesParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(TemplateRulesParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(TemplateRulesParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(TemplateRulesParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(TemplateRulesParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(TemplateRulesParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(TemplateRulesParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 2047L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			assignmentExpression();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(396);
				match(Comma);
				setState(397);
				assignmentExpression();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TemplateRulesParser.Semi, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaration);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Noreturn:
			case ThreadLocal:
			case Identifier:
			case NamespaceLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				declarationSpecifiers();
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 70368752631809L) != 0)) {
					{
					setState(406);
					initDeclaratorList();
					}
				}

				setState(409);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				staticAssertDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(414);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(417); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDeclarationSpecifiers2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(419);
				declarationSpecifier();
				}
				}
				setState(422); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 726758353016520956L) != 0) || _la==Identifier || _la==NamespaceLiteral );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declarationSpecifier);
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(425);
				typeSpecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(427);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				alignmentSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			initDeclarator();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(432);
				match(Comma);
				setState(433);
				initDeclarator();
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TemplateRulesParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			declarator();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(440);
				match(Assign);
				setState(441);
				initializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(TemplateRulesParser.Typedef, 0); }
		public TerminalNode Extern() { return getToken(TemplateRulesParser.Extern, 0); }
		public TerminalNode Static() { return getToken(TemplateRulesParser.Static, 0); }
		public TerminalNode ThreadLocal() { return getToken(TemplateRulesParser.ThreadLocal, 0); }
		public TerminalNode Auto() { return getToken(TemplateRulesParser.Auto, 0); }
		public TerminalNode Register() { return getToken(TemplateRulesParser.Register, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 576480578006745088L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(TemplateRulesParser.Void, 0); }
		public TerminalNode Char() { return getToken(TemplateRulesParser.Char, 0); }
		public TerminalNode Short() { return getToken(TemplateRulesParser.Short, 0); }
		public TerminalNode Int() { return getToken(TemplateRulesParser.Int, 0); }
		public TerminalNode Long() { return getToken(TemplateRulesParser.Long, 0); }
		public TerminalNode Float() { return getToken(TemplateRulesParser.Float, 0); }
		public TerminalNode Double() { return getToken(TemplateRulesParser.Double, 0); }
		public TerminalNode Signed() { return getToken(TemplateRulesParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(TemplateRulesParser.Unsigned, 0); }
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public CrossDomainNamespaceTypeContext crossDomainNamespaceType() {
			return getRuleContext(CrossDomainNamespaceTypeContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeSpecifier);
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(Void);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(Char);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(Short);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(Int);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
				match(Long);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(451);
				match(Float);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(452);
				match(Double);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(453);
				match(Signed);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(454);
				match(Unsigned);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(455);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(456);
				match(T__2);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(457);
				atomicTypeSpecifier();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(458);
				structOrUnionSpecifier();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(459);
				enumSpecifier();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(460);
				typedefName();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(461);
				match(T__3);
				setState(462);
				match(LeftParen);
				setState(463);
				constantExpression();
				setState(464);
				match(RightParen);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(466);
				crossDomainNamespaceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TemplateRulesParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(TemplateRulesParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitStructOrUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				structOrUnion();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(470);
					match(Identifier);
					}
				}

				setState(473);
				match(LeftBrace);
				setState(474);
				structDeclarationList();
				setState(475);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				structOrUnion();
				setState(478);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(TemplateRulesParser.Struct, 0); }
		public TerminalNode Union() { return getToken(TemplateRulesParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitStructOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclarationListContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitStructDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(484);
				structDeclaration();
				}
				}
				setState(487); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 293267058883821596L) != 0) || _la==Identifier || _la==NamespaceLiteral );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TemplateRulesParser.Semi, 0); }
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structDeclaration);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				specifierQualifierList();
				setState(490);
				structDeclaratorList();
				setState(491);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				specifierQualifierList();
				setState(494);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				staticAssertDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_specifierQualifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(499);
				typeSpecifier();
				}
				break;
			case 2:
				{
				setState(500);
				typeQualifier();
				}
				break;
			}
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(503);
				specifierQualifierList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			structDeclarator();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(507);
				match(Comma);
				setState(508);
				structDeclarator();
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_structDeclarator);
		int _la;
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 70368752631809L) != 0)) {
					{
					setState(515);
					declarator();
					}
				}

				setState(518);
				match(Colon);
				setState(519);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(TemplateRulesParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(TemplateRulesParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(TemplateRulesParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(TemplateRulesParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_enumSpecifier);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(Enum);
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(523);
					match(Identifier);
					}
				}

				setState(526);
				match(LeftBrace);
				setState(527);
				enumeratorList();
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(528);
					match(Comma);
					}
				}

				setState(531);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				match(Enum);
				setState(534);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			enumerator();
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(538);
					match(Comma);
					setState(539);
					enumerator();
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TemplateRulesParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			enumerationConstant();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(546);
				match(Assign);
				setState(547);
				constantExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitEnumerationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Atomic() { return getToken(TemplateRulesParser.Atomic, 0); }
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitAtomicTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(Atomic);
			setState(553);
			match(LeftParen);
			setState(554);
			typeName();
			setState(555);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(TemplateRulesParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(TemplateRulesParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(TemplateRulesParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(TemplateRulesParser.Atomic, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143324606464L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(TemplateRulesParser.Inline, 0); }
		public TerminalNode Noreturn() { return getToken(TemplateRulesParser.Noreturn, 0); }
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionSpecifier);
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Inline:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(Inline);
				}
				break;
			case Noreturn:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				match(Noreturn);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(562);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(563);
				match(T__6);
				setState(564);
				match(LeftParen);
				setState(565);
				match(Identifier);
				setState(566);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(TemplateRulesParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitAlignmentSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_alignmentSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(Alignas);
			setState(570);
			match(LeftParen);
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(571);
				typeName();
				}
				break;
			case 2:
				{
				setState(572);
				constantExpression();
				}
				break;
			}
			setState(575);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(577);
				pointer();
				}
			}

			setState(580);
			directDeclarator(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public TerminalNode DigitSequence() { return getToken(TemplateRulesParser.DigitSequence, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(TemplateRulesParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TemplateRulesParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(TemplateRulesParser.Static, 0); }
		public TerminalNode Star() { return getToken(TemplateRulesParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(583);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(584);
				match(LeftParen);
				setState(585);
				declarator();
				setState(586);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(588);
				match(Identifier);
				setState(589);
				match(Colon);
				setState(590);
				match(DigitSequence);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(636);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(593);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(594);
						match(LeftBracket);
						setState(596);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143324606464L) != 0)) {
							{
							setState(595);
							typeQualifierList();
							}
						}

						setState(599);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1155174403932160002L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 498216219295L) != 0)) {
							{
							setState(598);
							assignmentExpression();
							}
						}

						setState(601);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(602);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(603);
						match(LeftBracket);
						setState(604);
						match(Static);
						setState(606);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143324606464L) != 0)) {
							{
							setState(605);
							typeQualifierList();
							}
						}

						setState(608);
						assignmentExpression();
						setState(609);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(611);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(612);
						match(LeftBracket);
						setState(613);
						typeQualifierList();
						setState(614);
						match(Static);
						setState(615);
						assignmentExpression();
						setState(616);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(618);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(619);
						match(LeftBracket);
						setState(621);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143324606464L) != 0)) {
							{
							setState(620);
							typeQualifierList();
							}
						}

						setState(623);
						match(Star);
						setState(624);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(625);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(626);
						match(LeftParen);
						setState(627);
						parameterTypeList();
						setState(628);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(630);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(631);
						match(LeftParen);
						setState(633);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(632);
							identifierList();
							}
						}

						setState(635);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(TemplateRulesParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(TemplateRulesParser.LeftParen, i);
		}
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(TemplateRulesParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(TemplateRulesParser.RightParen, i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitNestedParenthesesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305843009213693954L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 18014398509481983L) != 0)) {
				{
				setState(646);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Email:
				case Constant:
				case DigitSequence:
				case StringLiteral:
				case NamespaceLiteral:
				case MultiLineMacro:
				case Directive:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(641);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(642);
					match(LeftParen);
					setState(643);
					nestedParenthesesBlock();
					setState(644);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointerContext extends ParserRuleContext {
		public List<TerminalNode> Star() { return getTokens(TemplateRulesParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(TemplateRulesParser.Star, i);
		}
		public List<TerminalNode> Caret() { return getTokens(TemplateRulesParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(TemplateRulesParser.Caret, i);
		}
		public List<TypeQualifierListContext> typeQualifierList() {
			return getRuleContexts(TypeQualifierListContext.class);
		}
		public TypeQualifierListContext typeQualifierList(int i) {
			return getRuleContext(TypeQualifierListContext.class,i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(651);
				_la = _input.LA(1);
				if ( !(_la==Star || _la==Caret) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143324606464L) != 0)) {
					{
					setState(652);
					typeQualifierList();
					}
				}

				}
				}
				setState(657); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Star || _la==Caret );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualifierListContext extends ParserRuleContext {
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitTypeQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(659);
				typeQualifier();
				}
				}
				setState(662); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143324606464L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TemplateRulesParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(TemplateRulesParser.Ellipsis, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitParameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			parameterList();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(665);
				match(Comma);
				setState(666);
				match(Ellipsis);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			parameterDeclaration();
			setState(674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(670);
					match(Comma);
					setState(671);
					parameterDeclaration();
					}
					} 
				}
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_parameterDeclaration);
		int _la;
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				declarationSpecifiers();
				setState(678);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				declarationSpecifiers2();
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 8454149L) != 0)) {
					{
					setState(681);
					abstractDeclarator();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(TemplateRulesParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TemplateRulesParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(Identifier);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(687);
				match(Comma);
				setState(688);
				match(Identifier);
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			specifierQualifierList();
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 8454149L) != 0)) {
				{
				setState(695);
				abstractDeclarator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_abstractDeclarator);
		int _la;
		try {
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(699);
					pointer();
					}
				}

				setState(702);
				directAbstractDeclarator(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public TerminalNode LeftBracket() { return getToken(TemplateRulesParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TemplateRulesParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(TemplateRulesParser.Static, 0); }
		public TerminalNode Star() { return getToken(TemplateRulesParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(706);
				match(LeftParen);
				setState(707);
				abstractDeclarator();
				setState(708);
				match(RightParen);
				}
				break;
			case 2:
				{
				setState(710);
				match(LeftBracket);
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143324606464L) != 0)) {
					{
					setState(711);
					typeQualifierList();
					}
				}

				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1155174403932160002L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 498216219295L) != 0)) {
					{
					setState(714);
					assignmentExpression();
					}
				}

				setState(717);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(718);
				match(LeftBracket);
				setState(719);
				match(Static);
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143324606464L) != 0)) {
					{
					setState(720);
					typeQualifierList();
					}
				}

				setState(723);
				assignmentExpression();
				setState(724);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(726);
				match(LeftBracket);
				setState(727);
				typeQualifierList();
				setState(728);
				match(Static);
				setState(729);
				assignmentExpression();
				setState(730);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(732);
				match(LeftBracket);
				setState(733);
				match(Star);
				setState(734);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(735);
				match(LeftParen);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 726758353016520956L) != 0) || _la==Identifier || _la==NamespaceLiteral) {
					{
					setState(736);
					parameterTypeList();
					}
				}

				setState(739);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(779);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(777);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(742);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(743);
						match(LeftBracket);
						setState(745);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143324606464L) != 0)) {
							{
							setState(744);
							typeQualifierList();
							}
						}

						setState(748);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1155174403932160002L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 498216219295L) != 0)) {
							{
							setState(747);
							assignmentExpression();
							}
						}

						setState(750);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(751);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(752);
						match(LeftBracket);
						setState(753);
						match(Static);
						setState(755);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4785143324606464L) != 0)) {
							{
							setState(754);
							typeQualifierList();
							}
						}

						setState(757);
						assignmentExpression();
						setState(758);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(760);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(761);
						match(LeftBracket);
						setState(762);
						typeQualifierList();
						setState(763);
						match(Static);
						setState(764);
						assignmentExpression();
						setState(765);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(767);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(768);
						match(LeftBracket);
						setState(769);
						match(Star);
						setState(770);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(771);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(772);
						match(LeftParen);
						setState(774);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 726758353016520956L) != 0) || _la==Identifier || _la==NamespaceLiteral) {
							{
							setState(773);
							parameterTypeList();
							}
						}

						setState(776);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(781);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TemplateRulesParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(TemplateRulesParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(TemplateRulesParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_initializer);
		int _la;
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Sizeof:
			case Alignof:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case AndAnd:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				match(LeftBrace);
				setState(786);
				initializerList();
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(787);
					match(Comma);
					}
				}

				setState(790);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(794);
				designation();
				}
			}

			setState(797);
			initializer();
			setState(805);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(798);
					match(Comma);
					setState(800);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(799);
						designation();
						}
					}

					setState(802);
					initializer();
					}
					} 
				}
				setState(807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TemplateRulesParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			designatorList();
			setState(809);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DesignatorListContext extends ParserRuleContext {
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDesignatorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(812); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(811);
				designator();
				}
				}
				setState(814); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket || _la==Dot );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TemplateRulesParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(TemplateRulesParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(TemplateRulesParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_designator);
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				match(LeftBracket);
				setState(817);
				constantExpression();
				setState(818);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				match(Dot);
				setState(821);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode StaticAssert() { return getToken(TemplateRulesParser.StaticAssert, 0); }
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TemplateRulesParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(TemplateRulesParser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(TemplateRulesParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(TemplateRulesParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(StaticAssert);
			setState(825);
			match(LeftParen);
			setState(826);
			constantExpression();
			setState(827);
			match(Comma);
			setState(829); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(828);
				match(StringLiteral);
				}
				}
				setState(831); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(833);
			match(RightParen);
			setState(834);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_statement);
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(838);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(839);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(840);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(841);
				jumpStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(TemplateRulesParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(TemplateRulesParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_labeledStatement);
		try {
			setState(855);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				match(Identifier);
				setState(845);
				match(Colon);
				setState(846);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				match(Case);
				setState(848);
				constantExpression();
				setState(849);
				match(Colon);
				setState(850);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				match(Default);
				setState(853);
				match(Colon);
				setState(854);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TemplateRulesParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TemplateRulesParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			match(LeftBrace);
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2170735020358959358L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 268280857272065L) != 0)) {
				{
				setState(858);
				blockItemList();
				}
			}

			setState(861);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(863);
				blockItem();
				}
				}
				setState(866); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2170735020358959358L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 268280857272065L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_blockItem);
		try {
			setState(870);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(TemplateRulesParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1155174403932160002L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 498216219295L) != 0)) {
				{
				setState(872);
				expression();
				}
			}

			setState(875);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TemplateRulesParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(TemplateRulesParser.Else, 0); }
		public TerminalNode Switch() { return getToken(TemplateRulesParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_selectionStatement);
		try {
			setState(892);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(877);
				match(If);
				setState(878);
				match(LeftParen);
				setState(879);
				expression();
				setState(880);
				match(RightParen);
				setState(881);
				statement();
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(882);
					match(Else);
					setState(883);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				match(Switch);
				setState(887);
				match(LeftParen);
				setState(888);
				expression();
				setState(889);
				match(RightParen);
				setState(890);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(TemplateRulesParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(TemplateRulesParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TemplateRulesParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(TemplateRulesParser.Do, 0); }
		public TerminalNode Semi() { return getToken(TemplateRulesParser.Semi, 0); }
		public TerminalNode For() { return getToken(TemplateRulesParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_iterationStatement);
		try {
			setState(914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				match(While);
				setState(895);
				match(LeftParen);
				setState(896);
				expression();
				setState(897);
				match(RightParen);
				setState(898);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				match(Do);
				setState(901);
				statement();
				setState(902);
				match(While);
				setState(903);
				match(LeftParen);
				setState(904);
				expression();
				setState(905);
				match(RightParen);
				setState(906);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(908);
				match(For);
				setState(909);
				match(LeftParen);
				setState(910);
				forCondition();
				setState(911);
				match(RightParen);
				setState(912);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForConditionContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(TemplateRulesParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(TemplateRulesParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(916);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1155174403932160002L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 498216219295L) != 0)) {
					{
					setState(917);
					expression();
					}
				}

				}
				break;
			}
			setState(922);
			match(Semi);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1155174403932160002L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 498216219295L) != 0)) {
				{
				setState(923);
				forExpression();
				}
			}

			setState(926);
			match(Semi);
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1155174403932160002L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 498216219295L) != 0)) {
				{
				setState(927);
				forExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			declarationSpecifiers();
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 70368752631809L) != 0)) {
				{
				setState(931);
				initDeclaratorList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			assignmentExpression();
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(935);
				match(Comma);
				setState(936);
				assignmentExpression();
				}
				}
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(TemplateRulesParser.Semi, 0); }
		public TerminalNode Goto() { return getToken(TemplateRulesParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public TerminalNode Continue() { return getToken(TemplateRulesParser.Continue, 0); }
		public TerminalNode Break() { return getToken(TemplateRulesParser.Break, 0); }
		public TerminalNode Return() { return getToken(TemplateRulesParser.Return, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(942);
				match(Goto);
				setState(943);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(944);
				match(Continue);
				}
				break;
			case 3:
				{
				setState(945);
				match(Break);
				}
				break;
			case 4:
				{
				setState(946);
				match(Return);
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1155174403932160002L) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 498216219295L) != 0)) {
					{
					setState(947);
					expression();
					}
				}

				}
				break;
			case 5:
				{
				setState(950);
				match(Goto);
				setState(951);
				unaryExpression();
				}
				break;
			}
			setState(954);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompilationUnitContext extends ParserRuleContext {
		public CrossDomainHeaderContext crossDomainHeader() {
			return getRuleContext(CrossDomainHeaderContext.class,0);
		}
		public CrossDomainNamespacesContext crossDomainNamespaces() {
			return getRuleContext(CrossDomainNamespacesContext.class,0);
		}
		public CrossDomainMethodsContext crossDomainMethods() {
			return getRuleContext(CrossDomainMethodsContext.class,0);
		}
		public CrossDomainCouplingsContext crossDomainCouplings() {
			return getRuleContext(CrossDomainCouplingsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(TemplateRulesParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			crossDomainHeader();
			setState(957);
			crossDomainNamespaces();
			setState(958);
			crossDomainMethods();
			setState(959);
			crossDomainCouplings();
			setState(960);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(962);
				externalDeclaration();
				}
				}
				setState(965); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2167910233775079676L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 35433484417L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TemplateRulesParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_externalDeclaration);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(969);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(972);
				declarationSpecifiers();
				}
				break;
			}
			setState(975);
			declarator();
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1014988729168232700L) != 0) || _la==Identifier || _la==NamespaceLiteral) {
				{
				setState(976);
				declarationList();
				}
			}

			setState(979);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(981);
				declaration();
				}
				}
				setState(984); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1014988729168232700L) != 0) || _la==Identifier || _la==NamespaceLiteral );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceAliasLiteralContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public NamespaceAliasLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAliasLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitNamespaceAliasLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasLiteralContext namespaceAliasLiteral() throws RecognitionException {
		NamespaceAliasLiteralContext _localctx = new NamespaceAliasLiteralContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_namespaceAliasLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainHeaderContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TemplateRulesParser.LeftBrace, 0); }
		public CrossDomainHeaderNameContext crossDomainHeaderName() {
			return getRuleContext(CrossDomainHeaderNameContext.class,0);
		}
		public CrossDomainHeaderDateContext crossDomainHeaderDate() {
			return getRuleContext(CrossDomainHeaderDateContext.class,0);
		}
		public CrossDomainHeaderDescriptionContext crossDomainHeaderDescription() {
			return getRuleContext(CrossDomainHeaderDescriptionContext.class,0);
		}
		public CrossDomainAuthorListContext crossDomainAuthorList() {
			return getRuleContext(CrossDomainAuthorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(TemplateRulesParser.RightBrace, 0); }
		public CrossDomainHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainHeader; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainHeaderContext crossDomainHeader() throws RecognitionException {
		CrossDomainHeaderContext _localctx = new CrossDomainHeaderContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_crossDomainHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(T__7);
			setState(989);
			match(LeftBrace);
			setState(990);
			crossDomainHeaderName();
			setState(991);
			crossDomainHeaderDate();
			setState(992);
			crossDomainHeaderDescription();
			setState(993);
			crossDomainAuthorList();
			setState(994);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainHeaderNameContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public TerminalNode StringLiteral() { return getToken(TemplateRulesParser.StringLiteral, 0); }
		public CrossDomainHeaderNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainHeaderName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainHeaderName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainHeaderNameContext crossDomainHeaderName() throws RecognitionException {
		CrossDomainHeaderNameContext _localctx = new CrossDomainHeaderNameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_crossDomainHeaderName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(T__8);
			setState(997);
			match(Colon);
			setState(998);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainHeaderDateContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public TerminalNode StringLiteral() { return getToken(TemplateRulesParser.StringLiteral, 0); }
		public CrossDomainHeaderDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainHeaderDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainHeaderDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainHeaderDateContext crossDomainHeaderDate() throws RecognitionException {
		CrossDomainHeaderDateContext _localctx = new CrossDomainHeaderDateContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_crossDomainHeaderDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(T__9);
			setState(1001);
			match(Colon);
			setState(1002);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainHeaderDescriptionContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public TerminalNode StringLiteral() { return getToken(TemplateRulesParser.StringLiteral, 0); }
		public CrossDomainHeaderDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainHeaderDescription; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainHeaderDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainHeaderDescriptionContext crossDomainHeaderDescription() throws RecognitionException {
		CrossDomainHeaderDescriptionContext _localctx = new CrossDomainHeaderDescriptionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_crossDomainHeaderDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(T__10);
			setState(1005);
			match(Colon);
			setState(1006);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainAuthorListContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public TerminalNode LeftBracket() { return getToken(TemplateRulesParser.LeftBracket, 0); }
		public List<CrossDomainAuthorContext> crossDomainAuthor() {
			return getRuleContexts(CrossDomainAuthorContext.class);
		}
		public CrossDomainAuthorContext crossDomainAuthor(int i) {
			return getRuleContext(CrossDomainAuthorContext.class,i);
		}
		public TerminalNode RightBracket() { return getToken(TemplateRulesParser.RightBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public CrossDomainAuthorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainAuthorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainAuthorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainAuthorListContext crossDomainAuthorList() throws RecognitionException {
		CrossDomainAuthorListContext _localctx = new CrossDomainAuthorListContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_crossDomainAuthorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(T__11);
			setState(1009);
			match(Colon);
			setState(1010);
			match(LeftBracket);
			setState(1011);
			crossDomainAuthor();
			setState(1016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1012);
				match(Comma);
				setState(1013);
				crossDomainAuthor();
				}
				}
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1019);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainAuthorContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(TemplateRulesParser.StringLiteral, 0); }
		public TerminalNode LeftBracket() { return getToken(TemplateRulesParser.LeftBracket, 0); }
		public TerminalNode Email() { return getToken(TemplateRulesParser.Email, 0); }
		public TerminalNode RightBracket() { return getToken(TemplateRulesParser.RightBracket, 0); }
		public CrossDomainAuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainAuthor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainAuthor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainAuthorContext crossDomainAuthor() throws RecognitionException {
		CrossDomainAuthorContext _localctx = new CrossDomainAuthorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_crossDomainAuthor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			match(StringLiteral);
			setState(1022);
			match(LeftBracket);
			setState(1023);
			match(Email);
			setState(1024);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainNamespaceTypeContext extends ParserRuleContext {
		public TerminalNode NamespaceLiteral() { return getToken(TemplateRulesParser.NamespaceLiteral, 0); }
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public NamespaceAliasLiteralContext namespaceAliasLiteral() {
			return getRuleContext(NamespaceAliasLiteralContext.class,0);
		}
		public CrossDomainNamespaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainNamespaceType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainNamespaceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainNamespaceTypeContext crossDomainNamespaceType() throws RecognitionException {
		CrossDomainNamespaceTypeContext _localctx = new CrossDomainNamespaceTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_crossDomainNamespaceType);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NamespaceLiteral:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1026);
				match(NamespaceLiteral);
				setState(1027);
				match(Colon);
				setState(1028);
				match(Identifier);
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1029);
				namespaceAliasLiteral();
				setState(1030);
				match(Colon);
				setState(1031);
				match(Identifier);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainNamespacesContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TemplateRulesParser.LeftBrace, 0); }
		public List<CrossDomainNamespaceContext> crossDomainNamespace() {
			return getRuleContexts(CrossDomainNamespaceContext.class);
		}
		public CrossDomainNamespaceContext crossDomainNamespace(int i) {
			return getRuleContext(CrossDomainNamespaceContext.class,i);
		}
		public TerminalNode RightBrace() { return getToken(TemplateRulesParser.RightBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public CrossDomainNamespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainNamespaces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainNamespacesContext crossDomainNamespaces() throws RecognitionException {
		CrossDomainNamespacesContext _localctx = new CrossDomainNamespacesContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_crossDomainNamespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(T__12);
			setState(1036);
			match(LeftBrace);
			setState(1037);
			crossDomainNamespace();
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1038);
				match(Comma);
				setState(1039);
				crossDomainNamespace();
				}
				}
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1045);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainNamespaceContext extends ParserRuleContext {
		public TerminalNode NamespaceLiteral() { return getToken(TemplateRulesParser.NamespaceLiteral, 0); }
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public NamespaceAliasLiteralContext namespaceAliasLiteral() {
			return getRuleContext(NamespaceAliasLiteralContext.class,0);
		}
		public CrossDomainNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainNamespace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainNamespaceContext crossDomainNamespace() throws RecognitionException {
		CrossDomainNamespaceContext _localctx = new CrossDomainNamespaceContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_crossDomainNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(NamespaceLiteral);
			setState(1048);
			match(Colon);
			setState(1049);
			namespaceAliasLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainMethodsContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TemplateRulesParser.LeftBrace, 0); }
		public List<CrossDomainMethodContext> crossDomainMethod() {
			return getRuleContexts(CrossDomainMethodContext.class);
		}
		public CrossDomainMethodContext crossDomainMethod(int i) {
			return getRuleContext(CrossDomainMethodContext.class,i);
		}
		public TerminalNode RightBrace() { return getToken(TemplateRulesParser.RightBrace, 0); }
		public List<TerminalNode> Semi() { return getTokens(TemplateRulesParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(TemplateRulesParser.Semi, i);
		}
		public CrossDomainMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainMethods; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainMethodsContext crossDomainMethods() throws RecognitionException {
		CrossDomainMethodsContext _localctx = new CrossDomainMethodsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_crossDomainMethods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(T__13);
			setState(1052);
			match(LeftBrace);
			setState(1053);
			crossDomainMethod();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(1054);
				match(Semi);
				setState(1055);
				crossDomainMethod();
				}
				}
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1061);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainMethodContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(TemplateRulesParser.Colon, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CrossDomainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainMethodContext crossDomainMethod() throws RecognitionException {
		CrossDomainMethodContext _localctx = new CrossDomainMethodContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_crossDomainMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			match(Identifier);
			setState(1064);
			match(Colon);
			setState(1065);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainCouplingsContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TemplateRulesParser.LeftBrace, 0); }
		public List<CrossDomainCouplingContext> crossDomainCoupling() {
			return getRuleContexts(CrossDomainCouplingContext.class);
		}
		public CrossDomainCouplingContext crossDomainCoupling(int i) {
			return getRuleContext(CrossDomainCouplingContext.class,i);
		}
		public TerminalNode RightBrace() { return getToken(TemplateRulesParser.RightBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public CrossDomainCouplingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainCouplings; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainCouplings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainCouplingsContext crossDomainCouplings() throws RecognitionException {
		CrossDomainCouplingsContext _localctx = new CrossDomainCouplingsContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_crossDomainCouplings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(T__14);
			setState(1068);
			match(LeftBrace);
			setState(1069);
			crossDomainCoupling();
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1070);
				match(Comma);
				setState(1071);
				crossDomainCoupling();
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1077);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainCouplingContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TemplateRulesParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(TemplateRulesParser.StringLiteral, 0); }
		public TerminalNode LeftBracket() { return getToken(TemplateRulesParser.LeftBracket, 0); }
		public CrossDomainCouplingInputsContext crossDomainCouplingInputs() {
			return getRuleContext(CrossDomainCouplingInputsContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(TemplateRulesParser.RightBracket, 0); }
		public CrossDomainCouplingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainCoupling; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainCoupling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainCouplingContext crossDomainCoupling() throws RecognitionException {
		CrossDomainCouplingContext _localctx = new CrossDomainCouplingContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_crossDomainCoupling);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(Identifier);
			setState(1080);
			match(StringLiteral);
			setState(1081);
			match(LeftBracket);
			setState(1082);
			crossDomainCouplingInputs();
			setState(1083);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CrossDomainCouplingInputsContext extends ParserRuleContext {
		public List<TerminalNode> StringLiteral() { return getTokens(TemplateRulesParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(TemplateRulesParser.StringLiteral, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TemplateRulesParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TemplateRulesParser.Comma, i);
		}
		public CrossDomainCouplingInputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossDomainCouplingInputs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitCrossDomainCouplingInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrossDomainCouplingInputsContext crossDomainCouplingInputs() throws RecognitionException {
		CrossDomainCouplingInputsContext _localctx = new CrossDomainCouplingInputsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_crossDomainCouplingInputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(StringLiteral);
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1086);
				match(Comma);
				setState(1087);
				match(StringLiteral);
				}
				}
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 47:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 57:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001u\u0446\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"\u00c6\b\u0000\u000b\u0000\f\u0000\u00c7\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u00ce\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u00d3\b\u0001\n\u0001\f\u0001\u00d6\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00da\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00e1\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00e9\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00ed\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00f5\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u00fc\b\u0003\n\u0003\f\u0003\u00ff\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004\u0104\b\u0004\n\u0004\f\u0004\u0107\t\u0004\u0001\u0005"+
		"\u0005\u0005\u010a\b\u0005\n\u0005\f\u0005\u010d\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u011a\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0003\u0007\u011f\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u0128\b\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u012d\b\b\n\b\f\b"+
		"\u0130\t\b\u0001\t\u0001\t\u0001\t\u0005\t\u0135\b\t\n\t\f\t\u0138\t\t"+
		"\u0001\n\u0001\n\u0001\n\u0005\n\u013d\b\n\n\n\f\n\u0140\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0145\b\u000b\n\u000b\f\u000b\u0148"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u014d\b\f\n\f\f\f\u0150\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u0155\b\r\n\r\f\r\u0158\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u015d\b\u000e\n\u000e\f\u000e\u0160\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0165\b\u000f\n\u000f"+
		"\f\u000f\u0168\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u016d\b\u0010\n\u0010\f\u0010\u0170\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0175\b\u0011\n\u0011\f\u0011\u0178\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0180\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0188\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u018f\b\u0015\n\u0015\f\u0015\u0192"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0198"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u019d\b\u0017"+
		"\u0001\u0018\u0004\u0018\u01a0\b\u0018\u000b\u0018\f\u0018\u01a1\u0001"+
		"\u0019\u0004\u0019\u01a5\b\u0019\u000b\u0019\f\u0019\u01a6\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01ae\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01b3\b\u001b\n\u001b"+
		"\f\u001b\u01b6\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u01bb\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0003\u001e\u01d4\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u01d8\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u01e1\b\u001f\u0001 \u0001 \u0001!\u0004"+
		"!\u01e6\b!\u000b!\f!\u01e7\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01f2\b\"\u0001#\u0001#\u0003#\u01f6\b#\u0001"+
		"#\u0003#\u01f9\b#\u0001$\u0001$\u0001$\u0005$\u01fe\b$\n$\f$\u0201\t$"+
		"\u0001%\u0001%\u0003%\u0205\b%\u0001%\u0001%\u0003%\u0209\b%\u0001&\u0001"+
		"&\u0003&\u020d\b&\u0001&\u0001&\u0001&\u0003&\u0212\b&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u0218\b&\u0001\'\u0001\'\u0001\'\u0005\'\u021d\b\'\n\'"+
		"\f\'\u0220\t\'\u0001(\u0001(\u0001(\u0003(\u0225\b(\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u0238\b,\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u023e\b-\u0001-\u0001-\u0001.\u0003.\u0243\b.\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u0250"+
		"\b/\u0001/\u0001/\u0001/\u0003/\u0255\b/\u0001/\u0003/\u0258\b/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u025f\b/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u026e\b/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u027a\b/\u0001/\u0005/\u027d\b/\n/\f/\u0280\t/\u00010"+
		"\u00010\u00010\u00010\u00010\u00050\u0287\b0\n0\f0\u028a\t0\u00011\u0001"+
		"1\u00031\u028e\b1\u00041\u0290\b1\u000b1\f1\u0291\u00012\u00042\u0295"+
		"\b2\u000b2\f2\u0296\u00013\u00013\u00013\u00033\u029c\b3\u00014\u0001"+
		"4\u00014\u00054\u02a1\b4\n4\f4\u02a4\t4\u00015\u00015\u00015\u00015\u0001"+
		"5\u00035\u02ab\b5\u00035\u02ad\b5\u00016\u00016\u00016\u00056\u02b2\b"+
		"6\n6\f6\u02b5\t6\u00017\u00017\u00037\u02b9\b7\u00018\u00018\u00038\u02bd"+
		"\b8\u00018\u00038\u02c0\b8\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00039\u02c9\b9\u00019\u00039\u02cc\b9\u00019\u00019\u00019\u00019\u0003"+
		"9\u02d2\b9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00039\u02e2\b9\u00019\u00039\u02e5"+
		"\b9\u00019\u00019\u00019\u00039\u02ea\b9\u00019\u00039\u02ed\b9\u0001"+
		"9\u00019\u00019\u00019\u00019\u00039\u02f4\b9\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00039\u0307\b9\u00019\u00059\u030a\b9\n9\f9\u030d"+
		"\t9\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0003;\u0315\b;\u0001;\u0001"+
		";\u0003;\u0319\b;\u0001<\u0003<\u031c\b<\u0001<\u0001<\u0001<\u0003<\u0321"+
		"\b<\u0001<\u0005<\u0324\b<\n<\f<\u0327\t<\u0001=\u0001=\u0001=\u0001>"+
		"\u0004>\u032d\b>\u000b>\f>\u032e\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0003?\u0337\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0004@\u033e\b@\u000b"+
		"@\f@\u033f\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0003A\u034b\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0003B\u0358\bB\u0001C\u0001C\u0003C\u035c\bC\u0001"+
		"C\u0001C\u0001D\u0004D\u0361\bD\u000bD\fD\u0362\u0001E\u0001E\u0003E\u0367"+
		"\bE\u0001F\u0003F\u036a\bF\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0003G\u0375\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0003G\u037d\bG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"H\u0001H\u0001H\u0003H\u0393\bH\u0001I\u0001I\u0003I\u0397\bI\u0003I\u0399"+
		"\bI\u0001I\u0001I\u0003I\u039d\bI\u0001I\u0001I\u0003I\u03a1\bI\u0001"+
		"J\u0001J\u0003J\u03a5\bJ\u0001K\u0001K\u0001K\u0005K\u03aa\bK\nK\fK\u03ad"+
		"\tK\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0003L\u03b5\bL\u0001L\u0001"+
		"L\u0003L\u03b9\bL\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0001N\u0004N\u03c4\bN\u000bN\fN\u03c5\u0001O\u0001O\u0001O\u0003O\u03cb"+
		"\bO\u0001P\u0003P\u03ce\bP\u0001P\u0001P\u0003P\u03d2\bP\u0001P\u0001"+
		"P\u0001Q\u0004Q\u03d7\bQ\u000bQ\fQ\u03d8\u0001R\u0001R\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001T\u0001T\u0001T\u0001T\u0001"+
		"U\u0001U\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0001W\u0001W\u0001"+
		"W\u0001W\u0001W\u0001W\u0005W\u03f7\bW\nW\fW\u03fa\tW\u0001W\u0001W\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0003Y\u040a\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0005Z\u0411"+
		"\bZ\nZ\fZ\u0414\tZ\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0001[\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0005\\\u0421\b\\\n\\\f\\\u0424\t\\\u0001\\"+
		"\u0001\\\u0001]\u0001]\u0001]\u0001]\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0005^\u0431\b^\n^\f^\u0434\t^\u0001^\u0001^\u0001_\u0001_\u0001_\u0001"+
		"_\u0001_\u0001_\u0001`\u0001`\u0001`\u0005`\u0441\b`\n`\f`\u0444\t`\u0001"+
		"`\u0000\u0002^ra\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u0000"+
		"\u000f\u0001\u0000gh\u0003\u0000((IIKK\u0002\u0000((33\u0005\u0000HHJ"+
		"JLLOOTU\u0001\u0000LN\u0002\u0000HHJJ\u0001\u0000FG\u0001\u0000BE\u0001"+
		"\u0000ef\u0001\u0000Zd\u0006\u0000\u0010\u0010\u001b\u001b##)),,;;\u0002"+
		"\u0000**--\u0004\u0000\u0014\u0014$$0044\u0001\u0000<=\u0002\u0000LLS"+
		"S\u0492\u0000\u00cd\u0001\u0000\u0000\u0000\u0002\u00cf\u0001\u0000\u0000"+
		"\u0000\u0004\u00d9\u0001\u0000\u0000\u0000\u0006\u00ec\u0001\u0000\u0000"+
		"\u0000\b\u0100\u0001\u0000\u0000\u0000\n\u010b\u0001\u0000\u0000\u0000"+
		"\f\u011b\u0001\u0000\u0000\u0000\u000e\u0127\u0001\u0000\u0000\u0000\u0010"+
		"\u0129\u0001\u0000\u0000\u0000\u0012\u0131\u0001\u0000\u0000\u0000\u0014"+
		"\u0139\u0001\u0000\u0000\u0000\u0016\u0141\u0001\u0000\u0000\u0000\u0018"+
		"\u0149\u0001\u0000\u0000\u0000\u001a\u0151\u0001\u0000\u0000\u0000\u001c"+
		"\u0159\u0001\u0000\u0000\u0000\u001e\u0161\u0001\u0000\u0000\u0000 \u0169"+
		"\u0001\u0000\u0000\u0000\"\u0171\u0001\u0000\u0000\u0000$\u0179\u0001"+
		"\u0000\u0000\u0000&\u0187\u0001\u0000\u0000\u0000(\u0189\u0001\u0000\u0000"+
		"\u0000*\u018b\u0001\u0000\u0000\u0000,\u0193\u0001\u0000\u0000\u0000."+
		"\u019c\u0001\u0000\u0000\u00000\u019f\u0001\u0000\u0000\u00002\u01a4\u0001"+
		"\u0000\u0000\u00004\u01ad\u0001\u0000\u0000\u00006\u01af\u0001\u0000\u0000"+
		"\u00008\u01b7\u0001\u0000\u0000\u0000:\u01bc\u0001\u0000\u0000\u0000<"+
		"\u01d3\u0001\u0000\u0000\u0000>\u01e0\u0001\u0000\u0000\u0000@\u01e2\u0001"+
		"\u0000\u0000\u0000B\u01e5\u0001\u0000\u0000\u0000D\u01f1\u0001\u0000\u0000"+
		"\u0000F\u01f5\u0001\u0000\u0000\u0000H\u01fa\u0001\u0000\u0000\u0000J"+
		"\u0208\u0001\u0000\u0000\u0000L\u0217\u0001\u0000\u0000\u0000N\u0219\u0001"+
		"\u0000\u0000\u0000P\u0221\u0001\u0000\u0000\u0000R\u0226\u0001\u0000\u0000"+
		"\u0000T\u0228\u0001\u0000\u0000\u0000V\u022d\u0001\u0000\u0000\u0000X"+
		"\u0237\u0001\u0000\u0000\u0000Z\u0239\u0001\u0000\u0000\u0000\\\u0242"+
		"\u0001\u0000\u0000\u0000^\u024f\u0001\u0000\u0000\u0000`\u0288\u0001\u0000"+
		"\u0000\u0000b\u028f\u0001\u0000\u0000\u0000d\u0294\u0001\u0000\u0000\u0000"+
		"f\u0298\u0001\u0000\u0000\u0000h\u029d\u0001\u0000\u0000\u0000j\u02ac"+
		"\u0001\u0000\u0000\u0000l\u02ae\u0001\u0000\u0000\u0000n\u02b6\u0001\u0000"+
		"\u0000\u0000p\u02bf\u0001\u0000\u0000\u0000r\u02e4\u0001\u0000\u0000\u0000"+
		"t\u030e\u0001\u0000\u0000\u0000v\u0318\u0001\u0000\u0000\u0000x\u031b"+
		"\u0001\u0000\u0000\u0000z\u0328\u0001\u0000\u0000\u0000|\u032c\u0001\u0000"+
		"\u0000\u0000~\u0336\u0001\u0000\u0000\u0000\u0080\u0338\u0001\u0000\u0000"+
		"\u0000\u0082\u034a\u0001\u0000\u0000\u0000\u0084\u0357\u0001\u0000\u0000"+
		"\u0000\u0086\u0359\u0001\u0000\u0000\u0000\u0088\u0360\u0001\u0000\u0000"+
		"\u0000\u008a\u0366\u0001\u0000\u0000\u0000\u008c\u0369\u0001\u0000\u0000"+
		"\u0000\u008e\u037c\u0001\u0000\u0000\u0000\u0090\u0392\u0001\u0000\u0000"+
		"\u0000\u0092\u0398\u0001\u0000\u0000\u0000\u0094\u03a2\u0001\u0000\u0000"+
		"\u0000\u0096\u03a6\u0001\u0000\u0000\u0000\u0098\u03b8\u0001\u0000\u0000"+
		"\u0000\u009a\u03bc\u0001\u0000\u0000\u0000\u009c\u03c3\u0001\u0000\u0000"+
		"\u0000\u009e\u03ca\u0001\u0000\u0000\u0000\u00a0\u03cd\u0001\u0000\u0000"+
		"\u0000\u00a2\u03d6\u0001\u0000\u0000\u0000\u00a4\u03da\u0001\u0000\u0000"+
		"\u0000\u00a6\u03dc\u0001\u0000\u0000\u0000\u00a8\u03e4\u0001\u0000\u0000"+
		"\u0000\u00aa\u03e8\u0001\u0000\u0000\u0000\u00ac\u03ec\u0001\u0000\u0000"+
		"\u0000\u00ae\u03f0\u0001\u0000\u0000\u0000\u00b0\u03fd\u0001\u0000\u0000"+
		"\u0000\u00b2\u0409\u0001\u0000\u0000\u0000\u00b4\u040b\u0001\u0000\u0000"+
		"\u0000\u00b6\u0417\u0001\u0000\u0000\u0000\u00b8\u041b\u0001\u0000\u0000"+
		"\u0000\u00ba\u0427\u0001\u0000\u0000\u0000\u00bc\u042b\u0001\u0000\u0000"+
		"\u0000\u00be\u0437\u0001\u0000\u0000\u0000\u00c0\u043d\u0001\u0000\u0000"+
		"\u0000\u00c2\u00ce\u0005j\u0000\u0000\u00c3\u00ce\u0005l\u0000\u0000\u00c4"+
		"\u00c6\u0005n\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ce\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005<\u0000\u0000\u00ca\u00cb\u0003*\u0015\u0000\u00cb\u00cc\u0005="+
		"\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00c2\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c3\u0001\u0000\u0000\u0000\u00cd\u00c5\u0001\u0000"+
		"\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00ce\u0001\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d4\u0003\u0004\u0002\u0000\u00d0\u00d1\u0005Y\u0000"+
		"\u0000\u00d1\u00d3\u0003\u0004\u0002\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u0003\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da\u0003n7\u0000\u00d8"+
		"\u00da\u0005\u0016\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0005W\u0000\u0000\u00dc\u00dd\u0003&\u0013\u0000\u00dd\u0005\u0001"+
		"\u0000\u0000\u0000\u00de\u00ed\u0003\u0000\u0000\u0000\u00df\u00e1\u0005"+
		"\u0001\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005"+
		"<\u0000\u0000\u00e3\u00e4\u0003n7\u0000\u00e4\u00e5\u0005=\u0000\u0000"+
		"\u00e5\u00e6\u0005@\u0000\u0000\u00e6\u00e8\u0003x<\u0000\u00e7\u00e9"+
		"\u0005Y\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		"A\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00de\u0001\u0000"+
		"\u0000\u0000\u00ec\u00e0\u0001\u0000\u0000\u0000\u00ed\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005>\u0000\u0000\u00ef\u00f0\u0003*\u0015\u0000"+
		"\u00f0\u00f1\u0005?\u0000\u0000\u00f1\u00fc\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f4\u0005<\u0000\u0000\u00f3\u00f5\u0003\b\u0004\u0000\u00f4\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f6\u00fc\u0005=\u0000\u0000\u00f7\u00f8\u0007"+
		"\u0000\u0000\u0000\u00f8\u00fc\u0005j\u0000\u0000\u00f9\u00fc\u0005I\u0000"+
		"\u0000\u00fa\u00fc\u0005K\u0000\u0000\u00fb\u00ee\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f2\u0001\u0000\u0000\u0000\u00fb\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0007\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0105\u0003&\u0013\u0000\u0101"+
		"\u0102\u0005Y\u0000\u0000\u0102\u0104\u0003&\u0013\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\t\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010a\u0007\u0001"+
		"\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u010d\u0001\u0000"+
		"\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u0119\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010e\u011a\u0003\u0006\u0003\u0000\u010f\u0110\u0003\f\u0006"+
		"\u0000\u0110\u0111\u0003\u000e\u0007\u0000\u0111\u011a\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0007\u0002\u0000\u0000\u0113\u0114\u0005<\u0000\u0000"+
		"\u0114\u0115\u0003n7\u0000\u0115\u0116\u0005=\u0000\u0000\u0116\u011a"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0005Q\u0000\u0000\u0118\u011a\u0005"+
		"j\u0000\u0000\u0119\u010e\u0001\u0000\u0000\u0000\u0119\u010f\u0001\u0000"+
		"\u0000\u0000\u0119\u0112\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000"+
		"\u0000\u0000\u011a\u000b\u0001\u0000\u0000\u0000\u011b\u011c\u0007\u0003"+
		"\u0000\u0000\u011c\r\u0001\u0000\u0000\u0000\u011d\u011f\u0005\u0001\u0000"+
		"\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0005<\u0000\u0000"+
		"\u0121\u0122\u0003n7\u0000\u0122\u0123\u0005=\u0000\u0000\u0123\u0124"+
		"\u0003\u000e\u0007\u0000\u0124\u0128\u0001\u0000\u0000\u0000\u0125\u0128"+
		"\u0003\n\u0005\u0000\u0126\u0128\u0005m\u0000\u0000\u0127\u011e\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0126\u0001"+
		"\u0000\u0000\u0000\u0128\u000f\u0001\u0000\u0000\u0000\u0129\u012e\u0003"+
		"\u000e\u0007\u0000\u012a\u012b\u0007\u0004\u0000\u0000\u012b\u012d\u0003"+
		"\u000e\u0007\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0130\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u0011\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0131\u0136\u0003\u0010\b\u0000\u0132\u0133\u0007\u0005"+
		"\u0000\u0000\u0133\u0135\u0003\u0010\b\u0000\u0134\u0132\u0001\u0000\u0000"+
		"\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0013\u0001\u0000\u0000"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013e\u0003\u0012\t\u0000"+
		"\u013a\u013b\u0007\u0006\u0000\u0000\u013b\u013d\u0003\u0012\t\u0000\u013c"+
		"\u013a\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f"+
		"\u0015\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141"+
		"\u0146\u0003\u0014\n\u0000\u0142\u0143\u0007\u0007\u0000\u0000\u0143\u0145"+
		"\u0003\u0014\n\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0148\u0001"+
		"\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0017\u0001\u0000\u0000\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0149\u014e\u0003\u0016\u000b\u0000\u014a\u014b\u0007"+
		"\b\u0000\u0000\u014b\u014d\u0003\u0016\u000b\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0019\u0001\u0000"+
		"\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0156\u0003\u0018"+
		"\f\u0000\u0152\u0153\u0005O\u0000\u0000\u0153\u0155\u0003\u0018\f\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000"+
		"\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000"+
		"\u0157\u001b\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0159\u015e\u0003\u001a\r\u0000\u015a\u015b\u0005S\u0000\u0000\u015b"+
		"\u015d\u0003\u001a\r\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015d\u0160"+
		"\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0001\u0000\u0000\u0000\u015f\u001d\u0001\u0000\u0000\u0000\u0160\u015e"+
		"\u0001\u0000\u0000\u0000\u0161\u0166\u0003\u001c\u000e\u0000\u0162\u0163"+
		"\u0005P\u0000\u0000\u0163\u0165\u0003\u001c\u000e\u0000\u0164\u0162\u0001"+
		"\u0000\u0000\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001"+
		"\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u001f\u0001"+
		"\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016e\u0003"+
		"\u001e\u000f\u0000\u016a\u016b\u0005Q\u0000\u0000\u016b\u016d\u0003\u001e"+
		"\u000f\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000"+
		"\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000"+
		"\u0000\u0000\u016f!\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000"+
		"\u0000\u0171\u0176\u0003 \u0010\u0000\u0172\u0173\u0005R\u0000\u0000\u0173"+
		"\u0175\u0003 \u0010\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0178"+
		"\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0001\u0000\u0000\u0000\u0177#\u0001\u0000\u0000\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0179\u017f\u0003\"\u0011\u0000\u017a\u017b\u0005V"+
		"\u0000\u0000\u017b\u017c\u0003*\u0015\u0000\u017c\u017d\u0005W\u0000\u0000"+
		"\u017d\u017e\u0003$\u0012\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f"+
		"\u017a\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180"+
		"%\u0001\u0000\u0000\u0000\u0181\u0188\u0003$\u0012\u0000\u0182\u0183\u0003"+
		"\n\u0005\u0000\u0183\u0184\u0003(\u0014\u0000\u0184\u0185\u0003&\u0013"+
		"\u0000\u0185\u0188\u0001\u0000\u0000\u0000\u0186\u0188\u0005m\u0000\u0000"+
		"\u0187\u0181\u0001\u0000\u0000\u0000\u0187\u0182\u0001\u0000\u0000\u0000"+
		"\u0187\u0186\u0001\u0000\u0000\u0000\u0188\'\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0007\t\u0000\u0000\u018a)\u0001\u0000\u0000\u0000\u018b\u0190"+
		"\u0003&\u0013\u0000\u018c\u018d\u0005Y\u0000\u0000\u018d\u018f\u0003&"+
		"\u0013\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000"+
		"\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191+\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0003$\u0012\u0000\u0194-\u0001\u0000\u0000\u0000\u0195"+
		"\u0197\u00030\u0018\u0000\u0196\u0198\u00036\u001b\u0000\u0197\u0196\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0005X\u0000\u0000\u019a\u019d\u0001\u0000"+
		"\u0000\u0000\u019b\u019d\u0003\u0080@\u0000\u019c\u0195\u0001\u0000\u0000"+
		"\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d/\u0001\u0000\u0000\u0000"+
		"\u019e\u01a0\u00034\u001a\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a21\u0001\u0000\u0000\u0000\u01a3\u01a5"+
		"\u00034\u001a\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a73\u0001\u0000\u0000\u0000\u01a8\u01ae\u0003:\u001d"+
		"\u0000\u01a9\u01ae\u0003<\u001e\u0000\u01aa\u01ae\u0003V+\u0000\u01ab"+
		"\u01ae\u0003X,\u0000\u01ac\u01ae\u0003Z-\u0000\u01ad\u01a8\u0001\u0000"+
		"\u0000\u0000\u01ad\u01a9\u0001\u0000\u0000\u0000\u01ad\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ae5\u0001\u0000\u0000\u0000\u01af\u01b4\u00038\u001c\u0000"+
		"\u01b0\u01b1\u0005Y\u0000\u0000\u01b1\u01b3\u00038\u001c\u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b57\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01ba\u0003"+
		"\\.\u0000\u01b8\u01b9\u0005Z\u0000\u0000\u01b9\u01bb\u0003v;\u0000\u01ba"+
		"\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb"+
		"9\u0001\u0000\u0000\u0000\u01bc\u01bd\u0007\n\u0000\u0000\u01bd;\u0001"+
		"\u0000\u0000\u0000\u01be\u01d4\u0005/\u0000\u0000\u01bf\u01d4\u0005\u0013"+
		"\u0000\u0000\u01c0\u01d4\u0005&\u0000\u0000\u01c1\u01d4\u0005!\u0000\u0000"+
		"\u01c2\u01d4\u0005\"\u0000\u0000\u01c3\u01d4\u0005\u001c\u0000\u0000\u01c4"+
		"\u01d4\u0005\u0018\u0000\u0000\u01c5\u01d4\u0005\'\u0000\u0000\u01c6\u01d4"+
		"\u0005.\u0000\u0000\u01c7\u01d4\u0005\u0002\u0000\u0000\u01c8\u01d4\u0005"+
		"\u0003\u0000\u0000\u01c9\u01d4\u0003T*\u0000\u01ca\u01d4\u0003>\u001f"+
		"\u0000\u01cb\u01d4\u0003L&\u0000\u01cc\u01d4\u0003t:\u0000\u01cd\u01ce"+
		"\u0005\u0004\u0000\u0000\u01ce\u01cf\u0005<\u0000\u0000\u01cf\u01d0\u0003"+
		",\u0016\u0000\u01d0\u01d1\u0005=\u0000\u0000\u01d1\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d4\u0003\u00b2Y\u0000\u01d3\u01be\u0001\u0000\u0000\u0000"+
		"\u01d3\u01bf\u0001\u0000\u0000\u0000\u01d3\u01c0\u0001\u0000\u0000\u0000"+
		"\u01d3\u01c1\u0001\u0000\u0000\u0000\u01d3\u01c2\u0001\u0000\u0000\u0000"+
		"\u01d3\u01c3\u0001\u0000\u0000\u0000\u01d3\u01c4\u0001\u0000\u0000\u0000"+
		"\u01d3\u01c5\u0001\u0000\u0000\u0000\u01d3\u01c6\u0001\u0000\u0000\u0000"+
		"\u01d3\u01c7\u0001\u0000\u0000\u0000\u01d3\u01c8\u0001\u0000\u0000\u0000"+
		"\u01d3\u01c9\u0001\u0000\u0000\u0000\u01d3\u01ca\u0001\u0000\u0000\u0000"+
		"\u01d3\u01cb\u0001\u0000\u0000\u0000\u01d3\u01cc\u0001\u0000\u0000\u0000"+
		"\u01d3\u01cd\u0001\u0000\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000"+
		"\u01d4=\u0001\u0000\u0000\u0000\u01d5\u01d7\u0003@ \u0000\u01d6\u01d8"+
		"\u0005j\u0000\u0000\u01d7\u01d6\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9\u01da\u0005"+
		"@\u0000\u0000\u01da\u01db\u0003B!\u0000\u01db\u01dc\u0005A\u0000\u0000"+
		"\u01dc\u01e1\u0001\u0000\u0000\u0000\u01dd\u01de\u0003@ \u0000\u01de\u01df"+
		"\u0005j\u0000\u0000\u01df\u01e1\u0001\u0000\u0000\u0000\u01e0\u01d5\u0001"+
		"\u0000\u0000\u0000\u01e0\u01dd\u0001\u0000\u0000\u0000\u01e1?\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e3\u0007\u000b\u0000\u0000\u01e3A\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e6\u0003D\"\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8C\u0001\u0000\u0000\u0000\u01e9"+
		"\u01ea\u0003F#\u0000\u01ea\u01eb\u0003H$\u0000\u01eb\u01ec\u0005X\u0000"+
		"\u0000\u01ec\u01f2\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003F#\u0000\u01ee"+
		"\u01ef\u0005X\u0000\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01f2"+
		"\u0003\u0080@\u0000\u01f1\u01e9\u0001\u0000\u0000\u0000\u01f1\u01ed\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f2E\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f6\u0003<\u001e\u0000\u01f4\u01f6\u0003V+\u0000"+
		"\u01f5\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01f9\u0003F#\u0000\u01f8\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9G\u0001"+
		"\u0000\u0000\u0000\u01fa\u01ff\u0003J%\u0000\u01fb\u01fc\u0005Y\u0000"+
		"\u0000\u01fc\u01fe\u0003J%\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe"+
		"\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200I\u0001\u0000\u0000\u0000\u0201\u01ff"+
		"\u0001\u0000\u0000\u0000\u0202\u0209\u0003\\.\u0000\u0203\u0205\u0003"+
		"\\.\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0207\u0005W\u0000"+
		"\u0000\u0207\u0209\u0003,\u0016\u0000\u0208\u0202\u0001\u0000\u0000\u0000"+
		"\u0208\u0204\u0001\u0000\u0000\u0000\u0209K\u0001\u0000\u0000\u0000\u020a"+
		"\u020c\u0005\u001a\u0000\u0000\u020b\u020d\u0005j\u0000\u0000\u020c\u020b"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0005@\u0000\u0000\u020f\u0211\u0003"+
		"N\'\u0000\u0210\u0212\u0005Y\u0000\u0000\u0211\u0210\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000"+
		"\u0000\u0213\u0214\u0005A\u0000\u0000\u0214\u0218\u0001\u0000\u0000\u0000"+
		"\u0215\u0216\u0005\u001a\u0000\u0000\u0216\u0218\u0005j\u0000\u0000\u0217"+
		"\u020a\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218"+
		"M\u0001\u0000\u0000\u0000\u0219\u021e\u0003P(\u0000\u021a\u021b\u0005"+
		"Y\u0000\u0000\u021b\u021d\u0003P(\u0000\u021c\u021a\u0001\u0000\u0000"+
		"\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021fO\u0001\u0000\u0000\u0000"+
		"\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0224\u0003R)\u0000\u0222\u0223"+
		"\u0005Z\u0000\u0000\u0223\u0225\u0003,\u0016\u0000\u0224\u0222\u0001\u0000"+
		"\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225Q\u0001\u0000\u0000"+
		"\u0000\u0226\u0227\u0005j\u0000\u0000\u0227S\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u00054\u0000\u0000\u0229\u022a\u0005<\u0000\u0000\u022a\u022b\u0003"+
		"n7\u0000\u022b\u022c\u0005=\u0000\u0000\u022cU\u0001\u0000\u0000\u0000"+
		"\u022d\u022e\u0007\f\u0000\u0000\u022eW\u0001\u0000\u0000\u0000\u022f"+
		"\u0238\u0005 \u0000\u0000\u0230\u0238\u00059\u0000\u0000\u0231\u0238\u0005"+
		"\u0005\u0000\u0000\u0232\u0238\u0005\u0006\u0000\u0000\u0233\u0234\u0005"+
		"\u0007\u0000\u0000\u0234\u0235\u0005<\u0000\u0000\u0235\u0236\u0005j\u0000"+
		"\u0000\u0236\u0238\u0005=\u0000\u0000\u0237\u022f\u0001\u0000\u0000\u0000"+
		"\u0237\u0230\u0001\u0000\u0000\u0000\u0237\u0231\u0001\u0000\u0000\u0000"+
		"\u0237\u0232\u0001\u0000\u0000\u0000\u0237\u0233\u0001\u0000\u0000\u0000"+
		"\u0238Y\u0001\u0000\u0000\u0000\u0239\u023a\u00052\u0000\u0000\u023a\u023d"+
		"\u0005<\u0000\u0000\u023b\u023e\u0003n7\u0000\u023c\u023e\u0003,\u0016"+
		"\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023c\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0005=\u0000\u0000"+
		"\u0240[\u0001\u0000\u0000\u0000\u0241\u0243\u0003b1\u0000\u0242\u0241"+
		"\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243\u0244"+
		"\u0001\u0000\u0000\u0000\u0244\u0245\u0003^/\u0000\u0245]\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0006/\uffff\uffff\u0000\u0247\u0250\u0005j\u0000"+
		"\u0000\u0248\u0249\u0005<\u0000\u0000\u0249\u024a\u0003\\.\u0000\u024a"+
		"\u024b\u0005=\u0000\u0000\u024b\u0250\u0001\u0000\u0000\u0000\u024c\u024d"+
		"\u0005j\u0000\u0000\u024d\u024e\u0005W\u0000\u0000\u024e\u0250\u0005m"+
		"\u0000\u0000\u024f\u0246\u0001\u0000\u0000\u0000\u024f\u0248\u0001\u0000"+
		"\u0000\u0000\u024f\u024c\u0001\u0000\u0000\u0000\u0250\u027e\u0001\u0000"+
		"\u0000\u0000\u0251\u0252\n\u0007\u0000\u0000\u0252\u0254\u0005>\u0000"+
		"\u0000\u0253\u0255\u0003d2\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255\u0257\u0001\u0000\u0000\u0000\u0256"+
		"\u0258\u0003&\u0013\u0000\u0257\u0256\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u027d"+
		"\u0005?\u0000\u0000\u025a\u025b\n\u0006\u0000\u0000\u025b\u025c\u0005"+
		">\u0000\u0000\u025c\u025e\u0005)\u0000\u0000\u025d\u025f\u0003d2\u0000"+
		"\u025e\u025d\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0003&\u0013\u0000\u0261"+
		"\u0262\u0005?\u0000\u0000\u0262\u027d\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\n\u0005\u0000\u0000\u0264\u0265\u0005>\u0000\u0000\u0265\u0266\u0003"+
		"d2\u0000\u0266\u0267\u0005)\u0000\u0000\u0267\u0268\u0003&\u0013\u0000"+
		"\u0268\u0269\u0005?\u0000\u0000\u0269\u027d\u0001\u0000\u0000\u0000\u026a"+
		"\u026b\n\u0004\u0000\u0000\u026b\u026d\u0005>\u0000\u0000\u026c\u026e"+
		"\u0003d2\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026d\u026e\u0001\u0000"+
		"\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000\u026f\u0270\u0005L\u0000"+
		"\u0000\u0270\u027d\u0005?\u0000\u0000\u0271\u0272\n\u0003\u0000\u0000"+
		"\u0272\u0273\u0005<\u0000\u0000\u0273\u0274\u0003f3\u0000\u0274\u0275"+
		"\u0005=\u0000\u0000\u0275\u027d\u0001\u0000\u0000\u0000\u0276\u0277\n"+
		"\u0002\u0000\u0000\u0277\u0279\u0005<\u0000\u0000\u0278\u027a\u0003l6"+
		"\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000"+
		"\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027d\u0005=\u0000\u0000"+
		"\u027c\u0251\u0001\u0000\u0000\u0000\u027c\u025a\u0001\u0000\u0000\u0000"+
		"\u027c\u0263\u0001\u0000\u0000\u0000\u027c\u026a\u0001\u0000\u0000\u0000"+
		"\u027c\u0271\u0001\u0000\u0000\u0000\u027c\u0276\u0001\u0000\u0000\u0000"+
		"\u027d\u0280\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000"+
		"\u027e\u027f\u0001\u0000\u0000\u0000\u027f_\u0001\u0000\u0000\u0000\u0280"+
		"\u027e\u0001\u0000\u0000\u0000\u0281\u0287\b\r\u0000\u0000\u0282\u0283"+
		"\u0005<\u0000\u0000\u0283\u0284\u0003`0\u0000\u0284\u0285\u0005=\u0000"+
		"\u0000\u0285\u0287\u0001\u0000\u0000\u0000\u0286\u0281\u0001\u0000\u0000"+
		"\u0000\u0286\u0282\u0001\u0000\u0000\u0000\u0287\u028a\u0001\u0000\u0000"+
		"\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0288\u0289\u0001\u0000\u0000"+
		"\u0000\u0289a\u0001\u0000\u0000\u0000\u028a\u0288\u0001\u0000\u0000\u0000"+
		"\u028b\u028d\u0007\u000e\u0000\u0000\u028c\u028e\u0003d2\u0000\u028d\u028c"+
		"\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u0290"+
		"\u0001\u0000\u0000\u0000\u028f\u028b\u0001\u0000\u0000\u0000\u0290\u0291"+
		"\u0001\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0291\u0292"+
		"\u0001\u0000\u0000\u0000\u0292c\u0001\u0000\u0000\u0000\u0293\u0295\u0003"+
		"V+\u0000\u0294\u0293\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000\u0000"+
		"\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000"+
		"\u0000\u0297e\u0001\u0000\u0000\u0000\u0298\u029b\u0003h4\u0000\u0299"+
		"\u029a\u0005Y\u0000\u0000\u029a\u029c\u0005i\u0000\u0000\u029b\u0299\u0001"+
		"\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029cg\u0001\u0000"+
		"\u0000\u0000\u029d\u02a2\u0003j5\u0000\u029e\u029f\u0005Y\u0000\u0000"+
		"\u029f\u02a1\u0003j5\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a1\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a3"+
		"\u0001\u0000\u0000\u0000\u02a3i\u0001\u0000\u0000\u0000\u02a4\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a6\u00030\u0018\u0000\u02a6\u02a7\u0003\\"+
		".\u0000\u02a7\u02ad\u0001\u0000\u0000\u0000\u02a8\u02aa\u00032\u0019\u0000"+
		"\u02a9\u02ab\u0003p8\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab"+
		"\u0001\u0000\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000\u0000\u02ac\u02a5"+
		"\u0001\u0000\u0000\u0000\u02ac\u02a8\u0001\u0000\u0000\u0000\u02adk\u0001"+
		"\u0000\u0000\u0000\u02ae\u02b3\u0005j\u0000\u0000\u02af\u02b0\u0005Y\u0000"+
		"\u0000\u02b0\u02b2\u0005j\u0000\u0000\u02b1\u02af\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b5\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4m\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b8\u0003F#\u0000\u02b7\u02b9\u0003"+
		"p8\u0000\u02b8\u02b7\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000"+
		"\u0000\u02b9o\u0001\u0000\u0000\u0000\u02ba\u02c0\u0003b1\u0000\u02bb"+
		"\u02bd\u0003b1\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000\u02be\u02c0\u0003"+
		"r9\u0000\u02bf\u02ba\u0001\u0000\u0000\u0000\u02bf\u02bc\u0001\u0000\u0000"+
		"\u0000\u02c0q\u0001\u0000\u0000\u0000\u02c1\u02c2\u00069\uffff\uffff\u0000"+
		"\u02c2\u02c3\u0005<\u0000\u0000\u02c3\u02c4\u0003p8\u0000\u02c4\u02c5"+
		"\u0005=\u0000\u0000\u02c5\u02e5\u0001\u0000\u0000\u0000\u02c6\u02c8\u0005"+
		">\u0000\u0000\u02c7\u02c9\u0003d2\u0000\u02c8\u02c7\u0001\u0000\u0000"+
		"\u0000\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02cb\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cc\u0003&\u0013\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000"+
		"\u02cd\u02e5\u0005?\u0000\u0000\u02ce\u02cf\u0005>\u0000\u0000\u02cf\u02d1"+
		"\u0005)\u0000\u0000\u02d0\u02d2\u0003d2\u0000\u02d1\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d4\u0003&\u0013\u0000\u02d4\u02d5\u0005?\u0000\u0000"+
		"\u02d5\u02e5\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005>\u0000\u0000\u02d7"+
		"\u02d8\u0003d2\u0000\u02d8\u02d9\u0005)\u0000\u0000\u02d9\u02da\u0003"+
		"&\u0013\u0000\u02da\u02db\u0005?\u0000\u0000\u02db\u02e5\u0001\u0000\u0000"+
		"\u0000\u02dc\u02dd\u0005>\u0000\u0000\u02dd\u02de\u0005L\u0000\u0000\u02de"+
		"\u02e5\u0005?\u0000\u0000\u02df\u02e1\u0005<\u0000\u0000\u02e0\u02e2\u0003"+
		"f3\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e5\u0005=\u0000\u0000"+
		"\u02e4\u02c1\u0001\u0000\u0000\u0000\u02e4\u02c6\u0001\u0000\u0000\u0000"+
		"\u02e4\u02ce\u0001\u0000\u0000\u0000\u02e4\u02d6\u0001\u0000\u0000\u0000"+
		"\u02e4\u02dc\u0001\u0000\u0000\u0000\u02e4\u02df\u0001\u0000\u0000\u0000"+
		"\u02e5\u030b\u0001\u0000\u0000\u0000\u02e6\u02e7\n\u0005\u0000\u0000\u02e7"+
		"\u02e9\u0005>\u0000\u0000\u02e8\u02ea\u0003d2\u0000\u02e9\u02e8\u0001"+
		"\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02ec\u0001"+
		"\u0000\u0000\u0000\u02eb\u02ed\u0003&\u0013\u0000\u02ec\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000"+
		"\u0000\u0000\u02ee\u030a\u0005?\u0000\u0000\u02ef\u02f0\n\u0004\u0000"+
		"\u0000\u02f0\u02f1\u0005>\u0000\u0000\u02f1\u02f3\u0005)\u0000\u0000\u02f2"+
		"\u02f4\u0003d2\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02f6\u0003"+
		"&\u0013\u0000\u02f6\u02f7\u0005?\u0000\u0000\u02f7\u030a\u0001\u0000\u0000"+
		"\u0000\u02f8\u02f9\n\u0003\u0000\u0000\u02f9\u02fa\u0005>\u0000\u0000"+
		"\u02fa\u02fb\u0003d2\u0000\u02fb\u02fc\u0005)\u0000\u0000\u02fc\u02fd"+
		"\u0003&\u0013\u0000\u02fd\u02fe\u0005?\u0000\u0000\u02fe\u030a\u0001\u0000"+
		"\u0000\u0000\u02ff\u0300\n\u0002\u0000\u0000\u0300\u0301\u0005>\u0000"+
		"\u0000\u0301\u0302\u0005L\u0000\u0000\u0302\u030a\u0005?\u0000\u0000\u0303"+
		"\u0304\n\u0001\u0000\u0000\u0304\u0306\u0005<\u0000\u0000\u0305\u0307"+
		"\u0003f3\u0000\u0306\u0305\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000"+
		"\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u030a\u0005=\u0000"+
		"\u0000\u0309\u02e6\u0001\u0000\u0000\u0000\u0309\u02ef\u0001\u0000\u0000"+
		"\u0000\u0309\u02f8\u0001\u0000\u0000\u0000\u0309\u02ff\u0001\u0000\u0000"+
		"\u0000\u0309\u0303\u0001\u0000\u0000\u0000\u030a\u030d\u0001\u0000\u0000"+
		"\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000"+
		"\u0000\u030cs\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000"+
		"\u030e\u030f\u0005j\u0000\u0000\u030fu\u0001\u0000\u0000\u0000\u0310\u0319"+
		"\u0003&\u0013\u0000\u0311\u0312\u0005@\u0000\u0000\u0312\u0314\u0003x"+
		"<\u0000\u0313\u0315\u0005Y\u0000\u0000\u0314\u0313\u0001\u0000\u0000\u0000"+
		"\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000"+
		"\u0316\u0317\u0005A\u0000\u0000\u0317\u0319\u0001\u0000\u0000\u0000\u0318"+
		"\u0310\u0001\u0000\u0000\u0000\u0318\u0311\u0001\u0000\u0000\u0000\u0319"+
		"w\u0001\u0000\u0000\u0000\u031a\u031c\u0003z=\u0000\u031b\u031a\u0001"+
		"\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0001"+
		"\u0000\u0000\u0000\u031d\u0325\u0003v;\u0000\u031e\u0320\u0005Y\u0000"+
		"\u0000\u031f\u0321\u0003z=\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322"+
		"\u0324\u0003v;\u0000\u0323\u031e\u0001\u0000\u0000\u0000\u0324\u0327\u0001"+
		"\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325\u0326\u0001"+
		"\u0000\u0000\u0000\u0326y\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000"+
		"\u0000\u0000\u0328\u0329\u0003|>\u0000\u0329\u032a\u0005Z\u0000\u0000"+
		"\u032a{\u0001\u0000\u0000\u0000\u032b\u032d\u0003~?\u0000\u032c\u032b"+
		"\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u032c"+
		"\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f}\u0001"+
		"\u0000\u0000\u0000\u0330\u0331\u0005>\u0000\u0000\u0331\u0332\u0003,\u0016"+
		"\u0000\u0332\u0333\u0005?\u0000\u0000\u0333\u0337\u0001\u0000\u0000\u0000"+
		"\u0334\u0335\u0005h\u0000\u0000\u0335\u0337\u0005j\u0000\u0000\u0336\u0330"+
		"\u0001\u0000\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0337\u007f"+
		"\u0001\u0000\u0000\u0000\u0338\u0339\u0005:\u0000\u0000\u0339\u033a\u0005"+
		"<\u0000\u0000\u033a\u033b\u0003,\u0016\u0000\u033b\u033d\u0005Y\u0000"+
		"\u0000\u033c\u033e\u0005n\u0000\u0000\u033d\u033c\u0001\u0000\u0000\u0000"+
		"\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u033d\u0001\u0000\u0000\u0000"+
		"\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0341\u0001\u0000\u0000\u0000"+
		"\u0341\u0342\u0005=\u0000\u0000\u0342\u0343\u0005X\u0000\u0000\u0343\u0081"+
		"\u0001\u0000\u0000\u0000\u0344\u034b\u0003\u0084B\u0000\u0345\u034b\u0003"+
		"\u0086C\u0000\u0346\u034b\u0003\u008cF\u0000\u0347\u034b\u0003\u008eG"+
		"\u0000\u0348\u034b\u0003\u0090H\u0000\u0349\u034b\u0003\u0098L\u0000\u034a"+
		"\u0344\u0001\u0000\u0000\u0000\u034a\u0345\u0001\u0000\u0000\u0000\u034a"+
		"\u0346\u0001\u0000\u0000\u0000\u034a\u0347\u0001\u0000\u0000\u0000\u034a"+
		"\u0348\u0001\u0000\u0000\u0000\u034a\u0349\u0001\u0000\u0000\u0000\u034b"+
		"\u0083\u0001\u0000\u0000\u0000\u034c\u034d\u0005j\u0000\u0000\u034d\u034e"+
		"\u0005W\u0000\u0000\u034e\u0358\u0003\u0082A\u0000\u034f\u0350\u0005\u0012"+
		"\u0000\u0000\u0350\u0351\u0003,\u0016\u0000\u0351\u0352\u0005W\u0000\u0000"+
		"\u0352\u0353\u0003\u0082A\u0000\u0353\u0358\u0001\u0000\u0000\u0000\u0354"+
		"\u0355\u0005\u0016\u0000\u0000\u0355\u0356\u0005W\u0000\u0000\u0356\u0358"+
		"\u0003\u0082A\u0000\u0357\u034c\u0001\u0000\u0000\u0000\u0357\u034f\u0001"+
		"\u0000\u0000\u0000\u0357\u0354\u0001\u0000\u0000\u0000\u0358\u0085\u0001"+
		"\u0000\u0000\u0000\u0359\u035b\u0005@\u0000\u0000\u035a\u035c\u0003\u0088"+
		"D\u0000\u035b\u035a\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000\u0000"+
		"\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u035e\u0005A\u0000\u0000"+
		"\u035e\u0087\u0001\u0000\u0000\u0000\u035f\u0361\u0003\u008aE\u0000\u0360"+
		"\u035f\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362"+
		"\u0360\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363"+
		"\u0089\u0001\u0000\u0000\u0000\u0364\u0367\u0003\u0082A\u0000\u0365\u0367"+
		"\u0003.\u0017\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0366\u0365\u0001"+
		"\u0000\u0000\u0000\u0367\u008b\u0001\u0000\u0000\u0000\u0368\u036a\u0003"+
		"*\u0015\u0000\u0369\u0368\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000"+
		"\u0000\u0000\u036a\u036b\u0001\u0000\u0000\u0000\u036b\u036c\u0005X\u0000"+
		"\u0000\u036c\u008d\u0001\u0000\u0000\u0000\u036d\u036e\u0005\u001f\u0000"+
		"\u0000\u036e\u036f\u0005<\u0000\u0000\u036f\u0370\u0003*\u0015\u0000\u0370"+
		"\u0371\u0005=\u0000\u0000\u0371\u0374\u0003\u0082A\u0000\u0372\u0373\u0005"+
		"\u0019\u0000\u0000\u0373\u0375\u0003\u0082A\u0000\u0374\u0372\u0001\u0000"+
		"\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u037d\u0001\u0000"+
		"\u0000\u0000\u0376\u0377\u0005+\u0000\u0000\u0377\u0378\u0005<\u0000\u0000"+
		"\u0378\u0379\u0003*\u0015\u0000\u0379\u037a\u0005=\u0000\u0000\u037a\u037b"+
		"\u0003\u0082A\u0000\u037b\u037d\u0001\u0000\u0000\u0000\u037c\u036d\u0001"+
		"\u0000\u0000\u0000\u037c\u0376\u0001\u0000\u0000\u0000\u037d\u008f\u0001"+
		"\u0000\u0000\u0000\u037e\u037f\u00051\u0000\u0000\u037f\u0380\u0005<\u0000"+
		"\u0000\u0380\u0381\u0003*\u0015\u0000\u0381\u0382\u0005=\u0000\u0000\u0382"+
		"\u0383\u0003\u0082A\u0000\u0383\u0393\u0001\u0000\u0000\u0000\u0384\u0385"+
		"\u0005\u0017\u0000\u0000\u0385\u0386\u0003\u0082A\u0000\u0386\u0387\u0005"+
		"1\u0000\u0000\u0387\u0388\u0005<\u0000\u0000\u0388\u0389\u0003*\u0015"+
		"\u0000\u0389\u038a\u0005=\u0000\u0000\u038a\u038b\u0005X\u0000\u0000\u038b"+
		"\u0393\u0001\u0000\u0000\u0000\u038c\u038d\u0005\u001d\u0000\u0000\u038d"+
		"\u038e\u0005<\u0000\u0000\u038e\u038f\u0003\u0092I\u0000\u038f\u0390\u0005"+
		"=\u0000\u0000\u0390\u0391\u0003\u0082A\u0000\u0391\u0393\u0001\u0000\u0000"+
		"\u0000\u0392\u037e\u0001\u0000\u0000\u0000\u0392\u0384\u0001\u0000\u0000"+
		"\u0000\u0392\u038c\u0001\u0000\u0000\u0000\u0393\u0091\u0001\u0000\u0000"+
		"\u0000\u0394\u0399\u0003\u0094J\u0000\u0395\u0397\u0003*\u0015\u0000\u0396"+
		"\u0395\u0001\u0000\u0000\u0000\u0396\u0397\u0001\u0000\u0000\u0000\u0397"+
		"\u0399\u0001\u0000\u0000\u0000\u0398\u0394\u0001\u0000\u0000\u0000\u0398"+
		"\u0396\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a"+
		"\u039c\u0005X\u0000\u0000\u039b\u039d\u0003\u0096K\u0000\u039c\u039b\u0001"+
		"\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u039e\u0001"+
		"\u0000\u0000\u0000\u039e\u03a0\u0005X\u0000\u0000\u039f\u03a1\u0003\u0096"+
		"K\u0000\u03a0\u039f\u0001\u0000\u0000\u0000\u03a0\u03a1\u0001\u0000\u0000"+
		"\u0000\u03a1\u0093\u0001\u0000\u0000\u0000\u03a2\u03a4\u00030\u0018\u0000"+
		"\u03a3\u03a5\u00036\u001b\u0000\u03a4\u03a3\u0001\u0000\u0000\u0000\u03a4"+
		"\u03a5\u0001\u0000\u0000\u0000\u03a5\u0095\u0001\u0000\u0000\u0000\u03a6"+
		"\u03ab\u0003&\u0013\u0000\u03a7\u03a8\u0005Y\u0000\u0000\u03a8\u03aa\u0003"+
		"&\u0013\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03aa\u03ad\u0001\u0000"+
		"\u0000\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000"+
		"\u0000\u0000\u03ac\u0097\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000"+
		"\u0000\u0000\u03ae\u03af\u0005\u001e\u0000\u0000\u03af\u03b9\u0005j\u0000"+
		"\u0000\u03b0\u03b9\u0005\u0015\u0000\u0000\u03b1\u03b9\u0005\u0011\u0000"+
		"\u0000\u03b2\u03b4\u0005%\u0000\u0000\u03b3\u03b5\u0003*\u0015\u0000\u03b4"+
		"\u03b3\u0001\u0000\u0000\u0000\u03b4\u03b5\u0001\u0000\u0000\u0000\u03b5"+
		"\u03b9\u0001\u0000\u0000\u0000\u03b6\u03b7\u0005\u001e\u0000\u0000\u03b7"+
		"\u03b9\u0003\n\u0005\u0000\u03b8\u03ae\u0001\u0000\u0000\u0000\u03b8\u03b0"+
		"\u0001\u0000\u0000\u0000\u03b8\u03b1\u0001\u0000\u0000\u0000\u03b8\u03b2"+
		"\u0001\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b9\u03ba"+
		"\u0001\u0000\u0000\u0000\u03ba\u03bb\u0005X\u0000\u0000\u03bb\u0099\u0001"+
		"\u0000\u0000\u0000\u03bc\u03bd\u0003\u00a6S\u0000\u03bd\u03be\u0003\u00b4"+
		"Z\u0000\u03be\u03bf\u0003\u00b8\\\u0000\u03bf\u03c0\u0003\u00bc^\u0000"+
		"\u03c0\u03c1\u0005\u0000\u0000\u0001\u03c1\u009b\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c4\u0003\u009eO\u0000\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c4"+
		"\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c5"+
		"\u03c6\u0001\u0000\u0000\u0000\u03c6\u009d\u0001\u0000\u0000\u0000\u03c7"+
		"\u03cb\u0003\u00a0P\u0000\u03c8\u03cb\u0003.\u0017\u0000\u03c9\u03cb\u0005"+
		"X\u0000\u0000\u03ca\u03c7\u0001\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000"+
		"\u0000\u0000\u03ca\u03c9\u0001\u0000\u0000\u0000\u03cb\u009f\u0001\u0000"+
		"\u0000\u0000\u03cc\u03ce\u00030\u0018\u0000\u03cd\u03cc\u0001\u0000\u0000"+
		"\u0000\u03cd\u03ce\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000"+
		"\u0000\u03cf\u03d1\u0003\\.\u0000\u03d0\u03d2\u0003\u00a2Q\u0000\u03d1"+
		"\u03d0\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d3\u03d4\u0003\u0086C\u0000\u03d4\u00a1"+
		"\u0001\u0000\u0000\u0000\u03d5\u03d7\u0003.\u0017\u0000\u03d6\u03d5\u0001"+
		"\u0000\u0000\u0000\u03d7\u03d8\u0001\u0000\u0000\u0000\u03d8\u03d6\u0001"+
		"\u0000\u0000\u0000\u03d8\u03d9\u0001\u0000\u0000\u0000\u03d9\u00a3\u0001"+
		"\u0000\u0000\u0000\u03da\u03db\u0005j\u0000\u0000\u03db\u00a5\u0001\u0000"+
		"\u0000\u0000\u03dc\u03dd\u0005\b\u0000\u0000\u03dd\u03de\u0005@\u0000"+
		"\u0000\u03de\u03df\u0003\u00a8T\u0000\u03df\u03e0\u0003\u00aaU\u0000\u03e0"+
		"\u03e1\u0003\u00acV\u0000\u03e1\u03e2\u0003\u00aeW\u0000\u03e2\u03e3\u0005"+
		"A\u0000\u0000\u03e3\u00a7\u0001\u0000\u0000\u0000\u03e4\u03e5\u0005\t"+
		"\u0000\u0000\u03e5\u03e6\u0005W\u0000\u0000\u03e6\u03e7\u0005n\u0000\u0000"+
		"\u03e7\u00a9\u0001\u0000\u0000\u0000\u03e8\u03e9\u0005\n\u0000\u0000\u03e9"+
		"\u03ea\u0005W\u0000\u0000\u03ea\u03eb\u0005n\u0000\u0000\u03eb\u00ab\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ed\u0005\u000b\u0000\u0000\u03ed\u03ee\u0005"+
		"W\u0000\u0000\u03ee\u03ef\u0005n\u0000\u0000\u03ef\u00ad\u0001\u0000\u0000"+
		"\u0000\u03f0\u03f1\u0005\f\u0000\u0000\u03f1\u03f2\u0005W\u0000\u0000"+
		"\u03f2\u03f3\u0005>\u0000\u0000\u03f3\u03f8\u0003\u00b0X\u0000\u03f4\u03f5"+
		"\u0005Y\u0000\u0000\u03f5\u03f7\u0003\u00b0X\u0000\u03f6\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f7\u03fa\u0001\u0000\u0000\u0000\u03f8\u03f6\u0001\u0000"+
		"\u0000\u0000\u03f8\u03f9\u0001\u0000\u0000\u0000\u03f9\u03fb\u0001\u0000"+
		"\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000\u03fb\u03fc\u0005?\u0000"+
		"\u0000\u03fc\u00af\u0001\u0000\u0000\u0000\u03fd\u03fe\u0005n\u0000\u0000"+
		"\u03fe\u03ff\u0005>\u0000\u0000\u03ff\u0400\u0005k\u0000\u0000\u0400\u0401"+
		"\u0005?\u0000\u0000\u0401\u00b1\u0001\u0000\u0000\u0000\u0402\u0403\u0005"+
		"o\u0000\u0000\u0403\u0404\u0005W\u0000\u0000\u0404\u040a\u0005j\u0000"+
		"\u0000\u0405\u0406\u0003\u00a4R\u0000\u0406\u0407\u0005W\u0000\u0000\u0407"+
		"\u0408\u0005j\u0000\u0000\u0408\u040a\u0001\u0000\u0000\u0000\u0409\u0402"+
		"\u0001\u0000\u0000\u0000\u0409\u0405\u0001\u0000\u0000\u0000\u040a\u00b3"+
		"\u0001\u0000\u0000\u0000\u040b\u040c\u0005\r\u0000\u0000\u040c\u040d\u0005"+
		"@\u0000\u0000\u040d\u0412\u0003\u00b6[\u0000\u040e\u040f\u0005Y\u0000"+
		"\u0000\u040f\u0411\u0003\u00b6[\u0000\u0410\u040e\u0001\u0000\u0000\u0000"+
		"\u0411\u0414\u0001\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000"+
		"\u0412\u0413\u0001\u0000\u0000\u0000\u0413\u0415\u0001\u0000\u0000\u0000"+
		"\u0414\u0412\u0001\u0000\u0000\u0000\u0415\u0416\u0005A\u0000\u0000\u0416"+
		"\u00b5\u0001\u0000\u0000\u0000\u0417\u0418\u0005o\u0000\u0000\u0418\u0419"+
		"\u0005W\u0000\u0000\u0419\u041a\u0003\u00a4R\u0000\u041a\u00b7\u0001\u0000"+
		"\u0000\u0000\u041b\u041c\u0005\u000e\u0000\u0000\u041c\u041d\u0005@\u0000"+
		"\u0000\u041d\u0422\u0003\u00ba]\u0000\u041e\u041f\u0005X\u0000\u0000\u041f"+
		"\u0421\u0003\u00ba]\u0000\u0420\u041e\u0001\u0000\u0000\u0000\u0421\u0424"+
		"\u0001\u0000\u0000\u0000\u0422\u0420\u0001\u0000\u0000\u0000\u0422\u0423"+
		"\u0001\u0000\u0000\u0000\u0423\u0425\u0001\u0000\u0000\u0000\u0424\u0422"+
		"\u0001\u0000\u0000\u0000\u0425\u0426\u0005A\u0000\u0000\u0426\u00b9\u0001"+
		"\u0000\u0000\u0000\u0427\u0428\u0005j\u0000\u0000\u0428\u0429\u0005W\u0000"+
		"\u0000\u0429\u042a\u0003.\u0017\u0000\u042a\u00bb\u0001\u0000\u0000\u0000"+
		"\u042b\u042c\u0005\u000f\u0000\u0000\u042c\u042d\u0005@\u0000\u0000\u042d"+
		"\u0432\u0003\u00be_\u0000\u042e\u042f\u0005Y\u0000\u0000\u042f\u0431\u0003"+
		"\u00be_\u0000\u0430\u042e\u0001\u0000\u0000\u0000\u0431\u0434\u0001\u0000"+
		"\u0000\u0000\u0432\u0430\u0001\u0000\u0000\u0000\u0432\u0433\u0001\u0000"+
		"\u0000\u0000\u0433\u0435\u0001\u0000\u0000\u0000\u0434\u0432\u0001\u0000"+
		"\u0000\u0000\u0435\u0436\u0005A\u0000\u0000\u0436\u00bd\u0001\u0000\u0000"+
		"\u0000\u0437\u0438\u0005j\u0000\u0000\u0438\u0439\u0005n\u0000\u0000\u0439"+
		"\u043a\u0005>\u0000\u0000\u043a\u043b\u0003\u00c0`\u0000\u043b\u043c\u0005"+
		"?\u0000\u0000\u043c\u00bf\u0001\u0000\u0000\u0000\u043d\u0442\u0005n\u0000"+
		"\u0000\u043e\u043f\u0005Y\u0000\u0000\u043f\u0441\u0005n\u0000\u0000\u0440"+
		"\u043e\u0001\u0000\u0000\u0000\u0441\u0444\u0001\u0000\u0000\u0000\u0442"+
		"\u0440\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443"+
		"\u00c1\u0001\u0000\u0000\u0000\u0444\u0442\u0001\u0000\u0000\u0000y\u00c7"+
		"\u00cd\u00d4\u00d9\u00e0\u00e8\u00ec\u00f4\u00fb\u00fd\u0105\u010b\u0119"+
		"\u011e\u0127\u012e\u0136\u013e\u0146\u014e\u0156\u015e\u0166\u016e\u0176"+
		"\u017f\u0187\u0190\u0197\u019c\u01a1\u01a6\u01ad\u01b4\u01ba\u01d3\u01d7"+
		"\u01e0\u01e7\u01f1\u01f5\u01f8\u01ff\u0204\u0208\u020c\u0211\u0217\u021e"+
		"\u0224\u0237\u023d\u0242\u024f\u0254\u0257\u025e\u026d\u0279\u027c\u027e"+
		"\u0286\u0288\u028d\u0291\u0296\u029b\u02a2\u02aa\u02ac\u02b3\u02b8\u02bc"+
		"\u02bf\u02c8\u02cb\u02d1\u02e1\u02e4\u02e9\u02ec\u02f3\u0306\u0309\u030b"+
		"\u0314\u0318\u031b\u0320\u0325\u032e\u0336\u033f\u034a\u0357\u035b\u0362"+
		"\u0366\u0369\u0374\u037c\u0392\u0396\u0398\u039c\u03a0\u03a4\u03ab\u03b4"+
		"\u03b8\u03c5\u03ca\u03cd\u03d1\u03d8\u03f8\u0409\u0412\u0422\u0432\u0442";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}