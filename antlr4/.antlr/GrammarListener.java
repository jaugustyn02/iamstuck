// Generated from /home/jaugustyn/Studies/sem 5/Kompilatory/iamstuck/antlr4/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start_}.
	 * @param ctx the parse tree
	 */
	void enterStart_(GrammarParser.Start_Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start_}.
	 * @param ctx the parse tree
	 */
	void exitStart_(GrammarParser.Start_Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(GrammarParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(GrammarParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arith_opr}.
	 * @param ctx the parse tree
	 */
	void enterArith_opr(GrammarParser.Arith_oprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arith_opr}.
	 * @param ctx the parse tree
	 */
	void exitArith_opr(GrammarParser.Arith_oprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arith_assign_opr}.
	 * @param ctx the parse tree
	 */
	void enterArith_assign_opr(GrammarParser.Arith_assign_oprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arith_assign_opr}.
	 * @param ctx the parse tree
	 */
	void exitArith_assign_opr(GrammarParser.Arith_assign_oprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(GrammarParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(GrammarParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(GrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(GrammarParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(GrammarParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#structure_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStructure_declaration(GrammarParser.Structure_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#structure_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStructure_declaration(GrammarParser.Structure_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(GrammarParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(GrammarParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(GrammarParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(GrammarParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(GrammarParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(GrammarParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(GrammarParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(GrammarParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#for_range_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_statement(GrammarParser.For_range_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#for_range_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_statement(GrammarParser.For_range_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#pass_statement}.
	 * @param ctx the parse tree
	 */
	void enterPass_statement(GrammarParser.Pass_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#pass_statement}.
	 * @param ctx the parse tree
	 */
	void exitPass_statement(GrammarParser.Pass_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(GrammarParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(GrammarParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(GrammarParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(GrammarParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(GrammarParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(GrammarParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(GrammarParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(GrammarParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void enterNull_literal(GrammarParser.Null_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#null_literal}.
	 * @param ctx the parse tree
	 */
	void exitNull_literal(GrammarParser.Null_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(GrammarParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(GrammarParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#not_equal}.
	 * @param ctx the parse tree
	 */
	void enterNot_equal(GrammarParser.Not_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#not_equal}.
	 * @param ctx the parse tree
	 */
	void exitNot_equal(GrammarParser.Not_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#greater}.
	 * @param ctx the parse tree
	 */
	void enterGreater(GrammarParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#greater}.
	 * @param ctx the parse tree
	 */
	void exitGreater(GrammarParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lesser}.
	 * @param ctx the parse tree
	 */
	void enterLesser(GrammarParser.LesserContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lesser}.
	 * @param ctx the parse tree
	 */
	void exitLesser(GrammarParser.LesserContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#greater_equal}.
	 * @param ctx the parse tree
	 */
	void enterGreater_equal(GrammarParser.Greater_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#greater_equal}.
	 * @param ctx the parse tree
	 */
	void exitGreater_equal(GrammarParser.Greater_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lesser_equal}.
	 * @param ctx the parse tree
	 */
	void enterLesser_equal(GrammarParser.Lesser_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lesser_equal}.
	 * @param ctx the parse tree
	 */
	void exitLesser_equal(GrammarParser.Lesser_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#data_types}.
	 * @param ctx the parse tree
	 */
	void enterData_types(GrammarParser.Data_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#data_types}.
	 * @param ctx the parse tree
	 */
	void exitData_types(GrammarParser.Data_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#double}.
	 * @param ctx the parse tree
	 */
	void enterDouble(GrammarParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#double}.
	 * @param ctx the parse tree
	 */
	void exitDouble(GrammarParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#char}.
	 * @param ctx the parse tree
	 */
	void enterChar(GrammarParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#char}.
	 * @param ctx the parse tree
	 */
	void exitChar(GrammarParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(GrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(GrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(GrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(GrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#float}.
	 * @param ctx the parse tree
	 */
	void enterFloat(GrammarParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#float}.
	 * @param ctx the parse tree
	 */
	void exitFloat(GrammarParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#data_structures}.
	 * @param ctx the parse tree
	 */
	void enterData_structures(GrammarParser.Data_structuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#data_structures}.
	 * @param ctx the parse tree
	 */
	void exitData_structures(GrammarParser.Data_structuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(GrammarParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(GrammarParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#queue}.
	 * @param ctx the parse tree
	 */
	void enterQueue(GrammarParser.QueueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#queue}.
	 * @param ctx the parse tree
	 */
	void exitQueue(GrammarParser.QueueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#deque}.
	 * @param ctx the parse tree
	 */
	void enterDeque(GrammarParser.DequeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#deque}.
	 * @param ctx the parse tree
	 */
	void exitDeque(GrammarParser.DequeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(GrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(GrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(GrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(GrammarParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(GrammarParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(GrammarParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(GrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(GrammarParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(GrammarParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(GrammarParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(GrammarParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(GrammarParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(GrammarParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(GrammarParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#add_assign}.
	 * @param ctx the parse tree
	 */
	void enterAdd_assign(GrammarParser.Add_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#add_assign}.
	 * @param ctx the parse tree
	 */
	void exitAdd_assign(GrammarParser.Add_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#sub_assign}.
	 * @param ctx the parse tree
	 */
	void enterSub_assign(GrammarParser.Sub_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#sub_assign}.
	 * @param ctx the parse tree
	 */
	void exitSub_assign(GrammarParser.Sub_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mul_assign}.
	 * @param ctx the parse tree
	 */
	void enterMul_assign(GrammarParser.Mul_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mul_assign}.
	 * @param ctx the parse tree
	 */
	void exitMul_assign(GrammarParser.Mul_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#div_assign}.
	 * @param ctx the parse tree
	 */
	void enterDiv_assign(GrammarParser.Div_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#div_assign}.
	 * @param ctx the parse tree
	 */
	void exitDiv_assign(GrammarParser.Div_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#mod_assign}.
	 * @param ctx the parse tree
	 */
	void enterMod_assign(GrammarParser.Mod_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#mod_assign}.
	 * @param ctx the parse tree
	 */
	void exitMod_assign(GrammarParser.Mod_assignContext ctx);
}