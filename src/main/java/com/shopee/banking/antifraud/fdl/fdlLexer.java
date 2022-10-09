// Generated from /home/larryfu/projects/antlr-demo/src/main/resources/fdl.g4 by ANTLR 4.10.1
        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package com.shopee.banking.antifraud.fdl;
 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fdlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, SELECT=6, FROM=7, WHERE=8, GROUPBY=9, 
		TIMEUNIT=10, INT=11, NUMBER=12, OPERATOR=13, STRING=14, AND=15, IDENTIFIER=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "DIGIT", "LETTER", "WS", "SELECT", "FROM", 
			"WHERE", "GROUPBY", "TIMEUNIT", "INT", "NUMBER", "OPERATOR", "STRING", 
			"AND", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'*'", "')'", "'recent'", null, null, null, "'where'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WS", "SELECT", "FROM", "WHERE", "GROUPBY", 
			"TIMEUNIT", "INT", "NUMBER", "OPERATOR", "STRING", "AND", "IDENTIFIER"
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


	public fdlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fdl.g4"; }

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
		"\u0004\u0000\u0010\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0004\u00068\b\u0006\u000b\u0006\f\u00069\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\nW\b\n\u000b\n\f\nX\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000bg\b\u000b\u0001\f\u0004\fj\b\f\u000b"+
		"\f\f\fk\u0001\r\u0001\r\u0001\r\u0003\rq\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000ex\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f~\b\u000f\n\u000f\f\u000f\u0081"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u008d"+
		"\b\u0011\u000b\u0011\f\u0011\u008e\u0000\u0000\u0012\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0000\u000b\u0000\r\u0005\u000f\u0006"+
		"\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f"+
		"\u000e!\u000f#\u0010\u0001\u0000\u0011\u0001\u000009\u0002\u0000AZaz\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000SSss\u0002\u0000EEee\u0002\u0000LLll\u0002"+
		"\u0000CCcc\u0002\u0000TTtt\u0002\u0000FFff\u0002\u0000RRrr\u0002\u0000"+
		"OOoo\u0002\u0000MMmm\u0001\u0000  \u0002\u0000\'\'\\\\\u0002\u0000AAa"+
		"a\u0002\u0000NNnn\u0002\u0000DDdd\u009a\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'\u0001"+
		"\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000\u0000"+
		"\u0000\t2\u0001\u0000\u0000\u0000\u000b4\u0001\u0000\u0000\u0000\r7\u0001"+
		"\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011D\u0001\u0000\u0000"+
		"\u0000\u0013I\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017"+
		"f\u0001\u0000\u0000\u0000\u0019i\u0001\u0000\u0000\u0000\u001bm\u0001"+
		"\u0000\u0000\u0000\u001dw\u0001\u0000\u0000\u0000\u001fy\u0001\u0000\u0000"+
		"\u0000!\u0084\u0001\u0000\u0000\u0000#\u0088\u0001\u0000\u0000\u0000%"+
		"&\u0005(\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005*\u0000\u0000"+
		"(\u0004\u0001\u0000\u0000\u0000)*\u0005)\u0000\u0000*\u0006\u0001\u0000"+
		"\u0000\u0000+,\u0005r\u0000\u0000,-\u0005e\u0000\u0000-.\u0005c\u0000"+
		"\u0000./\u0005e\u0000\u0000/0\u0005n\u0000\u000001\u0005t\u0000\u0000"+
		"1\b\u0001\u0000\u0000\u000023\u0007\u0000\u0000\u00003\n\u0001\u0000\u0000"+
		"\u000045\u0007\u0001\u0000\u00005\f\u0001\u0000\u0000\u000068\u0007\u0002"+
		"\u0000\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";<\u0006\u0006\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0007\u0003"+
		"\u0000\u0000>?\u0007\u0004\u0000\u0000?@\u0007\u0005\u0000\u0000@A\u0007"+
		"\u0004\u0000\u0000AB\u0007\u0006\u0000\u0000BC\u0007\u0007\u0000\u0000"+
		"C\u0010\u0001\u0000\u0000\u0000DE\u0007\b\u0000\u0000EF\u0007\t\u0000"+
		"\u0000FG\u0007\n\u0000\u0000GH\u0007\u000b\u0000\u0000H\u0012\u0001\u0000"+
		"\u0000\u0000IJ\u0005w\u0000\u0000JK\u0005h\u0000\u0000KL\u0005e\u0000"+
		"\u0000LM\u0005r\u0000\u0000MN\u0005e\u0000\u0000N\u0014\u0001\u0000\u0000"+
		"\u0000OP\u0005g\u0000\u0000PQ\u0005r\u0000\u0000QR\u0005o\u0000\u0000"+
		"RS\u0005u\u0000\u0000ST\u0005p\u0000\u0000TV\u0001\u0000\u0000\u0000U"+
		"W\u0007\f\u0000\u0000VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0005b\u0000\u0000[\\\u0005y\u0000\u0000\\\u0016\u0001\u0000"+
		"\u0000\u0000]^\u0005s\u0000\u0000^_\u0005e\u0000\u0000_g\u0005c\u0000"+
		"\u0000`a\u0005m\u0000\u0000ab\u0005i\u0000\u0000bg\u0005n\u0000\u0000"+
		"cd\u0005d\u0000\u0000de\u0005a\u0000\u0000eg\u0005y\u0000\u0000f]\u0001"+
		"\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000"+
		"g\u0018\u0001\u0000\u0000\u0000hj\u0003\t\u0004\u0000ih\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000l\u001a\u0001\u0000\u0000\u0000mp\u0003\u0019\f\u0000no\u0005"+
		".\u0000\u0000oq\u0003\u0019\f\u0000pn\u0001\u0000\u0000\u0000pq\u0001"+
		"\u0000\u0000\u0000q\u001c\u0001\u0000\u0000\u0000rx\u0002<>\u0000st\u0005"+
		">\u0000\u0000tx\u0005=\u0000\u0000uv\u0005<\u0000\u0000vx\u0005=\u0000"+
		"\u0000wr\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000x\u001e\u0001\u0000\u0000\u0000y\u007f\u0005\'\u0000\u0000"+
		"z~\b\r\u0000\u0000{|\u0005\\\u0000\u0000|~\t\u0000\u0000\u0000}z\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005\'\u0000\u0000\u0083 \u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0007\u000e\u0000\u0000\u0085\u0086\u0007\u000f\u0000\u0000\u0086"+
		"\u0087\u0007\u0010\u0000\u0000\u0087\"\u0001\u0000\u0000\u0000\u0088\u008c"+
		"\u0003\u000b\u0005\u0000\u0089\u008d\u0003\u000b\u0005\u0000\u008a\u008d"+
		"\u0003\t\u0004\u0000\u008b\u008d\u0005_\u0000\u0000\u008c\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f$\u0001\u0000"+
		"\u0000\u0000\u000b\u00009Xfkpw}\u007f\u008c\u008e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}