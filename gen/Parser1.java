// Generated from C:/Users/LENOVO/IdeaProjects/AnalizadorLexico/Parser1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Parser1 extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHEN=3, FOR=4, THEN=5, RETURN=6, FUNC=7, TIPO=8, LBRACE=9, 
		RBRACE=10, LPAREN=11, RPAREN=12, SEMICOLON=13, COMMA=14, PLUS=15, MINUS=16, 
		MULT=17, DIV=18, ASSIGN=19, COMP_OP=20, ID=21, NUM=22, FLOATNUM=23, WS=24;
	public static final int
		RULE_program = 0, RULE_declaracion = 1, RULE_tipoFuncion = 2, RULE_listaId = 3, 
		RULE_sentencia = 4, RULE_asignacion = 5, RULE_funcion = 6, RULE_llamadaFuncion = 7, 
		RULE_parametros = 8, RULE_argumentos = 9, RULE_ifStmt = 10, RULE_bloque = 11, 
		RULE_condicion = 12, RULE_expr = 13, RULE_term = 14, RULE_factor = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaracion", "tipoFuncion", "listaId", "sentencia", "asignacion", 
			"funcion", "llamadaFuncion", "parametros", "argumentos", "ifStmt", "bloque", 
			"condicion", "expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'when'", "'for'", "'then'", "'return'", "'function'", 
			null, "'{'", "'}'", "'('", "')'", "';'", "','", "'+'", "'-'", "'*'", 
			"'/'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHEN", "FOR", "THEN", "RETURN", "FUNC", "TIPO", 
			"LBRACE", "RBRACE", "LPAREN", "RPAREN", "SEMICOLON", "COMMA", "PLUS", 
			"MINUS", "MULT", "DIV", "ASSIGN", "COMP_OP", "ID", "NUM", "FLOATNUM", 
			"WS"
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
	public String getGrammarFileName() { return "Parser1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Parser1(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Parser1.EOF, 0); }
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TipoFuncionContext> tipoFuncion() {
			return getRuleContexts(TipoFuncionContext.class);
		}
		public TipoFuncionContext tipoFuncion(int i) {
			return getRuleContext(TipoFuncionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(35);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(32);
					declaracion();
					}
					break;
				case 2:
					{
					setState(33);
					sentencia();
					}
					break;
				case 3:
					{
					setState(34);
					tipoFuncion();
					}
					break;
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2097410L) != 0) );
			setState(39);
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
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(Parser1.TIPO, 0); }
		public ListaIdContext listaId() {
			return getRuleContext(ListaIdContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parser1.SEMICOLON, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(TIPO);
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(42);
				listaId();
				setState(43);
				match(SEMICOLON);
				}
				break;
			case 2:
				{
				setState(45);
				asignacion();
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
	public static class TipoFuncionContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(Parser1.TIPO, 0); }
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public TipoFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterTipoFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitTipoFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitTipoFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoFuncionContext tipoFuncion() throws RecognitionException {
		TipoFuncionContext _localctx = new TipoFuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipoFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(TIPO);
			setState(49);
			funcion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaIdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Parser1.ID); }
		public TerminalNode ID(int i) {
			return getToken(Parser1.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser1.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser1.COMMA, i);
		}
		public ListaIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterListaId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitListaId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitListaId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaIdContext listaId() throws RecognitionException {
		ListaIdContext _localctx = new ListaIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listaId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ID);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(52);
				match(COMMA);
				setState(53);
				match(ID);
				}
				}
				setState(58);
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
	public static class SentenciaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				asignacion();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				ifStmt();
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Parser1.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(Parser1.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parser1.SEMICOLON, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ID);
			setState(64);
			match(ASSIGN);
			setState(65);
			expr();
			setState(66);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(Parser1.FUNC, 0); }
		public TerminalNode ID() { return getToken(Parser1.ID, 0); }
		public TerminalNode LPAREN() { return getToken(Parser1.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser1.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(Parser1.LBRACE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(Parser1.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(Parser1.SEMICOLON, 0); }
		public TerminalNode RBRACE() { return getToken(Parser1.RBRACE, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(FUNC);
			setState(69);
			match(ID);
			setState(70);
			match(LPAREN);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(71);
				parametros();
				}
			}

			setState(74);
			match(RPAREN);
			setState(75);
			match(LBRACE);
			setState(76);
			bloque();
			setState(77);
			match(RETURN);
			setState(78);
			expr();
			setState(79);
			match(SEMICOLON);
			setState(80);
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
	public static class LlamadaFuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Parser1.ID, 0); }
		public TerminalNode LPAREN() { return getToken(Parser1.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(Parser1.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(Parser1.SEMICOLON, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public LlamadaFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterLlamadaFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitLlamadaFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitLlamadaFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaFuncionContext llamadaFuncion() throws RecognitionException {
		LlamadaFuncionContext _localctx = new LlamadaFuncionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_llamadaFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(LPAREN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14682112L) != 0)) {
				{
				setState(84);
				argumentos();
				}
			}

			setState(87);
			match(RPAREN);
			setState(88);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> TIPO() { return getTokens(Parser1.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(Parser1.TIPO, i);
		}
		public List<TerminalNode> ID() { return getTokens(Parser1.ID); }
		public TerminalNode ID(int i) {
			return getToken(Parser1.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser1.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser1.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(TIPO);
			setState(91);
			match(ID);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(92);
				match(COMMA);
				setState(93);
				match(TIPO);
				setState(94);
				match(ID);
				}
				}
				setState(99);
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
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Parser1.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Parser1.COMMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			expr();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(101);
				match(COMMA);
				setState(102);
				expr();
				}
				}
				setState(107);
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
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Parser1.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Parser1.LPAREN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser1.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(Parser1.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(Parser1.LBRACE, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(Parser1.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(Parser1.RBRACE, i);
		}
		public List<TerminalNode> RETURN() { return getTokens(Parser1.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(Parser1.RETURN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(Parser1.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(Parser1.SEMICOLON, i);
		}
		public TerminalNode ELSE() { return getToken(Parser1.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(IF);
			setState(109);
			match(LPAREN);
			setState(110);
			condicion();
			setState(111);
			match(RPAREN);
			setState(112);
			match(LBRACE);
			setState(113);
			bloque();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(114);
				match(RETURN);
				setState(115);
				expr();
				setState(116);
				match(SEMICOLON);
				}
			}

			setState(120);
			match(RBRACE);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(121);
				match(ELSE);
				setState(122);
				match(LBRACE);
				setState(123);
				bloque();
				setState(124);
				match(RBRACE);
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(125);
					match(RETURN);
					setState(126);
					expr();
					setState(127);
					match(SEMICOLON);
					}
					break;
				}
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
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2097410L) != 0)) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case ID:
					{
					setState(133);
					sentencia();
					}
					break;
				case TIPO:
					{
					setState(134);
					declaracion();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
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
	public static class CondicionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMP_OP() { return getToken(Parser1.COMP_OP, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			expr();
			setState(141);
			match(COMP_OP);
			setState(142);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(Parser1.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(Parser1.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(Parser1.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(Parser1.MINUS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			term();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				term();
				}
				}
				setState(151);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(Parser1.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(Parser1.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(Parser1.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(Parser1.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			factor();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(153);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(154);
				factor();
				}
				}
				setState(159);
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(Parser1.NUM, 0); }
		public TerminalNode ID() { return getToken(Parser1.ID, 0); }
		public TerminalNode FLOATNUM() { return getToken(Parser1.FLOATNUM, 0); }
		public TerminalNode LPAREN() { return getToken(Parser1.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Parser1.RPAREN, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Parser1Listener ) ((Parser1Listener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Parser1Visitor ) return ((Parser1Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(ID);
				}
				break;
			case FLOATNUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(FLOATNUM);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(LPAREN);
				setState(164);
				expr();
				setState(165);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u00aa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000$\b\u0000\u000b"+
		"\u0000\f\u0000%\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00037\b"+
		"\u0003\n\u0003\f\u0003:\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004>\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006I\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007V\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b`\b\b\n\b\f\bc\t\b\u0001\t\u0001\t\u0001\t\u0005\th"+
		"\b\t\n\t\f\tk\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\nw\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0082\b\n\u0003\n\u0084"+
		"\b\n\u0001\u000b\u0001\u000b\u0005\u000b\u0088\b\u000b\n\u000b\f\u000b"+
		"\u008b\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u0094\b\r\n\r\f\r\u0097\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u009c\b\u000e\n\u000e\f\u000e\u009f\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00a8\b\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0002"+
		"\u0001\u0000\u000f\u0010\u0001\u0000\u0011\u0012\u00ad\u0000#\u0001\u0000"+
		"\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000"+
		"\u00063\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\n?\u0001\u0000"+
		"\u0000\u0000\fD\u0001\u0000\u0000\u0000\u000eR\u0001\u0000\u0000\u0000"+
		"\u0010Z\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000\u0014l"+
		"\u0001\u0000\u0000\u0000\u0016\u0089\u0001\u0000\u0000\u0000\u0018\u008c"+
		"\u0001\u0000\u0000\u0000\u001a\u0090\u0001\u0000\u0000\u0000\u001c\u0098"+
		"\u0001\u0000\u0000\u0000\u001e\u00a7\u0001\u0000\u0000\u0000 $\u0003\u0002"+
		"\u0001\u0000!$\u0003\b\u0004\u0000\"$\u0003\u0004\u0002\u0000# \u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000"+
		"$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'(\u0005\u0000\u0000\u0001(\u0001\u0001"+
		"\u0000\u0000\u0000).\u0005\b\u0000\u0000*+\u0003\u0006\u0003\u0000+,\u0005"+
		"\r\u0000\u0000,/\u0001\u0000\u0000\u0000-/\u0003\n\u0005\u0000.*\u0001"+
		"\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0003\u0001\u0000\u0000"+
		"\u000001\u0005\b\u0000\u000012\u0003\f\u0006\u00002\u0005\u0001\u0000"+
		"\u0000\u000038\u0005\u0015\u0000\u000045\u0005\u000e\u0000\u000057\u0005"+
		"\u0015\u0000\u000064\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0007\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000;>\u0003\n\u0005\u0000<>\u0003\u0014"+
		"\n\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>\t\u0001"+
		"\u0000\u0000\u0000?@\u0005\u0015\u0000\u0000@A\u0005\u0013\u0000\u0000"+
		"AB\u0003\u001a\r\u0000BC\u0005\r\u0000\u0000C\u000b\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0007\u0000\u0000EF\u0005\u0015\u0000\u0000FH\u0005\u000b"+
		"\u0000\u0000GI\u0003\u0010\b\u0000HG\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005\f\u0000\u0000KL\u0005\t"+
		"\u0000\u0000LM\u0003\u0016\u000b\u0000MN\u0005\u0006\u0000\u0000NO\u0003"+
		"\u001a\r\u0000OP\u0005\r\u0000\u0000PQ\u0005\n\u0000\u0000Q\r\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0015\u0000\u0000SU\u0005\u000b\u0000\u0000TV\u0003"+
		"\u0012\t\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0005\f\u0000\u0000XY\u0005\r\u0000\u0000Y\u000f"+
		"\u0001\u0000\u0000\u0000Z[\u0005\b\u0000\u0000[a\u0005\u0015\u0000\u0000"+
		"\\]\u0005\u000e\u0000\u0000]^\u0005\b\u0000\u0000^`\u0005\u0015\u0000"+
		"\u0000_\\\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0011\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000di\u0003\u001a\r\u0000ef\u0005\u000e\u0000\u0000"+
		"fh\u0003\u001a\r\u0000ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0013\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0001\u0000\u0000mn\u0005"+
		"\u000b\u0000\u0000no\u0003\u0018\f\u0000op\u0005\f\u0000\u0000pq\u0005"+
		"\t\u0000\u0000qv\u0003\u0016\u000b\u0000rs\u0005\u0006\u0000\u0000st\u0003"+
		"\u001a\r\u0000tu\u0005\r\u0000\u0000uw\u0001\u0000\u0000\u0000vr\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"x\u0083\u0005\n\u0000\u0000yz\u0005\u0002\u0000\u0000z{\u0005\t\u0000"+
		"\u0000{|\u0003\u0016\u000b\u0000|\u0081\u0005\n\u0000\u0000}~\u0005\u0006"+
		"\u0000\u0000~\u007f\u0003\u001a\r\u0000\u007f\u0080\u0005\r\u0000\u0000"+
		"\u0080\u0082\u0001\u0000\u0000\u0000\u0081}\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083"+
		"y\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0015"+
		"\u0001\u0000\u0000\u0000\u0085\u0088\u0003\b\u0004\u0000\u0086\u0088\u0003"+
		"\u0002\u0001\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0017\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0003"+
		"\u001a\r\u0000\u008d\u008e\u0005\u0014\u0000\u0000\u008e\u008f\u0003\u001a"+
		"\r\u0000\u008f\u0019\u0001\u0000\u0000\u0000\u0090\u0095\u0003\u001c\u000e"+
		"\u0000\u0091\u0092\u0007\u0000\u0000\u0000\u0092\u0094\u0003\u001c\u000e"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u001b\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0098\u009d\u0003\u001e\u000f\u0000\u0099\u009a\u0007\u0001\u0000"+
		"\u0000\u009a\u009c\u0003\u001e\u000f\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u001d\u0001\u0000\u0000"+
		"\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a8\u0005\u0016\u0000"+
		"\u0000\u00a1\u00a8\u0005\u0015\u0000\u0000\u00a2\u00a8\u0005\u0017\u0000"+
		"\u0000\u00a3\u00a4\u0005\u000b\u0000\u0000\u00a4\u00a5\u0003\u001a\r\u0000"+
		"\u00a5\u00a6\u0005\f\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a8"+
		"\u001f\u0001\u0000\u0000\u0000\u0011#%.8=HUaiv\u0081\u0083\u0087\u0089"+
		"\u0095\u009d\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}