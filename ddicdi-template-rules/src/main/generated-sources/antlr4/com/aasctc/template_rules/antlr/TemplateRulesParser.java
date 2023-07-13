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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, LPAREN=31, 
		RPAREN=32, COMMA=33, COLON=34, QUOTE=35, LBRACK=36, RBRACK=37, LBRACE=38, 
		RBRACE=39, IDENTIFIER=40, DATE=41, EMAIL=42, TRUE=43, FALSE=44, BOOLEAN=45, 
		WS=46, COMMENT=47, TEXT=48, URI=49, INT=50, FLOAT=51, STRING=52;
	public static final int
		RULE_methodProgram = 0, RULE_methodStatement = 1, RULE_methodAssignment = 2, 
		RULE_methodReturn = 3, RULE_methodExpression = 4, RULE_methodPrimaryExpression = 5, 
		RULE_intConstant = 6, RULE_floatConstant = 7, RULE_stringConstant = 8, 
		RULE_methodFunctionCall = 9, RULE_methodArgumentList = 10, RULE_methodPropertyAccess = 11, 
		RULE_methodConditional = 12, RULE_methodIfBlock = 13, RULE_methodElseIfBlock = 14, 
		RULE_methodElseBlock = 15, RULE_methodForEachLoop = 16, RULE_methodRange = 17, 
		RULE_methodType = 18, RULE_templateRulesDocument = 19, RULE_header = 20, 
		RULE_headerFields = 21, RULE_headerName = 22, RULE_headerDate = 23, RULE_headerAuthorList = 24, 
		RULE_headerAuthor = 25, RULE_headerAuthorName = 26, RULE_headerAuthorEmail = 27, 
		RULE_headerDescription = 28, RULE_templates = 29, RULE_namespaces = 30, 
		RULE_namespace = 31, RULE_namespaceName = 32, RULE_namespaceAlias = 33, 
		RULE_methods = 34, RULE_method = 35, RULE_methodName = 36, RULE_methodParameters = 37, 
		RULE_methodParameter = 38, RULE_methodParameterType = 39, RULE_methodParameterValue = 40, 
		RULE_rules = 41, RULE_rule = 42, RULE_ruleLocation = 43, RULE_ruleOutputElement = 44;
	private static String[] makeRuleNames() {
		return new String[] {
			"methodProgram", "methodStatement", "methodAssignment", "methodReturn", 
			"methodExpression", "methodPrimaryExpression", "intConstant", "floatConstant", 
			"stringConstant", "methodFunctionCall", "methodArgumentList", "methodPropertyAccess", 
			"methodConditional", "methodIfBlock", "methodElseIfBlock", "methodElseBlock", 
			"methodForEachLoop", "methodRange", "methodType", "templateRulesDocument", 
			"header", "headerFields", "headerName", "headerDate", "headerAuthorList", 
			"headerAuthor", "headerAuthorName", "headerAuthorEmail", "headerDescription", 
			"templates", "namespaces", "namespace", "namespaceName", "namespaceAlias", 
			"methods", "method", "methodName", "methodParameters", "methodParameter", 
			"methodParameterType", "methodParameterValue", "rules", "rule", "ruleLocation", 
			"ruleOutputElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'->'", "'='", "'return'", "'.'", "'if'", "'else'", "'foreach'", 
			"'..'", "'<'", "'>'", "'header'", "'name'", "'date'", "'author'", "'description'", 
			"'email'", "'templates'", "'namespaces'", "'namespace'", "'alias'", "'methods'", 
			"'method'", "'type'", "'parameters'", "'program'", "'rules'", "'rule'", 
			"'location'", "'outputElement'", "'('", "')'", "','", "':'", "'\"'", 
			"'['", "']'", "'{'", "'}'", null, "'YYYY-mm-ddTHH:MM:SS'", null, "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "LPAREN", "RPAREN", "COMMA", 
			"COLON", "QUOTE", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "IDENTIFIER", 
			"DATE", "EMAIL", "TRUE", "FALSE", "BOOLEAN", "WS", "COMMENT", "TEXT", 
			"URI", "INT", "FLOAT", "STRING"
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
	public static class MethodProgramContext extends ParserRuleContext {
		public List<MethodStatementContext> methodStatement() {
			return getRuleContexts(MethodStatementContext.class);
		}
		public MethodStatementContext methodStatement(int i) {
			return getRuleContext(MethodStatementContext.class,i);
		}
		public MethodProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodProgram; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodProgramContext methodProgram() throws RecognitionException {
		MethodProgramContext _localctx = new MethodProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_methodProgram);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				methodStatement();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7882401007010128L) != 0) );
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
	public static class MethodStatementContext extends ParserRuleContext {
		public MethodAssignmentContext methodAssignment() {
			return getRuleContext(MethodAssignmentContext.class,0);
		}
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public MethodConditionalContext methodConditional() {
			return getRuleContext(MethodConditionalContext.class,0);
		}
		public MethodForEachLoopContext methodForEachLoop() {
			return getRuleContext(MethodForEachLoopContext.class,0);
		}
		public MethodReturnContext methodReturn() {
			return getRuleContext(MethodReturnContext.class,0);
		}
		public MethodStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodStatementContext methodStatement() throws RecognitionException {
		MethodStatementContext _localctx = new MethodStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_methodStatement);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(95);
				methodAssignment();
				setState(96);
				match(T__0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(98);
				methodExpression();
				setState(99);
				match(T__0);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				methodConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				methodForEachLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(103);
				methodReturn();
				setState(104);
				match(T__0);
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
	public static class MethodAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public MethodAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodAssignmentContext methodAssignment() throws RecognitionException {
		MethodAssignmentContext _localctx = new MethodAssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IDENTIFIER);
			setState(109);
			match(T__1);
			setState(110);
			methodType();
			setState(111);
			match(T__2);
			setState(112);
			methodExpression();
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
	public static class MethodReturnContext extends ParserRuleContext {
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public MethodReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReturnContext methodReturn() throws RecognitionException {
		MethodReturnContext _localctx = new MethodReturnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__3);
			setState(115);
			methodExpression();
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
	public static class MethodExpressionContext extends ParserRuleContext {
		public MethodPrimaryExpressionContext methodPrimaryExpression() {
			return getRuleContext(MethodPrimaryExpressionContext.class,0);
		}
		public MethodFunctionCallContext methodFunctionCall() {
			return getRuleContext(MethodFunctionCallContext.class,0);
		}
		public MethodPropertyAccessContext methodPropertyAccess() {
			return getRuleContext(MethodPropertyAccessContext.class,0);
		}
		public MethodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodExpressionContext methodExpression() throws RecognitionException {
		MethodExpressionContext _localctx = new MethodExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodExpression);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				methodPrimaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				methodFunctionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				methodPropertyAccess();
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
	public static class MethodPrimaryExpressionContext extends ParserRuleContext {
		public IntConstantContext intConstant() {
			return getRuleContext(IntConstantContext.class,0);
		}
		public FloatConstantContext floatConstant() {
			return getRuleContext(FloatConstantContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TemplateRulesParser.LPAREN, 0); }
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TemplateRulesParser.RPAREN, 0); }
		public MethodPrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodPrimaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodPrimaryExpressionContext methodPrimaryExpression() throws RecognitionException {
		MethodPrimaryExpressionContext _localctx = new MethodPrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodPrimaryExpression);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				intConstant();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				floatConstant();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				stringConstant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(LPAREN);
				setState(127);
				methodExpression();
				setState(128);
				match(RPAREN);
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
	public static class IntConstantContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TemplateRulesParser.INT, 0); }
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public IntConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitIntConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntConstantContext intConstant() throws RecognitionException {
		IntConstantContext _localctx = new IntConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(INT);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(133);
				match(T__1);
				setState(134);
				methodType();
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
	public static class FloatConstantContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(TemplateRulesParser.FLOAT, 0); }
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public FloatConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitFloatConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatConstantContext floatConstant() throws RecognitionException {
		FloatConstantContext _localctx = new FloatConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(FLOAT);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(138);
				match(T__1);
				setState(139);
				methodType();
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
	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(TemplateRulesParser.STRING, 0); }
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(STRING);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(143);
				match(T__1);
				setState(144);
				methodType();
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
	public static class MethodFunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(TemplateRulesParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(TemplateRulesParser.RPAREN, 0); }
		public MethodArgumentListContext methodArgumentList() {
			return getRuleContext(MethodArgumentListContext.class,0);
		}
		public MethodFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodFunctionCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodFunctionCallContext methodFunctionCall() throws RecognitionException {
		MethodFunctionCallContext _localctx = new MethodFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IDENTIFIER);
			setState(148);
			match(LPAREN);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7882401007009792L) != 0)) {
				{
				setState(149);
				methodArgumentList();
				}
			}

			setState(152);
			match(RPAREN);
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
	public static class MethodArgumentListContext extends ParserRuleContext {
		public List<MethodExpressionContext> methodExpression() {
			return getRuleContexts(MethodExpressionContext.class);
		}
		public MethodExpressionContext methodExpression(int i) {
			return getRuleContext(MethodExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TemplateRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TemplateRulesParser.COMMA, i);
		}
		public MethodArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodArgumentList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodArgumentListContext methodArgumentList() throws RecognitionException {
		MethodArgumentListContext _localctx = new MethodArgumentListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			methodExpression();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				methodExpression();
				}
				}
				setState(161);
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
	public static class MethodPropertyAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TemplateRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TemplateRulesParser.IDENTIFIER, i);
		}
		public MethodPropertyAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodPropertyAccess; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodPropertyAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodPropertyAccessContext methodPropertyAccess() throws RecognitionException {
		MethodPropertyAccessContext _localctx = new MethodPropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodPropertyAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(IDENTIFIER);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				match(T__4);
				setState(164);
				match(IDENTIFIER);
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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
	public static class MethodConditionalContext extends ParserRuleContext {
		public MethodIfBlockContext methodIfBlock() {
			return getRuleContext(MethodIfBlockContext.class,0);
		}
		public List<MethodElseIfBlockContext> methodElseIfBlock() {
			return getRuleContexts(MethodElseIfBlockContext.class);
		}
		public MethodElseIfBlockContext methodElseIfBlock(int i) {
			return getRuleContext(MethodElseIfBlockContext.class,i);
		}
		public MethodElseBlockContext methodElseBlock() {
			return getRuleContext(MethodElseBlockContext.class,0);
		}
		public MethodConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodConditional; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodConditionalContext methodConditional() throws RecognitionException {
		MethodConditionalContext _localctx = new MethodConditionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodConditional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			methodIfBlock();
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(170);
					methodElseIfBlock();
					}
					} 
				}
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(176);
				methodElseBlock();
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
	public static class MethodIfBlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TemplateRulesParser.LPAREN, 0); }
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TemplateRulesParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public List<MethodStatementContext> methodStatement() {
			return getRuleContexts(MethodStatementContext.class);
		}
		public MethodStatementContext methodStatement(int i) {
			return getRuleContext(MethodStatementContext.class,i);
		}
		public MethodIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodIfBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodIfBlockContext methodIfBlock() throws RecognitionException {
		MethodIfBlockContext _localctx = new MethodIfBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_methodIfBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__5);
			setState(180);
			match(LPAREN);
			setState(181);
			methodExpression();
			setState(182);
			match(RPAREN);
			setState(183);
			match(LBRACE);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				methodStatement();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7882401007010128L) != 0) );
			setState(189);
			match(RBRACE);
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
	public static class MethodElseIfBlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TemplateRulesParser.LPAREN, 0); }
		public MethodExpressionContext methodExpression() {
			return getRuleContext(MethodExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TemplateRulesParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public List<MethodStatementContext> methodStatement() {
			return getRuleContexts(MethodStatementContext.class);
		}
		public MethodStatementContext methodStatement(int i) {
			return getRuleContext(MethodStatementContext.class,i);
		}
		public MethodElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodElseIfBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodElseIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodElseIfBlockContext methodElseIfBlock() throws RecognitionException {
		MethodElseIfBlockContext _localctx = new MethodElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_methodElseIfBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__6);
			setState(192);
			match(T__5);
			setState(193);
			match(LPAREN);
			setState(194);
			methodExpression();
			setState(195);
			match(RPAREN);
			setState(196);
			match(LBRACE);
			setState(198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(197);
				methodStatement();
				}
				}
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7882401007010128L) != 0) );
			setState(202);
			match(RBRACE);
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
	public static class MethodElseBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public List<MethodStatementContext> methodStatement() {
			return getRuleContexts(MethodStatementContext.class);
		}
		public MethodStatementContext methodStatement(int i) {
			return getRuleContext(MethodStatementContext.class,i);
		}
		public MethodElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodElseBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodElseBlockContext methodElseBlock() throws RecognitionException {
		MethodElseBlockContext _localctx = new MethodElseBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_methodElseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__6);
			setState(205);
			match(LBRACE);
			setState(207); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(206);
				methodStatement();
				}
				}
				setState(209); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7882401007010128L) != 0) );
			setState(211);
			match(RBRACE);
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
	public static class MethodForEachLoopContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(TemplateRulesParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(TemplateRulesParser.COLON, 0); }
		public MethodRangeContext methodRange() {
			return getRuleContext(MethodRangeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(TemplateRulesParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public List<MethodStatementContext> methodStatement() {
			return getRuleContexts(MethodStatementContext.class);
		}
		public MethodStatementContext methodStatement(int i) {
			return getRuleContext(MethodStatementContext.class,i);
		}
		public MethodForEachLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodForEachLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodForEachLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodForEachLoopContext methodForEachLoop() throws RecognitionException {
		MethodForEachLoopContext _localctx = new MethodForEachLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_methodForEachLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__7);
			setState(214);
			match(LPAREN);
			setState(215);
			match(IDENTIFIER);
			setState(216);
			match(COLON);
			setState(217);
			methodRange();
			setState(218);
			match(RPAREN);
			setState(219);
			match(LBRACE);
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				methodStatement();
				}
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 7882401007010128L) != 0) );
			setState(225);
			match(RBRACE);
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
	public static class MethodRangeContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(TemplateRulesParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(TemplateRulesParser.INT, i);
		}
		public MethodRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodRange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodRangeContext methodRange() throws RecognitionException {
		MethodRangeContext _localctx = new MethodRangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_methodRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(INT);
			setState(228);
			match(T__8);
			setState(229);
			match(INT);
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
	public static class MethodTypeContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TemplateRulesParser.COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TemplateRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TemplateRulesParser.IDENTIFIER, i);
		}
		public TerminalNode URI() { return getToken(TemplateRulesParser.URI, 0); }
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(231);
				match(IDENTIFIER);
				}
				break;
			case T__9:
				{
				setState(232);
				match(T__9);
				setState(233);
				match(URI);
				setState(234);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(237);
			match(COLON);
			setState(238);
			match(IDENTIFIER);
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
	public static class TemplateRulesDocumentContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TemplatesContext templates() {
			return getRuleContext(TemplatesContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public TemplateRulesDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateRulesDocument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitTemplateRulesDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateRulesDocumentContext templateRulesDocument() throws RecognitionException {
		TemplateRulesDocumentContext _localctx = new TemplateRulesDocumentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_templateRulesDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			header();
			setState(241);
			templates();
			setState(242);
			rules();
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
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public HeaderFieldsContext headerFields() {
			return getRuleContext(HeaderFieldsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__11);
			setState(245);
			match(LBRACE);
			setState(246);
			headerFields();
			setState(247);
			match(RBRACE);
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
	public static class HeaderFieldsContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(TemplateRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TemplateRulesParser.COLON, i);
		}
		public HeaderNameContext headerName() {
			return getRuleContext(HeaderNameContext.class,0);
		}
		public HeaderDateContext headerDate() {
			return getRuleContext(HeaderDateContext.class,0);
		}
		public HeaderAuthorListContext headerAuthorList() {
			return getRuleContext(HeaderAuthorListContext.class,0);
		}
		public HeaderDescriptionContext headerDescription() {
			return getRuleContext(HeaderDescriptionContext.class,0);
		}
		public HeaderFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerFields; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitHeaderFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderFieldsContext headerFields() throws RecognitionException {
		HeaderFieldsContext _localctx = new HeaderFieldsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_headerFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__12);
			setState(250);
			match(COLON);
			setState(251);
			headerName();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(252);
				match(T__13);
				setState(253);
				match(COLON);
				setState(254);
				headerDate();
				}
			}

			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(257);
				match(T__14);
				setState(258);
				match(COLON);
				setState(259);
				headerAuthorList();
				}
			}

			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(262);
				match(T__15);
				setState(263);
				match(COLON);
				setState(264);
				headerDescription();
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
	public static class HeaderNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public HeaderNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitHeaderName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderNameContext headerName() throws RecognitionException {
		HeaderNameContext _localctx = new HeaderNameContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_headerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(IDENTIFIER);
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
	public static class HeaderDateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(TemplateRulesParser.DATE, 0); }
		public HeaderDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerDate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitHeaderDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderDateContext headerDate() throws RecognitionException {
		HeaderDateContext _localctx = new HeaderDateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_headerDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(DATE);
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
	public static class HeaderAuthorListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TemplateRulesParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(TemplateRulesParser.RBRACK, 0); }
		public List<HeaderAuthorContext> headerAuthor() {
			return getRuleContexts(HeaderAuthorContext.class);
		}
		public HeaderAuthorContext headerAuthor(int i) {
			return getRuleContext(HeaderAuthorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TemplateRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TemplateRulesParser.COMMA, i);
		}
		public HeaderAuthorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerAuthorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitHeaderAuthorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderAuthorListContext headerAuthorList() throws RecognitionException {
		HeaderAuthorListContext _localctx = new HeaderAuthorListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_headerAuthorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LBRACK);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(272);
				headerAuthor();
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(273);
					match(COMMA);
					setState(274);
					headerAuthor();
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(282);
			match(RBRACK);
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
	public static class HeaderAuthorContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(TemplateRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TemplateRulesParser.COLON, i);
		}
		public HeaderAuthorNameContext headerAuthorName() {
			return getRuleContext(HeaderAuthorNameContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public HeaderAuthorEmailContext headerAuthorEmail() {
			return getRuleContext(HeaderAuthorEmailContext.class,0);
		}
		public HeaderAuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerAuthor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitHeaderAuthor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderAuthorContext headerAuthor() throws RecognitionException {
		HeaderAuthorContext _localctx = new HeaderAuthorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_headerAuthor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LBRACE);
			setState(285);
			match(T__12);
			setState(286);
			match(COLON);
			setState(287);
			headerAuthorName();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(288);
				match(T__16);
				setState(289);
				match(COLON);
				setState(290);
				headerAuthorEmail();
				}
			}

			setState(293);
			match(RBRACE);
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
	public static class HeaderAuthorNameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public HeaderAuthorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerAuthorName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitHeaderAuthorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderAuthorNameContext headerAuthorName() throws RecognitionException {
		HeaderAuthorNameContext _localctx = new HeaderAuthorNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_headerAuthorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(TEXT);
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
	public static class HeaderAuthorEmailContext extends ParserRuleContext {
		public TerminalNode EMAIL() { return getToken(TemplateRulesParser.EMAIL, 0); }
		public HeaderAuthorEmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerAuthorEmail; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitHeaderAuthorEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderAuthorEmailContext headerAuthorEmail() throws RecognitionException {
		HeaderAuthorEmailContext _localctx = new HeaderAuthorEmailContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_headerAuthorEmail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(EMAIL);
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
	public static class HeaderDescriptionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public HeaderDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerDescription; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitHeaderDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderDescriptionContext headerDescription() throws RecognitionException {
		HeaderDescriptionContext _localctx = new HeaderDescriptionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_headerDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(TEXT);
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
	public static class TemplatesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public NamespacesContext namespaces() {
			return getRuleContext(NamespacesContext.class,0);
		}
		public MethodsContext methods() {
			return getRuleContext(MethodsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public TemplatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templates; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitTemplates(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatesContext templates() throws RecognitionException {
		TemplatesContext _localctx = new TemplatesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_templates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__17);
			setState(302);
			match(LBRACE);
			setState(303);
			namespaces();
			setState(304);
			methods();
			setState(305);
			match(RBRACE);
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
	public static class NamespacesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public List<NamespaceContext> namespace() {
			return getRuleContexts(NamespaceContext.class);
		}
		public NamespaceContext namespace(int i) {
			return getRuleContext(NamespaceContext.class,i);
		}
		public NamespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaces; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacesContext namespaces() throws RecognitionException {
		NamespacesContext _localctx = new NamespacesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_namespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__18);
			setState(308);
			match(LBRACE);
			setState(310); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(309);
				namespace();
				}
				}
				setState(312); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__19 );
			setState(314);
			match(RBRACE);
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
	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(TemplateRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TemplateRulesParser.COLON, i);
		}
		public NamespaceNameContext namespaceName() {
			return getRuleContext(NamespaceNameContext.class,0);
		}
		public NamespaceAliasContext namespaceAlias() {
			return getRuleContext(NamespaceAliasContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__19);
			setState(317);
			match(LBRACE);
			setState(318);
			match(T__12);
			setState(319);
			match(COLON);
			setState(320);
			namespaceName();
			setState(321);
			match(T__20);
			setState(322);
			match(COLON);
			setState(323);
			namespaceAlias();
			setState(324);
			match(RBRACE);
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
	public static class NamespaceNameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public NamespaceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitNamespaceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceNameContext namespaceName() throws RecognitionException {
		NamespaceNameContext _localctx = new NamespaceNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_namespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(TEXT);
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
	public static class NamespaceAliasContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public NamespaceAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceAlias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitNamespaceAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceAliasContext namespaceAlias() throws RecognitionException {
		NamespaceAliasContext _localctx = new NamespaceAliasContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_namespaceAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(TEXT);
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
	public static class MethodsContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public MethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methods; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodsContext methods() throws RecognitionException {
		MethodsContext _localctx = new MethodsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__21);
			setState(331);
			match(LBRACE);
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				method();
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 );
			setState(337);
			match(RBRACE);
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
	public static class MethodContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(TemplateRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TemplateRulesParser.COLON, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(TemplateRulesParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(TemplateRulesParser.LBRACE, i);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public MethodParametersContext methodParameters() {
			return getRuleContext(MethodParametersContext.class,0);
		}
		public MethodProgramContext methodProgram() {
			return getRuleContext(MethodProgramContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TemplateRulesParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(TemplateRulesParser.RBRACE, i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__22);
			setState(340);
			match(COLON);
			setState(341);
			match(LBRACE);
			setState(342);
			match(T__12);
			setState(343);
			match(COLON);
			setState(344);
			methodName();
			setState(345);
			match(T__23);
			setState(346);
			match(COLON);
			setState(347);
			methodType();
			setState(348);
			match(T__24);
			setState(349);
			match(COLON);
			setState(350);
			methodParameters();
			setState(351);
			match(T__25);
			setState(352);
			match(COLON);
			setState(353);
			match(LBRACE);
			setState(354);
			methodProgram();
			setState(355);
			match(RBRACE);
			setState(356);
			match(RBRACE);
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
	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(IDENTIFIER);
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
	public static class MethodParametersContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TemplateRulesParser.LBRACK, 0); }
		public List<MethodParameterContext> methodParameter() {
			return getRuleContexts(MethodParameterContext.class);
		}
		public MethodParameterContext methodParameter(int i) {
			return getRuleContext(MethodParameterContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(TemplateRulesParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TemplateRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TemplateRulesParser.COMMA, i);
		}
		public MethodParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParametersContext methodParameters() throws RecognitionException {
		MethodParametersContext _localctx = new MethodParametersContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_methodParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(LBRACK);
			setState(361);
			methodParameter();
			setState(364); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(362);
				match(COMMA);
				setState(363);
				methodParameter();
				}
				}
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(368);
			match(RBRACK);
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
	public static class MethodParameterContext extends ParserRuleContext {
		public MethodParameterValueContext methodParameterValue() {
			return getRuleContext(MethodParameterValueContext.class,0);
		}
		public MethodParameterTypeContext methodParameterType() {
			return getRuleContext(MethodParameterTypeContext.class,0);
		}
		public MethodParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterContext methodParameter() throws RecognitionException {
		MethodParameterContext _localctx = new MethodParameterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_methodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			methodParameterValue();
			setState(371);
			match(T__1);
			setState(372);
			methodParameterType();
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
	public static class MethodParameterTypeContext extends ParserRuleContext {
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public MethodParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameterType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodParameterType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterTypeContext methodParameterType() throws RecognitionException {
		MethodParameterTypeContext _localctx = new MethodParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_methodParameterType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			methodType();
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
	public static class MethodParameterValueContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public MethodParameterValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodParameterValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitMethodParameterValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodParameterValueContext methodParameterValue() throws RecognitionException {
		MethodParameterValueContext _localctx = new MethodParameterValueContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_methodParameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(TEXT);
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
	public static class RulesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__26);
			setState(379);
			match(LBRACE);
			setState(381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(380);
				rule_();
				}
				}
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__27 );
			setState(385);
			match(RBRACE);
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
	public static class RuleContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(TemplateRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TemplateRulesParser.COLON, i);
		}
		public RuleLocationContext ruleLocation() {
			return getRuleContext(RuleLocationContext.class,0);
		}
		public RuleOutputElementContext ruleOutputElement() {
			return getRuleContext(RuleOutputElementContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__27);
			setState(388);
			match(LBRACE);
			setState(389);
			match(T__28);
			setState(390);
			match(COLON);
			setState(391);
			ruleLocation();
			setState(392);
			match(T__29);
			setState(393);
			match(COLON);
			setState(394);
			ruleOutputElement();
			setState(395);
			match(T__22);
			setState(396);
			match(COLON);
			setState(397);
			method();
			setState(398);
			match(RBRACE);
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
	public static class RuleLocationContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public RuleLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleLocation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitRuleLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleLocationContext ruleLocation() throws RecognitionException {
		RuleLocationContext _localctx = new RuleLocationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ruleLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(TEXT);
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
	public static class RuleOutputElementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public RuleOutputElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOutputElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitRuleOutputElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleOutputElementContext ruleOutputElement() throws RecognitionException {
		RuleOutputElementContext _localctx = new RuleOutputElementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ruleOutputElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(IDENTIFIER);
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

	public static final String _serializedATN =
		"\u0004\u00014\u0195\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0001"+
		"\u0000\u0004\u0000\\\b\u0000\u000b\u0000\f\u0000]\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"y\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u008d\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u0092\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u0097\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u009e\b\n\n\n\f\n\u00a1\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u00a6\b\u000b\u000b\u000b\f\u000b\u00a7"+
		"\u0001\f\u0001\f\u0005\f\u00ac\b\f\n\f\f\f\u00af\t\f\u0001\f\u0003\f\u00b2"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00ba\b\r"+
		"\u000b\r\f\r\u00bb\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00c7\b\u000e"+
		"\u000b\u000e\f\u000e\u00c8\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0004\u000f\u00d0\b\u000f\u000b\u000f\f\u000f\u00d1\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00de\b\u0010\u000b"+
		"\u0010\f\u0010\u00df\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u00ec\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0100\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0105\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u010a\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0114\b\u0018\n"+
		"\u0018\f\u0018\u0117\t\u0018\u0003\u0018\u0119\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0124\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0004\u001e\u0137\b\u001e\u000b\u001e\f"+
		"\u001e\u0138\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0004"+
		"\"\u014e\b\"\u000b\"\f\"\u014f\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0004%\u016d\b%\u000b%\f%\u016e\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0004)\u017e"+
		"\b)\u000b)\f)\u017f\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0000\u0000-\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVX\u0000\u0000\u0189\u0000[\u0001\u0000\u0000\u0000\u0002j\u0001\u0000"+
		"\u0000\u0000\u0004l\u0001\u0000\u0000\u0000\u0006r\u0001\u0000\u0000\u0000"+
		"\bx\u0001\u0000\u0000\u0000\n\u0082\u0001\u0000\u0000\u0000\f\u0084\u0001"+
		"\u0000\u0000\u0000\u000e\u0089\u0001\u0000\u0000\u0000\u0010\u008e\u0001"+
		"\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000\u0014\u009a\u0001"+
		"\u0000\u0000\u0000\u0016\u00a2\u0001\u0000\u0000\u0000\u0018\u00a9\u0001"+
		"\u0000\u0000\u0000\u001a\u00b3\u0001\u0000\u0000\u0000\u001c\u00bf\u0001"+
		"\u0000\u0000\u0000\u001e\u00cc\u0001\u0000\u0000\u0000 \u00d5\u0001\u0000"+
		"\u0000\u0000\"\u00e3\u0001\u0000\u0000\u0000$\u00eb\u0001\u0000\u0000"+
		"\u0000&\u00f0\u0001\u0000\u0000\u0000(\u00f4\u0001\u0000\u0000\u0000*"+
		"\u00f9\u0001\u0000\u0000\u0000,\u010b\u0001\u0000\u0000\u0000.\u010d\u0001"+
		"\u0000\u0000\u00000\u010f\u0001\u0000\u0000\u00002\u011c\u0001\u0000\u0000"+
		"\u00004\u0127\u0001\u0000\u0000\u00006\u0129\u0001\u0000\u0000\u00008"+
		"\u012b\u0001\u0000\u0000\u0000:\u012d\u0001\u0000\u0000\u0000<\u0133\u0001"+
		"\u0000\u0000\u0000>\u013c\u0001\u0000\u0000\u0000@\u0146\u0001\u0000\u0000"+
		"\u0000B\u0148\u0001\u0000\u0000\u0000D\u014a\u0001\u0000\u0000\u0000F"+
		"\u0153\u0001\u0000\u0000\u0000H\u0166\u0001\u0000\u0000\u0000J\u0168\u0001"+
		"\u0000\u0000\u0000L\u0172\u0001\u0000\u0000\u0000N\u0176\u0001\u0000\u0000"+
		"\u0000P\u0178\u0001\u0000\u0000\u0000R\u017a\u0001\u0000\u0000\u0000T"+
		"\u0183\u0001\u0000\u0000\u0000V\u0190\u0001\u0000\u0000\u0000X\u0192\u0001"+
		"\u0000\u0000\u0000Z\\\u0003\u0002\u0001\u0000[Z\u0001\u0000\u0000\u0000"+
		"\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^\u0001\u0001\u0000\u0000\u0000_`\u0003\u0004\u0002\u0000`a\u0005"+
		"\u0001\u0000\u0000ak\u0001\u0000\u0000\u0000bc\u0003\b\u0004\u0000cd\u0005"+
		"\u0001\u0000\u0000dk\u0001\u0000\u0000\u0000ek\u0003\u0018\f\u0000fk\u0003"+
		" \u0010\u0000gh\u0003\u0006\u0003\u0000hi\u0005\u0001\u0000\u0000ik\u0001"+
		"\u0000\u0000\u0000j_\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000"+
		"je\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000"+
		"\u0000k\u0003\u0001\u0000\u0000\u0000lm\u0005(\u0000\u0000mn\u0005\u0002"+
		"\u0000\u0000no\u0003$\u0012\u0000op\u0005\u0003\u0000\u0000pq\u0003\b"+
		"\u0004\u0000q\u0005\u0001\u0000\u0000\u0000rs\u0005\u0004\u0000\u0000"+
		"st\u0003\b\u0004\u0000t\u0007\u0001\u0000\u0000\u0000uy\u0003\n\u0005"+
		"\u0000vy\u0003\u0012\t\u0000wy\u0003\u0016\u000b\u0000xu\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\t\u0001\u0000"+
		"\u0000\u0000z\u0083\u0003\f\u0006\u0000{\u0083\u0003\u000e\u0007\u0000"+
		"|\u0083\u0003\u0010\b\u0000}\u0083\u0005(\u0000\u0000~\u007f\u0005\u001f"+
		"\u0000\u0000\u007f\u0080\u0003\b\u0004\u0000\u0080\u0081\u0005 \u0000"+
		"\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082z\u0001\u0000\u0000\u0000"+
		"\u0082{\u0001\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000\u0082}"+
		"\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0083\u000b\u0001"+
		"\u0000\u0000\u0000\u0084\u0087\u00052\u0000\u0000\u0085\u0086\u0005\u0002"+
		"\u0000\u0000\u0086\u0088\u0003$\u0012\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\r\u0001\u0000\u0000\u0000"+
		"\u0089\u008c\u00053\u0000\u0000\u008a\u008b\u0005\u0002\u0000\u0000\u008b"+
		"\u008d\u0003$\u0012\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u00054\u0000\u0000\u008f\u0090\u0005\u0002\u0000\u0000\u0090\u0092\u0003"+
		"$\u0012\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0011\u0001\u0000\u0000\u0000\u0093\u0094\u0005(\u0000"+
		"\u0000\u0094\u0096\u0005\u001f\u0000\u0000\u0095\u0097\u0003\u0014\n\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005 \u0000\u0000\u0099"+
		"\u0013\u0001\u0000\u0000\u0000\u009a\u009f\u0003\b\u0004\u0000\u009b\u009c"+
		"\u0005!\u0000\u0000\u009c\u009e\u0003\b\u0004\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u0015\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2\u00a5\u0005"+
		"(\u0000\u0000\u00a3\u00a4\u0005\u0005\u0000\u0000\u00a4\u00a6\u0005(\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u0017\u0001\u0000\u0000\u0000\u00a9\u00ad\u0003\u001a\r\u0000"+
		"\u00aa\u00ac\u0003\u001c\u000e\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003\u001e\u000f\u0000"+
		"\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u0019\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0006\u0000\u0000"+
		"\u00b4\u00b5\u0005\u001f\u0000\u0000\u00b5\u00b6\u0003\b\u0004\u0000\u00b6"+
		"\u00b7\u0005 \u0000\u0000\u00b7\u00b9\u0005&\u0000\u0000\u00b8\u00ba\u0003"+
		"\u0002\u0001\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0005"+
		"\'\u0000\u0000\u00be\u001b\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0007"+
		"\u0000\u0000\u00c0\u00c1\u0005\u0006\u0000\u0000\u00c1\u00c2\u0005\u001f"+
		"\u0000\u0000\u00c2\u00c3\u0003\b\u0004\u0000\u00c3\u00c4\u0005 \u0000"+
		"\u0000\u00c4\u00c6\u0005&\u0000\u0000\u00c5\u00c7\u0003\u0002\u0001\u0000"+
		"\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\'\u0000\u0000\u00cb"+
		"\u001d\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0007\u0000\u0000\u00cd"+
		"\u00cf\u0005&\u0000\u0000\u00ce\u00d0\u0003\u0002\u0001\u0000\u00cf\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\'\u0000\u0000\u00d4\u001f\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\b\u0000\u0000\u00d6\u00d7\u0005\u001f"+
		"\u0000\u0000\u00d7\u00d8\u0005(\u0000\u0000\u00d8\u00d9\u0005\"\u0000"+
		"\u0000\u00d9\u00da\u0003\"\u0011\u0000\u00da\u00db\u0005 \u0000\u0000"+
		"\u00db\u00dd\u0005&\u0000\u0000\u00dc\u00de\u0003\u0002\u0001\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\'\u0000\u0000\u00e2!"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u00052\u0000\u0000\u00e4\u00e5\u0005"+
		"\t\u0000\u0000\u00e5\u00e6\u00052\u0000\u0000\u00e6#\u0001\u0000\u0000"+
		"\u0000\u00e7\u00ec\u0005(\u0000\u0000\u00e8\u00e9\u0005\n\u0000\u0000"+
		"\u00e9\u00ea\u00051\u0000\u0000\u00ea\u00ec\u0005\u000b\u0000\u0000\u00eb"+
		"\u00e7\u0001\u0000\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005\"\u0000\u0000\u00ee\u00ef"+
		"\u0005(\u0000\u0000\u00ef%\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003("+
		"\u0014\u0000\u00f1\u00f2\u0003:\u001d\u0000\u00f2\u00f3\u0003R)\u0000"+
		"\u00f3\'\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\f\u0000\u0000\u00f5"+
		"\u00f6\u0005&\u0000\u0000\u00f6\u00f7\u0003*\u0015\u0000\u00f7\u00f8\u0005"+
		"\'\u0000\u0000\u00f8)\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\r\u0000"+
		"\u0000\u00fa\u00fb\u0005\"\u0000\u0000\u00fb\u00ff\u0003,\u0016\u0000"+
		"\u00fc\u00fd\u0005\u000e\u0000\u0000\u00fd\u00fe\u0005\"\u0000\u0000\u00fe"+
		"\u0100\u0003.\u0017\u0000\u00ff\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0104\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0005\u000f\u0000\u0000\u0102\u0103\u0005\"\u0000\u0000\u0103\u0105\u0003"+
		"0\u0018\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000"+
		"\u0000\u0000\u0105\u0109\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0010"+
		"\u0000\u0000\u0107\u0108\u0005\"\u0000\u0000\u0108\u010a\u00038\u001c"+
		"\u0000\u0109\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a+\u0001\u0000\u0000\u0000\u010b\u010c\u0005(\u0000\u0000\u010c"+
		"-\u0001\u0000\u0000\u0000\u010d\u010e\u0005)\u0000\u0000\u010e/\u0001"+
		"\u0000\u0000\u0000\u010f\u0118\u0005$\u0000\u0000\u0110\u0115\u00032\u0019"+
		"\u0000\u0111\u0112\u0005!\u0000\u0000\u0112\u0114\u00032\u0019\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118"+
		"\u0110\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0005%\u0000\u0000\u011b1\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0005&\u0000\u0000\u011d\u011e\u0005\r"+
		"\u0000\u0000\u011e\u011f\u0005\"\u0000\u0000\u011f\u0123\u00034\u001a"+
		"\u0000\u0120\u0121\u0005\u0011\u0000\u0000\u0121\u0122\u0005\"\u0000\u0000"+
		"\u0122\u0124\u00036\u001b\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0005\'\u0000\u0000\u01263\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u00050\u0000\u0000\u01285\u0001\u0000\u0000\u0000\u0129\u012a\u0005*"+
		"\u0000\u0000\u012a7\u0001\u0000\u0000\u0000\u012b\u012c\u00050\u0000\u0000"+
		"\u012c9\u0001\u0000\u0000\u0000\u012d\u012e\u0005\u0012\u0000\u0000\u012e"+
		"\u012f\u0005&\u0000\u0000\u012f\u0130\u0003<\u001e\u0000\u0130\u0131\u0003"+
		"D\"\u0000\u0131\u0132\u0005\'\u0000\u0000\u0132;\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0005\u0013\u0000\u0000\u0134\u0136\u0005&\u0000\u0000\u0135"+
		"\u0137\u0003>\u001f\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0005\'\u0000\u0000\u013b=\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		"\u0014\u0000\u0000\u013d\u013e\u0005&\u0000\u0000\u013e\u013f\u0005\r"+
		"\u0000\u0000\u013f\u0140\u0005\"\u0000\u0000\u0140\u0141\u0003@ \u0000"+
		"\u0141\u0142\u0005\u0015\u0000\u0000\u0142\u0143\u0005\"\u0000\u0000\u0143"+
		"\u0144\u0003B!\u0000\u0144\u0145\u0005\'\u0000\u0000\u0145?\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u00050\u0000\u0000\u0147A\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u00050\u0000\u0000\u0149C\u0001\u0000\u0000\u0000\u014a\u014b"+
		"\u0005\u0016\u0000\u0000\u014b\u014d\u0005&\u0000\u0000\u014c\u014e\u0003"+
		"F#\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0152\u0005\'\u0000\u0000"+
		"\u0152E\u0001\u0000\u0000\u0000\u0153\u0154\u0005\u0017\u0000\u0000\u0154"+
		"\u0155\u0005\"\u0000\u0000\u0155\u0156\u0005&\u0000\u0000\u0156\u0157"+
		"\u0005\r\u0000\u0000\u0157\u0158\u0005\"\u0000\u0000\u0158\u0159\u0003"+
		"H$\u0000\u0159\u015a\u0005\u0018\u0000\u0000\u015a\u015b\u0005\"\u0000"+
		"\u0000\u015b\u015c\u0003$\u0012\u0000\u015c\u015d\u0005\u0019\u0000\u0000"+
		"\u015d\u015e\u0005\"\u0000\u0000\u015e\u015f\u0003J%\u0000\u015f\u0160"+
		"\u0005\u001a\u0000\u0000\u0160\u0161\u0005\"\u0000\u0000\u0161\u0162\u0005"+
		"&\u0000\u0000\u0162\u0163\u0003\u0000\u0000\u0000\u0163\u0164\u0005\'"+
		"\u0000\u0000\u0164\u0165\u0005\'\u0000\u0000\u0165G\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005(\u0000\u0000\u0167I\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0005$\u0000\u0000\u0169\u016c\u0003L&\u0000\u016a\u016b\u0005"+
		"!\u0000\u0000\u016b\u016d\u0003L&\u0000\u016c\u016a\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0005%\u0000\u0000\u0171K\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0003P(\u0000\u0173\u0174\u0005\u0002\u0000\u0000\u0174\u0175\u0003"+
		"N\'\u0000\u0175M\u0001\u0000\u0000\u0000\u0176\u0177\u0003$\u0012\u0000"+
		"\u0177O\u0001\u0000\u0000\u0000\u0178\u0179\u00050\u0000\u0000\u0179Q"+
		"\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u001b\u0000\u0000\u017b\u017d"+
		"\u0005&\u0000\u0000\u017c\u017e\u0003T*\u0000\u017d\u017c\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0005\'\u0000\u0000\u0182S\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0005\u001c\u0000\u0000\u0184\u0185\u0005&\u0000\u0000"+
		"\u0185\u0186\u0005\u001d\u0000\u0000\u0186\u0187\u0005\"\u0000\u0000\u0187"+
		"\u0188\u0003V+\u0000\u0188\u0189\u0005\u001e\u0000\u0000\u0189\u018a\u0005"+
		"\"\u0000\u0000\u018a\u018b\u0003X,\u0000\u018b\u018c\u0005\u0017\u0000"+
		"\u0000\u018c\u018d\u0005\"\u0000\u0000\u018d\u018e\u0003F#\u0000\u018e"+
		"\u018f\u0005\'\u0000\u0000\u018fU\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u00050\u0000\u0000\u0191W\u0001\u0000\u0000\u0000\u0192\u0193\u0005("+
		"\u0000\u0000\u0193Y\u0001\u0000\u0000\u0000\u001b]jx\u0082\u0087\u008c"+
		"\u0091\u0096\u009f\u00a7\u00ad\u00b1\u00bb\u00c8\u00d1\u00df\u00eb\u00ff"+
		"\u0104\u0109\u0115\u0118\u0123\u0138\u014f\u016e\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}