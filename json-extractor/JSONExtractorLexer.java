// Generated from JSONExtractor.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONExtractorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'extrair'", "'{'", "'}'", "'cliente'", "'limite'", "'faturamento'", 
			"'financeiro'", "'historico_pagamentos'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "WS"
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


	public JSONExtractorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSONExtractor.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rp\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\7\13e\n\13\f\13\16\13h\13\13\3\f\6"+
		"\fk\n\f\r\f\16\fl\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\3\2\5\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2q\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3"+
		"\31\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13-\3\2\2\2\r\64\3\2\2\2"+
		"\17@\3\2\2\2\21K\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27j\3\2\2\2\31\32\7g"+
		"\2\2\32\33\7z\2\2\33\34\7v\2\2\34\35\7t\2\2\35\36\7c\2\2\36\37\7k\2\2"+
		"\37 \7t\2\2 \4\3\2\2\2!\"\7}\2\2\"\6\3\2\2\2#$\7\177\2\2$\b\3\2\2\2%&"+
		"\7e\2\2&\'\7n\2\2\'(\7k\2\2()\7g\2\2)*\7p\2\2*+\7v\2\2+,\7g\2\2,\n\3\2"+
		"\2\2-.\7n\2\2./\7k\2\2/\60\7o\2\2\60\61\7k\2\2\61\62\7v\2\2\62\63\7g\2"+
		"\2\63\f\3\2\2\2\64\65\7h\2\2\65\66\7c\2\2\66\67\7v\2\2\678\7w\2\289\7"+
		"t\2\29:\7c\2\2:;\7o\2\2;<\7g\2\2<=\7p\2\2=>\7v\2\2>?\7q\2\2?\16\3\2\2"+
		"\2@A\7h\2\2AB\7k\2\2BC\7p\2\2CD\7c\2\2DE\7p\2\2EF\7e\2\2FG\7g\2\2GH\7"+
		"k\2\2HI\7t\2\2IJ\7q\2\2J\20\3\2\2\2KL\7j\2\2LM\7k\2\2MN\7u\2\2NO\7v\2"+
		"\2OP\7q\2\2PQ\7t\2\2QR\7k\2\2RS\7e\2\2ST\7q\2\2TU\7a\2\2UV\7r\2\2VW\7"+
		"c\2\2WX\7i\2\2XY\7c\2\2YZ\7o\2\2Z[\7g\2\2[\\\7p\2\2\\]\7v\2\2]^\7q\2\2"+
		"^_\7u\2\2_\22\3\2\2\2`a\7.\2\2a\24\3\2\2\2bf\t\2\2\2ce\t\3\2\2dc\3\2\2"+
		"\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\26\3\2\2\2hf\3\2\2\2ik\t\4\2\2ji\3\2"+
		"\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\b\f\2\2o\30\3\2\2\2\5\2"+
		"fl\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}