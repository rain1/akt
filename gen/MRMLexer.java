// Generated from E:/akt\MRM.g4 by ANTLR 4.x
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MRMLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, Nimi=23, Arvuliteraal=24, 
		Soneliteraal=25, Kommentaar=26, Whitespace=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'do'", "')'", "'function'", "','", "'+'", "'-'", "'*'", "'('", "'if'", 
		"'<'", "'return'", "'='", "'!='", "';'", "'<='", "'{'", "'>'", "'=='", 
		"'/'", "'}'", "'>='", "'end'", "Nimi", "Arvuliteraal", "Soneliteraal", 
		"Kommentaar", "Whitespace"
	};
	public static final String[] ruleNames = {
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "Nimi", "Arvuliteraal", "Soneliteraal", 
		"Kommentaar", "Whitespace"
	};


	public MRMLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MRM.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\7\30|\n\30\f\30\16"+
		"\30\177\13\30\3\31\3\31\3\31\7\31\u0084\n\31\f\31\16\31\u0087\13\31\5"+
		"\31\u0089\n\31\3\31\3\31\6\31\u008d\n\31\r\31\16\31\u008e\5\31\u0091\n"+
		"\31\3\32\3\32\7\32\u0095\n\32\f\32\16\32\u0098\13\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\7\33\u00a0\n\33\f\33\16\33\u00a3\13\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\6\34\u00ab\n\34\r\34\16\34\u00ac\3\34\3\34\3\u00a1\2\35"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\b"+
		"\4\2C\\c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\f\f\17\17$$\5\2\13\f\17\17"+
		"\"\"\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2"+
		"\2\2\5<\3\2\2\2\7>\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2"+
		"\2\21O\3\2\2\2\23Q\3\2\2\2\25T\3\2\2\2\27V\3\2\2\2\31]\3\2\2\2\33_\3\2"+
		"\2\2\35b\3\2\2\2\37d\3\2\2\2!g\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'n\3\2\2\2"+
		")p\3\2\2\2+r\3\2\2\2-u\3\2\2\2/y\3\2\2\2\61\u0088\3\2\2\2\63\u0092\3\2"+
		"\2\2\65\u009b\3\2\2\2\67\u00aa\3\2\2\29:\7f\2\2:;\7q\2\2;\4\3\2\2\2<="+
		"\7+\2\2=\6\3\2\2\2>?\7h\2\2?@\7w\2\2@A\7p\2\2AB\7e\2\2BC\7v\2\2CD\7k\2"+
		"\2DE\7q\2\2EF\7p\2\2F\b\3\2\2\2GH\7.\2\2H\n\3\2\2\2IJ\7-\2\2J\f\3\2\2"+
		"\2KL\7/\2\2L\16\3\2\2\2MN\7,\2\2N\20\3\2\2\2OP\7*\2\2P\22\3\2\2\2QR\7"+
		"k\2\2RS\7h\2\2S\24\3\2\2\2TU\7>\2\2U\26\3\2\2\2VW\7t\2\2WX\7g\2\2XY\7"+
		"v\2\2YZ\7w\2\2Z[\7t\2\2[\\\7p\2\2\\\30\3\2\2\2]^\7?\2\2^\32\3\2\2\2_`"+
		"\7#\2\2`a\7?\2\2a\34\3\2\2\2bc\7=\2\2c\36\3\2\2\2de\7>\2\2ef\7?\2\2f "+
		"\3\2\2\2gh\7}\2\2h\"\3\2\2\2ij\7@\2\2j$\3\2\2\2kl\7?\2\2lm\7?\2\2m&\3"+
		"\2\2\2no\7\61\2\2o(\3\2\2\2pq\7\177\2\2q*\3\2\2\2rs\7@\2\2st\7?\2\2t,"+
		"\3\2\2\2uv\7g\2\2vw\7p\2\2wx\7f\2\2x.\3\2\2\2y}\t\2\2\2z|\t\3\2\2{z\3"+
		"\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\60\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0089\7\62\2\2\u0081\u0085\t\4\2\2\u0082\u0084\t\5\2\2\u0083\u0082\3"+
		"\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0081\3\2"+
		"\2\2\u0089\u0090\3\2\2\2\u008a\u008c\7\60\2\2\u008b\u008d\t\5\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0091\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\62\3\2\2\2\u0092\u0096\7$\2\2\u0093\u0095\n\6\2\2\u0094\u0093\3\2\2\2"+
		"\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7$\2\2\u009a\64\3\2\2\2\u009b"+
		"\u009c\7\61\2\2\u009c\u009d\7,\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\13"+
		"\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7,"+
		"\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\33\2\2\u00a8"+
		"\66\3\2\2\2\u00a9\u00ab\t\7\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2"+
		"\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\b\34\2\2\u00af8\3\2\2\2\13\2}\u0085\u0088\u008e\u0090\u0096\u00a1\u00ac"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}