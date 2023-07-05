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
		T__17=18, T__18=19, T__19=20, T__20=21, LPAREN=22, RPAREN=23, COMMA=24, 
		COLON=25, QUOTE=26, LBRACK=27, RBRACK=28, LBRACE=29, RBRACE=30, IDENTIFIER=31, 
		DATE=32, EMAIL=33, TRUE=34, FALSE=35, BOOLEAN=36, WS=37, COMMENT=38, TEXT=39;
	public static final int
		RULE_templateRulesDocument = 0, RULE_header = 1, RULE_headerFields = 2, 
		RULE_headerName = 3, RULE_headerDate = 4, RULE_headerAuthorList = 5, RULE_headerAuthor = 6, 
		RULE_headerAuthorName = 7, RULE_headerAuthorEmail = 8, RULE_headerDescription = 9, 
		RULE_templates = 10, RULE_namespaces = 11, RULE_namespace = 12, RULE_namespaceName = 13, 
		RULE_namespaceAlias = 14, RULE_sources = 15, RULE_source = 16, RULE_sourceName = 17, 
		RULE_sourceLabel = 18, RULE_sinks = 19, RULE_sink = 20, RULE_sinkName = 21, 
		RULE_sinkLabel = 22, RULE_sinkMethod = 23, RULE_sinkMethodName = 24, RULE_sinkMethodParameters = 25, 
		RULE_sinkMethodParameter = 26, RULE_rules = 27, RULE_rule = 28, RULE_ruleLocation = 29, 
		RULE_ruleSource = 30, RULE_ruleSink = 31, RULE_rulePruneChildren = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"templateRulesDocument", "header", "headerFields", "headerName", "headerDate", 
			"headerAuthorList", "headerAuthor", "headerAuthorName", "headerAuthorEmail", 
			"headerDescription", "templates", "namespaces", "namespace", "namespaceName", 
			"namespaceAlias", "sources", "source", "sourceName", "sourceLabel", "sinks", 
			"sink", "sinkName", "sinkLabel", "sinkMethod", "sinkMethodName", "sinkMethodParameters", 
			"sinkMethodParameter", "rules", "rule", "ruleLocation", "ruleSource", 
			"ruleSink", "rulePruneChildren"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'header'", "'name'", "'date'", "'author'", "'description'", "'email'", 
			"'templates'", "'namespaces'", "'namespace'", "'alias'", "'sources'", 
			"'source'", "'label'", "'sinks'", "'sink'", "'method'", "'parameters'", 
			"'rules'", "'rule'", "'location'", "'pruneChildren'", "'('", "')'", "','", 
			"':'", "'\"'", "'['", "']'", "'{'", "'}'", null, "'YYYY-mm-ddTHH:MM:SS'", 
			null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "LPAREN", 
			"RPAREN", "COMMA", "COLON", "QUOTE", "LBRACK", "RBRACK", "LBRACE", "RBRACE", 
			"IDENTIFIER", "DATE", "EMAIL", "TRUE", "FALSE", "BOOLEAN", "WS", "COMMENT", 
			"TEXT"
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
		enterRule(_localctx, 0, RULE_templateRulesDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			header();
			setState(67);
			templates();
			setState(68);
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
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__0);
			setState(71);
			match(LBRACE);
			setState(72);
			headerFields();
			setState(73);
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
		enterRule(_localctx, 4, RULE_headerFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__1);
			setState(76);
			match(COLON);
			setState(77);
			headerName();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(78);
				match(T__2);
				setState(79);
				match(COLON);
				setState(80);
				headerDate();
				}
			}

			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(83);
				match(T__3);
				setState(84);
				match(COLON);
				setState(85);
				headerAuthorList();
				}
			}

			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(88);
				match(T__4);
				setState(89);
				match(COLON);
				setState(90);
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
		enterRule(_localctx, 6, RULE_headerName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		enterRule(_localctx, 8, RULE_headerDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		enterRule(_localctx, 10, RULE_headerAuthorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(LBRACK);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(98);
				headerAuthor();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(99);
					match(COMMA);
					setState(100);
					headerAuthor();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(108);
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
		enterRule(_localctx, 12, RULE_headerAuthor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LBRACE);
			setState(111);
			match(T__1);
			setState(112);
			match(COLON);
			setState(113);
			headerAuthorName();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(114);
				match(T__5);
				setState(115);
				match(COLON);
				setState(116);
				headerAuthorEmail();
				}
			}

			setState(119);
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
		enterRule(_localctx, 14, RULE_headerAuthorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
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
		enterRule(_localctx, 16, RULE_headerAuthorEmail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		enterRule(_localctx, 18, RULE_headerDescription);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public List<NamespacesContext> namespaces() {
			return getRuleContexts(NamespacesContext.class);
		}
		public NamespacesContext namespaces(int i) {
			return getRuleContext(NamespacesContext.class,i);
		}
		public List<SourcesContext> sources() {
			return getRuleContexts(SourcesContext.class);
		}
		public SourcesContext sources(int i) {
			return getRuleContext(SourcesContext.class,i);
		}
		public List<SinksContext> sinks() {
			return getRuleContexts(SinksContext.class);
		}
		public SinksContext sinks(int i) {
			return getRuleContext(SinksContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_templates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__6);
			setState(128);
			match(LBRACE);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				namespaces();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				sources();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				sinks();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
			setState(144);
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
		enterRule(_localctx, 22, RULE_namespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__7);
			setState(147);
			match(LBRACE);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148);
				namespace();
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(153);
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
		enterRule(_localctx, 24, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__8);
			setState(156);
			match(LBRACE);
			setState(157);
			match(T__1);
			setState(158);
			match(COLON);
			setState(159);
			namespaceName();
			setState(160);
			match(T__9);
			setState(161);
			match(COLON);
			setState(162);
			namespaceAlias();
			setState(163);
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
		enterRule(_localctx, 26, RULE_namespaceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		enterRule(_localctx, 28, RULE_namespaceAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		enterRule(_localctx, 30, RULE_sources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__10);
			setState(170);
			match(LBRACE);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				source();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(176);
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
		enterRule(_localctx, 32, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__11);
			setState(179);
			match(LBRACE);
			setState(180);
			match(T__1);
			setState(181);
			match(COLON);
			setState(182);
			sourceName();
			setState(183);
			match(T__12);
			setState(184);
			match(COLON);
			setState(185);
			sourceLabel();
			setState(186);
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
		enterRule(_localctx, 34, RULE_sourceName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		enterRule(_localctx, 36, RULE_sourceLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		enterRule(_localctx, 38, RULE_sinks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__13);
			setState(193);
			match(LBRACE);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				sink();
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
			setState(199);
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
		enterRule(_localctx, 40, RULE_sink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__14);
			setState(202);
			match(LBRACE);
			setState(203);
			match(T__1);
			setState(204);
			match(COLON);
			setState(205);
			sinkName();
			setState(206);
			match(T__12);
			setState(207);
			match(COLON);
			setState(208);
			sinkLabel();
			setState(209);
			sinkMethod();
			setState(210);
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
		enterRule(_localctx, 42, RULE_sinkName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		enterRule(_localctx, 44, RULE_sinkLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public SinkMethodNameContext sinkMethodName() {
			return getRuleContext(SinkMethodNameContext.class,0);
		}
		public SinkMethodParametersContext sinkMethodParameters() {
			return getRuleContext(SinkMethodParametersContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
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
		enterRule(_localctx, 46, RULE_sinkMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__15);
			setState(217);
			match(COLON);
			setState(218);
			match(LBRACE);
			setState(219);
			match(T__1);
			setState(220);
			match(COLON);
			setState(221);
			sinkMethodName();
			setState(222);
			match(T__16);
			setState(223);
			match(COLON);
			setState(224);
			sinkMethodParameters();
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
		enterRule(_localctx, 48, RULE_sinkMethodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		enterRule(_localctx, 50, RULE_sinkMethodParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(LBRACK);
			setState(230);
			sinkMethodParameter();
			setState(233); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				match(COMMA);
				setState(232);
				sinkMethodParameter();
				}
				}
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(237);
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
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
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
		enterRule(_localctx, 52, RULE_sinkMethodParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		enterRule(_localctx, 54, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__17);
			setState(242);
			match(LBRACE);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				rule_();
				}
				}
				setState(246); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
			setState(248);
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
		enterRule(_localctx, 56, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__18);
			setState(251);
			match(LBRACE);
			setState(252);
			match(T__19);
			setState(253);
			match(COLON);
			setState(254);
			ruleLocation();
			setState(255);
			match(T__11);
			setState(256);
			match(COLON);
			setState(257);
			ruleSource();
			setState(258);
			match(T__14);
			setState(259);
			match(COLON);
			setState(260);
			ruleSink();
			setState(261);
			match(RBRACE);
			setState(262);
			match(T__20);
			setState(263);
			match(COLON);
			setState(264);
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
		enterRule(_localctx, 58, RULE_ruleLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 60, RULE_ruleSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		enterRule(_localctx, 62, RULE_ruleSink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
		enterRule(_localctx, 64, RULE_rulePruneChildren);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
		"\u0004\u0001\'\u0113\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002R\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"W\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005f\b\u0005\n\u0005\f\u0005i\t\u0005\u0003"+
		"\u0005k\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006v\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004\n\u0083\b\n\u000b\n\f\n"+
		"\u0084\u0001\n\u0004\n\u0088\b\n\u000b\n\f\n\u0089\u0001\n\u0004\n\u008d"+
		"\b\n\u000b\n\f\n\u008e\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0004\u000b\u0096\b\u000b\u000b\u000b\f\u000b\u0097\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u00ad\b\u000f\u000b\u000f\f\u000f\u00ae"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0004\u0013\u00c4\b\u0013\u000b\u0013\f\u0013\u00c5\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0004\u0019\u00ea\b\u0019\u000b"+
		"\u0019\f\u0019\u00eb\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u00f5\b\u001b\u000b\u001b\f"+
		"\u001b\u00f6\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0000\u0000!\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@\u0000\u0000\u00ff\u0000B\u0001\u0000\u0000\u0000\u0002F\u0001"+
		"\u0000\u0000\u0000\u0004K\u0001\u0000\u0000\u0000\u0006]\u0001\u0000\u0000"+
		"\u0000\b_\u0001\u0000\u0000\u0000\na\u0001\u0000\u0000\u0000\fn\u0001"+
		"\u0000\u0000\u0000\u000ey\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000"+
		"\u0000\u0012}\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000"+
		"\u0016\u0092\u0001\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000"+
		"\u001a\u00a5\u0001\u0000\u0000\u0000\u001c\u00a7\u0001\u0000\u0000\u0000"+
		"\u001e\u00a9\u0001\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\""+
		"\u00bc\u0001\u0000\u0000\u0000$\u00be\u0001\u0000\u0000\u0000&\u00c0\u0001"+
		"\u0000\u0000\u0000(\u00c9\u0001\u0000\u0000\u0000*\u00d4\u0001\u0000\u0000"+
		"\u0000,\u00d6\u0001\u0000\u0000\u0000.\u00d8\u0001\u0000\u0000\u00000"+
		"\u00e3\u0001\u0000\u0000\u00002\u00e5\u0001\u0000\u0000\u00004\u00ef\u0001"+
		"\u0000\u0000\u00006\u00f1\u0001\u0000\u0000\u00008\u00fa\u0001\u0000\u0000"+
		"\u0000:\u010a\u0001\u0000\u0000\u0000<\u010c\u0001\u0000\u0000\u0000>"+
		"\u010e\u0001\u0000\u0000\u0000@\u0110\u0001\u0000\u0000\u0000BC\u0003"+
		"\u0002\u0001\u0000CD\u0003\u0014\n\u0000DE\u00036\u001b\u0000E\u0001\u0001"+
		"\u0000\u0000\u0000FG\u0005\u0001\u0000\u0000GH\u0005\u001d\u0000\u0000"+
		"HI\u0003\u0004\u0002\u0000IJ\u0005\u001e\u0000\u0000J\u0003\u0001\u0000"+
		"\u0000\u0000KL\u0005\u0002\u0000\u0000LM\u0005\u0019\u0000\u0000MQ\u0003"+
		"\u0006\u0003\u0000NO\u0005\u0003\u0000\u0000OP\u0005\u0019\u0000\u0000"+
		"PR\u0003\b\u0004\u0000QN\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RV\u0001\u0000\u0000\u0000ST\u0005\u0004\u0000\u0000TU\u0005\u0019\u0000"+
		"\u0000UW\u0003\n\u0005\u0000VS\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000W[\u0001\u0000\u0000\u0000XY\u0005\u0005\u0000\u0000YZ\u0005\u0019"+
		"\u0000\u0000Z\\\u0003\u0012\t\u0000[X\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\\u0005\u0001\u0000\u0000\u0000]^\u0005\u001f\u0000"+
		"\u0000^\u0007\u0001\u0000\u0000\u0000_`\u0005 \u0000\u0000`\t\u0001\u0000"+
		"\u0000\u0000aj\u0005\u001b\u0000\u0000bg\u0003\f\u0006\u0000cd\u0005\u0018"+
		"\u0000\u0000df\u0003\f\u0006\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0005\u001c\u0000"+
		"\u0000m\u000b\u0001\u0000\u0000\u0000no\u0005\u001d\u0000\u0000op\u0005"+
		"\u0002\u0000\u0000pq\u0005\u0019\u0000\u0000qu\u0003\u000e\u0007\u0000"+
		"rs\u0005\u0006\u0000\u0000st\u0005\u0019\u0000\u0000tv\u0003\u0010\b\u0000"+
		"ur\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wx\u0005\u001e\u0000\u0000x\r\u0001\u0000\u0000\u0000yz\u0005\'"+
		"\u0000\u0000z\u000f\u0001\u0000\u0000\u0000{|\u0005!\u0000\u0000|\u0011"+
		"\u0001\u0000\u0000\u0000}~\u0005\'\u0000\u0000~\u0013\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0005\u0007\u0000\u0000\u0080\u0082\u0005\u001d\u0000"+
		"\u0000\u0081\u0083\u0003\u0016\u000b\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000"+
		"\u0000\u0086\u0088\u0003\u001e\u000f\u0000\u0087\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0003&\u0013\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0005\u001e\u0000\u0000\u0091\u0015\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0005\b\u0000\u0000\u0093\u0095\u0005\u001d\u0000\u0000\u0094"+
		"\u0096\u0003\u0018\f\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005\u001e\u0000\u0000\u009a\u0017\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005\t\u0000\u0000\u009c\u009d\u0005\u001d\u0000\u0000\u009d\u009e\u0005"+
		"\u0002\u0000\u0000\u009e\u009f\u0005\u0019\u0000\u0000\u009f\u00a0\u0003"+
		"\u001a\r\u0000\u00a0\u00a1\u0005\n\u0000\u0000\u00a1\u00a2\u0005\u0019"+
		"\u0000\u0000\u00a2\u00a3\u0003\u001c\u000e\u0000\u00a3\u00a4\u0005\u001e"+
		"\u0000\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\'\u0000"+
		"\u0000\u00a6\u001b\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\'\u0000\u0000"+
		"\u00a8\u001d\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u000b\u0000\u0000"+
		"\u00aa\u00ac\u0005\u001d\u0000\u0000\u00ab\u00ad\u0003 \u0010\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u001e\u0000\u0000\u00b1"+
		"\u001f\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\f\u0000\u0000\u00b3\u00b4"+
		"\u0005\u001d\u0000\u0000\u00b4\u00b5\u0005\u0002\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0019\u0000\u0000\u00b6\u00b7\u0003\"\u0011\u0000\u00b7\u00b8\u0005"+
		"\r\u0000\u0000\u00b8\u00b9\u0005\u0019\u0000\u0000\u00b9\u00ba\u0003$"+
		"\u0012\u0000\u00ba\u00bb\u0005\u001e\u0000\u0000\u00bb!\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005\'\u0000\u0000\u00bd#\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0005\'\u0000\u0000\u00bf%\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0005\u000e\u0000\u0000\u00c1\u00c3\u0005\u001d\u0000\u0000\u00c2"+
		"\u00c4\u0003(\u0014\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005\u001e\u0000\u0000\u00c8\'\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"\u000f\u0000\u0000\u00ca\u00cb\u0005\u001d\u0000\u0000\u00cb\u00cc\u0005"+
		"\u0002\u0000\u0000\u00cc\u00cd\u0005\u0019\u0000\u0000\u00cd\u00ce\u0003"+
		"*\u0015\u0000\u00ce\u00cf\u0005\r\u0000\u0000\u00cf\u00d0\u0005\u0019"+
		"\u0000\u0000\u00d0\u00d1\u0003,\u0016\u0000\u00d1\u00d2\u0003.\u0017\u0000"+
		"\u00d2\u00d3\u0005\u001e\u0000\u0000\u00d3)\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0005\'\u0000\u0000\u00d5+\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005\'\u0000\u0000\u00d7-\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005"+
		"\u0010\u0000\u0000\u00d9\u00da\u0005\u0019\u0000\u0000\u00da\u00db\u0005"+
		"\u001d\u0000\u0000\u00db\u00dc\u0005\u0002\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0019\u0000\u0000\u00dd\u00de\u00030\u0018\u0000\u00de\u00df\u0005\u0011"+
		"\u0000\u0000\u00df\u00e0\u0005\u0019\u0000\u0000\u00e0\u00e1\u00032\u0019"+
		"\u0000\u00e1\u00e2\u0005\u001e\u0000\u0000\u00e2/\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005\u001f\u0000\u0000\u00e41\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0005\u001b\u0000\u0000\u00e6\u00e9\u00034\u001a\u0000\u00e7\u00e8"+
		"\u0005\u0018\u0000\u0000\u00e8\u00ea\u00034\u001a\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0005\u001c\u0000\u0000\u00ee3\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0005\'\u0000\u0000\u00f05\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0005\u0012\u0000\u0000\u00f2\u00f4\u0005\u001d\u0000"+
		"\u0000\u00f3\u00f5\u00038\u001c\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005\u001e\u0000\u0000\u00f97\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fb\u0005\u0013\u0000\u0000\u00fb\u00fc\u0005\u001d\u0000\u0000\u00fc"+
		"\u00fd\u0005\u0014\u0000\u0000\u00fd\u00fe\u0005\u0019\u0000\u0000\u00fe"+
		"\u00ff\u0003:\u001d\u0000\u00ff\u0100\u0005\f\u0000\u0000\u0100\u0101"+
		"\u0005\u0019\u0000\u0000\u0101\u0102\u0003<\u001e\u0000\u0102\u0103\u0005"+
		"\u000f\u0000\u0000\u0103\u0104\u0005\u0019\u0000\u0000\u0104\u0105\u0003"+
		">\u001f\u0000\u0105\u0106\u0005\u001e\u0000\u0000\u0106\u0107\u0005\u0015"+
		"\u0000\u0000\u0107\u0108\u0005\u0019\u0000\u0000\u0108\u0109\u0003@ \u0000"+
		"\u01099\u0001\u0000\u0000\u0000\u010a\u010b\u0005\'\u0000\u0000\u010b"+
		";\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u001f\u0000\u0000\u010d=\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0005\u001f\u0000\u0000\u010f?\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0005$\u0000\u0000\u0111A\u0001\u0000\u0000\u0000"+
		"\u000eQV[gju\u0084\u0089\u008e\u0097\u00ae\u00c5\u00eb\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}