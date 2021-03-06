// Generated from RevesParser.g4 by ANTLR 4.4
package com.backwardslanguage.reves.reves;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RevesParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, VAR=2, PRINTLN=3, MINUS=4, MULT=5, DIV=6, PLUS=7, EXP=8, AND=9, 
		NOT=10, OR=11, GT=12, LT=13, GEQ=14, LEQ=15, EQ=16, NEQ=17, BRACKET_OPEN=18, 
		BRACKET_CLOSE=19, PAR_OPEN=20, PAR_CLOSE=21, SEMICOLON=22, ASSIGN=23, 
		OPERATION=24, INT_TYPE=25, REAL_TYPE=26, BOOL_TYPE=27, STRING_TYPE=28, 
		BEGIN_RW=29, END_RW=30, IF_RW=31, ELSE_RW=32, WHILE_RW=33, FOR_RW=34, 
		WRITE_RW=35, READ_RW=36, TRUE_LITERAL=37, FALSE_LITERAL=38, UNARY=39, 
		ID=40, NUMBER=41, WS=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "VAR", "PRINTLN", "MINUS", "MULT", "DIV", "PLUS", "EXP", "AND", 
		"NOT", "OR", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "ASSIGN", "OPERATION", "TRUE", "FALSE", 
		"INT_TYPE", "REAL_TYPE", "BOOL_TYPE", "STRING_TYPE", "BEGIN_RW", "END_RW", 
		"IF_RW", "ELSE_RW", "WHILE_RW", "FOR_RW", "WRITE_RW", "READ_RW", "TRUE_LITERAL", 
		"FALSE_LITERAL", "UNARY", "NAT", "ID", "NUMBER", "WS"
	};


	public RevesParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RevesParser.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u0112\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\7,\u0102"+
		"\n,\f,\16,\u0105\13,\3-\6-\u0108\n-\r-\16-\u0109\3.\6.\u010d\n.\r.\16"+
		".\u010e\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65"+
		"\2\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U\2W*Y+[,\3\2\7\4\2--//"+
		"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u0111\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3"+
		"\2\2\2\5e\3\2\2\2\7i\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2\17w\3\2"+
		"\2\2\21y\3\2\2\2\23{\3\2\2\2\25~\3\2\2\2\27\u0080\3\2\2\2\31\u0083\3\2"+
		"\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2\2\37\u008a\3\2\2\2!\u008d\3\2\2\2"+
		"#\u0090\3\2\2\2%\u0093\3\2\2\2\'\u0095\3\2\2\2)\u0097\3\2\2\2+\u0099\3"+
		"\2\2\2-\u009b\3\2\2\2/\u009d\3\2\2\2\61\u009f\3\2\2\2\63\u00a9\3\2\2\2"+
		"\65\u00ae\3\2\2\2\67\u00b4\3\2\2\29\u00b8\3\2\2\2;\u00bd\3\2\2\2=\u00c2"+
		"\3\2\2\2?\u00c9\3\2\2\2A\u00cf\3\2\2\2C\u00d3\3\2\2\2E\u00d6\3\2\2\2G"+
		"\u00db\3\2\2\2I\u00e1\3\2\2\2K\u00e5\3\2\2\2M\u00eb\3\2\2\2O\u00f0\3\2"+
		"\2\2Q\u00f5\3\2\2\2S\u00fb\3\2\2\2U\u00fd\3\2\2\2W\u00ff\3\2\2\2Y\u0107"+
		"\3\2\2\2[\u010c\3\2\2\2]^\7o\2\2^_\7c\2\2_`\7t\2\2`a\7i\2\2ab\7q\2\2b"+
		"c\7t\2\2cd\7r\2\2d\4\3\2\2\2ef\7t\2\2fg\7c\2\2gh\7x\2\2h\6\3\2\2\2ij\7"+
		"p\2\2jk\7n\2\2kl\7v\2\2lm\7p\2\2mn\7k\2\2no\7t\2\2op\7r\2\2p\b\3\2\2\2"+
		"qr\7/\2\2r\n\3\2\2\2st\7,\2\2t\f\3\2\2\2uv\7\61\2\2v\16\3\2\2\2wx\7-\2"+
		"\2x\20\3\2\2\2yz\7`\2\2z\22\3\2\2\2{|\7(\2\2|}\7(\2\2}\24\3\2\2\2~\177"+
		"\7#\2\2\177\26\3\2\2\2\u0080\u0081\7~\2\2\u0081\u0082\7~\2\2\u0082\30"+
		"\3\2\2\2\u0083\u0084\7>\2\2\u0084\32\3\2\2\2\u0085\u0086\7@\2\2\u0086"+
		"\34\3\2\2\2\u0087\u0088\7>\2\2\u0088\u0089\7?\2\2\u0089\36\3\2\2\2\u008a"+
		"\u008b\7@\2\2\u008b\u008c\7?\2\2\u008c \3\2\2\2\u008d\u008e\7?\2\2\u008e"+
		"\u008f\7?\2\2\u008f\"\3\2\2\2\u0090\u0091\7#\2\2\u0091\u0092\7?\2\2\u0092"+
		"$\3\2\2\2\u0093\u0094\7\177\2\2\u0094&\3\2\2\2\u0095\u0096\7}\2\2\u0096"+
		"(\3\2\2\2\u0097\u0098\7+\2\2\u0098*\3\2\2\2\u0099\u009a\7*\2\2\u009a,"+
		"\3\2\2\2\u009b\u009c\7=\2\2\u009c.\3\2\2\2\u009d\u009e\7?\2\2\u009e\60"+
		"\3\2\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7r\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\u00a3\7t\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7k\2\2"+
		"\u00a6\u00a7\7q\2\2\u00a7\u00a8\7p\2\2\u00a8\62\3\2\2\2\u00a9\u00aa\7"+
		"g\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7v\2\2\u00ad\64"+
		"\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7n\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2\u00b3\7h\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7k\2\2\u00b5"+
		"\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b78\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n\2\2\u00bc:\3\2\2\2\u00bd"+
		"\u00be\7d\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7n\2\2"+
		"\u00c1<\3\2\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2"+
		"\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7i\2\2\u00c8>\3\2"+
		"\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd"+
		"\7g\2\2\u00cd\u00ce\7d\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1"+
		"\7p\2\2\u00d1\u00d2\7g\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5"+
		"\7k\2\2\u00d5D\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9"+
		"\7n\2\2\u00d9\u00da\7g\2\2\u00daF\3\2\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd"+
		"\7n\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7y\2\2\u00e0"+
		"H\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7h\2\2\u00e4"+
		"J\3\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7t\2\2\u00e9\u00ea\7y\2\2\u00eaL\3\2\2\2\u00eb\u00ec\7f\2\2\u00ec"+
		"\u00ed\7c\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7t\2\2\u00efN\3\2\2\2\u00f0"+
		"\u00f1\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7g\2\2"+
		"\u00f4P\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7n\2"+
		"\2\u00f8\u00f9\7u\2\2\u00f9\u00fa\7g\2\2\u00faR\3\2\2\2\u00fb\u00fc\t"+
		"\2\2\2\u00fcT\3\2\2\2\u00fd\u00fe\t\3\2\2\u00feV\3\2\2\2\u00ff\u0103\t"+
		"\4\2\2\u0100\u0102\t\5\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104X\3\2\2\2\u0105\u0103\3\2\2\2"+
		"\u0106\u0108\5U+\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010aZ\3\2\2\2\u010b\u010d\t\6\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0111\b.\2\2\u0111\\\3\2\2\2\6\2\u0103"+
		"\u0109\u010e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}