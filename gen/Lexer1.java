// Generated from C:/Users/LENOVO/IdeaProjects/AnalizadorLexico/Lexer1.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Lexer1 extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHEN=3, FOR=4, THEN=5, RETURN=6, FUNC=7, TIPO=8, LBRACE=9, 
		RBRACE=10, LPAREN=11, RPAREN=12, SEMICOLON=13, COMMA=14, PLUS=15, MINUS=16, 
		MULT=17, DIV=18, ASSIGN=19, COMP_OP=20, ID=21, NUM=22, FLOATNUM=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "WHEN", "FOR", "THEN", "RETURN", "FUNC", "TIPO", "LBRACE", 
			"RBRACE", "LPAREN", "RPAREN", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
			"MULT", "DIV", "ASSIGN", "COMP_OP", "ID", "NUM", "FLOATNUM", "WS"
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


	public Lexer1(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexer1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0018\u00a4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007j\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0085\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0089\b\u0014\n\u0014\f\u0014\u008c\t\u0014\u0001\u0015\u0004"+
		"\u0015\u008f\b\u0015\u000b\u0015\f\u0015\u0090\u0001\u0016\u0004\u0016"+
		"\u0094\b\u0016\u000b\u0016\f\u0016\u0095\u0001\u0016\u0001\u0016\u0004"+
		"\u0016\u009a\b\u0016\u000b\u0016\f\u0016\u009b\u0001\u0017\u0004\u0017"+
		"\u009f\b\u0017\u000b\u0017\f\u0017\u00a0\u0001\u0017\u0001\u0017\u0000"+
		"\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u0018\u0001\u0000\u0005\u0002\u0000<<>>\u0003\u0000AZ__az\u0004"+
		"\u000009AZ__az\u0001\u000009\u0003\u0000\t\n\r\r  \u00ac\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00011\u0001\u0000\u0000\u0000\u00034\u0001\u0000\u0000\u0000\u00059"+
		"\u0001\u0000\u0000\u0000\u0007>\u0001\u0000\u0000\u0000\tB\u0001\u0000"+
		"\u0000\u0000\u000bG\u0001\u0000\u0000\u0000\rN\u0001\u0000\u0000\u0000"+
		"\u000fi\u0001\u0000\u0000\u0000\u0011k\u0001\u0000\u0000\u0000\u0013m"+
		"\u0001\u0000\u0000\u0000\u0015o\u0001\u0000\u0000\u0000\u0017q\u0001\u0000"+
		"\u0000\u0000\u0019s\u0001\u0000\u0000\u0000\u001bu\u0001\u0000\u0000\u0000"+
		"\u001dw\u0001\u0000\u0000\u0000\u001fy\u0001\u0000\u0000\u0000!{\u0001"+
		"\u0000\u0000\u0000#}\u0001\u0000\u0000\u0000%\u007f\u0001\u0000\u0000"+
		"\u0000\'\u0084\u0001\u0000\u0000\u0000)\u0086\u0001\u0000\u0000\u0000"+
		"+\u008e\u0001\u0000\u0000\u0000-\u0093\u0001\u0000\u0000\u0000/\u009e"+
		"\u0001\u0000\u0000\u000012\u0005i\u0000\u000023\u0005f\u0000\u00003\u0002"+
		"\u0001\u0000\u0000\u000045\u0005e\u0000\u000056\u0005l\u0000\u000067\u0005"+
		"s\u0000\u000078\u0005e\u0000\u00008\u0004\u0001\u0000\u0000\u00009:\u0005"+
		"w\u0000\u0000:;\u0005h\u0000\u0000;<\u0005e\u0000\u0000<=\u0005n\u0000"+
		"\u0000=\u0006\u0001\u0000\u0000\u0000>?\u0005f\u0000\u0000?@\u0005o\u0000"+
		"\u0000@A\u0005r\u0000\u0000A\b\u0001\u0000\u0000\u0000BC\u0005t\u0000"+
		"\u0000CD\u0005h\u0000\u0000DE\u0005e\u0000\u0000EF\u0005n\u0000\u0000"+
		"F\n\u0001\u0000\u0000\u0000GH\u0005r\u0000\u0000HI\u0005e\u0000\u0000"+
		"IJ\u0005t\u0000\u0000JK\u0005u\u0000\u0000KL\u0005r\u0000\u0000LM\u0005"+
		"n\u0000\u0000M\f\u0001\u0000\u0000\u0000NO\u0005f\u0000\u0000OP\u0005"+
		"u\u0000\u0000PQ\u0005n\u0000\u0000QR\u0005c\u0000\u0000RS\u0005t\u0000"+
		"\u0000ST\u0005i\u0000\u0000TU\u0005o\u0000\u0000UV\u0005n\u0000\u0000"+
		"V\u000e\u0001\u0000\u0000\u0000WX\u0005i\u0000\u0000XY\u0005n\u0000\u0000"+
		"Yj\u0005t\u0000\u0000Z[\u0005f\u0000\u0000[\\\u0005l\u0000\u0000\\]\u0005"+
		"o\u0000\u0000]^\u0005a\u0000\u0000^j\u0005t\u0000\u0000_`\u0005c\u0000"+
		"\u0000`a\u0005h\u0000\u0000ab\u0005a\u0000\u0000bj\u0005r\u0000\u0000"+
		"cd\u0005s\u0000\u0000de\u0005t\u0000\u0000ef\u0005r\u0000\u0000fg\u0005"+
		"i\u0000\u0000gh\u0005n\u0000\u0000hj\u0005g\u0000\u0000iW\u0001\u0000"+
		"\u0000\u0000iZ\u0001\u0000\u0000\u0000i_\u0001\u0000\u0000\u0000ic\u0001"+
		"\u0000\u0000\u0000j\u0010\u0001\u0000\u0000\u0000kl\u0005{\u0000\u0000"+
		"l\u0012\u0001\u0000\u0000\u0000mn\u0005}\u0000\u0000n\u0014\u0001\u0000"+
		"\u0000\u0000op\u0005(\u0000\u0000p\u0016\u0001\u0000\u0000\u0000qr\u0005"+
		")\u0000\u0000r\u0018\u0001\u0000\u0000\u0000st\u0005;\u0000\u0000t\u001a"+
		"\u0001\u0000\u0000\u0000uv\u0005,\u0000\u0000v\u001c\u0001\u0000\u0000"+
		"\u0000wx\u0005+\u0000\u0000x\u001e\u0001\u0000\u0000\u0000yz\u0005-\u0000"+
		"\u0000z \u0001\u0000\u0000\u0000{|\u0005*\u0000\u0000|\"\u0001\u0000\u0000"+
		"\u0000}~\u0005/\u0000\u0000~$\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"=\u0000\u0000\u0080&\u0001\u0000\u0000\u0000\u0081\u0082\u0005=\u0000"+
		"\u0000\u0082\u0085\u0005=\u0000\u0000\u0083\u0085\u0007\u0000\u0000\u0000"+
		"\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085(\u0001\u0000\u0000\u0000\u0086\u008a\u0007\u0001\u0000\u0000\u0087"+
		"\u0089\u0007\u0002\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b*\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0003\u0000\u0000\u008e\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091,\u0001"+
		"\u0000\u0000\u0000\u0092\u0094\u0007\u0003\u0000\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0099\u0005.\u0000\u0000\u0098\u009a\u0007\u0003"+
		"\u0000\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c.\u0001\u0000\u0000\u0000\u009d\u009f\u0007\u0004\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0006\u0017\u0000"+
		"\u0000\u00a30\u0001\u0000\u0000\u0000\b\u0000i\u0084\u008a\u0090\u0095"+
		"\u009b\u00a0\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}