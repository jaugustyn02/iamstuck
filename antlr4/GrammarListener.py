# Generated from Grammar.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser

# This class defines a complete listener for a parse tree produced by GrammarParser.
class GrammarListener(ParseTreeListener):

    # Enter a parse tree produced by GrammarParser#start_.
    def enterStart_(self, ctx:GrammarParser.Start_Context):
        pass

    # Exit a parse tree produced by GrammarParser#start_.
    def exitStart_(self, ctx:GrammarParser.Start_Context):
        pass


    # Enter a parse tree produced by GrammarParser#expr.
    def enterExpr(self, ctx:GrammarParser.ExprContext):
        pass

    # Exit a parse tree produced by GrammarParser#expr.
    def exitExpr(self, ctx:GrammarParser.ExprContext):
        pass


    # Enter a parse tree produced by GrammarParser#declare.
    def enterDeclare(self, ctx:GrammarParser.DeclareContext):
        pass

    # Exit a parse tree produced by GrammarParser#declare.
    def exitDeclare(self, ctx:GrammarParser.DeclareContext):
        pass


    # Enter a parse tree produced by GrammarParser#arith_opr.
    def enterArith_opr(self, ctx:GrammarParser.Arith_oprContext):
        pass

    # Exit a parse tree produced by GrammarParser#arith_opr.
    def exitArith_opr(self, ctx:GrammarParser.Arith_oprContext):
        pass


    # Enter a parse tree produced by GrammarParser#arith_assign_opr.
    def enterArith_assign_opr(self, ctx:GrammarParser.Arith_assign_oprContext):
        pass

    # Exit a parse tree produced by GrammarParser#arith_assign_opr.
    def exitArith_assign_opr(self, ctx:GrammarParser.Arith_assign_oprContext):
        pass


    # Enter a parse tree produced by GrammarParser#assign.
    def enterAssign(self, ctx:GrammarParser.AssignContext):
        pass

    # Exit a parse tree produced by GrammarParser#assign.
    def exitAssign(self, ctx:GrammarParser.AssignContext):
        pass


    # Enter a parse tree produced by GrammarParser#comparator.
    def enterComparator(self, ctx:GrammarParser.ComparatorContext):
        pass

    # Exit a parse tree produced by GrammarParser#comparator.
    def exitComparator(self, ctx:GrammarParser.ComparatorContext):
        pass


    # Enter a parse tree produced by GrammarParser#condition.
    def enterCondition(self, ctx:GrammarParser.ConditionContext):
        pass

    # Exit a parse tree produced by GrammarParser#condition.
    def exitCondition(self, ctx:GrammarParser.ConditionContext):
        pass


    # Enter a parse tree produced by GrammarParser#declaration.
    def enterDeclaration(self, ctx:GrammarParser.DeclarationContext):
        pass

    # Exit a parse tree produced by GrammarParser#declaration.
    def exitDeclaration(self, ctx:GrammarParser.DeclarationContext):
        pass


    # Enter a parse tree produced by GrammarParser#variable_declaration.
    def enterVariable_declaration(self, ctx:GrammarParser.Variable_declarationContext):
        pass

    # Exit a parse tree produced by GrammarParser#variable_declaration.
    def exitVariable_declaration(self, ctx:GrammarParser.Variable_declarationContext):
        pass


    # Enter a parse tree produced by GrammarParser#structure_declaration.
    def enterStructure_declaration(self, ctx:GrammarParser.Structure_declarationContext):
        pass

    # Exit a parse tree produced by GrammarParser#structure_declaration.
    def exitStructure_declaration(self, ctx:GrammarParser.Structure_declarationContext):
        pass


    # Enter a parse tree produced by GrammarParser#assignment_statement.
    def enterAssignment_statement(self, ctx:GrammarParser.Assignment_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#assignment_statement.
    def exitAssignment_statement(self, ctx:GrammarParser.Assignment_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#statement.
    def enterStatement(self, ctx:GrammarParser.StatementContext):
        pass

    # Exit a parse tree produced by GrammarParser#statement.
    def exitStatement(self, ctx:GrammarParser.StatementContext):
        pass


    # Enter a parse tree produced by GrammarParser#for_statement.
    def enterFor_statement(self, ctx:GrammarParser.For_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#for_statement.
    def exitFor_statement(self, ctx:GrammarParser.For_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#if_statement.
    def enterIf_statement(self, ctx:GrammarParser.If_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#if_statement.
    def exitIf_statement(self, ctx:GrammarParser.If_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#while_statement.
    def enterWhile_statement(self, ctx:GrammarParser.While_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#while_statement.
    def exitWhile_statement(self, ctx:GrammarParser.While_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#for_range_statement.
    def enterFor_range_statement(self, ctx:GrammarParser.For_range_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#for_range_statement.
    def exitFor_range_statement(self, ctx:GrammarParser.For_range_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#pass_statement.
    def enterPass_statement(self, ctx:GrammarParser.Pass_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#pass_statement.
    def exitPass_statement(self, ctx:GrammarParser.Pass_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#constant.
    def enterConstant(self, ctx:GrammarParser.ConstantContext):
        pass

    # Exit a parse tree produced by GrammarParser#constant.
    def exitConstant(self, ctx:GrammarParser.ConstantContext):
        pass


    # Enter a parse tree produced by GrammarParser#char_literal.
    def enterChar_literal(self, ctx:GrammarParser.Char_literalContext):
        pass

    # Exit a parse tree produced by GrammarParser#char_literal.
    def exitChar_literal(self, ctx:GrammarParser.Char_literalContext):
        pass


    # Enter a parse tree produced by GrammarParser#string_literal.
    def enterString_literal(self, ctx:GrammarParser.String_literalContext):
        pass

    # Exit a parse tree produced by GrammarParser#string_literal.
    def exitString_literal(self, ctx:GrammarParser.String_literalContext):
        pass


    # Enter a parse tree produced by GrammarParser#bool_literal.
    def enterBool_literal(self, ctx:GrammarParser.Bool_literalContext):
        pass

    # Exit a parse tree produced by GrammarParser#bool_literal.
    def exitBool_literal(self, ctx:GrammarParser.Bool_literalContext):
        pass


    # Enter a parse tree produced by GrammarParser#null_literal.
    def enterNull_literal(self, ctx:GrammarParser.Null_literalContext):
        pass

    # Exit a parse tree produced by GrammarParser#null_literal.
    def exitNull_literal(self, ctx:GrammarParser.Null_literalContext):
        pass


    # Enter a parse tree produced by GrammarParser#equal.
    def enterEqual(self, ctx:GrammarParser.EqualContext):
        pass

    # Exit a parse tree produced by GrammarParser#equal.
    def exitEqual(self, ctx:GrammarParser.EqualContext):
        pass


    # Enter a parse tree produced by GrammarParser#not_equal.
    def enterNot_equal(self, ctx:GrammarParser.Not_equalContext):
        pass

    # Exit a parse tree produced by GrammarParser#not_equal.
    def exitNot_equal(self, ctx:GrammarParser.Not_equalContext):
        pass


    # Enter a parse tree produced by GrammarParser#greater.
    def enterGreater(self, ctx:GrammarParser.GreaterContext):
        pass

    # Exit a parse tree produced by GrammarParser#greater.
    def exitGreater(self, ctx:GrammarParser.GreaterContext):
        pass


    # Enter a parse tree produced by GrammarParser#lesser.
    def enterLesser(self, ctx:GrammarParser.LesserContext):
        pass

    # Exit a parse tree produced by GrammarParser#lesser.
    def exitLesser(self, ctx:GrammarParser.LesserContext):
        pass


    # Enter a parse tree produced by GrammarParser#greater_equal.
    def enterGreater_equal(self, ctx:GrammarParser.Greater_equalContext):
        pass

    # Exit a parse tree produced by GrammarParser#greater_equal.
    def exitGreater_equal(self, ctx:GrammarParser.Greater_equalContext):
        pass


    # Enter a parse tree produced by GrammarParser#lesser_equal.
    def enterLesser_equal(self, ctx:GrammarParser.Lesser_equalContext):
        pass

    # Exit a parse tree produced by GrammarParser#lesser_equal.
    def exitLesser_equal(self, ctx:GrammarParser.Lesser_equalContext):
        pass


    # Enter a parse tree produced by GrammarParser#data_types.
    def enterData_types(self, ctx:GrammarParser.Data_typesContext):
        pass

    # Exit a parse tree produced by GrammarParser#data_types.
    def exitData_types(self, ctx:GrammarParser.Data_typesContext):
        pass


    # Enter a parse tree produced by GrammarParser#integer.
    def enterInteger(self, ctx:GrammarParser.IntegerContext):
        pass

    # Exit a parse tree produced by GrammarParser#integer.
    def exitInteger(self, ctx:GrammarParser.IntegerContext):
        pass


    # Enter a parse tree produced by GrammarParser#double.
    def enterDouble(self, ctx:GrammarParser.DoubleContext):
        pass

    # Exit a parse tree produced by GrammarParser#double.
    def exitDouble(self, ctx:GrammarParser.DoubleContext):
        pass


    # Enter a parse tree produced by GrammarParser#char.
    def enterChar(self, ctx:GrammarParser.CharContext):
        pass

    # Exit a parse tree produced by GrammarParser#char.
    def exitChar(self, ctx:GrammarParser.CharContext):
        pass


    # Enter a parse tree produced by GrammarParser#string.
    def enterString(self, ctx:GrammarParser.StringContext):
        pass

    # Exit a parse tree produced by GrammarParser#string.
    def exitString(self, ctx:GrammarParser.StringContext):
        pass


    # Enter a parse tree produced by GrammarParser#bool.
    def enterBool(self, ctx:GrammarParser.BoolContext):
        pass

    # Exit a parse tree produced by GrammarParser#bool.
    def exitBool(self, ctx:GrammarParser.BoolContext):
        pass


    # Enter a parse tree produced by GrammarParser#float.
    def enterFloat(self, ctx:GrammarParser.FloatContext):
        pass

    # Exit a parse tree produced by GrammarParser#float.
    def exitFloat(self, ctx:GrammarParser.FloatContext):
        pass


    # Enter a parse tree produced by GrammarParser#data_structures.
    def enterData_structures(self, ctx:GrammarParser.Data_structuresContext):
        pass

    # Exit a parse tree produced by GrammarParser#data_structures.
    def exitData_structures(self, ctx:GrammarParser.Data_structuresContext):
        pass


    # Enter a parse tree produced by GrammarParser#stack.
    def enterStack(self, ctx:GrammarParser.StackContext):
        pass

    # Exit a parse tree produced by GrammarParser#stack.
    def exitStack(self, ctx:GrammarParser.StackContext):
        pass


    # Enter a parse tree produced by GrammarParser#queue.
    def enterQueue(self, ctx:GrammarParser.QueueContext):
        pass

    # Exit a parse tree produced by GrammarParser#queue.
    def exitQueue(self, ctx:GrammarParser.QueueContext):
        pass


    # Enter a parse tree produced by GrammarParser#deque.
    def enterDeque(self, ctx:GrammarParser.DequeContext):
        pass

    # Exit a parse tree produced by GrammarParser#deque.
    def exitDeque(self, ctx:GrammarParser.DequeContext):
        pass


    # Enter a parse tree produced by GrammarParser#add.
    def enterAdd(self, ctx:GrammarParser.AddContext):
        pass

    # Exit a parse tree produced by GrammarParser#add.
    def exitAdd(self, ctx:GrammarParser.AddContext):
        pass


    # Enter a parse tree produced by GrammarParser#sub.
    def enterSub(self, ctx:GrammarParser.SubContext):
        pass

    # Exit a parse tree produced by GrammarParser#sub.
    def exitSub(self, ctx:GrammarParser.SubContext):
        pass


    # Enter a parse tree produced by GrammarParser#mul.
    def enterMul(self, ctx:GrammarParser.MulContext):
        pass

    # Exit a parse tree produced by GrammarParser#mul.
    def exitMul(self, ctx:GrammarParser.MulContext):
        pass


    # Enter a parse tree produced by GrammarParser#div.
    def enterDiv(self, ctx:GrammarParser.DivContext):
        pass

    # Exit a parse tree produced by GrammarParser#div.
    def exitDiv(self, ctx:GrammarParser.DivContext):
        pass


    # Enter a parse tree produced by GrammarParser#mod.
    def enterMod(self, ctx:GrammarParser.ModContext):
        pass

    # Exit a parse tree produced by GrammarParser#mod.
    def exitMod(self, ctx:GrammarParser.ModContext):
        pass


    # Enter a parse tree produced by GrammarParser#inc.
    def enterInc(self, ctx:GrammarParser.IncContext):
        pass

    # Exit a parse tree produced by GrammarParser#inc.
    def exitInc(self, ctx:GrammarParser.IncContext):
        pass


    # Enter a parse tree produced by GrammarParser#dec.
    def enterDec(self, ctx:GrammarParser.DecContext):
        pass

    # Exit a parse tree produced by GrammarParser#dec.
    def exitDec(self, ctx:GrammarParser.DecContext):
        pass


    # Enter a parse tree produced by GrammarParser#add_assign.
    def enterAdd_assign(self, ctx:GrammarParser.Add_assignContext):
        pass

    # Exit a parse tree produced by GrammarParser#add_assign.
    def exitAdd_assign(self, ctx:GrammarParser.Add_assignContext):
        pass


    # Enter a parse tree produced by GrammarParser#sub_assign.
    def enterSub_assign(self, ctx:GrammarParser.Sub_assignContext):
        pass

    # Exit a parse tree produced by GrammarParser#sub_assign.
    def exitSub_assign(self, ctx:GrammarParser.Sub_assignContext):
        pass


    # Enter a parse tree produced by GrammarParser#mul_assign.
    def enterMul_assign(self, ctx:GrammarParser.Mul_assignContext):
        pass

    # Exit a parse tree produced by GrammarParser#mul_assign.
    def exitMul_assign(self, ctx:GrammarParser.Mul_assignContext):
        pass


    # Enter a parse tree produced by GrammarParser#div_assign.
    def enterDiv_assign(self, ctx:GrammarParser.Div_assignContext):
        pass

    # Exit a parse tree produced by GrammarParser#div_assign.
    def exitDiv_assign(self, ctx:GrammarParser.Div_assignContext):
        pass


    # Enter a parse tree produced by GrammarParser#mod_assign.
    def enterMod_assign(self, ctx:GrammarParser.Mod_assignContext):
        pass

    # Exit a parse tree produced by GrammarParser#mod_assign.
    def exitMod_assign(self, ctx:GrammarParser.Mod_assignContext):
        pass



del GrammarParser