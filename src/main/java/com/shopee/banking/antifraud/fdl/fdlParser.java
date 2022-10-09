// Generated from /home/larryfu/projects/antlr-demo/src/main/resources/fdl.g4 by ANTLR 4.10.1
        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package com.shopee.banking.antifraud.fdl;
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fdlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WS=5, SELECT=6, FROM=7, WHERE=8, GROUPBY=9, 
		TIMEUNIT=10, INT=11, NUMBER=12, OPERATOR=13, STRING=14, AND=15, IDENTIFIER=16;
	public static final int
		RULE_function_name = 0, RULE_function_param = 1, RULE_function = 2, RULE_value = 3, 
		RULE_condition = 4, RULE_table = 5, RULE_base_obj = 6, RULE_time_range = 7, 
		RULE_fdl = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"function_name", "function_param", "function", "value", "condition", 
			"table", "base_obj", "time_range", "fdl"
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

	@Override
	public String getGrammarFileName() { return "fdl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fdlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(fdlParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fdlVisitor ) return ((fdlVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
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

	public static class Function_paramContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(fdlParser.IDENTIFIER, 0); }
		public Function_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).enterFunction_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).exitFunction_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fdlVisitor ) return ((fdlVisitor<? extends T>)visitor).visitFunction_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_paramContext function_param() throws RecognitionException {
		Function_paramContext _localctx = new Function_paramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
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

	public static class FunctionContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Function_paramContext function_param() {
			return getRuleContext(Function_paramContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fdlVisitor ) return ((fdlVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			function_name();
			setState(23);
			match(T__0);
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(24);
				match(T__1);
				}
				break;
			case IDENTIFIER:
				{
				setState(25);
				function_param();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(28);
			match(T__2);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(fdlParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(fdlParser.NUMBER, 0); }
		public TerminalNode INT() { return getToken(fdlParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fdlVisitor ) return ((fdlVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << NUMBER) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(fdlParser.IDENTIFIER, 0); }
		public TerminalNode OPERATOR() { return getToken(fdlParser.OPERATOR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fdlVisitor ) return ((fdlVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(IDENTIFIER);
			setState(33);
			match(OPERATOR);
			setState(34);
			value();
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(fdlParser.IDENTIFIER, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fdlVisitor ) return ((fdlVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
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

	public static class Base_objContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(fdlParser.IDENTIFIER, 0); }
		public Base_objContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).enterBase_obj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).exitBase_obj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fdlVisitor ) return ((fdlVisitor<? extends T>)visitor).visitBase_obj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_objContext base_obj() throws RecognitionException {
		Base_objContext _localctx = new Base_objContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_base_obj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
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

	public static class Time_rangeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(fdlParser.INT, 0); }
		public TerminalNode TIMEUNIT() { return getToken(fdlParser.TIMEUNIT, 0); }
		public Time_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).enterTime_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).exitTime_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fdlVisitor ) return ((fdlVisitor<? extends T>)visitor).visitTime_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_rangeContext time_range() throws RecognitionException {
		Time_rangeContext _localctx = new Time_rangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_time_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(INT);
			setState(41);
			match(TIMEUNIT);
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

	public static class FdlContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(fdlParser.SELECT, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode FROM() { return getToken(fdlParser.FROM, 0); }
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(fdlParser.WHERE, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode GROUPBY() { return getToken(fdlParser.GROUPBY, 0); }
		public Base_objContext base_obj() {
			return getRuleContext(Base_objContext.class,0);
		}
		public Time_rangeContext time_range() {
			return getRuleContext(Time_rangeContext.class,0);
		}
		public List<TerminalNode> AND() { return getTokens(fdlParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(fdlParser.AND, i);
		}
		public FdlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).enterFdl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fdlListener ) ((fdlListener)listener).exitFdl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fdlVisitor ) return ((fdlVisitor<? extends T>)visitor).visitFdl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FdlContext fdl() throws RecognitionException {
		FdlContext _localctx = new FdlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fdl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(SELECT);
			setState(44);
			function();
			setState(45);
			match(FROM);
			setState(46);
			table();
			setState(47);
			match(WHERE);
			setState(48);
			condition();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(49);
				match(AND);
				setState(50);
				condition();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(GROUPBY);
			setState(57);
			base_obj();
			setState(58);
			match(T__3);
			setState(59);
			time_range();
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
		"\u0004\u0001\u0010>\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u001b\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b4\b\b\n\b\f\b7\t\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0000\u0001\u0002\u0000\u000b\f\u000e\u000e6\u0000\u0012\u0001\u0000"+
		"\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\u0016\u0001\u0000"+
		"\u0000\u0000\u0006\u001e\u0001\u0000\u0000\u0000\b \u0001\u0000\u0000"+
		"\u0000\n$\u0001\u0000\u0000\u0000\f&\u0001\u0000\u0000\u0000\u000e(\u0001"+
		"\u0000\u0000\u0000\u0010+\u0001\u0000\u0000\u0000\u0012\u0013\u0005\u0010"+
		"\u0000\u0000\u0013\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0010"+
		"\u0000\u0000\u0015\u0003\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0000"+
		"\u0000\u0000\u0017\u001a\u0005\u0001\u0000\u0000\u0018\u001b\u0005\u0002"+
		"\u0000\u0000\u0019\u001b\u0003\u0002\u0001\u0000\u001a\u0018\u0001\u0000"+
		"\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0005\u0003\u0000\u0000\u001d\u0005\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0007\u0000\u0000\u0000\u001f\u0007\u0001\u0000"+
		"\u0000\u0000 !\u0005\u0010\u0000\u0000!\"\u0005\r\u0000\u0000\"#\u0003"+
		"\u0006\u0003\u0000#\t\u0001\u0000\u0000\u0000$%\u0005\u0010\u0000\u0000"+
		"%\u000b\u0001\u0000\u0000\u0000&\'\u0005\u0010\u0000\u0000\'\r\u0001\u0000"+
		"\u0000\u0000()\u0005\u000b\u0000\u0000)*\u0005\n\u0000\u0000*\u000f\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0006\u0000\u0000,-\u0003\u0004\u0002\u0000"+
		"-.\u0005\u0007\u0000\u0000./\u0003\n\u0005\u0000/0\u0005\b\u0000\u0000"+
		"05\u0003\b\u0004\u000012\u0005\u000f\u0000\u000024\u0003\b\u0004\u0000"+
		"31\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000089\u0005\t\u0000\u00009:\u0003\f\u0006\u0000:;\u0005\u0004"+
		"\u0000\u0000;<\u0003\u000e\u0007\u0000<\u0011\u0001\u0000\u0000\u0000"+
		"\u0002\u001a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}