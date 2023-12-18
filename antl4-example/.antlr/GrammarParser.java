// Generated from c:/Users/jakub/OneDrive/Pulpit/Studia/Nowy folder (2)/iamstuck/antl4-example/Grammar.g4 by ANTLR 4.13.1
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, Id=45, Integer_literal=46, 
		Floating_point_literal=47, WS=48, Comment=49, Line_comment=50;
	public static final int
		RULE_start_ = 0, RULE_expr = 1, RULE_declare = 2, RULE_arith_opr = 3, 
		RULE_arith_assign_opr = 4, RULE_assign = 5, RULE_comparator = 6, RULE_condition = 7, 
		RULE_declaration = 8, RULE_variable_declaration = 9, RULE_structure_declaration = 10, 
		RULE_assignment_statement = 11, RULE_statement = 12, RULE_for_statement = 13, 
		RULE_if_statement = 14, RULE_while_statement = 15, RULE_for_range_statement = 16, 
		RULE_pass_statement = 17, RULE_constant = 18, RULE_char_literal = 19, 
		RULE_string_literal = 20, RULE_bool_literal = 21, RULE_null_literal = 22, 
		RULE_equal = 23, RULE_not_equal = 24, RULE_greater = 25, RULE_lesser = 26, 
		RULE_greater_equal = 27, RULE_lesser_equal = 28, RULE_data_types = 29, 
		RULE_integer = 30, RULE_double = 31, RULE_char = 32, RULE_string = 33, 
		RULE_bool = 34, RULE_float = 35, RULE_data_structures = 36, RULE_stack = 37, 
		RULE_queue = 38, RULE_deque = 39, RULE_add = 40, RULE_sub = 41, RULE_mul = 42, 
		RULE_div = 43, RULE_mod = 44, RULE_inc = 45, RULE_dec = 46, RULE_add_assign = 47, 
		RULE_sub_assign = 48, RULE_mul_assign = 49, RULE_div_assign = 50, RULE_mod_assign = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_", "expr", "declare", "arith_opr", "arith_assign_opr", "assign", 
			"comparator", "condition", "declaration", "variable_declaration", "structure_declaration", 
			"assignment_statement", "statement", "for_statement", "if_statement", 
			"while_statement", "for_range_statement", "pass_statement", "constant", 
			"char_literal", "string_literal", "bool_literal", "null_literal", "equal", 
			"not_equal", "greater", "lesser", "greater_equal", "lesser_equal", "data_types", 
			"integer", "double", "char", "string", "bool", "float", "data_structures", 
			"stack", "queue", "deque", "add", "sub", "mul", "div", "mod", "inc", 
			"dec", "add_assign", "sub_assign", "mul_assign", "div_assign", "mod_assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'='", "'<'", "'>'", "'IF'", "':'", "'ELIF'", 
			"'ELSE'", "'END'", "'WHILE'", "'FOR'", "'PASS'", "'''", "'\"'", "'true'", 
			"'false'", "'null'", "'=='", "'!='", "'>='", "'<='", "'int'", "'double'", 
			"'char'", "'string'", "'bool'", "'float'", "'STACK'", "'QUEUE'", "'DEQUE'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'+='", "'-='", "'*='", 
			"'/='", "'%='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Id", "Integer_literal", 
			"Floating_point_literal", "WS", "Comment", "Line_comment"
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
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35192945275008L) != 0)) {
				{
				{
				setState(104);
				statement();
				setState(105);
				match(T__0);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(GrammarParser.Id, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Arith_oprContext arith_opr() {
			return getRuleContext(Arith_oprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(115);
				match(Id);
				}
				break;
			case T__1:
				{
				setState(116);
				match(T__1);
				setState(117);
				expr(0);
				setState(118);
				match(T__2);
				}
				break;
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case Integer_literal:
			case Floating_point_literal:
				{
				setState(120);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(123);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(124);
					arith_opr();
					setState(125);
					expr(4);
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class DeclareContext extends ParserRuleContext {
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public TerminalNode Id() { return getToken(GrammarParser.Id, 0); }
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			data_types();
			setState(133);
			match(Id);
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
	public static class Arith_oprContext extends ParserRuleContext {
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
		public Arith_oprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_opr; }
	}

	public final Arith_oprContext arith_opr() throws RecognitionException {
		Arith_oprContext _localctx = new Arith_oprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arith_opr);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				add();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				sub();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				mul();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				div();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				mod();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				inc();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
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
	public static class Arith_assign_oprContext extends ParserRuleContext {
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
		public Arith_assign_oprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_assign_opr; }
	}

	public final Arith_assign_oprContext arith_assign_opr() throws RecognitionException {
		Arith_assign_oprContext _localctx = new Arith_assign_oprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arith_assign_opr);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				add_assign();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				sub_assign();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				mul_assign();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				div_assign();
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				mod_assign();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 6);
				{
				setState(149);
				match(T__3);
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
		public TerminalNode Id() { return getToken(GrammarParser.Id, 0); }
		public Arith_assign_oprContext arith_assign_opr() {
			return getRuleContext(Arith_assign_oprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Id);
			setState(153);
			arith_assign_opr();
			setState(154);
			expr(0);
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
		enterRule(_localctx, 12, RULE_comparator);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				equal();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				not_equal();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				greater();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				lesser();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				greater_equal();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 14, RULE_condition);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				bool_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				expr(0);
				setState(166);
				comparator();
				setState(167);
				expr(0);
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
	public static class DeclarationContext extends ParserRuleContext {
		public Structure_declarationContext structure_declaration() {
			return getRuleContext(Structure_declarationContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				structure_declaration();
				}
				break;
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
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
	public static class Variable_declarationContext extends ParserRuleContext {
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public TerminalNode Id() { return getToken(GrammarParser.Id, 0); }
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable_declaration);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				data_types();
				setState(176);
				match(Id);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				assignment_statement();
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
	public static class Structure_declarationContext extends ParserRuleContext {
		public Data_structuresContext data_structures() {
			return getRuleContext(Data_structuresContext.class,0);
		}
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public TerminalNode Id() { return getToken(GrammarParser.Id, 0); }
		public Structure_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure_declaration; }
	}

	public final Structure_declarationContext structure_declaration() throws RecognitionException {
		Structure_declarationContext _localctx = new Structure_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_structure_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			data_structures();
			setState(182);
			match(T__4);
			setState(183);
			data_types();
			setState(184);
			match(T__5);
			setState(185);
			match(Id);
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
	public static class Assignment_statementContext extends ParserRuleContext {
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public TerminalNode Id() { return getToken(GrammarParser.Id, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			data_types();
			setState(188);
			match(Id);
			setState(189);
			match(T__3);
			setState(190);
			expr(0);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_range_statementContext for_range_statement() {
			return getRuleContext(For_range_statementContext.class,0);
		}
		public Pass_statementContext pass_statement() {
			return getRuleContext(Pass_statementContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				declaration();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				if_statement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				while_statement();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				for_range_statement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				pass_statement();
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 6);
				{
				setState(197);
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
	public static class For_statementContext extends ParserRuleContext {
		public For_range_statementContext for_range_statement() {
			return getRuleContext(For_range_statementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			for_range_statement();
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
		enterRule(_localctx, 28, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__6);
			setState(203);
			condition();
			setState(204);
			match(T__7);
			setState(208); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				statement();
				setState(206);
				match(T__0);
				}
				}
				setState(210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35192945275008L) != 0) );
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(212);
				match(T__8);
				setState(213);
				condition();
				setState(214);
				match(T__7);
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215);
					statement();
					setState(216);
					match(T__0);
					}
					}
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35192945275008L) != 0) );
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(227);
				match(T__9);
				setState(228);
				match(T__7);
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(229);
					statement();
					setState(230);
					match(T__0);
					}
					}
					setState(234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35192945275008L) != 0) );
				}
			}

			setState(238);
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
		enterRule(_localctx, 30, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__11);
			setState(241);
			condition();
			setState(242);
			match(T__7);
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				statement();
				setState(244);
				match(T__0);
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35192945275008L) != 0) );
			setState(250);
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
	public static class For_range_statementContext extends ParserRuleContext {
		public List<Assignment_statementContext> assignment_statement() {
			return getRuleContexts(Assignment_statementContext.class);
		}
		public Assignment_statementContext assignment_statement(int i) {
			return getRuleContext(Assignment_statementContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		enterRule(_localctx, 32, RULE_for_range_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__12);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) {
				{
				setState(253);
				assignment_statement();
				}
			}

			setState(256);
			match(T__0);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290605637636L) != 0)) {
				{
				setState(257);
				condition();
				}
			}

			setState(260);
			match(T__0);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) {
				{
				setState(261);
				assignment_statement();
				setState(262);
				match(T__0);
				}
			}

			setState(266);
			match(T__7);
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				statement();
				setState(268);
				match(T__0);
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 35192945275008L) != 0) );
			setState(274);
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
		enterRule(_localctx, 34, RULE_pass_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__13);
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
		enterRule(_localctx, 36, RULE_constant);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_literal:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(Integer_literal);
				}
				break;
			case Floating_point_literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(Floating_point_literal);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				char_literal();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				string_literal();
				}
				break;
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				bool_literal();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
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
		enterRule(_localctx, 38, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__14);
			setState(287);
			matchWildcard();
			setState(288);
			match(T__14);
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
		enterRule(_localctx, 40, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__15);
			setState(291);
			matchWildcard();
			setState(292);
			match(T__15);
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
		enterRule(_localctx, 42, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
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
		enterRule(_localctx, 44, RULE_null_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__19);
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
		enterRule(_localctx, 48, RULE_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
	public static class GreaterContext extends ParserRuleContext {
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__5);
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
		enterRule(_localctx, 52, RULE_lesser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__4);
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
		enterRule(_localctx, 54, RULE_greater_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
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
	public static class Lesser_equalContext extends ParserRuleContext {
		public Lesser_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lesser_equal; }
	}

	public final Lesser_equalContext lesser_equal() throws RecognitionException {
		Lesser_equalContext _localctx = new Lesser_equalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lesser_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
	public static class Data_typesContext extends ParserRuleContext {
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
		public Data_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_types; }
	}

	public final Data_typesContext data_types() throws RecognitionException {
		Data_typesContext _localctx = new Data_typesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_data_types);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				integer();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				double_();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				char_();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				string();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				bool();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
				float_();
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
		enterRule(_localctx, 60, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
	public static class DoubleContext extends ParserRuleContext {
		public DoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double; }
	}

	public final DoubleContext double_() throws RecognitionException {
		DoubleContext _localctx = new DoubleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
	public static class CharContext extends ParserRuleContext {
		public CharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char; }
	}

	public final CharContext char_() throws RecognitionException {
		CharContext _localctx = new CharContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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
	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
	public static class FloatContext extends ParserRuleContext {
		public FloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float; }
	}

	public final FloatContext float_() throws RecognitionException {
		FloatContext _localctx = new FloatContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_float);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
	public static class Data_structuresContext extends ParserRuleContext {
		public StackContext stack() {
			return getRuleContext(StackContext.class,0);
		}
		public DequeContext deque() {
			return getRuleContext(DequeContext.class,0);
		}
		public QueueContext queue() {
			return getRuleContext(QueueContext.class,0);
		}
		public Data_structuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_structures; }
	}

	public final Data_structuresContext data_structures() throws RecognitionException {
		Data_structuresContext _localctx = new Data_structuresContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_data_structures);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				stack();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				deque();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
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
		enterRule(_localctx, 74, RULE_stack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
	public static class QueueContext extends ParserRuleContext {
		public QueueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queue; }
	}

	public final QueueContext queue() throws RecognitionException {
		QueueContext _localctx = new QueueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_queue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
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
	public static class DequeContext extends ParserRuleContext {
		public DequeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deque; }
	}

	public final DequeContext deque() throws RecognitionException {
		DequeContext _localctx = new DequeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_deque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
	public static class SubContext extends ParserRuleContext {
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
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
	public static class MulContext extends ParserRuleContext {
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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
	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
	public static class ModContext extends ParserRuleContext {
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
	public static class IncContext extends ParserRuleContext {
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_inc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
	public static class Add_assignContext extends ParserRuleContext {
		public Add_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_assign; }
	}

	public final Add_assignContext add_assign() throws RecognitionException {
		Add_assignContext _localctx = new Add_assignContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_add_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
	public static class Sub_assignContext extends ParserRuleContext {
		public Sub_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_assign; }
	}

	public final Sub_assignContext sub_assign() throws RecognitionException {
		Sub_assignContext _localctx = new Sub_assignContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_sub_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
	public static class Mul_assignContext extends ParserRuleContext {
		public Mul_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_assign; }
	}

	public final Mul_assignContext mul_assign() throws RecognitionException {
		Mul_assignContext _localctx = new Mul_assignContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_mul_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
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
	public static class Div_assignContext extends ParserRuleContext {
		public Div_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_assign; }
	}

	public final Div_assignContext div_assign() throws RecognitionException {
		Div_assignContext _localctx = new Div_assignContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_div_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
	public static class Mod_assignContext extends ParserRuleContext {
		public Mod_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_assign; }
	}

	public final Mod_assignContext mod_assign() throws RecognitionException {
		Mod_assignContext _localctx = new Mod_assignContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_mod_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u016e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"l\b\u0000\n\u0000\f\u0000o\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001z\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u0080\b\u0001\n\u0001\f\u0001\u0083\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u008f\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0097"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a3"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00aa\b\u0007\u0001\b\u0001\b\u0003\b\u00ae\b\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u00b4\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00c7\b\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00d1\b\u000e\u000b\u000e\f\u000e\u00d2\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004"+
		"\u000e\u00db\b\u000e\u000b\u000e\f\u000e\u00dc\u0005\u000e\u00df\b\u000e"+
		"\n\u000e\f\u000e\u00e2\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0004\u000e\u00e9\b\u000e\u000b\u000e\f\u000e\u00ea"+
		"\u0003\u000e\u00ed\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00f7\b\u000f"+
		"\u000b\u000f\f\u000f\u00f8\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00ff\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0103\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0109"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u010f"+
		"\b\u0010\u000b\u0010\f\u0010\u0110\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u011d\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u013d\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u014e\b$\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001"+
		"/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u00013\u0000"+
		"\u0001\u00024\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdf\u0000\u0001"+
		"\u0001\u0000\u0011\u0012\u016b\u0000m\u0001\u0000\u0000\u0000\u0002y\u0001"+
		"\u0000\u0000\u0000\u0004\u0084\u0001\u0000\u0000\u0000\u0006\u008e\u0001"+
		"\u0000\u0000\u0000\b\u0096\u0001\u0000\u0000\u0000\n\u0098\u0001\u0000"+
		"\u0000\u0000\f\u00a2\u0001\u0000\u0000\u0000\u000e\u00a9\u0001\u0000\u0000"+
		"\u0000\u0010\u00ad\u0001\u0000\u0000\u0000\u0012\u00b3\u0001\u0000\u0000"+
		"\u0000\u0014\u00b5\u0001\u0000\u0000\u0000\u0016\u00bb\u0001\u0000\u0000"+
		"\u0000\u0018\u00c6\u0001\u0000\u0000\u0000\u001a\u00c8\u0001\u0000\u0000"+
		"\u0000\u001c\u00ca\u0001\u0000\u0000\u0000\u001e\u00f0\u0001\u0000\u0000"+
		"\u0000 \u00fc\u0001\u0000\u0000\u0000\"\u0114\u0001\u0000\u0000\u0000"+
		"$\u011c\u0001\u0000\u0000\u0000&\u011e\u0001\u0000\u0000\u0000(\u0122"+
		"\u0001\u0000\u0000\u0000*\u0126\u0001\u0000\u0000\u0000,\u0128\u0001\u0000"+
		"\u0000\u0000.\u012a\u0001\u0000\u0000\u00000\u012c\u0001\u0000\u0000\u0000"+
		"2\u012e\u0001\u0000\u0000\u00004\u0130\u0001\u0000\u0000\u00006\u0132"+
		"\u0001\u0000\u0000\u00008\u0134\u0001\u0000\u0000\u0000:\u013c\u0001\u0000"+
		"\u0000\u0000<\u013e\u0001\u0000\u0000\u0000>\u0140\u0001\u0000\u0000\u0000"+
		"@\u0142\u0001\u0000\u0000\u0000B\u0144\u0001\u0000\u0000\u0000D\u0146"+
		"\u0001\u0000\u0000\u0000F\u0148\u0001\u0000\u0000\u0000H\u014d\u0001\u0000"+
		"\u0000\u0000J\u014f\u0001\u0000\u0000\u0000L\u0151\u0001\u0000\u0000\u0000"+
		"N\u0153\u0001\u0000\u0000\u0000P\u0155\u0001\u0000\u0000\u0000R\u0157"+
		"\u0001\u0000\u0000\u0000T\u0159\u0001\u0000\u0000\u0000V\u015b\u0001\u0000"+
		"\u0000\u0000X\u015d\u0001\u0000\u0000\u0000Z\u015f\u0001\u0000\u0000\u0000"+
		"\\\u0161\u0001\u0000\u0000\u0000^\u0163\u0001\u0000\u0000\u0000`\u0165"+
		"\u0001\u0000\u0000\u0000b\u0167\u0001\u0000\u0000\u0000d\u0169\u0001\u0000"+
		"\u0000\u0000f\u016b\u0001\u0000\u0000\u0000hi\u0003\u0018\f\u0000ij\u0005"+
		"\u0001\u0000\u0000jl\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u0000"+
		"\u0000\u0001q\u0001\u0001\u0000\u0000\u0000rs\u0006\u0001\uffff\uffff"+
		"\u0000sz\u0005-\u0000\u0000tu\u0005\u0002\u0000\u0000uv\u0003\u0002\u0001"+
		"\u0000vw\u0005\u0003\u0000\u0000wz\u0001\u0000\u0000\u0000xz\u0003$\u0012"+
		"\u0000yr\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000\u0000yx\u0001\u0000"+
		"\u0000\u0000z\u0081\u0001\u0000\u0000\u0000{|\n\u0003\u0000\u0000|}\u0003"+
		"\u0006\u0003\u0000}~\u0003\u0002\u0001\u0004~\u0080\u0001\u0000\u0000"+
		"\u0000\u007f{\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000"+
		"\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000"+
		"\u0082\u0003\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0003:\u001d\u0000\u0085\u0086\u0005-\u0000\u0000\u0086\u0005"+
		"\u0001\u0000\u0000\u0000\u0087\u008f\u0003P(\u0000\u0088\u008f\u0003R"+
		")\u0000\u0089\u008f\u0003T*\u0000\u008a\u008f\u0003V+\u0000\u008b\u008f"+
		"\u0003X,\u0000\u008c\u008f\u0003Z-\u0000\u008d\u008f\u0003\\.\u0000\u008e"+
		"\u0087\u0001\u0000\u0000\u0000\u008e\u0088\u0001\u0000\u0000\u0000\u008e"+
		"\u0089\u0001\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008e"+
		"\u008b\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0007\u0001\u0000\u0000\u0000\u0090"+
		"\u0097\u0003^/\u0000\u0091\u0097\u0003`0\u0000\u0092\u0097\u0003b1\u0000"+
		"\u0093\u0097\u0003d2\u0000\u0094\u0097\u0003f3\u0000\u0095\u0097\u0005"+
		"\u0004\u0000\u0000\u0096\u0090\u0001\u0000\u0000\u0000\u0096\u0091\u0001"+
		"\u0000\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0096\u0093\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\t\u0001\u0000\u0000\u0000\u0098\u0099\u0005-"+
		"\u0000\u0000\u0099\u009a\u0003\b\u0004\u0000\u009a\u009b\u0003\u0002\u0001"+
		"\u0000\u009b\u000b\u0001\u0000\u0000\u0000\u009c\u00a3\u0003.\u0017\u0000"+
		"\u009d\u00a3\u00030\u0018\u0000\u009e\u00a3\u00032\u0019\u0000\u009f\u00a3"+
		"\u00034\u001a\u0000\u00a0\u00a3\u00036\u001b\u0000\u00a1\u00a3\u00038"+
		"\u001c\u0000\u00a2\u009c\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000"+
		"\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\r\u0001\u0000\u0000\u0000\u00a4\u00aa\u0003*\u0015"+
		"\u0000\u00a5\u00a6\u0003\u0002\u0001\u0000\u00a6\u00a7\u0003\f\u0006\u0000"+
		"\u00a7\u00a8\u0003\u0002\u0001\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a4\u0001\u0000\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000"+
		"\u00aa\u000f\u0001\u0000\u0000\u0000\u00ab\u00ae\u0003\u0014\n\u0000\u00ac"+
		"\u00ae\u0003\u0012\t\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u0011\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0003:\u001d\u0000\u00b0\u00b1\u0005-\u0000\u0000\u00b1\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0003\u0016\u000b\u0000\u00b3\u00af\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u0013\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0003H$\u0000\u00b6\u00b7\u0005\u0005\u0000\u0000"+
		"\u00b7\u00b8\u0003:\u001d\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000\u00b9"+
		"\u00ba\u0005-\u0000\u0000\u00ba\u0015\u0001\u0000\u0000\u0000\u00bb\u00bc"+
		"\u0003:\u001d\u0000\u00bc\u00bd\u0005-\u0000\u0000\u00bd\u00be\u0005\u0004"+
		"\u0000\u0000\u00be\u00bf\u0003\u0002\u0001\u0000\u00bf\u0017\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c7\u0003\u0010\b\u0000\u00c1\u00c7\u0003\u001c\u000e"+
		"\u0000\u00c2\u00c7\u0003\u001e\u000f\u0000\u00c3\u00c7\u0003 \u0010\u0000"+
		"\u00c4\u00c7\u0003\"\u0011\u0000\u00c5\u00c7\u0003\n\u0005\u0000\u00c6"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u0019\u0001\u0000\u0000\u0000\u00c8\u00c9\u0003 \u0010\u0000\u00c9\u001b"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0007\u0000\u0000\u00cb\u00cc"+
		"\u0003\u000e\u0007\u0000\u00cc\u00d0\u0005\b\u0000\u0000\u00cd\u00ce\u0003"+
		"\u0018\f\u0000\u00ce\u00cf\u0005\u0001\u0000\u0000\u00cf\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00e0\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\t\u0000"+
		"\u0000\u00d5\u00d6\u0003\u000e\u0007\u0000\u00d6\u00da\u0005\b\u0000\u0000"+
		"\u00d7\u00d8\u0003\u0018\f\u0000\u00d8\u00d9\u0005\u0001\u0000\u0000\u00d9"+
		"\u00db\u0001\u0000\u0000\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de"+
		"\u00d4\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0"+
		"\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
		"\u00ec\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0005\n\u0000\u0000\u00e4\u00e8\u0005\b\u0000\u0000\u00e5\u00e6"+
		"\u0003\u0018\f\u0000\u00e6\u00e7\u0005\u0001\u0000\u0000\u00e7\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e3\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0005\u000b\u0000\u0000\u00ef\u001d\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005\f\u0000\u0000\u00f1\u00f2\u0003\u000e"+
		"\u0007\u0000\u00f2\u00f6\u0005\b\u0000\u0000\u00f3\u00f4\u0003\u0018\f"+
		"\u0000\u00f4\u00f5\u0005\u0001\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u000b\u0000"+
		"\u0000\u00fb\u001f\u0001\u0000\u0000\u0000\u00fc\u00fe\u0005\r\u0000\u0000"+
		"\u00fd\u00ff\u0003\u0016\u000b\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u0102\u0005\u0001\u0000\u0000\u0101\u0103\u0003\u000e\u0007\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0108\u0005\u0001\u0000\u0000"+
		"\u0105\u0106\u0003\u0016\u000b\u0000\u0106\u0107\u0005\u0001\u0000\u0000"+
		"\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0105\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a\u010e\u0005\b\u0000\u0000\u010b\u010c\u0003\u0018\f\u0000\u010c"+
		"\u010d\u0005\u0001\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e"+
		"\u010b\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u000b\u0000\u0000\u0113"+
		"!\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u000e\u0000\u0000\u0115#\u0001"+
		"\u0000\u0000\u0000\u0116\u011d\u0005.\u0000\u0000\u0117\u011d\u0005/\u0000"+
		"\u0000\u0118\u011d\u0003&\u0013\u0000\u0119\u011d\u0003(\u0014\u0000\u011a"+
		"\u011d\u0003*\u0015\u0000\u011b\u011d\u0003,\u0016\u0000\u011c\u0116\u0001"+
		"\u0000\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011c\u0118\u0001"+
		"\u0000\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d%\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005\u000f\u0000\u0000\u011f\u0120\t\u0000\u0000"+
		"\u0000\u0120\u0121\u0005\u000f\u0000\u0000\u0121\'\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0005\u0010\u0000\u0000\u0123\u0124\t\u0000\u0000\u0000\u0124"+
		"\u0125\u0005\u0010\u0000\u0000\u0125)\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0007\u0000\u0000\u0000\u0127+\u0001\u0000\u0000\u0000\u0128\u0129\u0005"+
		"\u0013\u0000\u0000\u0129-\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u0014"+
		"\u0000\u0000\u012b/\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0015\u0000"+
		"\u0000\u012d1\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0006\u0000\u0000"+
		"\u012f3\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u0005\u0000\u0000\u0131"+
		"5\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0016\u0000\u0000\u01337\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005\u0017\u0000\u0000\u01359\u0001\u0000"+
		"\u0000\u0000\u0136\u013d\u0003<\u001e\u0000\u0137\u013d\u0003>\u001f\u0000"+
		"\u0138\u013d\u0003@ \u0000\u0139\u013d\u0003B!\u0000\u013a\u013d\u0003"+
		"D\"\u0000\u013b\u013d\u0003F#\u0000\u013c\u0136\u0001\u0000\u0000\u0000"+
		"\u013c\u0137\u0001\u0000\u0000\u0000\u013c\u0138\u0001\u0000\u0000\u0000"+
		"\u013c\u0139\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013c\u013b\u0001\u0000\u0000\u0000\u013d;\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0005\u0018\u0000\u0000\u013f=\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0005\u0019\u0000\u0000\u0141?\u0001\u0000\u0000\u0000\u0142\u0143\u0005"+
		"\u001a\u0000\u0000\u0143A\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u001b"+
		"\u0000\u0000\u0145C\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u001c\u0000"+
		"\u0000\u0147E\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u001d\u0000\u0000"+
		"\u0149G\u0001\u0000\u0000\u0000\u014a\u014e\u0003J%\u0000\u014b\u014e"+
		"\u0003N\'\u0000\u014c\u014e\u0003L&\u0000\u014d\u014a\u0001\u0000\u0000"+
		"\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014d\u014c\u0001\u0000\u0000"+
		"\u0000\u014eI\u0001\u0000\u0000\u0000\u014f\u0150\u0005\u001e\u0000\u0000"+
		"\u0150K\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u001f\u0000\u0000\u0152"+
		"M\u0001\u0000\u0000\u0000\u0153\u0154\u0005 \u0000\u0000\u0154O\u0001"+
		"\u0000\u0000\u0000\u0155\u0156\u0005!\u0000\u0000\u0156Q\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005\"\u0000\u0000\u0158S\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0005#\u0000\u0000\u015aU\u0001\u0000\u0000\u0000\u015b\u015c"+
		"\u0005$\u0000\u0000\u015cW\u0001\u0000\u0000\u0000\u015d\u015e\u0005%"+
		"\u0000\u0000\u015eY\u0001\u0000\u0000\u0000\u015f\u0160\u0005&\u0000\u0000"+
		"\u0160[\u0001\u0000\u0000\u0000\u0161\u0162\u0005\'\u0000\u0000\u0162"+
		"]\u0001\u0000\u0000\u0000\u0163\u0164\u0005(\u0000\u0000\u0164_\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0005)\u0000\u0000\u0166a\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005*\u0000\u0000\u0168c\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0005+\u0000\u0000\u016ae\u0001\u0000\u0000\u0000\u016b\u016c\u0005"+
		",\u0000\u0000\u016cg\u0001\u0000\u0000\u0000\u0017my\u0081\u008e\u0096"+
		"\u00a2\u00a9\u00ad\u00b3\u00c6\u00d2\u00dc\u00e0\u00ea\u00ec\u00f8\u00fe"+
		"\u0102\u0108\u0110\u011c\u013c\u014d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}