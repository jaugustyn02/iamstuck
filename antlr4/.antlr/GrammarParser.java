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
		Id_literal=60, Integer_literal=61, Floating_point_literal=62, String_literal=63, 
		ESCAPE_SEQUENCE=64, White_spaces=65, Comment=66, Line_comment=67;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_block_statement = 2, RULE_single_statement = 3, 
		RULE_if_statement = 4, RULE_loop_statement = 5, RULE_for_statement = 6, 
		RULE_while_statement = 7, RULE_for_range_statement = 8, RULE_for_each_statement = 9, 
		RULE_printing_statement = 10, RULE_print_statement = 11, RULE_println_statement = 12, 
		RULE_printf_statement = 13, RULE_method_call = 14, RULE_function_call = 15, 
		RULE_pass_statement = 16, RULE_return_statement = 17, RULE_expression = 18, 
		RULE_logical_expression = 19, RULE_arithmetic_expression = 20, RULE_single_expression = 21, 
		RULE_logical_operator = 22, RULE_and = 23, RULE_or = 24, RULE_xor = 25, 
		RULE_not = 26, RULE_single_declaration = 27, RULE_block_declaration = 28, 
		RULE_variable_declaration = 29, RULE_container_declaration = 30, RULE_function_definition = 31, 
		RULE_id = 32, RULE_constant = 33, RULE_char_literal = 34, RULE_bool_literal = 35, 
		RULE_null_literal = 36, RULE_comparator = 37, RULE_equal = 38, RULE_not_equal = 39, 
		RULE_greater = 40, RULE_lesser = 41, RULE_greater_equal = 42, RULE_lesser_equal = 43, 
		RULE_data_type = 44, RULE_integer = 45, RULE_double = 46, RULE_char = 47, 
		RULE_string = 48, RULE_bool = 49, RULE_float = 50, RULE_void = 51, RULE_container_type = 52, 
		RULE_stack = 53, RULE_queue = 54, RULE_deque = 55, RULE_assign_statement = 56, 
		RULE_assign_operator = 57, RULE_add_assign = 58, RULE_sub_assign = 59, 
		RULE_mul_assign = 60, RULE_div_assign = 61, RULE_mod_assign = 62, RULE_increment = 63, 
		RULE_decrement = 64, RULE_assign = 65, RULE_arith_operator = 66, RULE_add = 67, 
		RULE_sub = 68, RULE_mul = 69, RULE_div = 70, RULE_mod = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "block_statement", "single_statement", "if_statement", 
			"loop_statement", "for_statement", "while_statement", "for_range_statement", 
			"for_each_statement", "printing_statement", "print_statement", "println_statement", 
			"printf_statement", "method_call", "function_call", "pass_statement", 
			"return_statement", "expression", "logical_expression", "arithmetic_expression", 
			"single_expression", "logical_operator", "and", "or", "xor", "not", "single_declaration", 
			"block_declaration", "variable_declaration", "container_declaration", 
			"function_definition", "id", "constant", "char_literal", "bool_literal", 
			"null_literal", "comparator", "equal", "not_equal", "greater", "lesser", 
			"greater_equal", "lesser_equal", "data_type", "integer", "double", "char", 
			"string", "bool", "float", "void", "container_type", "stack", "queue", 
			"deque", "assign_statement", "assign_operator", "add_assign", "sub_assign", 
			"mul_assign", "div_assign", "mod_assign", "increment", "decrement", "assign", 
			"arith_operator", "add", "sub", "mul", "div", "mod"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'END'", "'IF'", "':'", "'ELIF'", "'ELSE'", "'WHILE'", "'FOR'", 
			"'IN RANGE('", "','", "')'", "'IN'", "'PRINT'", "'('", "'PRINTLN'", "'PRINTF'", 
			"'.'", "'PASS'", "'RETURN'", "'['", "']'", "'AND'", "'OR'", "'XOR'", 
			"'NOT'", "'<'", "'>'", "'DEF'", "'''", "'true'", "'false'", "'null'", 
			"'=='", "'!='", "'>='", "'<='", "'int'", "'double'", "'char'", "'string'", 
			"'bool'", "'float'", "'void'", "'STACK'", "'QUEUE'", "'DEQUE'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'++'", "'--'", "'='", "'+'", "'-'", 
			"'*'", "'/'", "'%'"
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
			"Id_literal", "Integer_literal", "Floating_point_literal", "String_literal", 
			"ESCAPE_SEQUENCE", "White_spaces", "Comment", "Line_comment"
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
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903807689096L) != 0)) {
				{
				{
				setState(144);
				statement();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
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
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__14:
			case T__15:
			case T__17:
			case T__18:
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
				setState(152);
				single_statement();
				setState(153);
				match(T__0);
				}
				break;
			case T__2:
			case T__6:
			case T__7:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				block_statement();
				setState(156);
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
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				if_statement();
				}
				break;
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				loop_statement();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
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
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Pass_statementContext pass_statement() {
			return getRuleContext(Pass_statementContext.class,0);
		}
		public Printing_statementContext printing_statement() {
			return getRuleContext(Printing_statementContext.class,0);
		}
		public Single_declarationContext single_declaration() {
			return getRuleContext(Single_declarationContext.class,0);
		}
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				return_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				pass_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				printing_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				single_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				assign_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				method_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
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
	public static class If_statementContext extends ParserRuleContext {
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
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
			setState(174);
			match(T__2);
			setState(175);
			logical_expression(0);
			setState(176);
			match(T__3);
			setState(178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(177);
				statement();
				}
				}
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903807689096L) != 0) );
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(182);
				match(T__4);
				setState(183);
				logical_expression(0);
				setState(184);
				match(T__3);
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(185);
					statement();
					}
					}
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903807689096L) != 0) );
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(195);
				match(T__5);
				setState(196);
				match(T__3);
				setState(198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(197);
					statement();
					}
					}
					setState(200); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903807689096L) != 0) );
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
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				while_statement();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				for_range_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
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
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
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
			setState(212);
			match(T__6);
			setState(213);
			logical_expression(0);
			setState(214);
			match(T__3);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				statement();
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903807689096L) != 0) );
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			setState(220);
			match(T__7);
			setState(221);
			id();
			setState(222);
			match(T__8);
			setState(223);
			expression();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(224);
					match(T__9);
					setState(225);
					expression();
					}
					break;
				}
				setState(228);
				match(T__9);
				setState(229);
				expression();
				}
			}

			setState(232);
			match(T__10);
			setState(233);
			match(T__3);
			setState(235); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(234);
				statement();
				}
				}
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903807689096L) != 0) );
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
			setState(239);
			match(T__7);
			setState(240);
			id();
			setState(241);
			match(T__11);
			setState(242);
			id();
			setState(243);
			match(T__3);
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(244);
				statement();
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903807689096L) != 0) );
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
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				print_statement();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				println_statement();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
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
			setState(254);
			match(T__12);
			setState(255);
			match(T__13);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921496520212480L) != 0)) {
				{
				setState(256);
				expression();
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(257);
					match(T__9);
					setState(258);
					expression();
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(266);
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
			setState(268);
			match(T__14);
			setState(269);
			match(T__13);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921496520212480L) != 0)) {
				{
				setState(270);
				expression();
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(271);
					match(T__9);
					setState(272);
					expression();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(280);
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
		public TerminalNode String_literal() { return getToken(GrammarParser.String_literal, 0); }
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
			setState(282);
			match(T__15);
			setState(283);
			match(T__13);
			setState(284);
			match(String_literal);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(285);
				match(T__9);
				setState(286);
				expression();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
			setState(294);
			id();
			setState(295);
			match(T__16);
			setState(296);
			id();
			setState(297);
			match(T__13);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921496520212480L) != 0)) {
				{
				setState(298);
				expression();
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(299);
					match(T__9);
					setState(300);
					expression();
					}
					}
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(308);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			setState(310);
			id();
			setState(311);
			match(T__13);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921496520212480L) != 0)) {
				{
				setState(312);
				expression();
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(313);
					match(T__9);
					setState(314);
					expression();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(322);
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
			setState(324);
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
			setState(326);
			match(T__18);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -1152921496520212480L) != 0)) {
				{
				setState(327);
				expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public Single_expressionContext single_expression() {
			return getRuleContext(Single_expressionContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				single_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				arithmetic_expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				logical_expression(0);
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
	public static class Logical_expressionContext extends ParserRuleContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public Single_expressionContext single_expression() {
			return getRuleContext(Single_expressionContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		return logical_expression(0);
	}

	private Logical_expressionContext logical_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, _parentState);
		Logical_expressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_logical_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(336);
				not();
				setState(337);
				logical_expression(4);
				}
				break;
			case 2:
				{
				setState(339);
				match(T__13);
				setState(340);
				logical_expression(0);
				setState(341);
				match(T__10);
				}
				break;
			case 3:
				{
				setState(343);
				single_expression();
				}
				break;
			case 4:
				{
				setState(344);
				arithmetic_expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(355);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(347);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(348);
						logical_operator();
						setState(349);
						logical_expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Logical_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(351);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(352);
						comparator();
						setState(353);
						logical_expression(6);
						}
						break;
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public Single_expressionContext single_expression() {
			return getRuleContext(Single_expressionContext.class,0);
		}
		public Arith_operatorContext arith_operator() {
			return getRuleContext(Arith_operatorContext.class,0);
		}
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		return arithmetic_expression(0);
	}

	private Arithmetic_expressionContext arithmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, _parentState);
		Arithmetic_expressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_arithmetic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(361);
				match(T__13);
				setState(362);
				arithmetic_expression(0);
				setState(363);
				match(T__10);
				}
				break;
			case 2:
				{
				setState(365);
				single_expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Arithmetic_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
					setState(368);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(369);
					arith_operator();
					setState(370);
					arithmetic_expression(4);
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
	public static class Single_expressionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Single_expressionContext single_expression() {
			return getRuleContext(Single_expressionContext.class,0);
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
		public Single_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_expression; }
	}

	public final Single_expressionContext single_expression() throws RecognitionException {
		Single_expressionContext _localctx = new Single_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_single_expression);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				id();
				setState(379);
				match(T__19);
				setState(380);
				arithmetic_expression(0);
				setState(381);
				match(T__20);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				match(T__13);
				setState(384);
				single_expression();
				setState(385);
				match(T__10);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				constant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				method_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
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
	public static class Logical_operatorContext extends ParserRuleContext {
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public XorContext xor() {
			return getRuleContext(XorContext.class,0);
		}
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_logical_operator);
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				and();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				or();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				xor();
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
	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
	public static class XorContext extends ParserRuleContext {
		public XorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor; }
	}

	public final XorContext xor() throws RecognitionException {
		XorContext _localctx = new XorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_xor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__23);
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
	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
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
		enterRule(_localctx, 54, RULE_single_declaration);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
			case T__44:
			case T__45:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
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
				setState(406);
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
		enterRule(_localctx, 56, RULE_block_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
		enterRule(_localctx, 58, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			data_type();
			setState(412);
			id();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(413);
				assign();
				setState(414);
				expression();
				}
			}

			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(418);
				match(T__9);
				setState(419);
				id();
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__53) {
					{
					setState(420);
					assign();
					setState(421);
					expression();
					}
				}

				}
				}
				setState(429);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Container_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container_declaration; }
	}

	public final Container_declarationContext container_declaration() throws RecognitionException {
		Container_declarationContext _localctx = new Container_declarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_container_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			container_type();
			setState(431);
			match(T__25);
			setState(432);
			data_type();
			setState(433);
			match(T__26);
			setState(434);
			id();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(435);
				match(T__9);
				setState(436);
				id();
				}
				}
				setState(441);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_function_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(T__27);
			setState(443);
			data_type();
			setState(444);
			id();
			setState(445);
			match(T__13);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17454747090944L) != 0)) {
				{
				setState(446);
				data_type();
				setState(447);
				id();
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(448);
					match(T__9);
					setState(449);
					data_type();
					setState(450);
					id();
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(459);
			match(T__10);
			setState(460);
			match(T__3);
			setState(462); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(461);
				statement();
				}
				}
				setState(464); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1166572903807689096L) != 0) );
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode Id_literal() { return getToken(GrammarParser.Id_literal, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(Id_literal);
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
		public TerminalNode String_literal() { return getToken(GrammarParser.String_literal, 0); }
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
		enterRule(_localctx, 66, RULE_constant);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				match(Integer_literal);
				}
				break;
			case Floating_point_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				match(Floating_point_literal);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(470);
				char_literal();
				}
				break;
			case String_literal:
				enterOuterAlt(_localctx, 4);
				{
				setState(471);
				match(String_literal);
				}
				break;
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 5);
				{
				setState(472);
				bool_literal();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 6);
				{
				setState(473);
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
		enterRule(_localctx, 68, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__28);
			setState(477);
			matchWildcard();
			setState(478);
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
	public static class Bool_literalContext extends ParserRuleContext {
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
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
		enterRule(_localctx, 72, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
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
		enterRule(_localctx, 74, RULE_comparator);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				equal();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				not_equal();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				greater();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				lesser();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				greater_equal();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 6);
				{
				setState(489);
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
		enterRule(_localctx, 76, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
		enterRule(_localctx, 78, RULE_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
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
		enterRule(_localctx, 80, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
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
	public static class LesserContext extends ParserRuleContext {
		public LesserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser; }
	}

	public final LesserContext lesser() throws RecognitionException {
		LesserContext _localctx = new LesserContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lesser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
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
	public static class Greater_equalContext extends ParserRuleContext {
		public Greater_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater_equal; }
	}

	public final Greater_equalContext greater_equal() throws RecognitionException {
		Greater_equalContext _localctx = new Greater_equalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_greater_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
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
		enterRule(_localctx, 86, RULE_lesser_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
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
		enterRule(_localctx, 88, RULE_data_type);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				integer();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				double_();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				char_();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(507);
				string();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 5);
				{
				setState(508);
				bool();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
				float_();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 7);
				{
				setState(510);
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
		enterRule(_localctx, 90, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
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
		enterRule(_localctx, 92, RULE_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
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
		enterRule(_localctx, 94, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
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
		enterRule(_localctx, 96, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
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
		enterRule(_localctx, 98, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
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
		enterRule(_localctx, 100, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
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
		enterRule(_localctx, 102, RULE_void);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
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
		enterRule(_localctx, 104, RULE_container_type);
		try {
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				stack();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				deque();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
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
		enterRule(_localctx, 106, RULE_stack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
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
		enterRule(_localctx, 108, RULE_queue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
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
		enterRule(_localctx, 110, RULE_deque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
		enterRule(_localctx, 112, RULE_assign_statement);
		try {
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				id();
				setState(539);
				assign_operator();
				setState(540);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				id();
				setState(543);
				increment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				id();
				setState(546);
				decrement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(548);
				increment();
				setState(549);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(551);
				decrement();
				setState(552);
				id();
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
		enterRule(_localctx, 114, RULE_assign_operator);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				add_assign();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				sub_assign();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				mul_assign();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 4);
				{
				setState(559);
				div_assign();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 5);
				{
				setState(560);
				mod_assign();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 6);
				{
				setState(561);
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
		enterRule(_localctx, 116, RULE_add_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
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
		enterRule(_localctx, 118, RULE_sub_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
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
		enterRule(_localctx, 120, RULE_mul_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
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
		enterRule(_localctx, 122, RULE_div_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
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
		enterRule(_localctx, 124, RULE_mod_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
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
		enterRule(_localctx, 126, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
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
		enterRule(_localctx, 128, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		enterRule(_localctx, 130, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
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
		public Arith_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_operator; }
	}

	public final Arith_operatorContext arith_operator() throws RecognitionException {
		Arith_operatorContext _localctx = new Arith_operatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_arith_operator);
		try {
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				add();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				sub();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				mul();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 4);
				{
				setState(583);
				div();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 5);
				{
				setState(584);
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
		enterRule(_localctx, 134, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
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
		enterRule(_localctx, 136, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
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
		enterRule(_localctx, 138, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
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
		enterRule(_localctx, 140, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
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
		enterRule(_localctx, 142, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
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
		case 19:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		case 20:
			return arithmetic_expression_sempred((Arithmetic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean arithmetic_expression_sempred(Arithmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u0256\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0001\u0000\u0005\u0000\u0092\b\u0000\n\u0000\f"+
		"\u0000\u0095\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u009f\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a4\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00ad\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004"+
		"\u0004\u00b3\b\u0004\u000b\u0004\f\u0004\u00b4\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004\u00bb\b\u0004\u000b\u0004\f\u0004"+
		"\u00bc\u0005\u0004\u00bf\b\u0004\n\u0004\f\u0004\u00c2\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0004\u0004\u00c7\b\u0004\u000b\u0004\f\u0004"+
		"\u00c8\u0003\u0004\u00cb\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\u00cf"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00d3\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00d9\b\u0007\u000b\u0007"+
		"\f\u0007\u00da\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u00e3\b\b\u0001\b\u0001\b\u0003\b\u00e7\b\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u00ec\b\b\u000b\b\f\b\u00ed\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0004\t\u00f6\b\t\u000b\t\f\t\u00f7\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00fd\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0104\b\u000b\n\u000b\f\u000b\u0107\t\u000b\u0003\u000b\u0109"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0112\b\f\n\f\f\f\u0115\t\f\u0003\f\u0117\b\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0120\b\r\n\r\f\r\u0123"+
		"\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u012e\b\u000e\n\u000e\f\u000e"+
		"\u0131\t\u000e\u0003\u000e\u0133\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u013c"+
		"\b\u000f\n\u000f\f\u000f\u013f\t\u000f\u0003\u000f\u0141\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0149\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u014e"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u015a"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0164\b\u0013\n\u0013\f\u0013"+
		"\u0167\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u016f\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0175\b\u0014\n\u0014\f\u0014\u0178\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0187\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u018c\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0198\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a1\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a8\b\u001d\u0005"+
		"\u001d\u01aa\b\u001d\n\u001d\f\u001d\u01ad\t\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e"+
		"\u01b6\b\u001e\n\u001e\f\u001e\u01b9\t\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01c5\b\u001f\n\u001f\f\u001f\u01c8\t\u001f"+
		"\u0003\u001f\u01ca\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0004\u001f"+
		"\u01cf\b\u001f\u000b\u001f\f\u001f\u01d0\u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u01db\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u01eb\b%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u0200\b,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u0001"+
		"0\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u00014\u00014\u0001"+
		"4\u00034\u0213\b4\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00038\u022b\b8\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00039\u0233\b9\u0001:\u0001:\u0001;\u0001;\u0001<\u0001"+
		"<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001"+
		"A\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u024a\bB\u0001C\u0001C\u0001"+
		"D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0001G\u0000\u0002"+
		"&(H\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0000\u0001\u0001\u0000\u001e"+
		"\u001f\u0266\u0000\u0093\u0001\u0000\u0000\u0000\u0002\u009e\u0001\u0000"+
		"\u0000\u0000\u0004\u00a3\u0001\u0000\u0000\u0000\u0006\u00ac\u0001\u0000"+
		"\u0000\u0000\b\u00ae\u0001\u0000\u0000\u0000\n\u00ce\u0001\u0000\u0000"+
		"\u0000\f\u00d2\u0001\u0000\u0000\u0000\u000e\u00d4\u0001\u0000\u0000\u0000"+
		"\u0010\u00dc\u0001\u0000\u0000\u0000\u0012\u00ef\u0001\u0000\u0000\u0000"+
		"\u0014\u00fc\u0001\u0000\u0000\u0000\u0016\u00fe\u0001\u0000\u0000\u0000"+
		"\u0018\u010c\u0001\u0000\u0000\u0000\u001a\u011a\u0001\u0000\u0000\u0000"+
		"\u001c\u0126\u0001\u0000\u0000\u0000\u001e\u0136\u0001\u0000\u0000\u0000"+
		" \u0144\u0001\u0000\u0000\u0000\"\u0146\u0001\u0000\u0000\u0000$\u014d"+
		"\u0001\u0000\u0000\u0000&\u0159\u0001\u0000\u0000\u0000(\u016e\u0001\u0000"+
		"\u0000\u0000*\u0186\u0001\u0000\u0000\u0000,\u018b\u0001\u0000\u0000\u0000"+
		".\u018d\u0001\u0000\u0000\u00000\u018f\u0001\u0000\u0000\u00002\u0191"+
		"\u0001\u0000\u0000\u00004\u0193\u0001\u0000\u0000\u00006\u0197\u0001\u0000"+
		"\u0000\u00008\u0199\u0001\u0000\u0000\u0000:\u019b\u0001\u0000\u0000\u0000"+
		"<\u01ae\u0001\u0000\u0000\u0000>\u01ba\u0001\u0000\u0000\u0000@\u01d2"+
		"\u0001\u0000\u0000\u0000B\u01da\u0001\u0000\u0000\u0000D\u01dc\u0001\u0000"+
		"\u0000\u0000F\u01e0\u0001\u0000\u0000\u0000H\u01e2\u0001\u0000\u0000\u0000"+
		"J\u01ea\u0001\u0000\u0000\u0000L\u01ec\u0001\u0000\u0000\u0000N\u01ee"+
		"\u0001\u0000\u0000\u0000P\u01f0\u0001\u0000\u0000\u0000R\u01f2\u0001\u0000"+
		"\u0000\u0000T\u01f4\u0001\u0000\u0000\u0000V\u01f6\u0001\u0000\u0000\u0000"+
		"X\u01ff\u0001\u0000\u0000\u0000Z\u0201\u0001\u0000\u0000\u0000\\\u0203"+
		"\u0001\u0000\u0000\u0000^\u0205\u0001\u0000\u0000\u0000`\u0207\u0001\u0000"+
		"\u0000\u0000b\u0209\u0001\u0000\u0000\u0000d\u020b\u0001\u0000\u0000\u0000"+
		"f\u020d\u0001\u0000\u0000\u0000h\u0212\u0001\u0000\u0000\u0000j\u0214"+
		"\u0001\u0000\u0000\u0000l\u0216\u0001\u0000\u0000\u0000n\u0218\u0001\u0000"+
		"\u0000\u0000p\u022a\u0001\u0000\u0000\u0000r\u0232\u0001\u0000\u0000\u0000"+
		"t\u0234\u0001\u0000\u0000\u0000v\u0236\u0001\u0000\u0000\u0000x\u0238"+
		"\u0001\u0000\u0000\u0000z\u023a\u0001\u0000\u0000\u0000|\u023c\u0001\u0000"+
		"\u0000\u0000~\u023e\u0001\u0000\u0000\u0000\u0080\u0240\u0001\u0000\u0000"+
		"\u0000\u0082\u0242\u0001\u0000\u0000\u0000\u0084\u0249\u0001\u0000\u0000"+
		"\u0000\u0086\u024b\u0001\u0000\u0000\u0000\u0088\u024d\u0001\u0000\u0000"+
		"\u0000\u008a\u024f\u0001\u0000\u0000\u0000\u008c\u0251\u0001\u0000\u0000"+
		"\u0000\u008e\u0253\u0001\u0000\u0000\u0000\u0090\u0092\u0003\u0002\u0001"+
		"\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u0000\u0000\u0001\u0097\u0001\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0003\u0006\u0003\u0000\u0099\u009a\u0005\u0001\u0000"+
		"\u0000\u009a\u009f\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u0004\u0002"+
		"\u0000\u009c\u009d\u0005\u0002\u0000\u0000\u009d\u009f\u0001\u0000\u0000"+
		"\u0000\u009e\u0098\u0001\u0000\u0000\u0000\u009e\u009b\u0001\u0000\u0000"+
		"\u0000\u009f\u0003\u0001\u0000\u0000\u0000\u00a0\u00a4\u0003\b\u0004\u0000"+
		"\u00a1\u00a4\u0003\n\u0005\u0000\u00a2\u00a4\u00038\u001c\u0000\u00a3"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u0005\u0001\u0000\u0000\u0000\u00a5"+
		"\u00ad\u0003\"\u0011\u0000\u00a6\u00ad\u0003 \u0010\u0000\u00a7\u00ad"+
		"\u0003\u0014\n\u0000\u00a8\u00ad\u00036\u001b\u0000\u00a9\u00ad\u0003"+
		"p8\u0000\u00aa\u00ad\u0003\u001c\u000e\u0000\u00ab\u00ad\u0003\u001e\u000f"+
		"\u0000\u00ac\u00a5\u0001\u0000\u0000\u0000\u00ac\u00a6\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a7\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u0007\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005\u0003\u0000\u0000\u00af\u00b0\u0003&\u0013\u0000"+
		"\u00b0\u00b2\u0005\u0004\u0000\u0000\u00b1\u00b3\u0003\u0002\u0001\u0000"+
		"\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b5\u00c0\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0005\u0000\u0000"+
		"\u00b7\u00b8\u0003&\u0013\u0000\u00b8\u00ba\u0005\u0004\u0000\u0000\u00b9"+
		"\u00bb\u0003\u0002\u0001\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be"+
		"\u00b6\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0005\u0006\u0000\u0000\u00c4\u00c6\u0005\u0004\u0000\u0000\u00c5"+
		"\u00c7\u0003\u0002\u0001\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c3\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\t\u0001\u0000\u0000\u0000\u00cc\u00cf\u0003\u000e\u0007\u0000\u00cd\u00cf"+
		"\u0003\f\u0006\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cf\u000b\u0001\u0000\u0000\u0000\u00d0\u00d3\u0003"+
		"\u0010\b\u0000\u00d1\u00d3\u0003\u0012\t\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\r\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005\u0007\u0000\u0000\u00d5\u00d6\u0003&\u0013\u0000"+
		"\u00d6\u00d8\u0005\u0004\u0000\u0000\u00d7\u00d9\u0003\u0002\u0001\u0000"+
		"\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u000f\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\b\u0000\u0000\u00dd"+
		"\u00de\u0003@ \u0000\u00de\u00df\u0005\t\u0000\u0000\u00df\u00e6\u0003"+
		"$\u0012\u0000\u00e0\u00e1\u0005\n\u0000\u0000\u00e1\u00e3\u0003$\u0012"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\n\u0000\u0000"+
		"\u00e5\u00e7\u0003$\u0012\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\u000b\u0000\u0000\u00e9\u00eb\u0005\u0004\u0000\u0000\u00ea"+
		"\u00ec\u0003\u0002\u0001\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee\u0011\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005\b\u0000\u0000\u00f0\u00f1\u0003@ \u0000\u00f1\u00f2\u0005"+
		"\f\u0000\u0000\u00f2\u00f3\u0003@ \u0000\u00f3\u00f5\u0005\u0004\u0000"+
		"\u0000\u00f4\u00f6\u0003\u0002\u0001\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u0013\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fd\u0003\u0016\u000b\u0000\u00fa\u00fd\u0003\u0018\f\u0000"+
		"\u00fb\u00fd\u0003\u001a\r\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u0015\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\r\u0000\u0000\u00ff\u0108"+
		"\u0005\u000e\u0000\u0000\u0100\u0105\u0003$\u0012\u0000\u0101\u0102\u0005"+
		"\n\u0000\u0000\u0102\u0104\u0003$\u0012\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0100\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0005\u000b\u0000\u0000\u010b\u0017\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005\u000f\u0000\u0000\u010d\u0116\u0005\u000e"+
		"\u0000\u0000\u010e\u0113\u0003$\u0012\u0000\u010f\u0110\u0005\n\u0000"+
		"\u0000\u0110\u0112\u0003$\u0012\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u010e\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0005\u000b\u0000\u0000\u0119\u0019\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005\u0010\u0000\u0000\u011b\u011c\u0005\u000e\u0000\u0000"+
		"\u011c\u0121\u0005?\u0000\u0000\u011d\u011e\u0005\n\u0000\u0000\u011e"+
		"\u0120\u0003$\u0012\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0123"+
		"\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u000b\u0000\u0000\u0125\u001b"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0003@ \u0000\u0127\u0128\u0005\u0011"+
		"\u0000\u0000\u0128\u0129\u0003@ \u0000\u0129\u0132\u0005\u000e\u0000\u0000"+
		"\u012a\u012f\u0003$\u0012\u0000\u012b\u012c\u0005\n\u0000\u0000\u012c"+
		"\u012e\u0003$\u0012\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u0131"+
		"\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f"+
		"\u0001\u0000\u0000\u0000\u0132\u012a\u0001\u0000\u0000\u0000\u0132\u0133"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0005\u000b\u0000\u0000\u0135\u001d\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0003@ \u0000\u0137\u0140\u0005\u000e\u0000\u0000\u0138\u013d\u0003$"+
		"\u0012\u0000\u0139\u013a\u0005\n\u0000\u0000\u013a\u013c\u0003$\u0012"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000"+
		"\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000"+
		"\u0000\u0140\u0138\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000"+
		"\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u000b\u0000"+
		"\u0000\u0143\u001f\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u0012\u0000"+
		"\u0000\u0145!\u0001\u0000\u0000\u0000\u0146\u0148\u0005\u0013\u0000\u0000"+
		"\u0147\u0149\u0003$\u0012\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149#\u0001\u0000\u0000\u0000\u014a\u014e"+
		"\u0003*\u0015\u0000\u014b\u014e\u0003(\u0014\u0000\u014c\u014e\u0003&"+
		"\u0013\u0000\u014d\u014a\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e%\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0006\u0013\uffff\uffff\u0000\u0150\u0151\u00034\u001a"+
		"\u0000\u0151\u0152\u0003&\u0013\u0004\u0152\u015a\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0005\u000e\u0000\u0000\u0154\u0155\u0003&\u0013\u0000\u0155"+
		"\u0156\u0005\u000b\u0000\u0000\u0156\u015a\u0001\u0000\u0000\u0000\u0157"+
		"\u015a\u0003*\u0015\u0000\u0158\u015a\u0003(\u0014\u0000\u0159\u014f\u0001"+
		"\u0000\u0000\u0000\u0159\u0153\u0001\u0000\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u0165\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\n\u0006\u0000\u0000\u015c\u015d\u0003,"+
		"\u0016\u0000\u015d\u015e\u0003&\u0013\u0007\u015e\u0164\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\n\u0005\u0000\u0000\u0160\u0161\u0003J%\u0000\u0161"+
		"\u0162\u0003&\u0013\u0006\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u015b"+
		"\u0001\u0000\u0000\u0000\u0163\u015f\u0001\u0000\u0000\u0000\u0164\u0167"+
		"\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\'\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0006\u0014\uffff\uffff\u0000\u0169\u016a"+
		"\u0005\u000e\u0000\u0000\u016a\u016b\u0003(\u0014\u0000\u016b\u016c\u0005"+
		"\u000b\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u016f\u0003"+
		"*\u0015\u0000\u016e\u0168\u0001\u0000\u0000\u0000\u016e\u016d\u0001\u0000"+
		"\u0000\u0000\u016f\u0176\u0001\u0000\u0000\u0000\u0170\u0171\n\u0003\u0000"+
		"\u0000\u0171\u0172\u0003\u0084B\u0000\u0172\u0173\u0003(\u0014\u0004\u0173"+
		"\u0175\u0001\u0000\u0000\u0000\u0174\u0170\u0001\u0000\u0000\u0000\u0175"+
		"\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176"+
		"\u0177\u0001\u0000\u0000\u0000\u0177)\u0001\u0000\u0000\u0000\u0178\u0176"+
		"\u0001\u0000\u0000\u0000\u0179\u0187\u0003@ \u0000\u017a\u017b\u0003@"+
		" \u0000\u017b\u017c\u0005\u0014\u0000\u0000\u017c\u017d\u0003(\u0014\u0000"+
		"\u017d\u017e\u0005\u0015\u0000\u0000\u017e\u0187\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005\u000e\u0000\u0000\u0180\u0181\u0003*\u0015\u0000\u0181"+
		"\u0182\u0005\u000b\u0000\u0000\u0182\u0187\u0001\u0000\u0000\u0000\u0183"+
		"\u0187\u0003B!\u0000\u0184\u0187\u0003\u001c\u000e\u0000\u0185\u0187\u0003"+
		"\u001e\u000f\u0000\u0186\u0179\u0001\u0000\u0000\u0000\u0186\u017a\u0001"+
		"\u0000\u0000\u0000\u0186\u017f\u0001\u0000\u0000\u0000\u0186\u0183\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001"+
		"\u0000\u0000\u0000\u0187+\u0001\u0000\u0000\u0000\u0188\u018c\u0003.\u0017"+
		"\u0000\u0189\u018c\u00030\u0018\u0000\u018a\u018c\u00032\u0019\u0000\u018b"+
		"\u0188\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b"+
		"\u018a\u0001\u0000\u0000\u0000\u018c-\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0005\u0016\u0000\u0000\u018e/\u0001\u0000\u0000\u0000\u018f\u0190\u0005"+
		"\u0017\u0000\u0000\u01901\u0001\u0000\u0000\u0000\u0191\u0192\u0005\u0018"+
		"\u0000\u0000\u01923\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u0019\u0000"+
		"\u0000\u01945\u0001\u0000\u0000\u0000\u0195\u0198\u0003<\u001e\u0000\u0196"+
		"\u0198\u0003:\u001d\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u01987\u0001\u0000\u0000\u0000\u0199\u019a\u0003"+
		">\u001f\u0000\u019a9\u0001\u0000\u0000\u0000\u019b\u019c\u0003X,\u0000"+
		"\u019c\u01a0\u0003@ \u0000\u019d\u019e\u0003\u0082A\u0000\u019e\u019f"+
		"\u0003$\u0012\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0\u019d\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01ab\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0005\n\u0000\u0000\u01a3\u01a7\u0003@"+
		" \u0000\u01a4\u01a5\u0003\u0082A\u0000\u01a5\u01a6\u0003$\u0012\u0000"+
		"\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a2\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000"+
		"\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac;\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae"+
		"\u01af\u0003h4\u0000\u01af\u01b0\u0005\u001a\u0000\u0000\u01b0\u01b1\u0003"+
		"X,\u0000\u01b1\u01b2\u0005\u001b\u0000\u0000\u01b2\u01b7\u0003@ \u0000"+
		"\u01b3\u01b4\u0005\n\u0000\u0000\u01b4\u01b6\u0003@ \u0000\u01b5\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8=\u0001"+
		"\u0000\u0000\u0000\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005"+
		"\u001c\u0000\u0000\u01bb\u01bc\u0003X,\u0000\u01bc\u01bd\u0003@ \u0000"+
		"\u01bd\u01c9\u0005\u000e\u0000\u0000\u01be\u01bf\u0003X,\u0000\u01bf\u01c6"+
		"\u0003@ \u0000\u01c0\u01c1\u0005\n\u0000\u0000\u01c1\u01c2\u0003X,\u0000"+
		"\u01c2\u01c3\u0003@ \u0000\u01c3\u01c5\u0001\u0000\u0000\u0000\u01c4\u01c0"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7\u01ca"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c9\u01be"+
		"\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005\u000b\u0000\u0000\u01cc\u01ce"+
		"\u0005\u0004\u0000\u0000\u01cd\u01cf\u0003\u0002\u0001\u0000\u01ce\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1?\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0005<\u0000\u0000\u01d3A\u0001\u0000\u0000"+
		"\u0000\u01d4\u01db\u0005=\u0000\u0000\u01d5\u01db\u0005>\u0000\u0000\u01d6"+
		"\u01db\u0003D\"\u0000\u01d7\u01db\u0005?\u0000\u0000\u01d8\u01db\u0003"+
		"F#\u0000\u01d9\u01db\u0003H$\u0000\u01da\u01d4\u0001\u0000\u0000\u0000"+
		"\u01da\u01d5\u0001\u0000\u0000\u0000\u01da\u01d6\u0001\u0000\u0000\u0000"+
		"\u01da\u01d7\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000"+
		"\u01da\u01d9\u0001\u0000\u0000\u0000\u01dbC\u0001\u0000\u0000\u0000\u01dc"+
		"\u01dd\u0005\u001d\u0000\u0000\u01dd\u01de\t\u0000\u0000\u0000\u01de\u01df"+
		"\u0005\u001d\u0000\u0000\u01dfE\u0001\u0000\u0000\u0000\u01e0\u01e1\u0007"+
		"\u0000\u0000\u0000\u01e1G\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005 \u0000"+
		"\u0000\u01e3I\u0001\u0000\u0000\u0000\u01e4\u01eb\u0003L&\u0000\u01e5"+
		"\u01eb\u0003N\'\u0000\u01e6\u01eb\u0003P(\u0000\u01e7\u01eb\u0003R)\u0000"+
		"\u01e8\u01eb\u0003T*\u0000\u01e9\u01eb\u0003V+\u0000\u01ea\u01e4\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e5\u0001\u0000\u0000\u0000\u01ea\u01e6\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e7\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ebK\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0005!\u0000\u0000\u01edM\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ef\u0005\"\u0000\u0000\u01efO\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f1\u0005\u001b\u0000\u0000\u01f1Q\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0005\u001a\u0000\u0000\u01f3S\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005"+
		"#\u0000\u0000\u01f5U\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005$\u0000"+
		"\u0000\u01f7W\u0001\u0000\u0000\u0000\u01f8\u0200\u0003Z-\u0000\u01f9"+
		"\u0200\u0003\\.\u0000\u01fa\u0200\u0003^/\u0000\u01fb\u0200\u0003`0\u0000"+
		"\u01fc\u0200\u0003b1\u0000\u01fd\u0200\u0003d2\u0000\u01fe\u0200\u0003"+
		"f3\u0000\u01ff\u01f8\u0001\u0000\u0000\u0000\u01ff\u01f9\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fa\u0001\u0000\u0000\u0000\u01ff\u01fb\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fc\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000"+
		"\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200Y\u0001\u0000\u0000\u0000"+
		"\u0201\u0202\u0005%\u0000\u0000\u0202[\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0005&\u0000\u0000\u0204]\u0001\u0000\u0000\u0000\u0205\u0206\u0005\'"+
		"\u0000\u0000\u0206_\u0001\u0000\u0000\u0000\u0207\u0208\u0005(\u0000\u0000"+
		"\u0208a\u0001\u0000\u0000\u0000\u0209\u020a\u0005)\u0000\u0000\u020ac"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\u0005*\u0000\u0000\u020ce\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0005+\u0000\u0000\u020eg\u0001\u0000\u0000\u0000"+
		"\u020f\u0213\u0003j5\u0000\u0210\u0213\u0003n7\u0000\u0211\u0213\u0003"+
		"l6\u0000\u0212\u020f\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000"+
		"\u0000\u0212\u0211\u0001\u0000\u0000\u0000\u0213i\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0005,\u0000\u0000\u0215k\u0001\u0000\u0000\u0000\u0216\u0217"+
		"\u0005-\u0000\u0000\u0217m\u0001\u0000\u0000\u0000\u0218\u0219\u0005."+
		"\u0000\u0000\u0219o\u0001\u0000\u0000\u0000\u021a\u021b\u0003@ \u0000"+
		"\u021b\u021c\u0003r9\u0000\u021c\u021d\u0003$\u0012\u0000\u021d\u022b"+
		"\u0001\u0000\u0000\u0000\u021e\u021f\u0003@ \u0000\u021f\u0220\u0003~"+
		"?\u0000\u0220\u022b\u0001\u0000\u0000\u0000\u0221\u0222\u0003@ \u0000"+
		"\u0222\u0223\u0003\u0080@\u0000\u0223\u022b\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0003~?\u0000\u0225\u0226\u0003@ \u0000\u0226\u022b\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0003\u0080@\u0000\u0228\u0229\u0003@ \u0000"+
		"\u0229\u022b\u0001\u0000\u0000\u0000\u022a\u021a\u0001\u0000\u0000\u0000"+
		"\u022a\u021e\u0001\u0000\u0000\u0000\u022a\u0221\u0001\u0000\u0000\u0000"+
		"\u022a\u0224\u0001\u0000\u0000\u0000\u022a\u0227\u0001\u0000\u0000\u0000"+
		"\u022bq\u0001\u0000\u0000\u0000\u022c\u0233\u0003t:\u0000\u022d\u0233"+
		"\u0003v;\u0000\u022e\u0233\u0003x<\u0000\u022f\u0233\u0003z=\u0000\u0230"+
		"\u0233\u0003|>\u0000\u0231\u0233\u0003\u0082A\u0000\u0232\u022c\u0001"+
		"\u0000\u0000\u0000\u0232\u022d\u0001\u0000\u0000\u0000\u0232\u022e\u0001"+
		"\u0000\u0000\u0000\u0232\u022f\u0001\u0000\u0000\u0000\u0232\u0230\u0001"+
		"\u0000\u0000\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0233s\u0001\u0000"+
		"\u0000\u0000\u0234\u0235\u0005/\u0000\u0000\u0235u\u0001\u0000\u0000\u0000"+
		"\u0236\u0237\u00050\u0000\u0000\u0237w\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u00051\u0000\u0000\u0239y\u0001\u0000\u0000\u0000\u023a\u023b\u00052"+
		"\u0000\u0000\u023b{\u0001\u0000\u0000\u0000\u023c\u023d\u00053\u0000\u0000"+
		"\u023d}\u0001\u0000\u0000\u0000\u023e\u023f\u00054\u0000\u0000\u023f\u007f"+
		"\u0001\u0000\u0000\u0000\u0240\u0241\u00055\u0000\u0000\u0241\u0081\u0001"+
		"\u0000\u0000\u0000\u0242\u0243\u00056\u0000\u0000\u0243\u0083\u0001\u0000"+
		"\u0000\u0000\u0244\u024a\u0003\u0086C\u0000\u0245\u024a\u0003\u0088D\u0000"+
		"\u0246\u024a\u0003\u008aE\u0000\u0247\u024a\u0003\u008cF\u0000\u0248\u024a"+
		"\u0003\u008eG\u0000\u0249\u0244\u0001\u0000\u0000\u0000\u0249\u0245\u0001"+
		"\u0000\u0000\u0000\u0249\u0246\u0001\u0000\u0000\u0000\u0249\u0247\u0001"+
		"\u0000\u0000\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024a\u0085\u0001"+
		"\u0000\u0000\u0000\u024b\u024c\u00057\u0000\u0000\u024c\u0087\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u00058\u0000\u0000\u024e\u0089\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u00059\u0000\u0000\u0250\u008b\u0001\u0000\u0000\u0000"+
		"\u0251\u0252\u0005:\u0000\u0000\u0252\u008d\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0005;\u0000\u0000\u0254\u008f\u0001\u0000\u0000\u00002\u0093\u009e"+
		"\u00a3\u00ac\u00b4\u00bc\u00c0\u00c8\u00ca\u00ce\u00d2\u00da\u00e2\u00e6"+
		"\u00ed\u00f7\u00fc\u0105\u0108\u0113\u0116\u0121\u012f\u0132\u013d\u0140"+
		"\u0148\u014d\u0159\u0163\u0165\u016e\u0176\u0186\u018b\u0197\u01a0\u01a7"+
		"\u01ab\u01b7\u01c6\u01c9\u01d0\u01da\u01ea\u01ff\u0212\u022a\u0232\u0249";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}