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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, LPAREN=33, RPAREN=34, COMMA=35, COLON=36, QUOTE=37, LBRACK=38, 
		RBRACK=39, LBRACE=40, RBRACE=41, IDENTIFIER=42, DATE=43, EMAIL=44, TRUE=45, 
		FALSE=46, BOOLEAN=47, WS=48, COMMENT=49, TEXT=50, ID=51, URI=52, INT=53, 
		FLOAT=54, STRING=55;
	public static final int
		RULE_methodProgram = 0, RULE_methodStatement = 1, RULE_methodAssignment = 2, 
		RULE_methodReturn = 3, RULE_methodExpression = 4, RULE_methodPrimaryExpression = 5, 
		RULE_methodFunctionCall = 6, RULE_methodArgumentList = 7, RULE_methodPropertyAccess = 8, 
		RULE_methodConditional = 9, RULE_methodIfBlock = 10, RULE_methodElseIfBlock = 11, 
		RULE_methodElseBlock = 12, RULE_methodForEachLoop = 13, RULE_methodRange = 14, 
		RULE_type = 15, RULE_templateRulesDocument = 16, RULE_header = 17, RULE_headerFields = 18, 
		RULE_headerName = 19, RULE_headerDate = 20, RULE_headerAuthorList = 21, 
		RULE_headerAuthor = 22, RULE_headerAuthorName = 23, RULE_headerAuthorEmail = 24, 
		RULE_headerDescription = 25, RULE_templates = 26, RULE_namespaces = 27, 
		RULE_namespace = 28, RULE_namespaceName = 29, RULE_namespaceAlias = 30, 
		RULE_sources = 31, RULE_source = 32, RULE_sourceName = 33, RULE_sourceLabel = 34, 
		RULE_sinks = 35, RULE_sink = 36, RULE_sinkName = 37, RULE_sinkLabel = 38, 
		RULE_sinkMethod = 39, RULE_sinkMethodName = 40, RULE_sinkMethodParameters = 41, 
		RULE_sinkMethodParameter = 42, RULE_sinkMethodParameterType = 43, RULE_sinkMethodParameterValue = 44, 
		RULE_rules = 45, RULE_rule = 46, RULE_ruleLocation = 47, RULE_ruleSource = 48, 
		RULE_ruleSink = 49, RULE_rulePruneChildren = 50;
	private static String[] makeRuleNames() {
		return new String[] {
			"methodProgram", "methodStatement", "methodAssignment", "methodReturn", 
			"methodExpression", "methodPrimaryExpression", "methodFunctionCall", 
			"methodArgumentList", "methodPropertyAccess", "methodConditional", "methodIfBlock", 
			"methodElseIfBlock", "methodElseBlock", "methodForEachLoop", "methodRange", 
			"type", "templateRulesDocument", "header", "headerFields", "headerName", 
			"headerDate", "headerAuthorList", "headerAuthor", "headerAuthorName", 
			"headerAuthorEmail", "headerDescription", "templates", "namespaces", 
			"namespace", "namespaceName", "namespaceAlias", "sources", "source", 
			"sourceName", "sourceLabel", "sinks", "sink", "sinkName", "sinkLabel", 
			"sinkMethod", "sinkMethodName", "sinkMethodParameters", "sinkMethodParameter", 
			"sinkMethodParameterType", "sinkMethodParameterValue", "rules", "rule", 
			"ruleLocation", "ruleSource", "ruleSink", "rulePruneChildren"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'return'", "'.'", "'if'", "'else'", "'foreach'", 
			"'..'", "'<'", "'>'", "'header'", "'name'", "'date'", "'author'", "'description'", 
			"'email'", "'templates'", "'namespaces'", "'namespace'", "'alias'", "'sources'", 
			"'source'", "'label'", "'sinks'", "'sink'", "'method'", "'parameters'", 
			"'program'", "'rules'", "'rule'", "'location'", "'pruneChildren'", "'('", 
			"')'", "','", "':'", "'\"'", "'['", "']'", "'{'", "'}'", null, "'YYYY-mm-ddTHH:MM:SS'", 
			null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "LPAREN", "RPAREN", 
			"COMMA", "COLON", "QUOTE", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "IDENTIFIER", 
			"DATE", "EMAIL", "TRUE", "FALSE", "BOOLEAN", "WS", "COMMENT", "TEXT", 
			"ID", "URI", "INT", "FLOAT", "STRING"
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
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				methodStatement();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65302203186807464L) != 0) );
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				methodAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				methodExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				methodConditional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				methodForEachLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				methodReturn();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(TemplateRulesParser.ID, 0); }
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
			setState(114);
			type();
			setState(115);
			match(ID);
			setState(116);
			match(T__0);
			setState(117);
			methodExpression();
			setState(118);
			match(T__1);
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
			setState(120);
			match(T__2);
			setState(121);
			methodExpression();
			setState(122);
			match(T__1);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				methodPrimaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				methodFunctionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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
		public TerminalNode INT() { return getToken(TemplateRulesParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TemplateRulesParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(TemplateRulesParser.STRING, 0); }
		public TerminalNode ID() { return getToken(TemplateRulesParser.ID, 0); }
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(FLOAT);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(ID);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				match(LPAREN);
				setState(134);
				methodExpression();
				setState(135);
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
	public static class MethodFunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TemplateRulesParser.ID, 0); }
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
		enterRule(_localctx, 12, RULE_methodFunctionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ID);
			setState(140);
			match(LPAREN);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65302203186806784L) != 0)) {
				{
				setState(141);
				methodArgumentList();
				}
			}

			setState(144);
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
		enterRule(_localctx, 14, RULE_methodArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			methodExpression();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(147);
				match(COMMA);
				setState(148);
				methodExpression();
				}
				}
				setState(153);
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
		public List<TerminalNode> ID() { return getTokens(TemplateRulesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TemplateRulesParser.ID, i);
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
		enterRule(_localctx, 16, RULE_methodPropertyAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(ID);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(T__3);
				setState(156);
				match(ID);
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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
		enterRule(_localctx, 18, RULE_methodConditional);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			methodIfBlock();
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					methodElseIfBlock();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(168);
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
		enterRule(_localctx, 20, RULE_methodIfBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__4);
			setState(172);
			match(LPAREN);
			setState(173);
			methodExpression();
			setState(174);
			match(RPAREN);
			setState(175);
			match(LBRACE);
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				methodStatement();
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65302203186807464L) != 0) );
			setState(181);
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
		enterRule(_localctx, 22, RULE_methodElseIfBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(T__5);
			setState(184);
			match(T__4);
			setState(185);
			match(LPAREN);
			setState(186);
			methodExpression();
			setState(187);
			match(RPAREN);
			setState(188);
			match(LBRACE);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				methodStatement();
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65302203186807464L) != 0) );
			setState(194);
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
		enterRule(_localctx, 24, RULE_methodElseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__5);
			setState(197);
			match(LBRACE);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				methodStatement();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65302203186807464L) != 0) );
			setState(203);
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
		public TerminalNode ID() { return getToken(TemplateRulesParser.ID, 0); }
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
		enterRule(_localctx, 26, RULE_methodForEachLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__6);
			setState(206);
			match(LPAREN);
			setState(207);
			match(ID);
			setState(208);
			match(COLON);
			setState(209);
			methodRange();
			setState(210);
			match(RPAREN);
			setState(211);
			match(LBRACE);
			setState(213); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(212);
				methodStatement();
				}
				}
				setState(215); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 65302203186807464L) != 0) );
			setState(217);
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
		enterRule(_localctx, 28, RULE_methodRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(INT);
			setState(220);
			match(T__7);
			setState(221);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(TemplateRulesParser.COLON, 0); }
		public List<TerminalNode> ID() { return getTokens(TemplateRulesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TemplateRulesParser.ID, i);
		}
		public TerminalNode URI() { return getToken(TemplateRulesParser.URI, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(223);
				match(ID);
				}
				break;
			case T__8:
				{
				setState(224);
				match(T__8);
				setState(225);
				match(URI);
				setState(226);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(229);
			match(COLON);
			setState(230);
			match(ID);
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
		enterRule(_localctx, 32, RULE_templateRulesDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			header();
			setState(233);
			templates();
			setState(234);
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
		enterRule(_localctx, 34, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__10);
			setState(237);
			match(LBRACE);
			setState(238);
			headerFields();
			setState(239);
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
		enterRule(_localctx, 36, RULE_headerFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__11);
			setState(242);
			match(COLON);
			setState(243);
			headerName();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(244);
				match(T__12);
				setState(245);
				match(COLON);
				setState(246);
				headerDate();
				}
			}

			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(249);
				match(T__13);
				setState(250);
				match(COLON);
				setState(251);
				headerAuthorList();
				}
			}

			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(254);
				match(T__14);
				setState(255);
				match(COLON);
				setState(256);
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
		enterRule(_localctx, 38, RULE_headerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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
		enterRule(_localctx, 40, RULE_headerDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 42, RULE_headerAuthorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LBRACK);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(264);
				headerAuthor();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(265);
					match(COMMA);
					setState(266);
					headerAuthor();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(274);
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
		enterRule(_localctx, 44, RULE_headerAuthor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(LBRACE);
			setState(277);
			match(T__11);
			setState(278);
			match(COLON);
			setState(279);
			headerAuthorName();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(280);
				match(T__15);
				setState(281);
				match(COLON);
				setState(282);
				headerAuthorEmail();
				}
			}

			setState(285);
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
		enterRule(_localctx, 46, RULE_headerAuthorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
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
		enterRule(_localctx, 48, RULE_headerAuthorEmail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
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
		enterRule(_localctx, 50, RULE_headerDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
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
		public SourcesContext sources() {
			return getRuleContext(SourcesContext.class,0);
		}
		public SinksContext sinks() {
			return getRuleContext(SinksContext.class,0);
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
		enterRule(_localctx, 52, RULE_templates);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__16);
			setState(294);
			match(LBRACE);
			setState(295);
			namespaces();
			setState(296);
			sources();
			setState(297);
			sinks();
			setState(298);
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
		enterRule(_localctx, 54, RULE_namespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__17);
			setState(301);
			match(LBRACE);
			setState(303); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(302);
				namespace();
				}
				}
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
			setState(307);
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
		enterRule(_localctx, 56, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__18);
			setState(310);
			match(LBRACE);
			setState(311);
			match(T__11);
			setState(312);
			match(COLON);
			setState(313);
			namespaceName();
			setState(314);
			match(T__19);
			setState(315);
			match(COLON);
			setState(316);
			namespaceAlias();
			setState(317);
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
		enterRule(_localctx, 58, RULE_namespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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
		enterRule(_localctx, 60, RULE_namespaceAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
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
	public static class SourcesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public List<SourceContext> source() {
			return getRuleContexts(SourceContext.class);
		}
		public SourceContext source(int i) {
			return getRuleContext(SourceContext.class,i);
		}
		public SourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sources; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSources(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourcesContext sources() throws RecognitionException {
		SourcesContext _localctx = new SourcesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__20);
			setState(324);
			match(LBRACE);
			setState(326); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(325);
				source();
				}
				}
				setState(328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__21 );
			setState(330);
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
	public static class SourceContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(TemplateRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TemplateRulesParser.COLON, i);
		}
		public SourceNameContext sourceName() {
			return getRuleContext(SourceNameContext.class,0);
		}
		public SourceLabelContext sourceLabel() {
			return getRuleContext(SourceLabelContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__21);
			setState(333);
			match(LBRACE);
			setState(334);
			match(T__11);
			setState(335);
			match(COLON);
			setState(336);
			sourceName();
			setState(337);
			match(T__22);
			setState(338);
			match(COLON);
			setState(339);
			sourceLabel();
			setState(340);
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
	public static class SourceNameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public SourceNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSourceName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceNameContext sourceName() throws RecognitionException {
		SourceNameContext _localctx = new SourceNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sourceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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
	public static class SourceLabelContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public SourceLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSourceLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceLabelContext sourceLabel() throws RecognitionException {
		SourceLabelContext _localctx = new SourceLabelContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sourceLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
	public static class SinksContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public List<SinkContext> sink() {
			return getRuleContexts(SinkContext.class);
		}
		public SinkContext sink(int i) {
			return getRuleContext(SinkContext.class,i);
		}
		public SinksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinks; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSinks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinksContext sinks() throws RecognitionException {
		SinksContext _localctx = new SinksContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sinks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__23);
			setState(347);
			match(LBRACE);
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(348);
				sink();
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__24 );
			setState(353);
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
	public static class SinkContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(TemplateRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TemplateRulesParser.COLON, i);
		}
		public SinkNameContext sinkName() {
			return getRuleContext(SinkNameContext.class,0);
		}
		public SinkLabelContext sinkLabel() {
			return getRuleContext(SinkLabelContext.class,0);
		}
		public SinkMethodContext sinkMethod() {
			return getRuleContext(SinkMethodContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public SinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sink; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkContext sink() throws RecognitionException {
		SinkContext _localctx = new SinkContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_sink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__24);
			setState(356);
			match(LBRACE);
			setState(357);
			match(T__11);
			setState(358);
			match(COLON);
			setState(359);
			sinkName();
			setState(360);
			match(T__22);
			setState(361);
			match(COLON);
			setState(362);
			sinkLabel();
			setState(363);
			sinkMethod();
			setState(364);
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
	public static class SinkNameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public SinkNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSinkName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkNameContext sinkName() throws RecognitionException {
		SinkNameContext _localctx = new SinkNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sinkName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
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
	public static class SinkLabelContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public SinkLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkLabel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSinkLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkLabelContext sinkLabel() throws RecognitionException {
		SinkLabelContext _localctx = new SinkLabelContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sinkLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
	public static class SinkMethodContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(TemplateRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TemplateRulesParser.COLON, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(TemplateRulesParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(TemplateRulesParser.LBRACE, i);
		}
		public SinkMethodNameContext sinkMethodName() {
			return getRuleContext(SinkMethodNameContext.class,0);
		}
		public SinkMethodParametersContext sinkMethodParameters() {
			return getRuleContext(SinkMethodParametersContext.class,0);
		}
		public MethodProgramContext methodProgram() {
			return getRuleContext(MethodProgramContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(TemplateRulesParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(TemplateRulesParser.RBRACE, i);
		}
		public SinkMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSinkMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkMethodContext sinkMethod() throws RecognitionException {
		SinkMethodContext _localctx = new SinkMethodContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_sinkMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__25);
			setState(371);
			match(COLON);
			setState(372);
			match(LBRACE);
			setState(373);
			match(T__11);
			setState(374);
			match(COLON);
			setState(375);
			sinkMethodName();
			setState(376);
			match(T__26);
			setState(377);
			match(COLON);
			setState(378);
			sinkMethodParameters();
			setState(379);
			match(T__27);
			setState(380);
			match(COLON);
			setState(381);
			match(LBRACE);
			setState(382);
			methodProgram();
			setState(383);
			match(RBRACE);
			setState(384);
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
	public static class SinkMethodNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public SinkMethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkMethodName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSinkMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkMethodNameContext sinkMethodName() throws RecognitionException {
		SinkMethodNameContext _localctx = new SinkMethodNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sinkMethodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
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
	public static class SinkMethodParametersContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TemplateRulesParser.LBRACK, 0); }
		public List<SinkMethodParameterContext> sinkMethodParameter() {
			return getRuleContexts(SinkMethodParameterContext.class);
		}
		public SinkMethodParameterContext sinkMethodParameter(int i) {
			return getRuleContext(SinkMethodParameterContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(TemplateRulesParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TemplateRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TemplateRulesParser.COMMA, i);
		}
		public SinkMethodParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkMethodParameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSinkMethodParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkMethodParametersContext sinkMethodParameters() throws RecognitionException {
		SinkMethodParametersContext _localctx = new SinkMethodParametersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sinkMethodParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(LBRACK);
			setState(389);
			sinkMethodParameter();
			setState(392); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(390);
				match(COMMA);
				setState(391);
				sinkMethodParameter();
				}
				}
				setState(394); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(396);
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
	public static class SinkMethodParameterContext extends ParserRuleContext {
		public SinkMethodParameterTypeContext sinkMethodParameterType() {
			return getRuleContext(SinkMethodParameterTypeContext.class,0);
		}
		public SinkMethodParameterValueContext sinkMethodParameterValue() {
			return getRuleContext(SinkMethodParameterValueContext.class,0);
		}
		public SinkMethodParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkMethodParameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSinkMethodParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkMethodParameterContext sinkMethodParameter() throws RecognitionException {
		SinkMethodParameterContext _localctx = new SinkMethodParameterContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sinkMethodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			sinkMethodParameterType();
			setState(399);
			sinkMethodParameterValue();
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
	public static class SinkMethodParameterTypeContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public SinkMethodParameterTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkMethodParameterType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSinkMethodParameterType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkMethodParameterTypeContext sinkMethodParameterType() throws RecognitionException {
		SinkMethodParameterTypeContext _localctx = new SinkMethodParameterTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sinkMethodParameterType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
	public static class SinkMethodParameterValueContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public SinkMethodParameterValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinkMethodParameterValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitSinkMethodParameterValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinkMethodParameterValueContext sinkMethodParameterValue() throws RecognitionException {
		SinkMethodParameterValueContext _localctx = new SinkMethodParameterValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sinkMethodParameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		enterRule(_localctx, 90, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(T__28);
			setState(406);
			match(LBRACE);
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(407);
				rule_();
				}
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__29 );
			setState(412);
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
		public RuleSourceContext ruleSource() {
			return getRuleContext(RuleSourceContext.class,0);
		}
		public RuleSinkContext ruleSink() {
			return getRuleContext(RuleSinkContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public RulePruneChildrenContext rulePruneChildren() {
			return getRuleContext(RulePruneChildrenContext.class,0);
		}
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
		enterRule(_localctx, 92, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__29);
			setState(415);
			match(LBRACE);
			setState(416);
			match(T__30);
			setState(417);
			match(COLON);
			setState(418);
			ruleLocation();
			setState(419);
			match(T__21);
			setState(420);
			match(COLON);
			setState(421);
			ruleSource();
			setState(422);
			match(T__24);
			setState(423);
			match(COLON);
			setState(424);
			ruleSink();
			setState(425);
			match(RBRACE);
			setState(426);
			match(T__31);
			setState(427);
			match(COLON);
			setState(428);
			rulePruneChildren();
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
		enterRule(_localctx, 94, RULE_ruleLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
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
	public static class RuleSourceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public RuleSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSource; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitRuleSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSourceContext ruleSource() throws RecognitionException {
		RuleSourceContext _localctx = new RuleSourceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ruleSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
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
	public static class RuleSinkContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public RuleSinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSink; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitRuleSink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleSinkContext ruleSink() throws RecognitionException {
		RuleSinkContext _localctx = new RuleSinkContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ruleSink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
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
	public static class RulePruneChildrenContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(TemplateRulesParser.BOOLEAN, 0); }
		public RulePruneChildrenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePruneChildren; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitRulePruneChildren(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulePruneChildrenContext rulePruneChildren() throws RecognitionException {
		RulePruneChildrenContext _localctx = new RulePruneChildrenContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_rulePruneChildren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(BOOLEAN);
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
		"\u0004\u00017\u01b7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u0001\u0000\u0004\u0000h\b\u0000\u000b\u0000\f\u0000i\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001q\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0080\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u008a\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008f\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0096\b\u0007\n\u0007\f\u0007\u0099\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0004\b\u009e\b\b\u000b\b\f\b\u009f\u0001\t\u0001\t\u0005\t\u00a4\b"+
		"\t\n\t\f\t\u00a7\t\t\u0001\t\u0003\t\u00aa\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0004\n\u00b2\b\n\u000b\n\f\n\u00b3\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u00bf\b\u000b\u000b\u000b\f\u000b\u00c0\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u00c8\b\f\u000b\f\f"+
		"\f\u00c9\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0004\r\u00d6\b\r\u000b\r\f\r\u00d7\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00e4\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f8\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00fd\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0102\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u010c\b\u0015\n\u0015\f\u0015\u010f\t\u0015\u0003\u0015\u0111"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u011c\b\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0004"+
		"\u001b\u0130\b\u001b\u000b\u001b\f\u001b\u0131\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f"+
		"\u0147\b\u001f\u000b\u001f\f\u001f\u0148\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0004#\u015e\b#\u000b#\f"+
		"#\u015f\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0004)\u0189\b)\u000b)\f)\u018a\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001-\u0004-\u0199"+
		"\b-\u000b-\f-\u019a\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u00012\u0000"+
		"\u00003\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bd\u0000\u0000\u01a3"+
		"\u0000g\u0001\u0000\u0000\u0000\u0002p\u0001\u0000\u0000\u0000\u0004r"+
		"\u0001\u0000\u0000\u0000\u0006x\u0001\u0000\u0000\u0000\b\u007f\u0001"+
		"\u0000\u0000\u0000\n\u0089\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000"+
		"\u0000\u0000\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u009a\u0001\u0000"+
		"\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00ab\u0001\u0000"+
		"\u0000\u0000\u0016\u00b7\u0001\u0000\u0000\u0000\u0018\u00c4\u0001\u0000"+
		"\u0000\u0000\u001a\u00cd\u0001\u0000\u0000\u0000\u001c\u00db\u0001\u0000"+
		"\u0000\u0000\u001e\u00e3\u0001\u0000\u0000\u0000 \u00e8\u0001\u0000\u0000"+
		"\u0000\"\u00ec\u0001\u0000\u0000\u0000$\u00f1\u0001\u0000\u0000\u0000"+
		"&\u0103\u0001\u0000\u0000\u0000(\u0105\u0001\u0000\u0000\u0000*\u0107"+
		"\u0001\u0000\u0000\u0000,\u0114\u0001\u0000\u0000\u0000.\u011f\u0001\u0000"+
		"\u0000\u00000\u0121\u0001\u0000\u0000\u00002\u0123\u0001\u0000\u0000\u0000"+
		"4\u0125\u0001\u0000\u0000\u00006\u012c\u0001\u0000\u0000\u00008\u0135"+
		"\u0001\u0000\u0000\u0000:\u013f\u0001\u0000\u0000\u0000<\u0141\u0001\u0000"+
		"\u0000\u0000>\u0143\u0001\u0000\u0000\u0000@\u014c\u0001\u0000\u0000\u0000"+
		"B\u0156\u0001\u0000\u0000\u0000D\u0158\u0001\u0000\u0000\u0000F\u015a"+
		"\u0001\u0000\u0000\u0000H\u0163\u0001\u0000\u0000\u0000J\u016e\u0001\u0000"+
		"\u0000\u0000L\u0170\u0001\u0000\u0000\u0000N\u0172\u0001\u0000\u0000\u0000"+
		"P\u0182\u0001\u0000\u0000\u0000R\u0184\u0001\u0000\u0000\u0000T\u018e"+
		"\u0001\u0000\u0000\u0000V\u0191\u0001\u0000\u0000\u0000X\u0193\u0001\u0000"+
		"\u0000\u0000Z\u0195\u0001\u0000\u0000\u0000\\\u019e\u0001\u0000\u0000"+
		"\u0000^\u01ae\u0001\u0000\u0000\u0000`\u01b0\u0001\u0000\u0000\u0000b"+
		"\u01b2\u0001\u0000\u0000\u0000d\u01b4\u0001\u0000\u0000\u0000fh\u0003"+
		"\u0002\u0001\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0001\u0001\u0000"+
		"\u0000\u0000kq\u0003\u0004\u0002\u0000lq\u0003\b\u0004\u0000mq\u0003\u0012"+
		"\t\u0000nq\u0003\u001a\r\u0000oq\u0003\u0006\u0003\u0000pk\u0001\u0000"+
		"\u0000\u0000pl\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u0003\u0001\u0000\u0000"+
		"\u0000rs\u0003\u001e\u000f\u0000st\u00053\u0000\u0000tu\u0005\u0001\u0000"+
		"\u0000uv\u0003\b\u0004\u0000vw\u0005\u0002\u0000\u0000w\u0005\u0001\u0000"+
		"\u0000\u0000xy\u0005\u0003\u0000\u0000yz\u0003\b\u0004\u0000z{\u0005\u0002"+
		"\u0000\u0000{\u0007\u0001\u0000\u0000\u0000|\u0080\u0003\n\u0005\u0000"+
		"}\u0080\u0003\f\u0006\u0000~\u0080\u0003\u0010\b\u0000\u007f|\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u0080\t\u0001\u0000\u0000\u0000\u0081\u008a\u00055\u0000\u0000\u0082"+
		"\u008a\u00056\u0000\u0000\u0083\u008a\u00057\u0000\u0000\u0084\u008a\u0005"+
		"3\u0000\u0000\u0085\u0086\u0005!\u0000\u0000\u0086\u0087\u0003\b\u0004"+
		"\u0000\u0087\u0088\u0005\"\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000"+
		"\u0089\u0081\u0001\u0000\u0000\u0000\u0089\u0082\u0001\u0000\u0000\u0000"+
		"\u0089\u0083\u0001\u0000\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000"+
		"\u0089\u0085\u0001\u0000\u0000\u0000\u008a\u000b\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u00053\u0000\u0000\u008c\u008e\u0005!\u0000\u0000\u008d\u008f"+
		"\u0003\u000e\u0007\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\"\u0000\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092\u0097\u0003"+
		"\b\u0004\u0000\u0093\u0094\u0005#\u0000\u0000\u0094\u0096\u0003\b\u0004"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u000f\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u009d\u00053\u0000\u0000\u009b\u009c\u0005\u0004\u0000\u0000"+
		"\u009c\u009e\u00053\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u0011\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a5\u0003\u0014\n\u0000\u00a2\u00a4\u0003\u0016\u000b\u0000\u00a3\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0003\u0018\f\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u0013\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"\u0005\u0000\u0000\u00ac\u00ad\u0005!\u0000\u0000\u00ad\u00ae\u0003\b"+
		"\u0004\u0000\u00ae\u00af\u0005\"\u0000\u0000\u00af\u00b1\u0005(\u0000"+
		"\u0000\u00b0\u00b2\u0003\u0002\u0001\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005)\u0000\u0000\u00b6\u0015\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005\u0006\u0000\u0000\u00b8\u00b9\u0005\u0005\u0000\u0000"+
		"\u00b9\u00ba\u0005!\u0000\u0000\u00ba\u00bb\u0003\b\u0004\u0000\u00bb"+
		"\u00bc\u0005\"\u0000\u0000\u00bc\u00be\u0005(\u0000\u0000\u00bd\u00bf"+
		"\u0003\u0002\u0001\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0005)\u0000\u0000\u00c3\u0017\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005"+
		"\u0006\u0000\u0000\u00c5\u00c7\u0005(\u0000\u0000\u00c6\u00c8\u0003\u0002"+
		"\u0001\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005)\u0000"+
		"\u0000\u00cc\u0019\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0007\u0000"+
		"\u0000\u00ce\u00cf\u0005!\u0000\u0000\u00cf\u00d0\u00053\u0000\u0000\u00d0"+
		"\u00d1\u0005$\u0000\u0000\u00d1\u00d2\u0003\u001c\u000e\u0000\u00d2\u00d3"+
		"\u0005\"\u0000\u0000\u00d3\u00d5\u0005(\u0000\u0000\u00d4\u00d6\u0003"+
		"\u0002\u0001\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"+
		")\u0000\u0000\u00da\u001b\u0001\u0000\u0000\u0000\u00db\u00dc\u00055\u0000"+
		"\u0000\u00dc\u00dd\u0005\b\u0000\u0000\u00dd\u00de\u00055\u0000\u0000"+
		"\u00de\u001d\u0001\u0000\u0000\u0000\u00df\u00e4\u00053\u0000\u0000\u00e0"+
		"\u00e1\u0005\t\u0000\u0000\u00e1\u00e2\u00054\u0000\u0000\u00e2\u00e4"+
		"\u0005\n\u0000\u0000\u00e3\u00df\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"$\u0000\u0000\u00e6\u00e7\u00053\u0000\u0000\u00e7\u001f\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0003\"\u0011\u0000\u00e9\u00ea\u00034\u001a\u0000"+
		"\u00ea\u00eb\u0003Z-\u0000\u00eb!\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0005\u000b\u0000\u0000\u00ed\u00ee\u0005(\u0000\u0000\u00ee\u00ef\u0003"+
		"$\u0012\u0000\u00ef\u00f0\u0005)\u0000\u0000\u00f0#\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0005\f\u0000\u0000\u00f2\u00f3\u0005$\u0000\u0000"+
		"\u00f3\u00f7\u0003&\u0013\u0000\u00f4\u00f5\u0005\r\u0000\u0000\u00f5"+
		"\u00f6\u0005$\u0000\u0000\u00f6\u00f8\u0003(\u0014\u0000\u00f7\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fc\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005\u000e\u0000\u0000\u00fa\u00fb\u0005"+
		"$\u0000\u0000\u00fb\u00fd\u0003*\u0015\u0000\u00fc\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0101\u0001\u0000\u0000"+
		"\u0000\u00fe\u00ff\u0005\u000f\u0000\u0000\u00ff\u0100\u0005$\u0000\u0000"+
		"\u0100\u0102\u00032\u0019\u0000\u0101\u00fe\u0001\u0000\u0000\u0000\u0101"+
		"\u0102\u0001\u0000\u0000\u0000\u0102%\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0005*\u0000\u0000\u0104\'\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"+\u0000\u0000\u0106)\u0001\u0000\u0000\u0000\u0107\u0110\u0005&\u0000"+
		"\u0000\u0108\u010d\u0003,\u0016\u0000\u0109\u010a\u0005#\u0000\u0000\u010a"+
		"\u010c\u0003,\u0016\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f"+
		"\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u0110\u0108\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0005\'\u0000\u0000\u0113+\u0001\u0000\u0000\u0000\u0114\u0115\u0005"+
		"(\u0000\u0000\u0115\u0116\u0005\f\u0000\u0000\u0116\u0117\u0005$\u0000"+
		"\u0000\u0117\u011b\u0003.\u0017\u0000\u0118\u0119\u0005\u0010\u0000\u0000"+
		"\u0119\u011a\u0005$\u0000\u0000\u011a\u011c\u00030\u0018\u0000\u011b\u0118"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0005)\u0000\u0000\u011e-\u0001\u0000"+
		"\u0000\u0000\u011f\u0120\u00052\u0000\u0000\u0120/\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0005,\u0000\u0000\u01221\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u00052\u0000\u0000\u01243\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0011"+
		"\u0000\u0000\u0126\u0127\u0005(\u0000\u0000\u0127\u0128\u00036\u001b\u0000"+
		"\u0128\u0129\u0003>\u001f\u0000\u0129\u012a\u0003F#\u0000\u012a\u012b"+
		"\u0005)\u0000\u0000\u012b5\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0012"+
		"\u0000\u0000\u012d\u012f\u0005(\u0000\u0000\u012e\u0130\u00038\u001c\u0000"+
		"\u012f\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000"+
		"\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0005)\u0000\u0000\u0134"+
		"7\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0013\u0000\u0000\u0136\u0137"+
		"\u0005(\u0000\u0000\u0137\u0138\u0005\f\u0000\u0000\u0138\u0139\u0005"+
		"$\u0000\u0000\u0139\u013a\u0003:\u001d\u0000\u013a\u013b\u0005\u0014\u0000"+
		"\u0000\u013b\u013c\u0005$\u0000\u0000\u013c\u013d\u0003<\u001e\u0000\u013d"+
		"\u013e\u0005)\u0000\u0000\u013e9\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"2\u0000\u0000\u0140;\u0001\u0000\u0000\u0000\u0141\u0142\u00052\u0000"+
		"\u0000\u0142=\u0001\u0000\u0000\u0000\u0143\u0144\u0005\u0015\u0000\u0000"+
		"\u0144\u0146\u0005(\u0000\u0000\u0145\u0147\u0003@ \u0000\u0146\u0145"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0005)\u0000\u0000\u014b?\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0005\u0016\u0000\u0000\u014d\u014e\u0005(\u0000"+
		"\u0000\u014e\u014f\u0005\f\u0000\u0000\u014f\u0150\u0005$\u0000\u0000"+
		"\u0150\u0151\u0003B!\u0000\u0151\u0152\u0005\u0017\u0000\u0000\u0152\u0153"+
		"\u0005$\u0000\u0000\u0153\u0154\u0003D\"\u0000\u0154\u0155\u0005)\u0000"+
		"\u0000\u0155A\u0001\u0000\u0000\u0000\u0156\u0157\u00052\u0000\u0000\u0157"+
		"C\u0001\u0000\u0000\u0000\u0158\u0159\u00052\u0000\u0000\u0159E\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0005\u0018\u0000\u0000\u015b\u015d\u0005"+
		"(\u0000\u0000\u015c\u015e\u0003H$\u0000\u015d\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0005)\u0000\u0000\u0162G\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0005\u0019\u0000\u0000\u0164\u0165\u0005(\u0000\u0000\u0165\u0166"+
		"\u0005\f\u0000\u0000\u0166\u0167\u0005$\u0000\u0000\u0167\u0168\u0003"+
		"J%\u0000\u0168\u0169\u0005\u0017\u0000\u0000\u0169\u016a\u0005$\u0000"+
		"\u0000\u016a\u016b\u0003L&\u0000\u016b\u016c\u0003N\'\u0000\u016c\u016d"+
		"\u0005)\u0000\u0000\u016dI\u0001\u0000\u0000\u0000\u016e\u016f\u00052"+
		"\u0000\u0000\u016fK\u0001\u0000\u0000\u0000\u0170\u0171\u00052\u0000\u0000"+
		"\u0171M\u0001\u0000\u0000\u0000\u0172\u0173\u0005\u001a\u0000\u0000\u0173"+
		"\u0174\u0005$\u0000\u0000\u0174\u0175\u0005(\u0000\u0000\u0175\u0176\u0005"+
		"\f\u0000\u0000\u0176\u0177\u0005$\u0000\u0000\u0177\u0178\u0003P(\u0000"+
		"\u0178\u0179\u0005\u001b\u0000\u0000\u0179\u017a\u0005$\u0000\u0000\u017a"+
		"\u017b\u0003R)\u0000\u017b\u017c\u0005\u001c\u0000\u0000\u017c\u017d\u0005"+
		"$\u0000\u0000\u017d\u017e\u0005(\u0000\u0000\u017e\u017f\u0003\u0000\u0000"+
		"\u0000\u017f\u0180\u0005)\u0000\u0000\u0180\u0181\u0005)\u0000\u0000\u0181"+
		"O\u0001\u0000\u0000\u0000\u0182\u0183\u0005*\u0000\u0000\u0183Q\u0001"+
		"\u0000\u0000\u0000\u0184\u0185\u0005&\u0000\u0000\u0185\u0188\u0003T*"+
		"\u0000\u0186\u0187\u0005#\u0000\u0000\u0187\u0189\u0003T*\u0000\u0188"+
		"\u0186\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u0188\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b"+
		"\u018c\u0001\u0000\u0000\u0000\u018c\u018d\u0005\'\u0000\u0000\u018dS"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0003V+\u0000\u018f\u0190\u0003X"+
		",\u0000\u0190U\u0001\u0000\u0000\u0000\u0191\u0192\u00052\u0000\u0000"+
		"\u0192W\u0001\u0000\u0000\u0000\u0193\u0194\u00052\u0000\u0000\u0194Y"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0005\u001d\u0000\u0000\u0196\u0198"+
		"\u0005(\u0000\u0000\u0197\u0199\u0003\\.\u0000\u0198\u0197\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000"+
		"\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000"+
		"\u0000\u0000\u019c\u019d\u0005)\u0000\u0000\u019d[\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0005\u001e\u0000\u0000\u019f\u01a0\u0005(\u0000\u0000\u01a0"+
		"\u01a1\u0005\u001f\u0000\u0000\u01a1\u01a2\u0005$\u0000\u0000\u01a2\u01a3"+
		"\u0003^/\u0000\u01a3\u01a4\u0005\u0016\u0000\u0000\u01a4\u01a5\u0005$"+
		"\u0000\u0000\u01a5\u01a6\u0003`0\u0000\u01a6\u01a7\u0005\u0019\u0000\u0000"+
		"\u01a7\u01a8\u0005$\u0000\u0000\u01a8\u01a9\u0003b1\u0000\u01a9\u01aa"+
		"\u0005)\u0000\u0000\u01aa\u01ab\u0005 \u0000\u0000\u01ab\u01ac\u0005$"+
		"\u0000\u0000\u01ac\u01ad\u0003d2\u0000\u01ad]\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u00052\u0000\u0000\u01af_\u0001\u0000\u0000\u0000\u01b0\u01b1"+
		"\u0005*\u0000\u0000\u01b1a\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005*"+
		"\u0000\u0000\u01b3c\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005/\u0000\u0000"+
		"\u01b5e\u0001\u0000\u0000\u0000\u0019ip\u007f\u0089\u008e\u0097\u009f"+
		"\u00a5\u00a9\u00b3\u00c0\u00c9\u00d7\u00e3\u00f7\u00fc\u0101\u010d\u0110"+
		"\u011b\u0131\u0148\u015f\u018a\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}