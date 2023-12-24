// Generated from /home/jaugustyn/Studies/sem 5/Kompilatory/iamstuck/antlr4/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, Id_literal=52, 
		Integer_literal=53, Floating_point_literal=54, White_spaces=55, Comment=56, 
		Line_comment=57;
	public static final int
		RULE_start_ = 0, RULE_statement = 1, RULE_block_statement = 2, RULE_single_statement = 3, 
		RULE_loop_statement = 4, RULE_for_statement = 5, RULE_if_statement = 6, 
		RULE_while_statement = 7, RULE_for_range_statement = 8, RULE_for_each_statement = 9, 
		RULE_pass_statement = 10, RULE_method_call = 11, RULE_function_call = 12, 
		RULE_return_statement = 13, RULE_expression = 14, RULE_arith_operator = 15, 
		RULE_arith_assign_operator = 16, RULE_assign = 17, RULE_comparator = 18, 
		RULE_condition = 19, RULE_single_declaration = 20, RULE_block_declaration = 21, 
		RULE_variable_declaration = 22, RULE_container_declaration = 23, RULE_function_definition = 24, 
		RULE_constant = 25, RULE_char_literal = 26, RULE_string_literal = 27, 
		RULE_bool_literal = 28, RULE_null_literal = 29, RULE_equal = 30, RULE_not_equal = 31, 
		RULE_greater = 32, RULE_lesser = 33, RULE_greater_equal = 34, RULE_lesser_equal = 35, 
		RULE_data_type = 36, RULE_integer = 37, RULE_double = 38, RULE_char = 39, 
		RULE_string = 40, RULE_bool = 41, RULE_float = 42, RULE_void = 43, RULE_container_type = 44, 
		RULE_stack = 45, RULE_queue = 46, RULE_deque = 47, RULE_add = 48, RULE_sub = 49, 
		RULE_mul = 50, RULE_div = 51, RULE_mod = 52, RULE_inc = 53, RULE_dec = 54, 
		RULE_add_assign = 55, RULE_sub_assign = 56, RULE_mul_assign = 57, RULE_div_assign = 58, 
		RULE_mod_assign = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "statement", "block_statement", "single_statement", "loop_statement", 
			"for_statement", "if_statement", "while_statement", "for_range_statement", 
			"for_each_statement", "pass_statement", "method_call", "function_call", 
			"return_statement", "expression", "arith_operator", "arith_assign_operator", 
			"assign", "comparator", "condition", "single_declaration", "block_declaration", 
			"variable_declaration", "container_declaration", "function_definition", 
			"constant", "char_literal", "string_literal", "bool_literal", "null_literal", 
			"equal", "not_equal", "greater", "lesser", "greater_equal", "lesser_equal", 
			"data_type", "integer", "double", "char", "string", "bool", "float", 
			"void", "container_type", "stack", "queue", "deque", "add", "sub", "mul", 
			"div", "mod", "inc", "dec", "add_assign", "sub_assign", "mul_assign", 
			"div_assign", "mod_assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'END'", "'IF'", "':'", "'ELIF'", "'ELSE'", "'WHILE'", "'FOR'", 
			"'IN RANGE('", "','", "')'", "'IN'", "'PASS'", "'.'", "'('", "'RETURN'", 
			"'='", "'<'", "'>'", "'DEF'", "'''", "'\"'", "'true'", "'false'", "'null'", 
			"'=='", "'!='", "'>='", "'<='", "'int'", "'double'", "'char'", "'string'", 
			"'bool'", "'float'", "'void'", "'STACK'", "'QUEUE'", "'DEQUE'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", 
			"'%='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "Id_literal", "Integer_literal", "Floating_point_literal", 
			"White_spaces", "Comment", "Line_comment"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Start_Context extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Start_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_; }
	}

	public final Start_Context start_() throws RecognitionException {
		Start_Context _localctx = new Start_Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4504698066313608L) != 0)) {
				{
				{
				setState(120);
				statement();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
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
	public static class StatementContext extends ParserRuleContext {
		public Single_statementContext single_statement() {
			return getRuleContext(Single_statementContext.class,0);
		}
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case Id_literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				single_statement();
				setState(129);
				match(T__0);
				}
				break;
			case T__2:
			case T__6:
			case T__7:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				block_statement();
				setState(132);
				match(T__1);
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
	public static class Block_statementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block_statement);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				if_statement();
				}
				break;
			case T__6:
			case T__7:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				loop_statement();
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
	public static class Single_statementContext extends ParserRuleContext {
		public Single_declarationContext single_declaration() {
			return getRuleContext(Single_declarationContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Pass_statementContext pass_statement() {
			return getRuleContext(Pass_statementContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Single_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_statement; }
	}

	public final Single_statementContext single_statement() throws RecognitionException {
		Single_statementContext _localctx = new Single_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_statement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				single_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				pass_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				method_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				function_call();
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
	public static class Loop_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Block_declarationContext block_declaration() {
			return getRuleContext(Block_declarationContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop_statement);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				while_statement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				for_statement();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				block_declaration();
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
	public static class For_statementContext extends ParserRuleContext {
		public For_range_statementContext for_range_statement() {
			return getRuleContext(For_range_statementContext.class,0);
		}
		public For_each_statementContext for_each_statement() {
			return getRuleContext(For_each_statementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_statement);
		try {
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				for_range_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				for_each_statement();
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
	public static class If_statementContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__2);
			setState(157);
			condition();
			setState(158);
			match(T__3);
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				statement();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4504698066313608L) != 0) );
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(164);
				match(T__4);
				setState(165);
				condition();
				setState(166);
				match(T__3);
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					statement();
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4504698066313608L) != 0) );
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(177);
				match(T__5);
				setState(178);
				match(T__3);
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(179);
					statement();
					}
					}
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4504698066313608L) != 0) );
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
	public static class While_statementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__6);
			setState(187);
			condition();
			setState(188);
			match(T__3);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				statement();
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4504698066313608L) != 0) );
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
	public static class For_range_statementContext extends ParserRuleContext {
		public TerminalNode Id_literal() { return getToken(GrammarParser.Id_literal, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_range_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_statement; }
	}

	public final For_range_statementContext for_range_statement() throws RecognitionException {
		For_range_statementContext _localctx = new For_range_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_range_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__7);
			setState(195);
			match(Id_literal);
			setState(196);
			match(T__8);
			setState(197);
			expression(0);
			{
			setState(198);
			match(T__9);
			setState(199);
			expression(0);
			}
			0,2
			setState(202);
			match(T__10);
			setState(203);
			match(T__3);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				statement();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4504698066313608L) != 0) );
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
	public static class For_each_statementContext extends ParserRuleContext {
		public List<TerminalNode> Id_literal() { return getTokens(GrammarParser.Id_literal); }
		public TerminalNode Id_literal(int i) {
			return getToken(GrammarParser.Id_literal, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_each_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each_statement; }
	}

	public final For_each_statementContext for_each_statement() throws RecognitionException {
		For_each_statementContext _localctx = new For_each_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_each_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__7);
			setState(210);
			match(Id_literal);
			setState(211);
			match(T__11);
			setState(212);
			match(Id_literal);
			setState(213);
			match(T__3);
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				statement();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4504698066313608L) != 0) );
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
	public static class Pass_statementContext extends ParserRuleContext {
		public Pass_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_statement; }
	}

	public final Pass_statementContext pass_statement() throws RecognitionException {
		Pass_statementContext _localctx = new Pass_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pass_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__12);
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
	public static class Method_callContext extends ParserRuleContext {
		public List<TerminalNode> Id_literal() { return getTokens(GrammarParser.Id_literal); }
		public TerminalNode Id_literal(int i) {
			return getToken(GrammarParser.Id_literal, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(Id_literal);
			setState(222);
			match(T__13);
			setState(223);
			match(Id_literal);
			setState(224);
			match(T__14);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197456637952L) != 0)) {
				{
				setState(225);
				expression(0);
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(226);
					match(T__9);
					setState(227);
					expression(0);
					}
					}
					setState(232);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(235);
			match(T__10);
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode Id_literal() { return getToken(GrammarParser.Id_literal, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(Id_literal);
			setState(238);
			match(T__14);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197456637952L) != 0)) {
				{
				setState(239);
				expression(0);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(240);
					match(T__9);
					setState(241);
					expression(0);
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(249);
			match(T__10);
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
	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__15);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197456637952L) != 0)) {
				{
				setState(252);
				expression(0);
				}
			}

			setState(255);
			match(T__0);
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
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode Id_literal() { return getToken(GrammarParser.Id_literal, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Arith_operatorContext arith_operator() {
			return getRuleContext(Arith_operatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(258);
				match(Id_literal);
				}
				break;
			case 2:
				{
				setState(259);
				match(T__14);
				setState(260);
				expression(0);
				setState(261);
				match(T__10);
				}
				break;
			case 3:
				{
				setState(263);
				constant();
				}
				break;
			case 4:
				{
				setState(264);
				method_call();
				}
				break;
			case 5:
				{
				setState(265);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(268);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(269);
					arith_operator();
					setState(270);
					expression(6);
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arith_operatorContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public Arith_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_operator; }
	}

	public final Arith_operatorContext arith_operator() throws RecognitionException {
		Arith_operatorContext _localctx = new Arith_operatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arith_operator);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				add();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				sub();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				mul();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				div();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				mod();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				inc();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
				dec();
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
	public static class Arith_assign_operatorContext extends ParserRuleContext {
		public Add_assignContext add_assign() {
			return getRuleContext(Add_assignContext.class,0);
		}
		public Sub_assignContext sub_assign() {
			return getRuleContext(Sub_assignContext.class,0);
		}
		public Mul_assignContext mul_assign() {
			return getRuleContext(Mul_assignContext.class,0);
		}
		public Div_assignContext div_assign() {
			return getRuleContext(Div_assignContext.class,0);
		}
		public Mod_assignContext mod_assign() {
			return getRuleContext(Mod_assignContext.class,0);
		}
		public Arith_assign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_assign_operator; }
	}

	public final Arith_assign_operatorContext arith_assign_operator() throws RecognitionException {
		Arith_assign_operatorContext _localctx = new Arith_assign_operatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arith_assign_operator);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				add_assign();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				sub_assign();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				mul_assign();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				div_assign();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				mod_assign();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(291);
				match(T__16);
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode Id_literal() { return getToken(GrammarParser.Id_literal, 0); }
		public Arith_assign_operatorContext arith_assign_operator() {
			return getRuleContext(Arith_assign_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Id_literal);
			setState(295);
			arith_assign_operator();
			setState(296);
			expression(0);
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
	public static class ComparatorContext extends ParserRuleContext {
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public Not_equalContext not_equal() {
			return getRuleContext(Not_equalContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public LesserContext lesser() {
			return getRuleContext(LesserContext.class,0);
		}
		public Greater_equalContext greater_equal() {
			return getRuleContext(Greater_equalContext.class,0);
		}
		public Lesser_equalContext lesser_equal() {
			return getRuleContext(Lesser_equalContext.class,0);
		}
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparator);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				equal();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				not_equal();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				greater();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				lesser();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				greater_equal();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				lesser_equal();
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
	public static class ConditionContext extends ParserRuleContext {
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				bool_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				expression(0);
				setState(308);
				comparator();
				setState(309);
				expression(0);
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
	public static class Single_declarationContext extends ParserRuleContext {
		public Container_declarationContext container_declaration() {
			return getRuleContext(Container_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Single_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_declaration; }
	}

	public final Single_declarationContext single_declaration() throws RecognitionException {
		Single_declarationContext _localctx = new Single_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_single_declaration);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				container_declaration();
				}
				break;
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				variable_declaration();
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
	public static class Block_declarationContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Block_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_declaration; }
	}

	public final Block_declarationContext block_declaration() throws RecognitionException {
		Block_declarationContext _localctx = new Block_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			function_definition();
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> Id_literal() { return getTokens(GrammarParser.Id_literal); }
		public TerminalNode Id_literal(int i) {
			return getToken(GrammarParser.Id_literal, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variable_declaration);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				data_type();
				setState(320);
				match(Id_literal);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(321);
					match(T__9);
					setState(322);
					match(Id_literal);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				data_type();
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Id_literal) {
					{
					setState(329);
					match(Id_literal);
					setState(330);
					match(T__16);
					setState(331);
					expression(0);
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__9) {
						{
						{
						setState(332);
						match(T__9);
						setState(333);
						match(Id_literal);
						setState(334);
						match(T__16);
						setState(335);
						expression(0);
						}
						}
						setState(340);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

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
	public static class Container_declarationContext extends ParserRuleContext {
		public Container_typeContext container_type() {
			return getRuleContext(Container_typeContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public List<TerminalNode> Id_literal() { return getTokens(GrammarParser.Id_literal); }
		public TerminalNode Id_literal(int i) {
			return getToken(GrammarParser.Id_literal, i);
		}
		public Container_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_declaration; }
	}

	public final Container_declarationContext container_declaration() throws RecognitionException {
		Container_declarationContext _localctx = new Container_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_container_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			container_type();
			setState(346);
			match(T__17);
			setState(347);
			data_type();
			setState(348);
			match(T__18);
			setState(349);
			match(Id_literal);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(350);
				match(T__9);
				setState(351);
				match(Id_literal);
				}
				}
				setState(356);
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
	public static class Function_definitionContext extends ParserRuleContext {
		public List<Data_typeContext> data_type() {
			return getRuleContexts(Data_typeContext.class);
		}
		public Data_typeContext data_type(int i) {
			return getRuleContext(Data_typeContext.class,i);
		}
		public List<TerminalNode> Id_literal() { return getTokens(GrammarParser.Id_literal); }
		public TerminalNode Id_literal(int i) {
			return getToken(GrammarParser.Id_literal, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Return_statementContext> return_statement() {
			return getRuleContexts(Return_statementContext.class);
		}
		public Return_statementContext return_statement(int i) {
			return getRuleContext(Return_statementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__19);
			setState(358);
			data_type();
			setState(359);
			match(Id_literal);
			setState(360);
			match(T__14);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 136365211648L) != 0)) {
				{
				setState(361);
				data_type();
				setState(362);
				match(Id_literal);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(363);
					match(T__9);
					setState(364);
					data_type();
					setState(365);
					match(Id_literal);
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(374);
			match(T__10);
			setState(375);
			match(T__3);
			setState(378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(378);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__6:
				case T__7:
				case T__12:
				case T__19:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case T__36:
				case T__37:
				case T__38:
				case Id_literal:
					{
					setState(376);
					statement();
					}
					break;
				case T__15:
					{
					setState(377);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4504698066379144L) != 0) );
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
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode Integer_literal() { return getToken(GrammarParser.Integer_literal, 0); }
		public TerminalNode Floating_point_literal() { return getToken(GrammarParser.Floating_point_literal, 0); }
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Null_literalContext null_literal() {
			return getRuleContext(Null_literalContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constant);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				match(Integer_literal);
				}
				break;
			case Floating_point_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(Floating_point_literal);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				char_literal();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				string_literal();
				}
				break;
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				bool_literal();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				null_literal();
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
	public static class Char_literalContext extends ParserRuleContext {
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__20);
			setState(391);
			matchWildcard();
			setState(392);
			match(T__20);
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
	public static class String_literalContext extends ParserRuleContext {
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__21);
			setState(395);
			matchWildcard();
			setState(396);
			match(T__21);
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
	public static class Bool_literalContext extends ParserRuleContext {
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Null_literalContext extends ParserRuleContext {
		public Null_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_literal; }
	}

	public final Null_literalContext null_literal() throws RecognitionException {
		Null_literalContext _localctx = new Null_literalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__24);
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
	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__25);
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
	public static class Not_equalContext extends ParserRuleContext {
		public Not_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal; }
	}

	public final Not_equalContext not_equal() throws RecognitionException {
		Not_equalContext _localctx = new Not_equalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__26);
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
	public static class GreaterContext extends ParserRuleContext {
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__18);
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
	public static class LesserContext extends ParserRuleContext {
		public LesserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser; }
	}

	public final LesserContext lesser() throws RecognitionException {
		LesserContext _localctx = new LesserContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lesser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__17);
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
	public static class Greater_equalContext extends ParserRuleContext {
		public Greater_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_equal; }
	}

	public final Greater_equalContext greater_equal() throws RecognitionException {
		Greater_equalContext _localctx = new Greater_equalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_greater_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__27);
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
	public static class Lesser_equalContext extends ParserRuleContext {
		public Lesser_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser_equal; }
	}

	public final Lesser_equalContext lesser_equal() throws RecognitionException {
		Lesser_equalContext _localctx = new Lesser_equalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_lesser_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(T__28);
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
	public static class Data_typeContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public DoubleContext double_() {
			return getRuleContext(DoubleContext.class,0);
		}
		public CharContext char_() {
			return getRuleContext(CharContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public FloatContext float_() {
			return getRuleContext(FloatContext.class,0);
		}
		public VoidContext void_() {
			return getRuleContext(VoidContext.class,0);
		}
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_data_type);
		try {
			setState(421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				integer();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				double_();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				char_();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 4);
				{
				setState(417);
				string();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(418);
				bool();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 6);
				{
				setState(419);
				float_();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 7);
				{
				setState(420);
				void_();
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
	public static class IntegerContext extends ParserRuleContext {
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__29);
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
	public static class DoubleContext extends ParserRuleContext {
		public DoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double; }
	}

	public final DoubleContext double_() throws RecognitionException {
		DoubleContext _localctx = new DoubleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(T__30);
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
	public static class CharContext extends ParserRuleContext {
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__31);
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
	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(T__32);
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
	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(T__33);
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
	public static class FloatContext extends ParserRuleContext {
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(T__34);
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
	public static class VoidContext extends ParserRuleContext {
		public VoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void; }
	}

	public final VoidContext void_() throws RecognitionException {
		VoidContext _localctx = new VoidContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_void);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(T__35);
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
	public static class Container_typeContext extends ParserRuleContext {
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public DequeContext deque() {
			return getRuleContext(DequeContext.class,0);
		}
		public QueueContext queue() {
			return getRuleContext(QueueContext.class,0);
		}
		public Container_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_type; }
	}

	public final Container_typeContext container_type() throws RecognitionException {
		Container_typeContext _localctx = new Container_typeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_container_type);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				stack();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				deque();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				queue();
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
	public static class StackContext extends ParserRuleContext {
		public StackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack; }
	}

	public final StackContext stack() throws RecognitionException {
		StackContext _localctx = new StackContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_stack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__36);
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
	public static class QueueContext extends ParserRuleContext {
		public QueueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queue; }
	}

	public final QueueContext queue() throws RecognitionException {
		QueueContext _localctx = new QueueContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_queue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__37);
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
	public static class DequeContext extends ParserRuleContext {
		public DequeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deque; }
	}

	public final DequeContext deque() throws RecognitionException {
		DequeContext _localctx = new DequeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_deque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T__38);
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
	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__39);
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
	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__40);
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
	public static class MulContext extends ParserRuleContext {
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(T__41);
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
	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(T__42);
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
	public static class ModContext extends ParserRuleContext {
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(T__43);
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
	public static class IncContext extends ParserRuleContext {
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(T__44);
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
	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(T__45);
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
	public static class Add_assignContext extends ParserRuleContext {
		public Add_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_assign; }
	}

	public final Add_assignContext add_assign() throws RecognitionException {
		Add_assignContext _localctx = new Add_assignContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_add_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__46);
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
	public static class Sub_assignContext extends ParserRuleContext {
		public Sub_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_assign; }
	}

	public final Sub_assignContext sub_assign() throws RecognitionException {
		Sub_assignContext _localctx = new Sub_assignContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sub_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(T__47);
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
	public static class Mul_assignContext extends ParserRuleContext {
		public Mul_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_assign; }
	}

	public final Mul_assignContext mul_assign() throws RecognitionException {
		Mul_assignContext _localctx = new Mul_assignContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_mul_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(T__48);
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
	public static class Div_assignContext extends ParserRuleContext {
		public Div_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_assign; }
	}

	public final Div_assignContext div_assign() throws RecognitionException {
		Div_assignContext _localctx = new Div_assignContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_div_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__49);
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
	public static class Mod_assignContext extends ParserRuleContext {
		public Mod_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_assign; }
	}

	public final Mod_assignContext mod_assign() throws RecognitionException {
		Mod_assignContext _localctx = new Mod_assignContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_mod_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(T__50);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u01d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0001"+
		"\u0000\u0005\u0000z\b\u0000\n\u0000\f\u0000}\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0087\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002\u008b"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u0092\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0097"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u009b\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00a1\b\u0006\u000b\u0006"+
		"\f\u0006\u00a2\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"\u00a9\b\u0006\u000b\u0006\f\u0006\u00aa\u0005\u0006\u00ad\b\u0006\n\u0006"+
		"\f\u0006\u00b0\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"\u00b5\b\u0006\u000b\u0006\f\u0006\u00b6\u0003\u0006\u00b9\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00bf\b\u0007\u000b"+
		"\u0007\f\u0007\u00c0\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00ce\b\b\u000b\b\f\b\u00cf"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00d8\b\t\u000b"+
		"\t\f\t\u00d9\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e5\b\u000b\n"+
		"\u000b\f\u000b\u00e8\t\u000b\u0003\u000b\u00ea\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f3\b\f\n\f\f"+
		"\f\u00f6\t\f\u0003\f\u00f8\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r"+
		"\u00fe\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u010b\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0111\b\u000e\n\u000e\f\u000e\u0114\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u011d"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0125\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0131\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0138\b\u0013\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u013c\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u0144\b\u0016\n\u0016\f\u0016\u0147\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0151\b\u0016\n\u0016\f\u0016\u0154"+
		"\t\u0016\u0003\u0016\u0156\b\u0016\u0003\u0016\u0158\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0161\b\u0017\n\u0017\f\u0017\u0164\t\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0170\b\u0018\n\u0018\f\u0018"+
		"\u0173\t\u0018\u0003\u0018\u0175\b\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0004\u0018\u017b\b\u0018\u000b\u0018\f\u0018\u017c"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0185\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01a6\b$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0003,\u01b9\b,\u0001-\u0001-\u0001.\u0001"+
		".\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u0001"+
		"3\u00014\u00014\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u0001"+
		"8\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001;\u0000\u0001\u001c<"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\u0000\u0001"+
		"\u0001\u0000\u0017\u0018\u01e0\u0000{\u0001\u0000\u0000\u0000\u0002\u0086"+
		"\u0001\u0000\u0000\u0000\u0004\u008a\u0001\u0000\u0000\u0000\u0006\u0091"+
		"\u0001\u0000\u0000\u0000\b\u0096\u0001\u0000\u0000\u0000\n\u009a\u0001"+
		"\u0000\u0000\u0000\f\u009c\u0001\u0000\u0000\u0000\u000e\u00ba\u0001\u0000"+
		"\u0000\u0000\u0010\u00c2\u0001\u0000\u0000\u0000\u0012\u00d1\u0001\u0000"+
		"\u0000\u0000\u0014\u00db\u0001\u0000\u0000\u0000\u0016\u00dd\u0001\u0000"+
		"\u0000\u0000\u0018\u00ed\u0001\u0000\u0000\u0000\u001a\u00fb\u0001\u0000"+
		"\u0000\u0000\u001c\u010a\u0001\u0000\u0000\u0000\u001e\u011c\u0001\u0000"+
		"\u0000\u0000 \u0124\u0001\u0000\u0000\u0000\"\u0126\u0001\u0000\u0000"+
		"\u0000$\u0130\u0001\u0000\u0000\u0000&\u0137\u0001\u0000\u0000\u0000("+
		"\u013b\u0001\u0000\u0000\u0000*\u013d\u0001\u0000\u0000\u0000,\u0157\u0001"+
		"\u0000\u0000\u0000.\u0159\u0001\u0000\u0000\u00000\u0165\u0001\u0000\u0000"+
		"\u00002\u0184\u0001\u0000\u0000\u00004\u0186\u0001\u0000\u0000\u00006"+
		"\u018a\u0001\u0000\u0000\u00008\u018e\u0001\u0000\u0000\u0000:\u0190\u0001"+
		"\u0000\u0000\u0000<\u0192\u0001\u0000\u0000\u0000>\u0194\u0001\u0000\u0000"+
		"\u0000@\u0196\u0001\u0000\u0000\u0000B\u0198\u0001\u0000\u0000\u0000D"+
		"\u019a\u0001\u0000\u0000\u0000F\u019c\u0001\u0000\u0000\u0000H\u01a5\u0001"+
		"\u0000\u0000\u0000J\u01a7\u0001\u0000\u0000\u0000L\u01a9\u0001\u0000\u0000"+
		"\u0000N\u01ab\u0001\u0000\u0000\u0000P\u01ad\u0001\u0000\u0000\u0000R"+
		"\u01af\u0001\u0000\u0000\u0000T\u01b1\u0001\u0000\u0000\u0000V\u01b3\u0001"+
		"\u0000\u0000\u0000X\u01b8\u0001\u0000\u0000\u0000Z\u01ba\u0001\u0000\u0000"+
		"\u0000\\\u01bc\u0001\u0000\u0000\u0000^\u01be\u0001\u0000\u0000\u0000"+
		"`\u01c0\u0001\u0000\u0000\u0000b\u01c2\u0001\u0000\u0000\u0000d\u01c4"+
		"\u0001\u0000\u0000\u0000f\u01c6\u0001\u0000\u0000\u0000h\u01c8\u0001\u0000"+
		"\u0000\u0000j\u01ca\u0001\u0000\u0000\u0000l\u01cc\u0001\u0000\u0000\u0000"+
		"n\u01ce\u0001\u0000\u0000\u0000p\u01d0\u0001\u0000\u0000\u0000r\u01d2"+
		"\u0001\u0000\u0000\u0000t\u01d4\u0001\u0000\u0000\u0000v\u01d6\u0001\u0000"+
		"\u0000\u0000xz\u0003\u0002\u0001\u0000yx\u0001\u0000\u0000\u0000z}\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|~\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\u0000"+
		"\u0000\u0001\u007f\u0001\u0001\u0000\u0000\u0000\u0080\u0081\u0003\u0006"+
		"\u0003\u0000\u0081\u0082\u0005\u0001\u0000\u0000\u0082\u0087\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0003\u0004\u0002\u0000\u0084\u0085\u0005\u0002"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0080\u0001\u0000"+
		"\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0087\u0003\u0001\u0000"+
		"\u0000\u0000\u0088\u008b\u0003\f\u0006\u0000\u0089\u008b\u0003\b\u0004"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u0005\u0001\u0000\u0000\u0000\u008c\u0092\u0003(\u0014\u0000"+
		"\u008d\u0092\u0003\"\u0011\u0000\u008e\u0092\u0003\u0014\n\u0000\u008f"+
		"\u0092\u0003\u0016\u000b\u0000\u0090\u0092\u0003\u0018\f\u0000\u0091\u008c"+
		"\u0001\u0000\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0007\u0001\u0000\u0000\u0000\u0093\u0097"+
		"\u0003\u000e\u0007\u0000\u0094\u0097\u0003\n\u0005\u0000\u0095\u0097\u0003"+
		"*\u0015\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\t\u0001\u0000\u0000"+
		"\u0000\u0098\u009b\u0003\u0010\b\u0000\u0099\u009b\u0003\u0012\t\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u000b\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0003\u0000\u0000"+
		"\u009d\u009e\u0003&\u0013\u0000\u009e\u00a0\u0005\u0004\u0000\u0000\u009f"+
		"\u00a1\u0003\u0002\u0001\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00ae\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0005\u0000\u0000\u00a5\u00a6\u0003&\u0013\u0000\u00a6\u00a8"+
		"\u0005\u0004\u0000\u0000\u00a7\u00a9\u0003\u0002\u0001\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b8\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0006\u0000\u0000\u00b2\u00b4"+
		"\u0005\u0004\u0000\u0000\u00b3\u00b5\u0003\u0002\u0001\u0000\u00b4\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b1\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\r\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"\u0007\u0000\u0000\u00bb\u00bc\u0003&\u0013\u0000\u00bc\u00be\u0005\u0004"+
		"\u0000\u0000\u00bd\u00bf\u0003\u0002\u0001\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u000f\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005\b\u0000\u0000\u00c3\u00c4\u00054\u0000"+
		"\u0000\u00c4\u00c5\u0005\t\u0000\u0000\u00c5\u00c6\u0003\u001c\u000e\u0000"+
		"\u00c6\u00c7\u0005\n\u0000\u0000\u00c7\u00c8\u0003\u001c\u000e\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0006\b\uffff\uffff\u0000\u00ca"+
		"\u00cb\u0005\u000b\u0000\u0000\u00cb\u00cd\u0005\u0004\u0000\u0000\u00cc"+
		"\u00ce\u0003\u0002\u0001\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u0011\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0005\b\u0000\u0000\u00d2\u00d3\u00054\u0000\u0000\u00d3\u00d4"+
		"\u0005\f\u0000\u0000\u00d4\u00d5\u00054\u0000\u0000\u00d5\u00d7\u0005"+
		"\u0004\u0000\u0000\u00d6\u00d8\u0003\u0002\u0001\u0000\u00d7\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u0013\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0005\r\u0000\u0000\u00dc\u0015\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u00054\u0000\u0000\u00de\u00df\u0005\u000e\u0000"+
		"\u0000\u00df\u00e0\u00054\u0000\u0000\u00e0\u00e9\u0005\u000f\u0000\u0000"+
		"\u00e1\u00e6\u0003\u001c\u000e\u0000\u00e2\u00e3\u0005\n\u0000\u0000\u00e3"+
		"\u00e5\u0003\u001c\u000e\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e8\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e9\u00e1\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0005\u000b\u0000\u0000\u00ec\u0017\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u00054\u0000\u0000\u00ee\u00f7\u0005\u000f\u0000\u0000\u00ef\u00f4"+
		"\u0003\u001c\u000e\u0000\u00f0\u00f1\u0005\n\u0000\u0000\u00f1\u00f3\u0003"+
		"\u001c\u000e\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f7\u00ef\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"\u000b\u0000\u0000\u00fa\u0019\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005"+
		"\u0010\u0000\u0000\u00fc\u00fe\u0003\u001c\u000e\u0000\u00fd\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0005\u0001\u0000\u0000\u0100\u001b\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0006\u000e\uffff\uffff\u0000\u0102\u010b"+
		"\u00054\u0000\u0000\u0103\u0104\u0005\u000f\u0000\u0000\u0104\u0105\u0003"+
		"\u001c\u000e\u0000\u0105\u0106\u0005\u000b\u0000\u0000\u0106\u010b\u0001"+
		"\u0000\u0000\u0000\u0107\u010b\u00032\u0019\u0000\u0108\u010b\u0003\u0016"+
		"\u000b\u0000\u0109\u010b\u0003\u0018\f\u0000\u010a\u0101\u0001\u0000\u0000"+
		"\u0000\u010a\u0103\u0001\u0000\u0000\u0000\u010a\u0107\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u0109\u0001\u0000\u0000"+
		"\u0000\u010b\u0112\u0001\u0000\u0000\u0000\u010c\u010d\n\u0005\u0000\u0000"+
		"\u010d\u010e\u0003\u001e\u000f\u0000\u010e\u010f\u0003\u001c\u000e\u0006"+
		"\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000"+
		"\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u001d\u0001\u0000\u0000\u0000"+
		"\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u011d\u0003`0\u0000\u0116\u011d"+
		"\u0003b1\u0000\u0117\u011d\u0003d2\u0000\u0118\u011d\u0003f3\u0000\u0119"+
		"\u011d\u0003h4\u0000\u011a\u011d\u0003j5\u0000\u011b\u011d\u0003l6\u0000"+
		"\u011c\u0115\u0001\u0000\u0000\u0000\u011c\u0116\u0001\u0000\u0000\u0000"+
		"\u011c\u0117\u0001\u0000\u0000\u0000\u011c\u0118\u0001\u0000\u0000\u0000"+
		"\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u001f\u0001\u0000\u0000\u0000"+
		"\u011e\u0125\u0003n7\u0000\u011f\u0125\u0003p8\u0000\u0120\u0125\u0003"+
		"r9\u0000\u0121\u0125\u0003t:\u0000\u0122\u0125\u0003v;\u0000\u0123\u0125"+
		"\u0005\u0011\u0000\u0000\u0124\u011e\u0001\u0000\u0000\u0000\u0124\u011f"+
		"\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000\u0000\u0000\u0124\u0121"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0123"+
		"\u0001\u0000\u0000\u0000\u0125!\u0001\u0000\u0000\u0000\u0126\u0127\u0005"+
		"4\u0000\u0000\u0127\u0128\u0003 \u0010\u0000\u0128\u0129\u0003\u001c\u000e"+
		"\u0000\u0129#\u0001\u0000\u0000\u0000\u012a\u0131\u0003<\u001e\u0000\u012b"+
		"\u0131\u0003>\u001f\u0000\u012c\u0131\u0003@ \u0000\u012d\u0131\u0003"+
		"B!\u0000\u012e\u0131\u0003D\"\u0000\u012f\u0131\u0003F#\u0000\u0130\u012a"+
		"\u0001\u0000\u0000\u0000\u0130\u012b\u0001\u0000\u0000\u0000\u0130\u012c"+
		"\u0001\u0000\u0000\u0000\u0130\u012d\u0001\u0000\u0000\u0000\u0130\u012e"+
		"\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131%\u0001"+
		"\u0000\u0000\u0000\u0132\u0138\u00038\u001c\u0000\u0133\u0134\u0003\u001c"+
		"\u000e\u0000\u0134\u0135\u0003$\u0012\u0000\u0135\u0136\u0003\u001c\u000e"+
		"\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0132\u0001\u0000\u0000"+
		"\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0138\'\u0001\u0000\u0000\u0000"+
		"\u0139\u013c\u0003.\u0017\u0000\u013a\u013c\u0003,\u0016\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c)\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u00030\u0018\u0000\u013e+\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0003H$\u0000\u0140\u0145\u00054\u0000\u0000\u0141"+
		"\u0142\u0005\n\u0000\u0000\u0142\u0144\u00054\u0000\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0158"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0155"+
		"\u0003H$\u0000\u0149\u014a\u00054\u0000\u0000\u014a\u014b\u0005\u0011"+
		"\u0000\u0000\u014b\u0152\u0003\u001c\u000e\u0000\u014c\u014d\u0005\n\u0000"+
		"\u0000\u014d\u014e\u00054\u0000\u0000\u014e\u014f\u0005\u0011\u0000\u0000"+
		"\u014f\u0151\u0003\u001c\u000e\u0000\u0150\u014c\u0001\u0000\u0000\u0000"+
		"\u0151\u0154\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0156\u0001\u0000\u0000\u0000"+
		"\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0149\u0001\u0000\u0000\u0000"+
		"\u0155\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000"+
		"\u0157\u013f\u0001\u0000\u0000\u0000\u0157\u0148\u0001\u0000\u0000\u0000"+
		"\u0158-\u0001\u0000\u0000\u0000\u0159\u015a\u0003X,\u0000\u015a\u015b"+
		"\u0005\u0012\u0000\u0000\u015b\u015c\u0003H$\u0000\u015c\u015d\u0005\u0013"+
		"\u0000\u0000\u015d\u0162\u00054\u0000\u0000\u015e\u015f\u0005\n\u0000"+
		"\u0000\u015f\u0161\u00054\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000"+
		"\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000"+
		"\u0162\u0163\u0001\u0000\u0000\u0000\u0163/\u0001\u0000\u0000\u0000\u0164"+
		"\u0162\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0014\u0000\u0000\u0166"+
		"\u0167\u0003H$\u0000\u0167\u0168\u00054\u0000\u0000\u0168\u0174\u0005"+
		"\u000f\u0000\u0000\u0169\u016a\u0003H$\u0000\u016a\u0171\u00054\u0000"+
		"\u0000\u016b\u016c\u0005\n\u0000\u0000\u016c\u016d\u0003H$\u0000\u016d"+
		"\u016e\u00054\u0000\u0000\u016e\u0170\u0001\u0000\u0000\u0000\u016f\u016b"+
		"\u0001\u0000\u0000\u0000\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f"+
		"\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0175"+
		"\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0169"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u000b\u0000\u0000\u0177\u017a"+
		"\u0005\u0004\u0000\u0000\u0178\u017b\u0003\u0002\u0001\u0000\u0179\u017b"+
		"\u0003\u001a\r\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u0179\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d1\u0001\u0000"+
		"\u0000\u0000\u017e\u0185\u00055\u0000\u0000\u017f\u0185\u00056\u0000\u0000"+
		"\u0180\u0185\u00034\u001a\u0000\u0181\u0185\u00036\u001b\u0000\u0182\u0185"+
		"\u00038\u001c\u0000\u0183\u0185\u0003:\u001d\u0000\u0184\u017e\u0001\u0000"+
		"\u0000\u0000\u0184\u017f\u0001\u0000\u0000\u0000\u0184\u0180\u0001\u0000"+
		"\u0000\u0000\u0184\u0181\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0184\u0183\u0001\u0000\u0000\u0000\u01853\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0005\u0015\u0000\u0000\u0187\u0188\t\u0000\u0000\u0000"+
		"\u0188\u0189\u0005\u0015\u0000\u0000\u01895\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0005\u0016\u0000\u0000\u018b\u018c\t\u0000\u0000\u0000\u018c\u018d"+
		"\u0005\u0016\u0000\u0000\u018d7\u0001\u0000\u0000\u0000\u018e\u018f\u0007"+
		"\u0000\u0000\u0000\u018f9\u0001\u0000\u0000\u0000\u0190\u0191\u0005\u0019"+
		"\u0000\u0000\u0191;\u0001\u0000\u0000\u0000\u0192\u0193\u0005\u001a\u0000"+
		"\u0000\u0193=\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u001b\u0000\u0000"+
		"\u0195?\u0001\u0000\u0000\u0000\u0196\u0197\u0005\u0013\u0000\u0000\u0197"+
		"A\u0001\u0000\u0000\u0000\u0198\u0199\u0005\u0012\u0000\u0000\u0199C\u0001"+
		"\u0000\u0000\u0000\u019a\u019b\u0005\u001c\u0000\u0000\u019bE\u0001\u0000"+
		"\u0000\u0000\u019c\u019d\u0005\u001d\u0000\u0000\u019dG\u0001\u0000\u0000"+
		"\u0000\u019e\u01a6\u0003J%\u0000\u019f\u01a6\u0003L&\u0000\u01a0\u01a6"+
		"\u0003N\'\u0000\u01a1\u01a6\u0003P(\u0000\u01a2\u01a6\u0003R)\u0000\u01a3"+
		"\u01a6\u0003T*\u0000\u01a4\u01a6\u0003V+\u0000\u01a5\u019e\u0001\u0000"+
		"\u0000\u0000\u01a5\u019f\u0001\u0000\u0000\u0000\u01a5\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a1\u0001\u0000\u0000\u0000\u01a5\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6I\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\u001e\u0000"+
		"\u0000\u01a8K\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\u001f\u0000\u0000"+
		"\u01aaM\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005 \u0000\u0000\u01acO"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005!\u0000\u0000\u01aeQ\u0001\u0000"+
		"\u0000\u0000\u01af\u01b0\u0005\"\u0000\u0000\u01b0S\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0005#\u0000\u0000\u01b2U\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0005$\u0000\u0000\u01b4W\u0001\u0000\u0000\u0000\u01b5\u01b9\u0003"+
		"Z-\u0000\u01b6\u01b9\u0003^/\u0000\u01b7\u01b9\u0003\\.\u0000\u01b8\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b9Y\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005"+
		"%\u0000\u0000\u01bb[\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005&\u0000"+
		"\u0000\u01bd]\u0001\u0000\u0000\u0000\u01be\u01bf\u0005\'\u0000\u0000"+
		"\u01bf_\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005(\u0000\u0000\u01c1a"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005)\u0000\u0000\u01c3c\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0005*\u0000\u0000\u01c5e\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0005+\u0000\u0000\u01c7g\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0005,\u0000\u0000\u01c9i\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005-"+
		"\u0000\u0000\u01cbk\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005.\u0000\u0000"+
		"\u01cdm\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005/\u0000\u0000\u01cfo"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u00050\u0000\u0000\u01d1q\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u00051\u0000\u0000\u01d3s\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u00052\u0000\u0000\u01d5u\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u00053\u0000\u0000\u01d7w\u0001\u0000\u0000\u0000&{\u0086\u008a\u0091"+
		"\u0096\u009a\u00a2\u00aa\u00ae\u00b6\u00b8\u00c0\u00cf\u00d9\u00e6\u00e9"+
		"\u00f4\u00f7\u00fd\u010a\u0112\u011c\u0124\u0130\u0137\u013b\u0145\u0152"+
		"\u0155\u0157\u0162\u0171\u0174\u017a\u017c\u0184\u01a5\u01b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}