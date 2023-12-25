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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		Id_literal=60, Integer_literal=61, Floating_point_literal=62, ESCAPE_SEQUENCE=63, 
		White_spaces=64, Comment=65, Line_comment=66;
	public static final int
		RULE_start_ = 0, RULE_statement = 1, RULE_block_statement = 2, RULE_single_statement = 3, 
		RULE_if_statement = 4, RULE_loop_statement = 5, RULE_for_statement = 6, 
		RULE_while_statement = 7, RULE_for_range_statement = 8, RULE_for_each_statement = 9, 
		RULE_printing_statement = 10, RULE_print_statement = 11, RULE_println_statement = 12, 
		RULE_printf_statement = 13, RULE_method_call = 14, RULE_function_call = 15, 
		RULE_pass_statement = 16, RULE_return_statement = 17, RULE_expression = 18, 
		RULE_condition = 19, RULE_single_declaration = 20, RULE_block_declaration = 21, 
		RULE_variable_declaration = 22, RULE_container_declaration = 23, RULE_function_definition = 24, 
		RULE_constant = 25, RULE_char_literal = 26, RULE_string_literal = 27, 
		RULE_bool_literal = 28, RULE_null_literal = 29, RULE_comparator = 30, 
		RULE_equal = 31, RULE_not_equal = 32, RULE_greater = 33, RULE_lesser = 34, 
		RULE_greater_equal = 35, RULE_lesser_equal = 36, RULE_data_type = 37, 
		RULE_integer = 38, RULE_double = 39, RULE_char = 40, RULE_string = 41, 
		RULE_bool = 42, RULE_float = 43, RULE_void = 44, RULE_container_type = 45, 
		RULE_stack = 46, RULE_queue = 47, RULE_deque = 48, RULE_assign_statement = 49, 
		RULE_assign_operator = 50, RULE_add_assign = 51, RULE_sub_assign = 52, 
		RULE_mul_assign = 53, RULE_div_assign = 54, RULE_mod_assign = 55, RULE_increment = 56, 
		RULE_decrement = 57, RULE_assign = 58, RULE_arith_operator = 59, RULE_two_arg_arith_operator = 60, 
		RULE_add = 61, RULE_sub = 62, RULE_mul = 63, RULE_div = 64, RULE_mod = 65;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "statement", "block_statement", "single_statement", "if_statement", 
			"loop_statement", "for_statement", "while_statement", "for_range_statement", 
			"for_each_statement", "printing_statement", "print_statement", "println_statement", 
			"printf_statement", "method_call", "function_call", "pass_statement", 
			"return_statement", "expression", "condition", "single_declaration", 
			"block_declaration", "variable_declaration", "container_declaration", 
			"function_definition", "constant", "char_literal", "string_literal", 
			"bool_literal", "null_literal", "comparator", "equal", "not_equal", "greater", 
			"lesser", "greater_equal", "lesser_equal", "data_type", "integer", "double", 
			"char", "string", "bool", "float", "void", "container_type", "stack", 
			"queue", "deque", "assign_statement", "assign_operator", "add_assign", 
			"sub_assign", "mul_assign", "div_assign", "mod_assign", "increment", 
			"decrement", "assign", "arith_operator", "two_arg_arith_operator", "add", 
			"sub", "mul", "div", "mod"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'END'", "'IF'", "':'", "'ELIF'", "'ELSE'", "'WHILE'", "'FOR'", 
			"'IN RANGE('", "','", "')'", "'IN'", "'PRINT'", "'('", "'PRINTLN'", "'PRINTF'", 
			"'.'", "'PASS'", "'RETURN'", "'['", "']'", "'<'", "'>'", "'DEF'", "'''", 
			"'\"'", "'\\'", "'{'", "'}'", "'true'", "'false'", "'null'", "'=='", 
			"'!='", "'>='", "'<='", "'int'", "'double'", "'char'", "'string'", "'bool'", 
			"'float'", "'void'", "'STACK'", "'QUEUE'", "'DEQUE'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'++'", "'--'", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"Id_literal", "Integer_literal", "Floating_point_literal", "ESCAPE_SEQUENCE", 
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
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903555506568L) != 0)) {
				{
				{
				setState(132);
				statement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__14:
			case T__15:
			case T__17:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__51:
			case T__52:
			case Id_literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				single_statement();
				setState(141);
				match(T__0);
				}
				break;
			case T__2:
			case T__6:
			case T__7:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				block_statement();
				setState(144);
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
		public Block_declarationContext block_declaration() {
			return getRuleContext(Block_declarationContext.class,0);
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
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				if_statement();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				loop_statement();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
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
	public static class Single_statementContext extends ParserRuleContext {
		public Single_declarationContext single_declaration() {
			return getRuleContext(Single_declarationContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
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
		public Printing_statementContext printing_statement() {
			return getRuleContext(Printing_statementContext.class,0);
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
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				single_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				assign_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				pass_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				method_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(157);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				printing_statement();
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
		enterRule(_localctx, 8, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__2);
			setState(162);
			condition();
			setState(163);
			match(T__3);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				statement();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903555506568L) != 0) );
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(169);
				match(T__4);
				setState(170);
				condition();
				setState(171);
				match(T__3);
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(172);
					statement();
					}
					}
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903555506568L) != 0) );
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(182);
				match(T__5);
				setState(183);
				match(T__3);
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184);
					statement();
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903555506568L) != 0) );
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
	public static class Loop_statementContext extends ParserRuleContext {
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop_statement);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				while_statement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				for_statement();
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
		enterRule(_localctx, 12, RULE_for_statement);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				for_range_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
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
			setState(199);
			match(T__6);
			setState(200);
			condition();
			setState(201);
			match(T__3);
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				statement();
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903555506568L) != 0) );
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
			setState(207);
			match(T__7);
			setState(208);
			match(Id_literal);
			setState(209);
			match(T__8);
			setState(210);
			expression(0);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(211);
					match(T__9);
					setState(212);
					expression(0);
					}
					break;
				}
				setState(215);
				match(T__9);
				setState(216);
				expression(0);
				}
			}

			setState(219);
			match(T__10);
			setState(220);
			match(T__3);
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				statement();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903555506568L) != 0) );
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
			setState(226);
			match(T__7);
			setState(227);
			match(Id_literal);
			setState(228);
			match(T__11);
			setState(229);
			match(Id_literal);
			setState(230);
			match(T__3);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				statement();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903555506568L) != 0) );
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
	public static class Printing_statementContext extends ParserRuleContext {
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Println_statementContext println_statement() {
			return getRuleContext(Println_statementContext.class,0);
		}
		public Printf_statementContext printf_statement() {
			return getRuleContext(Printf_statementContext.class,0);
		}
		public Printing_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printing_statement; }
	}

	public final Printing_statementContext printing_statement() throws RecognitionException {
		Printing_statementContext _localctx = new Printing_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_printing_statement);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				print_statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				println_statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				printf_statement();
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
	public static class Print_statementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__12);
			setState(242);
			match(T__13);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450539864801280L) != 0)) {
				{
				setState(243);
				expression(0);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(244);
					match(T__9);
					setState(245);
					expression(0);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(253);
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
	public static class Println_statementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Println_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println_statement; }
	}

	public final Println_statementContext println_statement() throws RecognitionException {
		Println_statementContext _localctx = new Println_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_println_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__14);
			setState(256);
			match(T__13);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450539864801280L) != 0)) {
				{
				setState(257);
				expression(0);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(258);
					match(T__9);
					setState(259);
					expression(0);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(267);
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
	public static class Printf_statementContext extends ParserRuleContext {
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Printf_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf_statement; }
	}

	public final Printf_statementContext printf_statement() throws RecognitionException {
		Printf_statementContext _localctx = new Printf_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printf_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__15);
			setState(270);
			match(T__13);
			setState(271);
			string_literal();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(272);
				match(T__9);
				setState(273);
				expression(0);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
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
		enterRule(_localctx, 28, RULE_method_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(Id_literal);
			setState(282);
			match(T__16);
			setState(283);
			match(Id_literal);
			setState(284);
			match(T__13);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450539864801280L) != 0)) {
				{
				setState(285);
				expression(0);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(286);
					match(T__9);
					setState(287);
					expression(0);
					}
					}
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(295);
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
		enterRule(_localctx, 30, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(Id_literal);
			setState(298);
			match(T__13);
			{
			setState(299);
			expression(0);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(300);
				match(T__9);
				setState(301);
				expression(0);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(307);
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
	public static class Pass_statementContext extends ParserRuleContext {
		public Pass_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_statement; }
	}

	public final Pass_statementContext pass_statement() throws RecognitionException {
		Pass_statementContext _localctx = new Pass_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pass_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
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
		enterRule(_localctx, 34, RULE_return_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__18);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8070450539864801280L) != 0)) {
				{
				setState(312);
				expression(0);
				}
			}

			setState(315);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(318);
				match(Id_literal);
				}
				break;
			case 2:
				{
				setState(319);
				match(Id_literal);
				setState(320);
				match(T__19);
				setState(321);
				expression(0);
				setState(322);
				match(T__20);
				}
				break;
			case 3:
				{
				setState(324);
				match(T__13);
				setState(325);
				expression(0);
				setState(326);
				match(T__10);
				}
				break;
			case 4:
				{
				setState(328);
				constant();
				}
				break;
			case 5:
				{
				setState(329);
				method_call();
				}
				break;
			case 6:
				{
				setState(330);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(333);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(334);
					arith_operator();
					setState(335);
					expression(6);
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				bool_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				expression(0);
				setState(344);
				comparator();
				setState(345);
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
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				container_declaration();
				}
				break;
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
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
			setState(353);
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
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			data_type();
			setState(356);
			match(Id_literal);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(357);
				assign();
				setState(358);
				expression(0);
				}
			}

			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(362);
				match(T__9);
				setState(363);
				match(Id_literal);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__53) {
					{
					setState(364);
					assign();
					setState(365);
					expression(0);
					}
				}

				}
				}
				setState(373);
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
			setState(374);
			container_type();
			setState(375);
			match(T__21);
			setState(376);
			data_type();
			setState(377);
			match(T__22);
			setState(378);
			match(Id_literal);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(379);
				match(T__9);
				setState(380);
				match(Id_literal);
				}
				}
				setState(385);
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
			setState(386);
			match(T__23);
			setState(387);
			data_type();
			setState(388);
			match(Id_literal);
			setState(389);
			match(T__13);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17454747090944L) != 0)) {
				{
				setState(390);
				data_type();
				setState(391);
				match(Id_literal);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(392);
					match(T__9);
					setState(393);
					data_type();
					setState(394);
					match(Id_literal);
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(403);
			match(T__10);
			setState(404);
			match(T__3);
			setState(407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(407);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__6:
				case T__7:
				case T__12:
				case T__14:
				case T__15:
				case T__17:
				case T__23:
				case T__36:
				case T__37:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__51:
				case T__52:
				case Id_literal:
					{
					setState(405);
					statement();
					}
					break;
				case T__18:
					{
					setState(406);
					return_statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903556030856L) != 0) );
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
			setState(417);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(Integer_literal);
				}
				break;
			case Floating_point_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(Floating_point_literal);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				char_literal();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				string_literal();
				}
				break;
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				bool_literal();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
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
			setState(419);
			match(T__24);
			setState(420);
			matchWildcard();
			setState(421);
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
	public static class String_literalContext extends ParserRuleContext {
		public List<TerminalNode> ESCAPE_SEQUENCE() { return getTokens(GrammarParser.ESCAPE_SEQUENCE); }
		public TerminalNode ESCAPE_SEQUENCE(int i) {
			return getToken(GrammarParser.ESCAPE_SEQUENCE, i);
		}
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_string_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(T__25);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -201326594L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0)) {
				{
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(424);
					match(ESCAPE_SEQUENCE);
					}
					break;
				case 2:
					{
					setState(425);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T__25 || _la==T__26) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case 3:
					{
					setState(426);
					match(T__27);
					}
					break;
				case 4:
					{
					setState(427);
					match(T__28);
					}
					break;
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
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
			setState(435);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
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
			setState(437);
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
		enterRule(_localctx, 60, RULE_comparator);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				equal();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				not_equal();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				greater();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
				lesser();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(443);
				greater_equal();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 6);
				{
				setState(444);
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
	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
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
	public static class Not_equalContext extends ParserRuleContext {
		public Not_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal; }
	}

	public final Not_equalContext not_equal() throws RecognitionException {
		Not_equalContext _localctx = new Not_equalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
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
	public static class GreaterContext extends ParserRuleContext {
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__22);
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
		enterRule(_localctx, 68, RULE_lesser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
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
	public static class Greater_equalContext extends ParserRuleContext {
		public Greater_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_equal; }
	}

	public final Greater_equalContext greater_equal() throws RecognitionException {
		Greater_equalContext _localctx = new Greater_equalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_greater_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
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
	public static class Lesser_equalContext extends ParserRuleContext {
		public Lesser_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser_equal; }
	}

	public final Lesser_equalContext lesser_equal() throws RecognitionException {
		Lesser_equalContext _localctx = new Lesser_equalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_lesser_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
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
		enterRule(_localctx, 74, RULE_data_type);
		try {
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				integer();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				double_();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				char_();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
				string();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
				bool();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 6);
				{
				setState(464);
				float_();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 7);
				{
				setState(465);
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
		enterRule(_localctx, 76, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
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
	public static class DoubleContext extends ParserRuleContext {
		public DoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double; }
	}

	public final DoubleContext double_() throws RecognitionException {
		DoubleContext _localctx = new DoubleContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
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
	public static class CharContext extends ParserRuleContext {
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
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
	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
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
	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
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
	public static class FloatContext extends ParserRuleContext {
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
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
	public static class VoidContext extends ParserRuleContext {
		public VoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_void; }
	}

	public final VoidContext void_() throws RecognitionException {
		VoidContext _localctx = new VoidContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_void);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		enterRule(_localctx, 90, RULE_container_type);
		try {
			setState(485);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				stack();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				deque();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
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
		enterRule(_localctx, 92, RULE_stack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
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
	public static class QueueContext extends ParserRuleContext {
		public QueueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queue; }
	}

	public final QueueContext queue() throws RecognitionException {
		QueueContext _localctx = new QueueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_queue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
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
	public static class DequeContext extends ParserRuleContext {
		public DequeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deque; }
	}

	public final DequeContext deque() throws RecognitionException {
		DequeContext _localctx = new DequeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_deque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
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
	public static class Assign_statementContext extends ParserRuleContext {
		public TerminalNode Id_literal() { return getToken(GrammarParser.Id_literal, 0); }
		public Assign_operatorContext assign_operator() {
			return getRuleContext(Assign_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_assign_statement);
		try {
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(Id_literal);
				setState(494);
				assign_operator();
				setState(495);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(Id_literal);
				setState(498);
				increment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(499);
				match(Id_literal);
				setState(500);
				decrement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(501);
				increment();
				setState(502);
				match(Id_literal);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(504);
				decrement();
				setState(505);
				match(Id_literal);
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
	public static class Assign_operatorContext extends ParserRuleContext {
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Assign_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_operator; }
	}

	public final Assign_operatorContext assign_operator() throws RecognitionException {
		Assign_operatorContext _localctx = new Assign_operatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_assign_operator);
		try {
			setState(515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				add_assign();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				sub_assign();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				mul_assign();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				div_assign();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 5);
				{
				setState(513);
				mod_assign();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 6);
				{
				setState(514);
				assign();
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
	public static class Add_assignContext extends ParserRuleContext {
		public Add_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_assign; }
	}

	public final Add_assignContext add_assign() throws RecognitionException {
		Add_assignContext _localctx = new Add_assignContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_add_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		enterRule(_localctx, 104, RULE_sub_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
		enterRule(_localctx, 106, RULE_mul_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
		enterRule(_localctx, 108, RULE_div_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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
		enterRule(_localctx, 110, RULE_mod_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IncrementContext extends ParserRuleContext {
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(T__51);
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
	public static class DecrementContext extends ParserRuleContext {
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(T__52);
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
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(T__53);
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
	public static class Arith_operatorContext extends ParserRuleContext {
		public Two_arg_arith_operatorContext two_arg_arith_operator() {
			return getRuleContext(Two_arg_arith_operatorContext.class,0);
		}
		public Arith_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_operator; }
	}

	public final Arith_operatorContext arith_operator() throws RecognitionException {
		Arith_operatorContext _localctx = new Arith_operatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_arith_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			two_arg_arith_operator();
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
	public static class Two_arg_arith_operatorContext extends ParserRuleContext {
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
		public Two_arg_arith_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_two_arg_arith_operator; }
	}

	public final Two_arg_arith_operatorContext two_arg_arith_operator() throws RecognitionException {
		Two_arg_arith_operatorContext _localctx = new Two_arg_arith_operatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_two_arg_arith_operator);
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				add();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				sub();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				mul();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 4);
				{
				setState(538);
				div();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 5);
				{
				setState(539);
				mod();
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
	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(T__54);
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
		enterRule(_localctx, 124, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__55);
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
		enterRule(_localctx, 126, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(T__56);
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
		enterRule(_localctx, 128, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(T__57);
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
		enterRule(_localctx, 130, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(T__58);
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
		case 18:
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
		"\u0004\u0001B\u0229\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0001\u0000\u0005\u0000\u0086\b\u0000\n\u0000\f\u0000\u0089\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0093\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0098\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a0\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u00a6\b\u0004\u000b"+
		"\u0004\f\u0004\u00a7\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u00ae\b\u0004\u000b\u0004\f\u0004\u00af\u0005\u0004\u00b2\b\u0004"+
		"\n\u0004\f\u0004\u00b5\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u00ba\b\u0004\u000b\u0004\f\u0004\u00bb\u0003\u0004\u00be\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00c2\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00c6\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u00cc\b\u0007\u000b\u0007\f\u0007\u00cd\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d6\b\b\u0001\b\u0001\b\u0003\b\u00da"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0004\b\u00df\b\b\u000b\b\f\b\u00e0\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00e9\b\t\u000b\t\f"+
		"\t\u00ea\u0001\n\u0001\n\u0001\n\u0003\n\u00f0\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f7\b\u000b\n\u000b"+
		"\f\u000b\u00fa\t\u000b\u0003\u000b\u00fc\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0105\b\f\n\f\f\f\u0108"+
		"\t\f\u0003\f\u010a\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0005\r\u0113\b\r\n\r\f\r\u0116\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0121\b\u000e\n\u000e\f\u000e\u0124\t\u000e\u0003\u000e\u0126"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u012f\b\u000f\n\u000f\f\u000f\u0132\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u013a\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u014c\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u0152\b\u0012\n\u0012\f\u0012\u0155\t\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u015c\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0160\b\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0169"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u0170\b\u0016\u0005\u0016\u0172\b\u0016\n\u0016\f\u0016\u0175\t"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0005\u0017\u017e\b\u0017\n\u0017\f\u0017\u0181\t\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u018d\b\u0018"+
		"\n\u0018\f\u0018\u0190\t\u0018\u0003\u0018\u0192\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u0198\b\u0018\u000b\u0018\f"+
		"\u0018\u0199\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01a2\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u01ad\b\u001b\n\u001b\f\u001b\u01b0\t\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01be"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u01d3\b%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		")\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0003-\u01e6\b-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u01fc\b1\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u0204\b2\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u0001"+
		"6\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001"+
		";\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u021d\b<\u0001=\u0001=\u0001"+
		">\u0001>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001A\u0000\u0001"+
		"$B\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0000\u0002\u0001\u0000\u001a\u001b\u0001\u0000\u001e\u001f\u0239\u0000"+
		"\u0087\u0001\u0000\u0000\u0000\u0002\u0092\u0001\u0000\u0000\u0000\u0004"+
		"\u0097\u0001\u0000\u0000\u0000\u0006\u009f\u0001\u0000\u0000\u0000\b\u00a1"+
		"\u0001\u0000\u0000\u0000\n\u00c1\u0001\u0000\u0000\u0000\f\u00c5\u0001"+
		"\u0000\u0000\u0000\u000e\u00c7\u0001\u0000\u0000\u0000\u0010\u00cf\u0001"+
		"\u0000\u0000\u0000\u0012\u00e2\u0001\u0000\u0000\u0000\u0014\u00ef\u0001"+
		"\u0000\u0000\u0000\u0016\u00f1\u0001\u0000\u0000\u0000\u0018\u00ff\u0001"+
		"\u0000\u0000\u0000\u001a\u010d\u0001\u0000\u0000\u0000\u001c\u0119\u0001"+
		"\u0000\u0000\u0000\u001e\u0129\u0001\u0000\u0000\u0000 \u0135\u0001\u0000"+
		"\u0000\u0000\"\u0137\u0001\u0000\u0000\u0000$\u014b\u0001\u0000\u0000"+
		"\u0000&\u015b\u0001\u0000\u0000\u0000(\u015f\u0001\u0000\u0000\u0000*"+
		"\u0161\u0001\u0000\u0000\u0000,\u0163\u0001\u0000\u0000\u0000.\u0176\u0001"+
		"\u0000\u0000\u00000\u0182\u0001\u0000\u0000\u00002\u01a1\u0001\u0000\u0000"+
		"\u00004\u01a3\u0001\u0000\u0000\u00006\u01a7\u0001\u0000\u0000\u00008"+
		"\u01b3\u0001\u0000\u0000\u0000:\u01b5\u0001\u0000\u0000\u0000<\u01bd\u0001"+
		"\u0000\u0000\u0000>\u01bf\u0001\u0000\u0000\u0000@\u01c1\u0001\u0000\u0000"+
		"\u0000B\u01c3\u0001\u0000\u0000\u0000D\u01c5\u0001\u0000\u0000\u0000F"+
		"\u01c7\u0001\u0000\u0000\u0000H\u01c9\u0001\u0000\u0000\u0000J\u01d2\u0001"+
		"\u0000\u0000\u0000L\u01d4\u0001\u0000\u0000\u0000N\u01d6\u0001\u0000\u0000"+
		"\u0000P\u01d8\u0001\u0000\u0000\u0000R\u01da\u0001\u0000\u0000\u0000T"+
		"\u01dc\u0001\u0000\u0000\u0000V\u01de\u0001\u0000\u0000\u0000X\u01e0\u0001"+
		"\u0000\u0000\u0000Z\u01e5\u0001\u0000\u0000\u0000\\\u01e7\u0001\u0000"+
		"\u0000\u0000^\u01e9\u0001\u0000\u0000\u0000`\u01eb\u0001\u0000\u0000\u0000"+
		"b\u01fb\u0001\u0000\u0000\u0000d\u0203\u0001\u0000\u0000\u0000f\u0205"+
		"\u0001\u0000\u0000\u0000h\u0207\u0001\u0000\u0000\u0000j\u0209\u0001\u0000"+
		"\u0000\u0000l\u020b\u0001\u0000\u0000\u0000n\u020d\u0001\u0000\u0000\u0000"+
		"p\u020f\u0001\u0000\u0000\u0000r\u0211\u0001\u0000\u0000\u0000t\u0213"+
		"\u0001\u0000\u0000\u0000v\u0215\u0001\u0000\u0000\u0000x\u021c\u0001\u0000"+
		"\u0000\u0000z\u021e\u0001\u0000\u0000\u0000|\u0220\u0001\u0000\u0000\u0000"+
		"~\u0222\u0001\u0000\u0000\u0000\u0080\u0224\u0001\u0000\u0000\u0000\u0082"+
		"\u0226\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0002\u0001\u0000\u0085"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087"+
		"\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088"+
		"\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\u0000\u0000\u0001\u008b\u0001\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0003\u0006\u0003\u0000\u008d\u008e\u0005\u0001\u0000\u0000\u008e"+
		"\u0093\u0001\u0000\u0000\u0000\u008f\u0090\u0003\u0004\u0002\u0000\u0090"+
		"\u0091\u0005\u0002\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092"+
		"\u008c\u0001\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0093"+
		"\u0003\u0001\u0000\u0000\u0000\u0094\u0098\u0003\b\u0004\u0000\u0095\u0098"+
		"\u0003\n\u0005\u0000\u0096\u0098\u0003*\u0015\u0000\u0097\u0094\u0001"+
		"\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0005\u0001\u0000\u0000\u0000\u0099\u00a0\u0003"+
		"(\u0014\u0000\u009a\u00a0\u0003b1\u0000\u009b\u00a0\u0003 \u0010\u0000"+
		"\u009c\u00a0\u0003\u001c\u000e\u0000\u009d\u00a0\u0003\u001e\u000f\u0000"+
		"\u009e\u00a0\u0003\u0014\n\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u009f"+
		"\u009a\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u009f"+
		"\u009c\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u0007\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0005\u0003\u0000\u0000\u00a2\u00a3\u0003&\u0013\u0000\u00a3\u00a5"+
		"\u0005\u0004\u0000\u0000\u00a4\u00a6\u0003\u0002\u0001\u0000\u00a5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00b3"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ab"+
		"\u0003&\u0013\u0000\u00ab\u00ad\u0005\u0004\u0000\u0000\u00ac\u00ae\u0003"+
		"\u0002\u0001\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00a9\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00bd\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		"\u0006\u0000\u0000\u00b7\u00b9\u0005\u0004\u0000\u0000\u00b8\u00ba\u0003"+
		"\u0002\u0001\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b6\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\t\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c2\u0003\u000e\u0007\u0000\u00c0\u00c2\u0003\f\u0006"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u000b\u0001\u0000\u0000\u0000\u00c3\u00c6\u0003\u0010\b\u0000"+
		"\u00c4\u00c6\u0003\u0012\t\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\r\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0005\u0007\u0000\u0000\u00c8\u00c9\u0003&\u0013\u0000\u00c9\u00cb\u0005"+
		"\u0004\u0000\u0000\u00ca\u00cc\u0003\u0002\u0001\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u000f\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005\b\u0000\u0000\u00d0\u00d1\u0005<"+
		"\u0000\u0000\u00d1\u00d2\u0005\t\u0000\u0000\u00d2\u00d9\u0003$\u0012"+
		"\u0000\u00d3\u00d4\u0005\n\u0000\u0000\u00d4\u00d6\u0003$\u0012\u0000"+
		"\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\n\u0000\u0000\u00d8"+
		"\u00da\u0003$\u0012\u0000\u00d9\u00d5\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0005\u000b\u0000\u0000\u00dc\u00de\u0005\u0004\u0000\u0000\u00dd\u00df"+
		"\u0003\u0002\u0001\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e1\u0011\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0005\b\u0000\u0000\u00e3\u00e4\u0005<\u0000\u0000\u00e4\u00e5\u0005"+
		"\f\u0000\u0000\u00e5\u00e6\u0005<\u0000\u0000\u00e6\u00e8\u0005\u0004"+
		"\u0000\u0000\u00e7\u00e9\u0003\u0002\u0001\u0000\u00e8\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u0013\u0001\u0000"+
		"\u0000\u0000\u00ec\u00f0\u0003\u0016\u000b\u0000\u00ed\u00f0\u0003\u0018"+
		"\f\u0000\u00ee\u00f0\u0003\u001a\r\u0000\u00ef\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\u0015\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\r\u0000\u0000"+
		"\u00f2\u00fb\u0005\u000e\u0000\u0000\u00f3\u00f8\u0003$\u0012\u0000\u00f4"+
		"\u00f5\u0005\n\u0000\u0000\u00f5\u00f7\u0003$\u0012\u0000\u00f6\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00f3"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u000b\u0000\u0000\u00fe\u0017"+
		"\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u000f\u0000\u0000\u0100\u0109"+
		"\u0005\u000e\u0000\u0000\u0101\u0106\u0003$\u0012\u0000\u0102\u0103\u0005"+
		"\n\u0000\u0000\u0103\u0105\u0003$\u0012\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u0101\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0005\u000b\u0000\u0000\u010c\u0019\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0005\u0010\u0000\u0000\u010e\u010f\u0005\u000e"+
		"\u0000\u0000\u010f\u0114\u00036\u001b\u0000\u0110\u0111\u0005\n\u0000"+
		"\u0000\u0111\u0113\u0003$\u0012\u0000\u0112\u0110\u0001\u0000\u0000\u0000"+
		"\u0113\u0116\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000\u0000"+
		"\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u000b\u0000\u0000"+
		"\u0118\u001b\u0001\u0000\u0000\u0000\u0119\u011a\u0005<\u0000\u0000\u011a"+
		"\u011b\u0005\u0011\u0000\u0000\u011b\u011c\u0005<\u0000\u0000\u011c\u0125"+
		"\u0005\u000e\u0000\u0000\u011d\u0122\u0003$\u0012\u0000\u011e\u011f\u0005"+
		"\n\u0000\u0000\u011f\u0121\u0003$\u0012\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u011d\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005\u000b\u0000\u0000\u0128\u001d\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0005<\u0000\u0000\u012a\u012b\u0005\u000e\u0000"+
		"\u0000\u012b\u0130\u0003$\u0012\u0000\u012c\u012d\u0005\n\u0000\u0000"+
		"\u012d\u012f\u0003$\u0012\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u000b\u0000\u0000\u0134"+
		"\u001f\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0012\u0000\u0000\u0136"+
		"!\u0001\u0000\u0000\u0000\u0137\u0139\u0005\u0013\u0000\u0000\u0138\u013a"+
		"\u0003$\u0012\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u0139\u013a\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0005"+
		"\u0001\u0000\u0000\u013c#\u0001\u0000\u0000\u0000\u013d\u013e\u0006\u0012"+
		"\uffff\uffff\u0000\u013e\u014c\u0005<\u0000\u0000\u013f\u0140\u0005<\u0000"+
		"\u0000\u0140\u0141\u0005\u0014\u0000\u0000\u0141\u0142\u0003$\u0012\u0000"+
		"\u0142\u0143\u0005\u0015\u0000\u0000\u0143\u014c\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005\u000e\u0000\u0000\u0145\u0146\u0003$\u0012\u0000\u0146"+
		"\u0147\u0005\u000b\u0000\u0000\u0147\u014c\u0001\u0000\u0000\u0000\u0148"+
		"\u014c\u00032\u0019\u0000\u0149\u014c\u0003\u001c\u000e\u0000\u014a\u014c"+
		"\u0003\u001e\u000f\u0000\u014b\u013d\u0001\u0000\u0000\u0000\u014b\u013f"+
		"\u0001\u0000\u0000\u0000\u014b\u0144\u0001\u0000\u0000\u0000\u014b\u0148"+
		"\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014a"+
		"\u0001\u0000\u0000\u0000\u014c\u0153\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\n\u0005\u0000\u0000\u014e\u014f\u0003v;\u0000\u014f\u0150\u0003$\u0012"+
		"\u0006\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014d\u0001\u0000\u0000"+
		"\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154%\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u015c\u00038\u001c\u0000\u0157"+
		"\u0158\u0003$\u0012\u0000\u0158\u0159\u0003<\u001e\u0000\u0159\u015a\u0003"+
		"$\u0012\u0000\u015a\u015c\u0001\u0000\u0000\u0000\u015b\u0156\u0001\u0000"+
		"\u0000\u0000\u015b\u0157\u0001\u0000\u0000\u0000\u015c\'\u0001\u0000\u0000"+
		"\u0000\u015d\u0160\u0003.\u0017\u0000\u015e\u0160\u0003,\u0016\u0000\u015f"+
		"\u015d\u0001\u0000\u0000\u0000\u015f\u015e\u0001\u0000\u0000\u0000\u0160"+
		")\u0001\u0000\u0000\u0000\u0161\u0162\u00030\u0018\u0000\u0162+\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0003J%\u0000\u0164\u0168\u0005<\u0000"+
		"\u0000\u0165\u0166\u0003t:\u0000\u0166\u0167\u0003$\u0012\u0000\u0167"+
		"\u0169\u0001\u0000\u0000\u0000\u0168\u0165\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0001\u0000\u0000\u0000\u0169\u0173\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0005\n\u0000\u0000\u016b\u016f\u0005<\u0000\u0000\u016c\u016d"+
		"\u0003t:\u0000\u016d\u016e\u0003$\u0012\u0000\u016e\u0170\u0001\u0000"+
		"\u0000\u0000\u016f\u016c\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u0172\u0001\u0000\u0000\u0000\u0171\u016a\u0001\u0000"+
		"\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174-\u0001\u0000\u0000"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0177\u0003Z-\u0000\u0177"+
		"\u0178\u0005\u0016\u0000\u0000\u0178\u0179\u0003J%\u0000\u0179\u017a\u0005"+
		"\u0017\u0000\u0000\u017a\u017f\u0005<\u0000\u0000\u017b\u017c\u0005\n"+
		"\u0000\u0000\u017c\u017e\u0005<\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180/\u0001\u0000\u0000\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u0018\u0000\u0000"+
		"\u0183\u0184\u0003J%\u0000\u0184\u0185\u0005<\u0000\u0000\u0185\u0191"+
		"\u0005\u000e\u0000\u0000\u0186\u0187\u0003J%\u0000\u0187\u018e\u0005<"+
		"\u0000\u0000\u0188\u0189\u0005\n\u0000\u0000\u0189\u018a\u0003J%\u0000"+
		"\u018a\u018b\u0005<\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c"+
		"\u0188\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e"+
		"\u018c\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f"+
		"\u0192\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191"+
		"\u0186\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u000b\u0000\u0000\u0194"+
		"\u0197\u0005\u0004\u0000\u0000\u0195\u0198\u0003\u0002\u0001\u0000\u0196"+
		"\u0198\u0003\"\u0011\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a1\u0001"+
		"\u0000\u0000\u0000\u019b\u01a2\u0005=\u0000\u0000\u019c\u01a2\u0005>\u0000"+
		"\u0000\u019d\u01a2\u00034\u001a\u0000\u019e\u01a2\u00036\u001b\u0000\u019f"+
		"\u01a2\u00038\u001c\u0000\u01a0\u01a2\u0003:\u001d\u0000\u01a1\u019b\u0001"+
		"\u0000\u0000\u0000\u01a1\u019c\u0001\u0000\u0000\u0000\u01a1\u019d\u0001"+
		"\u0000\u0000\u0000\u01a1\u019e\u0001\u0000\u0000\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a23\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0005\u0019\u0000\u0000\u01a4\u01a5\t\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0005\u0019\u0000\u0000\u01a65\u0001\u0000\u0000\u0000"+
		"\u01a7\u01ae\u0005\u001a\u0000\u0000\u01a8\u01ad\u0005?\u0000\u0000\u01a9"+
		"\u01ad\b\u0000\u0000\u0000\u01aa\u01ad\u0005\u001c\u0000\u0000\u01ab\u01ad"+
		"\u0005\u001d\u0000\u0000\u01ac\u01a8\u0001\u0000\u0000\u0000\u01ac\u01a9"+
		"\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000\u01ac\u01ab"+
		"\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0005\u001a\u0000\u0000\u01b27\u0001\u0000\u0000\u0000\u01b3\u01b4\u0007"+
		"\u0001\u0000\u0000\u01b49\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005 \u0000"+
		"\u0000\u01b6;\u0001\u0000\u0000\u0000\u01b7\u01be\u0003>\u001f\u0000\u01b8"+
		"\u01be\u0003@ \u0000\u01b9\u01be\u0003B!\u0000\u01ba\u01be\u0003D\"\u0000"+
		"\u01bb\u01be\u0003F#\u0000\u01bc\u01be\u0003H$\u0000\u01bd\u01b7\u0001"+
		"\u0000\u0000\u0000\u01bd\u01b8\u0001\u0000\u0000\u0000\u01bd\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bd\u01ba\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01be=\u0001\u0000"+
		"\u0000\u0000\u01bf\u01c0\u0005!\u0000\u0000\u01c0?\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0005\"\u0000\u0000\u01c2A\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0005\u0017\u0000\u0000\u01c4C\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0005\u0016\u0000\u0000\u01c6E\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005"+
		"#\u0000\u0000\u01c8G\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005$\u0000"+
		"\u0000\u01caI\u0001\u0000\u0000\u0000\u01cb\u01d3\u0003L&\u0000\u01cc"+
		"\u01d3\u0003N\'\u0000\u01cd\u01d3\u0003P(\u0000\u01ce\u01d3\u0003R)\u0000"+
		"\u01cf\u01d3\u0003T*\u0000\u01d0\u01d3\u0003V+\u0000\u01d1\u01d3\u0003"+
		"X,\u0000\u01d2\u01cb\u0001\u0000\u0000\u0000\u01d2\u01cc\u0001\u0000\u0000"+
		"\u0000\u01d2\u01cd\u0001\u0000\u0000\u0000\u01d2\u01ce\u0001\u0000\u0000"+
		"\u0000\u01d2\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3K\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0005%\u0000\u0000\u01d5M\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0005&\u0000\u0000\u01d7O\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005\'"+
		"\u0000\u0000\u01d9Q\u0001\u0000\u0000\u0000\u01da\u01db\u0005(\u0000\u0000"+
		"\u01dbS\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005)\u0000\u0000\u01ddU"+
		"\u0001\u0000\u0000\u0000\u01de\u01df\u0005*\u0000\u0000\u01dfW\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e1\u0005+\u0000\u0000\u01e1Y\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e6\u0003\\.\u0000\u01e3\u01e6\u0003`0\u0000\u01e4\u01e6\u0003"+
		"^/\u0000\u01e5\u01e2\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e6[\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e8\u0005,\u0000\u0000\u01e8]\u0001\u0000\u0000\u0000\u01e9\u01ea"+
		"\u0005-\u0000\u0000\u01ea_\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005."+
		"\u0000\u0000\u01eca\u0001\u0000\u0000\u0000\u01ed\u01ee\u0005<\u0000\u0000"+
		"\u01ee\u01ef\u0003d2\u0000\u01ef\u01f0\u0003$\u0012\u0000\u01f0\u01fc"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005<\u0000\u0000\u01f2\u01fc\u0003"+
		"p8\u0000\u01f3\u01f4\u0005<\u0000\u0000\u01f4\u01fc\u0003r9\u0000\u01f5"+
		"\u01f6\u0003p8\u0000\u01f6\u01f7\u0005<\u0000\u0000\u01f7\u01fc\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0003r9\u0000\u01f9\u01fa\u0005<\u0000"+
		"\u0000\u01fa\u01fc\u0001\u0000\u0000\u0000\u01fb\u01ed\u0001\u0000\u0000"+
		"\u0000\u01fb\u01f1\u0001\u0000\u0000\u0000\u01fb\u01f3\u0001\u0000\u0000"+
		"\u0000\u01fb\u01f5\u0001\u0000\u0000\u0000\u01fb\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fcc\u0001\u0000\u0000\u0000\u01fd\u0204\u0003f3\u0000\u01fe"+
		"\u0204\u0003h4\u0000\u01ff\u0204\u0003j5\u0000\u0200\u0204\u0003l6\u0000"+
		"\u0201\u0204\u0003n7\u0000\u0202\u0204\u0003t:\u0000\u0203\u01fd\u0001"+
		"\u0000\u0000\u0000\u0203\u01fe\u0001\u0000\u0000\u0000\u0203\u01ff\u0001"+
		"\u0000\u0000\u0000\u0203\u0200\u0001\u0000\u0000\u0000\u0203\u0201\u0001"+
		"\u0000\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204e\u0001\u0000"+
		"\u0000\u0000\u0205\u0206\u0005/\u0000\u0000\u0206g\u0001\u0000\u0000\u0000"+
		"\u0207\u0208\u00050\u0000\u0000\u0208i\u0001\u0000\u0000\u0000\u0209\u020a"+
		"\u00051\u0000\u0000\u020ak\u0001\u0000\u0000\u0000\u020b\u020c\u00052"+
		"\u0000\u0000\u020cm\u0001\u0000\u0000\u0000\u020d\u020e\u00053\u0000\u0000"+
		"\u020eo\u0001\u0000\u0000\u0000\u020f\u0210\u00054\u0000\u0000\u0210q"+
		"\u0001\u0000\u0000\u0000\u0211\u0212\u00055\u0000\u0000\u0212s\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u00056\u0000\u0000\u0214u\u0001\u0000\u0000\u0000"+
		"\u0215\u0216\u0003x<\u0000\u0216w\u0001\u0000\u0000\u0000\u0217\u021d"+
		"\u0003z=\u0000\u0218\u021d\u0003|>\u0000\u0219\u021d\u0003~?\u0000\u021a"+
		"\u021d\u0003\u0080@\u0000\u021b\u021d\u0003\u0082A\u0000\u021c\u0217\u0001"+
		"\u0000\u0000\u0000\u021c\u0218\u0001\u0000\u0000\u0000\u021c\u0219\u0001"+
		"\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021b\u0001"+
		"\u0000\u0000\u0000\u021dy\u0001\u0000\u0000\u0000\u021e\u021f\u00057\u0000"+
		"\u0000\u021f{\u0001\u0000\u0000\u0000\u0220\u0221\u00058\u0000\u0000\u0221"+
		"}\u0001\u0000\u0000\u0000\u0222\u0223\u00059\u0000\u0000\u0223\u007f\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0005:\u0000\u0000\u0225\u0081\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0005;\u0000\u0000\u0227\u0083\u0001\u0000\u0000"+
		"\u0000/\u0087\u0092\u0097\u009f\u00a7\u00af\u00b3\u00bb\u00bd\u00c1\u00c5"+
		"\u00cd\u00d5\u00d9\u00e0\u00ea\u00ef\u00f8\u00fb\u0106\u0109\u0114\u0122"+
		"\u0125\u0130\u0139\u014b\u0153\u015b\u015f\u0168\u016f\u0173\u017f\u018e"+
		"\u0191\u0197\u0199\u01a1\u01ac\u01ae\u01bd\u01d2\u01e5\u01fb\u0203\u021c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}