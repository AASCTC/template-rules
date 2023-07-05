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
		T__17=18, T__18=19, T__19=20, LPAREN=21, RPAREN=22, COMMA=23, COLON=24, 
		QUOTE=25, LBRACK=26, RBRACK=27, LBRACE=28, RBRACE=29, IDENTIFIER=30, DATE=31, 
		EMAIL=32, WS=33, COMMENT=34, TEXT=35;
	public static final int
		RULE_templateRulesDocument = 0, RULE_header = 1, RULE_headerFields = 2, 
		RULE_authorList = 3, RULE_author = 4, RULE_templates = 5, RULE_namespaces = 6, 
		RULE_namespace = 7, RULE_sources = 8, RULE_source = 9, RULE_sinks = 10, 
		RULE_sink = 11, RULE_method = 12, RULE_parameters = 13, RULE_rules = 14, 
		RULE_rule = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"templateRulesDocument", "header", "headerFields", "authorList", "author", 
			"templates", "namespaces", "namespace", "sources", "source", "sinks", 
			"sink", "method", "parameters", "rules", "rule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'header'", "'name'", "'date'", "'author'", "'description'", "'email'", 
			"'templates'", "'namespaces'", "'namespace'", "'alias'", "'sources'", 
			"'source'", "'label'", "'sinks'", "'sink'", "'transform'", "'parameters'", 
			"'rules'", "'rule'", "'path'", "'('", "')'", "','", "':'", "'\"'", "'['", 
			"']'", "'{'", "'}'", null, "'YYYY-mm-ddTHH:MM:SS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "LPAREN", "RPAREN", 
			"COMMA", "COLON", "QUOTE", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "IDENTIFIER", 
			"DATE", "EMAIL", "WS", "COMMENT", "TEXT"
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
			setState(32);
			header();
			setState(33);
			templates();
			setState(34);
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
			setState(36);
			match(T__0);
			setState(37);
			match(LBRACE);
			setState(38);
			headerFields();
			setState(39);
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
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
		public TerminalNode DATE() { return getToken(TemplateRulesParser.DATE, 0); }
		public AuthorListContext authorList() {
			return getRuleContext(AuthorListContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
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
			setState(41);
			match(T__1);
			setState(42);
			match(COLON);
			setState(43);
			match(IDENTIFIER);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(44);
				match(T__2);
				setState(45);
				match(COLON);
				setState(46);
				match(DATE);
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(49);
				match(T__3);
				setState(50);
				match(COLON);
				setState(51);
				authorList();
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(54);
				match(T__4);
				setState(55);
				match(COLON);
				setState(56);
				match(TEXT);
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
	public static class AuthorListContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TemplateRulesParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(TemplateRulesParser.RBRACK, 0); }
		public List<AuthorContext> author() {
			return getRuleContexts(AuthorContext.class);
		}
		public AuthorContext author(int i) {
			return getRuleContext(AuthorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TemplateRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TemplateRulesParser.COMMA, i);
		}
		public AuthorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitAuthorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorListContext authorList() throws RecognitionException {
		AuthorListContext _localctx = new AuthorListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_authorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LBRACK);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(60);
				author();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(61);
					match(COMMA);
					setState(62);
					author();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
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
	public static class AuthorContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(TemplateRulesParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TemplateRulesParser.COLON, i);
		}
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
		public TerminalNode EMAIL() { return getToken(TemplateRulesParser.EMAIL, 0); }
		public AuthorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_author; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitAuthor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorContext author() throws RecognitionException {
		AuthorContext _localctx = new AuthorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_author);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(LBRACE);
			setState(73);
			match(T__1);
			setState(74);
			match(COLON);
			setState(75);
			match(TEXT);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(76);
				match(T__5);
				setState(77);
				match(COLON);
				setState(78);
				match(EMAIL);
				}
			}

			setState(81);
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
		enterRule(_localctx, 10, RULE_templates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__6);
			setState(84);
			match(LBRACE);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				namespaces();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				sources();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				sinks();
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__13 );
			setState(100);
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
		enterRule(_localctx, 12, RULE_namespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__7);
			setState(103);
			match(LBRACE);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				namespace();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
			setState(109);
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
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TemplateRulesParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 14, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__8);
			setState(112);
			match(LBRACE);
			setState(113);
			match(T__1);
			setState(114);
			match(COLON);
			setState(115);
			match(TEXT);
			setState(116);
			match(T__9);
			setState(117);
			match(COLON);
			setState(118);
			match(IDENTIFIER);
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
		enterRule(_localctx, 16, RULE_sources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__10);
			setState(122);
			match(LBRACE);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				source();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(128);
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
		public List<TerminalNode> TEXT() { return getTokens(TemplateRulesParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(TemplateRulesParser.TEXT, i);
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
		enterRule(_localctx, 18, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__11);
			setState(131);
			match(LBRACE);
			setState(132);
			match(T__1);
			setState(133);
			match(COLON);
			setState(134);
			match(TEXT);
			setState(135);
			match(T__12);
			setState(136);
			match(COLON);
			setState(137);
			match(TEXT);
			setState(138);
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
		enterRule(_localctx, 20, RULE_sinks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__13);
			setState(141);
			match(LBRACE);
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				sink();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
			setState(147);
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
		public List<TerminalNode> TEXT() { return getTokens(TemplateRulesParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(TemplateRulesParser.TEXT, i);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
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
		enterRule(_localctx, 22, RULE_sink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__14);
			setState(150);
			match(LBRACE);
			setState(151);
			match(T__1);
			setState(152);
			match(COLON);
			setState(153);
			match(TEXT);
			setState(154);
			match(T__12);
			setState(155);
			match(COLON);
			setState(156);
			match(TEXT);
			setState(157);
			method();
			setState(158);
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
		public TerminalNode LBRACE() { return getToken(TemplateRulesParser.LBRACE, 0); }
		public TerminalNode TEXT() { return getToken(TemplateRulesParser.TEXT, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(TemplateRulesParser.RBRACE, 0); }
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
		enterRule(_localctx, 24, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__15);
			setState(161);
			match(COLON);
			setState(162);
			match(LBRACE);
			setState(163);
			match(T__1);
			setState(164);
			match(COLON);
			setState(165);
			match(TEXT);
			setState(166);
			match(T__16);
			setState(167);
			match(COLON);
			setState(168);
			parameters();
			setState(169);
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
	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TemplateRulesParser.LBRACK, 0); }
		public List<TerminalNode> TEXT() { return getTokens(TemplateRulesParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(TemplateRulesParser.TEXT, i);
		}
		public TerminalNode RBRACK() { return getToken(TemplateRulesParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TemplateRulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TemplateRulesParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TemplateRulesVisitor ) return ((TemplateRulesVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(LBRACK);
			setState(172);
			match(TEXT);
			setState(175); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				match(COMMA);
				setState(174);
				match(TEXT);
				}
				}
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(179);
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
		enterRule(_localctx, 28, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__17);
			setState(182);
			match(LBRACE);
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				rule_();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 );
			setState(188);
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
		public List<TerminalNode> TEXT() { return getTokens(TemplateRulesParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(TemplateRulesParser.TEXT, i);
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
		enterRule(_localctx, 30, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__18);
			setState(191);
			match(LBRACE);
			setState(192);
			match(T__19);
			setState(193);
			match(COLON);
			setState(194);
			match(TEXT);
			setState(195);
			match(T__11);
			setState(196);
			match(COLON);
			setState(197);
			match(TEXT);
			setState(198);
			match(T__14);
			setState(199);
			match(COLON);
			setState(200);
			match(TEXT);
			setState(201);
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

	public static final String _serializedATN =
		"\u0004\u0001#\u00cc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00020\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003\u0003\u0003"+
		"E\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004P\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005"+
		"W\b\u0005\u000b\u0005\f\u0005X\u0001\u0005\u0004\u0005\\\b\u0005\u000b"+
		"\u0005\f\u0005]\u0001\u0005\u0004\u0005a\b\u0005\u000b\u0005\f\u0005b"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"j\b\u0006\u000b\u0006\f\u0006k\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004\b}\b\b\u000b"+
		"\b\f\b~\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0004\n\u0090"+
		"\b\n\u000b\n\f\n\u0091\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0004\r\u00b0\b\r\u000b\r\f\r\u00b1\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u00b9\b\u000e\u000b\u000e\f\u000e\u00ba"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e\u0000\u0000\u00c9\u0000 \u0001\u0000\u0000\u0000\u0002$\u0001\u0000"+
		"\u0000\u0000\u0004)\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000"+
		"\bH\u0001\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\ff\u0001\u0000"+
		"\u0000\u0000\u000eo\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000"+
		"\u0012\u0082\u0001\u0000\u0000\u0000\u0014\u008c\u0001\u0000\u0000\u0000"+
		"\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u00a0\u0001\u0000\u0000\u0000"+
		"\u001a\u00ab\u0001\u0000\u0000\u0000\u001c\u00b5\u0001\u0000\u0000\u0000"+
		"\u001e\u00be\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0003"+
		"\n\u0005\u0000\"#\u0003\u001c\u000e\u0000#\u0001\u0001\u0000\u0000\u0000"+
		"$%\u0005\u0001\u0000\u0000%&\u0005\u001c\u0000\u0000&\'\u0003\u0004\u0002"+
		"\u0000\'(\u0005\u001d\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0005"+
		"\u0002\u0000\u0000*+\u0005\u0018\u0000\u0000+/\u0005\u001e\u0000\u0000"+
		",-\u0005\u0003\u0000\u0000-.\u0005\u0018\u0000\u0000.0\u0005\u001f\u0000"+
		"\u0000/,\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000004\u0001\u0000"+
		"\u0000\u000012\u0005\u0004\u0000\u000023\u0005\u0018\u0000\u000035\u0003"+
		"\u0006\u0003\u000041\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"59\u0001\u0000\u0000\u000067\u0005\u0005\u0000\u000078\u0005\u0018\u0000"+
		"\u00008:\u0005#\u0000\u000096\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:\u0005\u0001\u0000\u0000\u0000;D\u0005\u001a\u0000\u0000<A\u0003"+
		"\b\u0004\u0000=>\u0005\u0017\u0000\u0000>@\u0003\b\u0004\u0000?=\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000D<\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FG\u0005\u001b\u0000\u0000G\u0007\u0001\u0000\u0000\u0000"+
		"HI\u0005\u001c\u0000\u0000IJ\u0005\u0002\u0000\u0000JK\u0005\u0018\u0000"+
		"\u0000KO\u0005#\u0000\u0000LM\u0005\u0006\u0000\u0000MN\u0005\u0018\u0000"+
		"\u0000NP\u0005 \u0000\u0000OL\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\u001d\u0000\u0000R\t\u0001\u0000"+
		"\u0000\u0000ST\u0005\u0007\u0000\u0000TV\u0005\u001c\u0000\u0000UW\u0003"+
		"\f\u0006\u0000VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000"+
		"Z\\\u0003\u0010\b\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000"+
		"\u0000\u0000_a\u0003\u0014\n\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000de\u0005\u001d\u0000\u0000e\u000b\u0001\u0000\u0000"+
		"\u0000fg\u0005\b\u0000\u0000gi\u0005\u001c\u0000\u0000hj\u0003\u000e\u0007"+
		"\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005"+
		"\u001d\u0000\u0000n\r\u0001\u0000\u0000\u0000op\u0005\t\u0000\u0000pq"+
		"\u0005\u001c\u0000\u0000qr\u0005\u0002\u0000\u0000rs\u0005\u0018\u0000"+
		"\u0000st\u0005#\u0000\u0000tu\u0005\n\u0000\u0000uv\u0005\u0018\u0000"+
		"\u0000vw\u0005\u001e\u0000\u0000wx\u0005\u001d\u0000\u0000x\u000f\u0001"+
		"\u0000\u0000\u0000yz\u0005\u000b\u0000\u0000z|\u0005\u001c\u0000\u0000"+
		"{}\u0003\u0012\t\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u001d\u0000\u0000\u0081\u0011"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\f\u0000\u0000\u0083\u0084\u0005"+
		"\u001c\u0000\u0000\u0084\u0085\u0005\u0002\u0000\u0000\u0085\u0086\u0005"+
		"\u0018\u0000\u0000\u0086\u0087\u0005#\u0000\u0000\u0087\u0088\u0005\r"+
		"\u0000\u0000\u0088\u0089\u0005\u0018\u0000\u0000\u0089\u008a\u0005#\u0000"+
		"\u0000\u008a\u008b\u0005\u001d\u0000\u0000\u008b\u0013\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u000e\u0000\u0000\u008d\u008f\u0005\u001c\u0000"+
		"\u0000\u008e\u0090\u0003\u0016\u000b\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\u001d\u0000\u0000\u0094\u0015\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0005\u000f\u0000\u0000\u0096\u0097\u0005\u001c\u0000"+
		"\u0000\u0097\u0098\u0005\u0002\u0000\u0000\u0098\u0099\u0005\u0018\u0000"+
		"\u0000\u0099\u009a\u0005#\u0000\u0000\u009a\u009b\u0005\r\u0000\u0000"+
		"\u009b\u009c\u0005\u0018\u0000\u0000\u009c\u009d\u0005#\u0000\u0000\u009d"+
		"\u009e\u0003\u0018\f\u0000\u009e\u009f\u0005\u001d\u0000\u0000\u009f\u0017"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0010\u0000\u0000\u00a1\u00a2"+
		"\u0005\u0018\u0000\u0000\u00a2\u00a3\u0005\u001c\u0000\u0000\u00a3\u00a4"+
		"\u0005\u0002\u0000\u0000\u00a4\u00a5\u0005\u0018\u0000\u0000\u00a5\u00a6"+
		"\u0005#\u0000\u0000\u00a6\u00a7\u0005\u0011\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0018\u0000\u0000\u00a8\u00a9\u0003\u001a\r\u0000\u00a9\u00aa\u0005\u001d"+
		"\u0000\u0000\u00aa\u0019\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u001a"+
		"\u0000\u0000\u00ac\u00af\u0005#\u0000\u0000\u00ad\u00ae\u0005\u0017\u0000"+
		"\u0000\u00ae\u00b0\u0005#\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0005\u001b\u0000\u0000\u00b4\u001b\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0012\u0000\u0000\u00b6\u00b8\u0005\u001c\u0000\u0000"+
		"\u00b7\u00b9\u0003\u001e\u000f\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005\u001d\u0000\u0000\u00bd\u001d\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0005\u0013\u0000\u0000\u00bf\u00c0\u0005\u001c\u0000\u0000"+
		"\u00c0\u00c1\u0005\u0014\u0000\u0000\u00c1\u00c2\u0005\u0018\u0000\u0000"+
		"\u00c2\u00c3\u0005#\u0000\u0000\u00c3\u00c4\u0005\f\u0000\u0000\u00c4"+
		"\u00c5\u0005\u0018\u0000\u0000\u00c5\u00c6\u0005#\u0000\u0000\u00c6\u00c7"+
		"\u0005\u000f\u0000\u0000\u00c7\u00c8\u0005\u0018\u0000\u0000\u00c8\u00c9"+
		"\u0005#\u0000\u0000\u00c9\u00ca\u0005\u001d\u0000\u0000\u00ca\u001f\u0001"+
		"\u0000\u0000\u0000\u000e/49ADOX]bk~\u0091\u00b1\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}