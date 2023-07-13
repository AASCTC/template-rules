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
		T__24=25, T__25=26, T__26=27, T__27=28, LPAREN=29, RPAREN=30, COMMA=31, 
		COLON=32, QUOTE=33, LBRACK=34, RBRACK=35, LBRACE=36, RBRACE=37, IDENTIFIER=38, 
		DATE=39, EMAIL=40, TRUE=41, FALSE=42, BOOLEAN=43, WS=44, COMMENT=45, TEXT=46, 
		URI=47, INT=48, FLOAT=49, STRING=50;
	public static final int
		RULE_methodProgram = 0, RULE_methodStatement = 1, RULE_methodAssignment = 2, 
		RULE_methodReturn = 3, RULE_methodExpression = 4, RULE_methodPrimaryExpression = 5, 
		RULE_intConstant = 6, RULE_floatConstant = 7, RULE_stringConstant = 8, 
		RULE_methodFunctionCall = 9, RULE_methodArgumentList = 10, RULE_methodPropertyAccess = 11, 
		RULE_methodConditional = 12, RULE_methodIfBlock = 13, RULE_methodElseIfBlock = 14, 
		RULE_methodElseBlock = 15, RULE_methodForEachLoop = 16, RULE_methodRange = 17, 
		RULE_methodType = 18, RULE_shortFormMethodType = 19, RULE_longFormMethodType = 20, 
		RULE_templateRulesDocument = 21, RULE_header = 22, RULE_headerFields = 23, 
		RULE_headerName = 24, RULE_headerDate = 25, RULE_headerAuthorList = 26, 
		RULE_headerAuthor = 27, RULE_headerAuthorName = 28, RULE_headerAuthorEmail = 29, 
		RULE_headerDescription = 30, RULE_templates = 31, RULE_namespaces = 32, 
		RULE_namespace = 33, RULE_namespaceName = 34, RULE_namespaceAlias = 35, 
		RULE_methods = 36, RULE_method = 37, RULE_methodName = 38, RULE_methodParameters = 39, 
		RULE_methodParameter = 40, RULE_methodParameterType = 41, RULE_methodParameterValue = 42, 
		RULE_rules = 43, RULE_rule = 44, RULE_ruleLocation = 45, RULE_ruleOutputElement = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"methodProgram", "methodStatement", "methodAssignment", "methodReturn", 
			"methodExpression", "methodPrimaryExpression", "intConstant", "floatConstant", 
			"stringConstant", "methodFunctionCall", "methodArgumentList", "methodPropertyAccess", 
			"methodConditional", "methodIfBlock", "methodElseIfBlock", "methodElseBlock", 
			"methodForEachLoop", "methodRange", "methodType", "shortFormMethodType", 
			"longFormMethodType", "templateRulesDocument", "header", "headerFields", 
			"headerName", "headerDate", "headerAuthorList", "headerAuthor", "headerAuthorName", 
			"headerAuthorEmail", "headerDescription", "templates", "namespaces", 
			"namespace", "namespaceName", "namespaceAlias", "methods", "method", 
			"methodName", "methodParameters", "methodParameter", "methodParameterType", 
			"methodParameterValue", "rules", "rule", "ruleLocation", "ruleOutputElement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'->'", "'='", "'return'", "'.'", "'if'", "'else'", "'foreach'", 
			"'..'", "'header'", "'name'", "'date'", "'author'", "'description'", 
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
			null, null, null, null, null, "LPAREN", "RPAREN", "COMMA", "COLON", "QUOTE", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "IDENTIFIER", "DATE", "EMAIL", 
			"TRUE", "FALSE", "BOOLEAN", "WS", "COMMENT", "TEXT", "URI", "INT", "FLOAT", 
			"STRING"
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
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				methodStatement();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1970600251752784L) != 0) );
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
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(99);
				methodAssignment();
				setState(100);
				match(T__0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(102);
				methodExpression();
				setState(103);
				match(T__0);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				methodConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				methodForEachLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(107);
				methodReturn();
				setState(108);
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
			setState(112);
			match(IDENTIFIER);
			setState(113);
			match(T__1);
			setState(114);
			methodType();
			setState(115);
			match(T__2);
			setState(116);
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
			setState(118);
			match(T__3);
			setState(119);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				methodPrimaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				methodFunctionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				intConstant();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				floatConstant();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				stringConstant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(LPAREN);
				setState(131);
				methodExpression();
				setState(132);
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
			setState(136);
			match(INT);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(137);
				match(T__1);
				setState(138);
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
			setState(141);
			match(FLOAT);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(142);
				match(T__1);
				setState(143);
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
			setState(146);
			match(STRING);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(147);
				match(T__1);
				setState(148);
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
			setState(151);
			match(IDENTIFIER);
			setState(152);
			match(LPAREN);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1970600251752448L) != 0)) {
				{
				setState(153);
				methodArgumentList();
				}
			}

			setState(156);
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
			setState(158);
			methodExpression();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(159);
				match(COMMA);
				setState(160);
				methodExpression();
				}
				}
				setState(165);
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
			setState(166);
			match(IDENTIFIER);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				match(T__4);
				setState(168);
				match(IDENTIFIER);
				}
				}
				setState(171); 
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
			setState(173);
			methodIfBlock();
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					methodElseIfBlock();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(180);
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
			setState(183);
			match(T__5);
			setState(184);
			match(LPAREN);
			setState(185);
			methodExpression();
			setState(186);
			match(RPAREN);
			setState(187);
			match(LBRACE);
			setState(189); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(188);
				methodStatement();
				}
				}
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1970600251752784L) != 0) );
			setState(193);
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
			setState(195);
			match(T__6);
			setState(196);
			match(T__5);
			setState(197);
			match(LPAREN);
			setState(198);
			methodExpression();
			setState(199);
			match(RPAREN);
			setState(200);
			match(LBRACE);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201);
				methodStatement();
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1970600251752784L) != 0) );
			setState(206);
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
			setState(208);
			match(T__6);
			setState(209);
			match(LBRACE);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				methodStatement();
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1970600251752784L) != 0) );
			setState(215);
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
			setState(217);
			match(T__7);
			setState(218);
			match(LPAREN);
			setState(219);
			match(IDENTIFIER);
			setState(220);
			match(COLON);
			setState(221);
			methodRange();
			setState(222);
			match(RPAREN);
			setState(223);
			match(LBRACE);
			setState(225); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(224);
				methodStatement();
				}
				}
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1970600251752784L) != 0) );
			setState(229);
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
			setState(231);
			match(INT);
			setState(232);
			match(T__8);
			setState(233);
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
		public ShortFormMethodTypeContext shortFormMethodType() {
			return getRuleContext(ShortFormMethodTypeContext.class,0);
		}
		public LongFormMethodTypeContext longFormMethodType() {
			return getRuleContext(LongFormMethodTypeContext.class,0);
		}
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
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				shortFormMethodType();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				longFormMethodType();
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
	public static class ShortFormMethodTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(TemplateRulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TemplateRulesParser.IDENTIFIER, i);
		}
		public TerminalNode COLON() { return getToken(TemplateRulesParser.COLON, 0); }
		public ShortFormMethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortFormMethodType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitShortFormMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortFormMethodTypeContext shortFormMethodType() throws RecognitionException {
		ShortFormMethodTypeContext _localctx = new ShortFormMethodTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_shortFormMethodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IDENTIFIER);
			setState(240);
			match(COLON);
			setState(241);
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
	public static class LongFormMethodTypeContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public TerminalNode COLON() { return getToken(TemplateRulesParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public LongFormMethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longFormMethodType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitLongFormMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongFormMethodTypeContext longFormMethodType() throws RecognitionException {
		LongFormMethodTypeContext _localctx = new LongFormMethodTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_longFormMethodType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(TEXT);
			setState(244);
			match(COLON);
			setState(245);
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
		enterRule(_localctx, 42, RULE_templateRulesDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			header();
			setState(248);
			templates();
			setState(249);
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
		enterRule(_localctx, 44, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__9);
			setState(252);
			match(LBRACE);
			setState(253);
			headerFields();
			setState(254);
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
		enterRule(_localctx, 46, RULE_headerFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__10);
			setState(257);
			match(COLON);
			setState(258);
			headerName();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(259);
				match(T__11);
				setState(260);
				match(COLON);
				setState(261);
				headerDate();
				}
			}

			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(264);
				match(T__12);
				setState(265);
				match(COLON);
				setState(266);
				headerAuthorList();
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(269);
				match(T__13);
				setState(270);
				match(COLON);
				setState(271);
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
		enterRule(_localctx, 48, RULE_headerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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
		enterRule(_localctx, 50, RULE_headerDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 52, RULE_headerAuthorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LBRACK);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(279);
				headerAuthor();
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(280);
					match(COMMA);
					setState(281);
					headerAuthor();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(289);
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
		enterRule(_localctx, 54, RULE_headerAuthor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(LBRACE);
			setState(292);
			match(T__10);
			setState(293);
			match(COLON);
			setState(294);
			headerAuthorName();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(295);
				match(T__14);
				setState(296);
				match(COLON);
				setState(297);
				headerAuthorEmail();
				}
			}

			setState(300);
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
		enterRule(_localctx, 56, RULE_headerAuthorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
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
		enterRule(_localctx, 58, RULE_headerAuthorEmail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
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
		enterRule(_localctx, 60, RULE_headerDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
		enterRule(_localctx, 62, RULE_templates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__15);
			setState(309);
			match(LBRACE);
			setState(310);
			namespaces();
			setState(311);
			methods();
			setState(312);
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
		enterRule(_localctx, 64, RULE_namespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(T__16);
			setState(315);
			match(LBRACE);
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(316);
				namespace();
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
			setState(321);
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
		enterRule(_localctx, 66, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__17);
			setState(324);
			match(LBRACE);
			setState(325);
			match(T__10);
			setState(326);
			match(COLON);
			setState(327);
			namespaceName();
			setState(328);
			match(T__18);
			setState(329);
			match(COLON);
			setState(330);
			namespaceAlias();
			setState(331);
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
		enterRule(_localctx, 68, RULE_namespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		enterRule(_localctx, 70, RULE_namespaceAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		enterRule(_localctx, 72, RULE_methods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__19);
			setState(338);
			match(LBRACE);
			setState(340); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(339);
				method();
				}
				}
				setState(342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__20 );
			setState(344);
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
		enterRule(_localctx, 74, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__20);
			setState(347);
			match(COLON);
			setState(348);
			match(LBRACE);
			setState(349);
			match(T__10);
			setState(350);
			match(COLON);
			setState(351);
			methodName();
			setState(352);
			match(T__21);
			setState(353);
			match(COLON);
			setState(354);
			methodType();
			setState(355);
			match(T__22);
			setState(356);
			match(COLON);
			setState(357);
			methodParameters();
			setState(358);
			match(T__23);
			setState(359);
			match(COLON);
			setState(360);
			match(LBRACE);
			setState(361);
			methodProgram();
			setState(362);
			match(RBRACE);
			setState(363);
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
		enterRule(_localctx, 76, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
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
		enterRule(_localctx, 78, RULE_methodParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(LBRACK);
			setState(368);
			methodParameter();
			setState(371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(369);
				match(COMMA);
				setState(370);
				methodParameter();
				}
				}
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(375);
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
		enterRule(_localctx, 80, RULE_methodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			methodParameterValue();
			setState(378);
			match(T__1);
			setState(379);
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
		enterRule(_localctx, 82, RULE_methodParameterType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
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
		enterRule(_localctx, 84, RULE_methodParameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
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
		enterRule(_localctx, 86, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__24);
			setState(386);
			match(LBRACE);
			setState(388); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(387);
				rule_();
				}
				}
				setState(390); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__25 );
			setState(392);
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
		enterRule(_localctx, 88, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__25);
			setState(395);
			match(LBRACE);
			setState(396);
			match(T__26);
			setState(397);
			match(COLON);
			setState(398);
			ruleLocation();
			setState(399);
			match(T__27);
			setState(400);
			match(COLON);
			setState(401);
			ruleOutputElement();
			setState(402);
			match(T__20);
			setState(403);
			match(COLON);
			setState(404);
			method();
			setState(405);
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
		enterRule(_localctx, 90, RULE_ruleLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		enterRule(_localctx, 92, RULE_ruleOutputElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		"\u0004\u00012\u019c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0004\u0000`\b\u0000\u000b\u0000\f"+
		"\u0000a\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001o\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004}\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0087\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008c"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0091\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0096\b\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u009b\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n\u00a2\b\n"+
		"\n\n\f\n\u00a5\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00aa"+
		"\b\u000b\u000b\u000b\f\u000b\u00ab\u0001\f\u0001\f\u0005\f\u00b0\b\f\n"+
		"\f\f\f\u00b3\t\f\u0001\f\u0003\f\u00b6\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0004\r\u00be\b\r\u000b\r\f\r\u00bf\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00cb\b\u000e\u000b\u000e\f\u000e\u00cc\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00d4"+
		"\b\u000f\u000b\u000f\f\u000f\u00d5\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u00e2\b\u0010\u000b\u0010\f\u0010\u00e3\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00ee\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0107\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u010c\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0111\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u011b"+
		"\b\u001a\n\u001a\f\u001a\u011e\t\u001a\u0003\u001a\u0120\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u012b\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0004 \u013e\b \u000b \f \u013f\u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0004$\u0155\b$\u000b"+
		"$\f$\u0156\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0004\'"+
		"\u0174\b\'\u000b\'\f\'\u0175\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001+\u0004+\u0185\b+\u000b"+
		"+\f+\u0186\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0000\u0000/\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"\u0000\u0000\u018e\u0000_\u0001\u0000\u0000\u0000\u0002n\u0001\u0000\u0000"+
		"\u0000\u0004p\u0001\u0000\u0000\u0000\u0006v\u0001\u0000\u0000\u0000\b"+
		"|\u0001\u0000\u0000\u0000\n\u0086\u0001\u0000\u0000\u0000\f\u0088\u0001"+
		"\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000\u0010\u0092\u0001"+
		"\u0000\u0000\u0000\u0012\u0097\u0001\u0000\u0000\u0000\u0014\u009e\u0001"+
		"\u0000\u0000\u0000\u0016\u00a6\u0001\u0000\u0000\u0000\u0018\u00ad\u0001"+
		"\u0000\u0000\u0000\u001a\u00b7\u0001\u0000\u0000\u0000\u001c\u00c3\u0001"+
		"\u0000\u0000\u0000\u001e\u00d0\u0001\u0000\u0000\u0000 \u00d9\u0001\u0000"+
		"\u0000\u0000\"\u00e7\u0001\u0000\u0000\u0000$\u00ed\u0001\u0000\u0000"+
		"\u0000&\u00ef\u0001\u0000\u0000\u0000(\u00f3\u0001\u0000\u0000\u0000*"+
		"\u00f7\u0001\u0000\u0000\u0000,\u00fb\u0001\u0000\u0000\u0000.\u0100\u0001"+
		"\u0000\u0000\u00000\u0112\u0001\u0000\u0000\u00002\u0114\u0001\u0000\u0000"+
		"\u00004\u0116\u0001\u0000\u0000\u00006\u0123\u0001\u0000\u0000\u00008"+
		"\u012e\u0001\u0000\u0000\u0000:\u0130\u0001\u0000\u0000\u0000<\u0132\u0001"+
		"\u0000\u0000\u0000>\u0134\u0001\u0000\u0000\u0000@\u013a\u0001\u0000\u0000"+
		"\u0000B\u0143\u0001\u0000\u0000\u0000D\u014d\u0001\u0000\u0000\u0000F"+
		"\u014f\u0001\u0000\u0000\u0000H\u0151\u0001\u0000\u0000\u0000J\u015a\u0001"+
		"\u0000\u0000\u0000L\u016d\u0001\u0000\u0000\u0000N\u016f\u0001\u0000\u0000"+
		"\u0000P\u0179\u0001\u0000\u0000\u0000R\u017d\u0001\u0000\u0000\u0000T"+
		"\u017f\u0001\u0000\u0000\u0000V\u0181\u0001\u0000\u0000\u0000X\u018a\u0001"+
		"\u0000\u0000\u0000Z\u0197\u0001\u0000\u0000\u0000\\\u0199\u0001\u0000"+
		"\u0000\u0000^`\u0003\u0002\u0001\u0000_^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"b\u0001\u0001\u0000\u0000\u0000cd\u0003\u0004\u0002\u0000de\u0005\u0001"+
		"\u0000\u0000eo\u0001\u0000\u0000\u0000fg\u0003\b\u0004\u0000gh\u0005\u0001"+
		"\u0000\u0000ho\u0001\u0000\u0000\u0000io\u0003\u0018\f\u0000jo\u0003 "+
		"\u0010\u0000kl\u0003\u0006\u0003\u0000lm\u0005\u0001\u0000\u0000mo\u0001"+
		"\u0000\u0000\u0000nc\u0001\u0000\u0000\u0000nf\u0001\u0000\u0000\u0000"+
		"ni\u0001\u0000\u0000\u0000nj\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000"+
		"\u0000o\u0003\u0001\u0000\u0000\u0000pq\u0005&\u0000\u0000qr\u0005\u0002"+
		"\u0000\u0000rs\u0003$\u0012\u0000st\u0005\u0003\u0000\u0000tu\u0003\b"+
		"\u0004\u0000u\u0005\u0001\u0000\u0000\u0000vw\u0005\u0004\u0000\u0000"+
		"wx\u0003\b\u0004\u0000x\u0007\u0001\u0000\u0000\u0000y}\u0003\n\u0005"+
		"\u0000z}\u0003\u0012\t\u0000{}\u0003\u0016\u000b\u0000|y\u0001\u0000\u0000"+
		"\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}\t\u0001\u0000"+
		"\u0000\u0000~\u0087\u0003\f\u0006\u0000\u007f\u0087\u0003\u000e\u0007"+
		"\u0000\u0080\u0087\u0003\u0010\b\u0000\u0081\u0087\u0005&\u0000\u0000"+
		"\u0082\u0083\u0005\u001d\u0000\u0000\u0083\u0084\u0003\b\u0004\u0000\u0084"+
		"\u0085\u0005\u001e\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086"+
		"~\u0001\u0000\u0000\u0000\u0086\u007f\u0001\u0000\u0000\u0000\u0086\u0080"+
		"\u0001\u0000\u0000\u0000\u0086\u0081\u0001\u0000\u0000\u0000\u0086\u0082"+
		"\u0001\u0000\u0000\u0000\u0087\u000b\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u00050\u0000\u0000\u0089\u008a\u0005\u0002\u0000\u0000\u008a\u008c\u0003"+
		"$\u0012\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c\r\u0001\u0000\u0000\u0000\u008d\u0090\u00051\u0000"+
		"\u0000\u008e\u008f\u0005\u0002\u0000\u0000\u008f\u0091\u0003$\u0012\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u000f\u0001\u0000\u0000\u0000\u0092\u0095\u00052\u0000\u0000\u0093"+
		"\u0094\u0005\u0002\u0000\u0000\u0094\u0096\u0003$\u0012\u0000\u0095\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0011"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005&\u0000\u0000\u0098\u009a\u0005"+
		"\u001d\u0000\u0000\u0099\u009b\u0003\u0014\n\u0000\u009a\u0099\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u001e\u0000\u0000\u009d\u0013\u0001\u0000"+
		"\u0000\u0000\u009e\u00a3\u0003\b\u0004\u0000\u009f\u00a0\u0005\u001f\u0000"+
		"\u0000\u00a0\u00a2\u0003\b\u0004\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u0015\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a9\u0005&\u0000\u0000\u00a7"+
		"\u00a8\u0005\u0005\u0000\u0000\u00a8\u00aa\u0005&\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u0017"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b1\u0003\u001a\r\u0000\u00ae\u00b0\u0003"+
		"\u001c\u000e\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b6\u0003\u001e\u000f\u0000\u00b5\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u0019\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0005\u0006\u0000\u0000\u00b8\u00b9\u0005"+
		"\u001d\u0000\u0000\u00b9\u00ba\u0003\b\u0004\u0000\u00ba\u00bb\u0005\u001e"+
		"\u0000\u0000\u00bb\u00bd\u0005$\u0000\u0000\u00bc\u00be\u0003\u0002\u0001"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005%\u0000\u0000"+
		"\u00c2\u001b\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0007\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0006\u0000\u0000\u00c5\u00c6\u0005\u001d\u0000\u0000"+
		"\u00c6\u00c7\u0003\b\u0004\u0000\u00c7\u00c8\u0005\u001e\u0000\u0000\u00c8"+
		"\u00ca\u0005$\u0000\u0000\u00c9\u00cb\u0003\u0002\u0001\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005%\u0000\u0000\u00cf\u001d\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005\u0007\u0000\u0000\u00d1\u00d3\u0005"+
		"$\u0000\u0000\u00d2\u00d4\u0003\u0002\u0001\u0000\u00d3\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0005%\u0000\u0000\u00d8\u001f\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005\b\u0000\u0000\u00da\u00db\u0005\u001d\u0000\u0000"+
		"\u00db\u00dc\u0005&\u0000\u0000\u00dc\u00dd\u0005 \u0000\u0000\u00dd\u00de"+
		"\u0003\"\u0011\u0000\u00de\u00df\u0005\u001e\u0000\u0000\u00df\u00e1\u0005"+
		"$\u0000\u0000\u00e0\u00e2\u0003\u0002\u0001\u0000\u00e1\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005%\u0000\u0000\u00e6!\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u00050\u0000\u0000\u00e8\u00e9\u0005\t\u0000\u0000\u00e9"+
		"\u00ea\u00050\u0000\u0000\u00ea#\u0001\u0000\u0000\u0000\u00eb\u00ee\u0003"+
		"&\u0013\u0000\u00ec\u00ee\u0003(\u0014\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee%\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0005&\u0000\u0000\u00f0\u00f1\u0005 \u0000\u0000\u00f1\u00f2"+
		"\u0005&\u0000\u0000\u00f2\'\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		".\u0000\u0000\u00f4\u00f5\u0005 \u0000\u0000\u00f5\u00f6\u0005&\u0000"+
		"\u0000\u00f6)\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003,\u0016\u0000\u00f8"+
		"\u00f9\u0003>\u001f\u0000\u00f9\u00fa\u0003V+\u0000\u00fa+\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0005\n\u0000\u0000\u00fc\u00fd\u0005$\u0000"+
		"\u0000\u00fd\u00fe\u0003.\u0017\u0000\u00fe\u00ff\u0005%\u0000\u0000\u00ff"+
		"-\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u000b\u0000\u0000\u0101\u0102"+
		"\u0005 \u0000\u0000\u0102\u0106\u00030\u0018\u0000\u0103\u0104\u0005\f"+
		"\u0000\u0000\u0104\u0105\u0005 \u0000\u0000\u0105\u0107\u00032\u0019\u0000"+
		"\u0106\u0103\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u010b\u0001\u0000\u0000\u0000\u0108\u0109\u0005\r\u0000\u0000\u0109"+
		"\u010a\u0005 \u0000\u0000\u010a\u010c\u00034\u001a\u0000\u010b\u0108\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0110\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005\u000e\u0000\u0000\u010e\u010f\u0005"+
		" \u0000\u0000\u010f\u0111\u0003<\u001e\u0000\u0110\u010d\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111/\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0005&\u0000\u0000\u01131\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005\'\u0000\u0000\u01153\u0001\u0000\u0000\u0000\u0116\u011f\u0005"+
		"\"\u0000\u0000\u0117\u011c\u00036\u001b\u0000\u0118\u0119\u0005\u001f"+
		"\u0000\u0000\u0119\u011b\u00036\u001b\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000\u0000"+
		"\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0117\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0005#\u0000\u0000\u01225\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0005$\u0000\u0000\u0124\u0125\u0005\u000b\u0000\u0000\u0125\u0126"+
		"\u0005 \u0000\u0000\u0126\u012a\u00038\u001c\u0000\u0127\u0128\u0005\u000f"+
		"\u0000\u0000\u0128\u0129\u0005 \u0000\u0000\u0129\u012b\u0003:\u001d\u0000"+
		"\u012a\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0005%\u0000\u0000\u012d"+
		"7\u0001\u0000\u0000\u0000\u012e\u012f\u0005.\u0000\u0000\u012f9\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0005(\u0000\u0000\u0131;\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0005.\u0000\u0000\u0133=\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0005\u0010\u0000\u0000\u0135\u0136\u0005$\u0000\u0000\u0136\u0137"+
		"\u0003@ \u0000\u0137\u0138\u0003H$\u0000\u0138\u0139\u0005%\u0000\u0000"+
		"\u0139?\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0011\u0000\u0000\u013b"+
		"\u013d\u0005$\u0000\u0000\u013c\u013e\u0003B!\u0000\u013d\u013c\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0005%\u0000\u0000\u0142A\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0005\u0012\u0000\u0000\u0144\u0145\u0005$\u0000\u0000"+
		"\u0145\u0146\u0005\u000b\u0000\u0000\u0146\u0147\u0005 \u0000\u0000\u0147"+
		"\u0148\u0003D\"\u0000\u0148\u0149\u0005\u0013\u0000\u0000\u0149\u014a"+
		"\u0005 \u0000\u0000\u014a\u014b\u0003F#\u0000\u014b\u014c\u0005%\u0000"+
		"\u0000\u014cC\u0001\u0000\u0000\u0000\u014d\u014e\u0005.\u0000\u0000\u014e"+
		"E\u0001\u0000\u0000\u0000\u014f\u0150\u0005.\u0000\u0000\u0150G\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0005\u0014\u0000\u0000\u0152\u0154\u0005"+
		"$\u0000\u0000\u0153\u0155\u0003J%\u0000\u0154\u0153\u0001\u0000\u0000"+
		"\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000"+
		"\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u0159\u0005%\u0000\u0000\u0159I\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0005\u0015\u0000\u0000\u015b\u015c\u0005 \u0000\u0000\u015c\u015d"+
		"\u0005$\u0000\u0000\u015d\u015e\u0005\u000b\u0000\u0000\u015e\u015f\u0005"+
		" \u0000\u0000\u015f\u0160\u0003L&\u0000\u0160\u0161\u0005\u0016\u0000"+
		"\u0000\u0161\u0162\u0005 \u0000\u0000\u0162\u0163\u0003$\u0012\u0000\u0163"+
		"\u0164\u0005\u0017\u0000\u0000\u0164\u0165\u0005 \u0000\u0000\u0165\u0166"+
		"\u0003N\'\u0000\u0166\u0167\u0005\u0018\u0000\u0000\u0167\u0168\u0005"+
		" \u0000\u0000\u0168\u0169\u0005$\u0000\u0000\u0169\u016a\u0003\u0000\u0000"+
		"\u0000\u016a\u016b\u0005%\u0000\u0000\u016b\u016c\u0005%\u0000\u0000\u016c"+
		"K\u0001\u0000\u0000\u0000\u016d\u016e\u0005&\u0000\u0000\u016eM\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0005\"\u0000\u0000\u0170\u0173\u0003P"+
		"(\u0000\u0171\u0172\u0005\u001f\u0000\u0000\u0172\u0174\u0003P(\u0000"+
		"\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000"+
		"\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0005#\u0000\u0000\u0178"+
		"O\u0001\u0000\u0000\u0000\u0179\u017a\u0003T*\u0000\u017a\u017b\u0005"+
		"\u0002\u0000\u0000\u017b\u017c\u0003R)\u0000\u017cQ\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0003$\u0012\u0000\u017eS\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u0005.\u0000\u0000\u0180U\u0001\u0000\u0000\u0000\u0181\u0182\u0005"+
		"\u0019\u0000\u0000\u0182\u0184\u0005$\u0000\u0000\u0183\u0185\u0003X,"+
		"\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000"+
		"\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0189\u0005%\u0000\u0000"+
		"\u0189W\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u001a\u0000\u0000\u018b"+
		"\u018c\u0005$\u0000\u0000\u018c\u018d\u0005\u001b\u0000\u0000\u018d\u018e"+
		"\u0005 \u0000\u0000\u018e\u018f\u0003Z-\u0000\u018f\u0190\u0005\u001c"+
		"\u0000\u0000\u0190\u0191\u0005 \u0000\u0000\u0191\u0192\u0003\\.\u0000"+
		"\u0192\u0193\u0005\u0015\u0000\u0000\u0193\u0194\u0005 \u0000\u0000\u0194"+
		"\u0195\u0003J%\u0000\u0195\u0196\u0005%\u0000\u0000\u0196Y\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0005.\u0000\u0000\u0198[\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0005&\u0000\u0000\u019a]\u0001\u0000\u0000\u0000\u001ba"+
		"n|\u0086\u008b\u0090\u0095\u009a\u00a3\u00ab\u00b1\u00b5\u00bf\u00cc\u00d5"+
		"\u00e3\u00ed\u0106\u010b\u0110\u011c\u011f\u012a\u013f\u0156\u0175\u0186";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}