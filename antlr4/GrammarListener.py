# Generated from Grammar.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .GrammarParser import GrammarParser
else:
    from GrammarParser import GrammarParser

# This class defines a complete listener for a parse tree produced by GrammarParser.
class GrammarListener(ParseTreeListener):

    # Enter a parse tree produced by GrammarParser#program.
    def enterProgram(self, ctx:GrammarParser.ProgramContext):
        pass

    # Exit a parse tree produced by GrammarParser#program.
    def exitProgram(self, ctx:GrammarParser.ProgramContext):
        pass


    # Enter a parse tree produced by GrammarParser#statement.
    def enterStatement(self, ctx:GrammarParser.StatementContext):
        pass

    # Exit a parse tree produced by GrammarParser#statement.
    def exitStatement(self, ctx:GrammarParser.StatementContext):
        pass


    # Enter a parse tree produced by GrammarParser#block_statement.
    def enterBlock_statement(self, ctx:GrammarParser.Block_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#block_statement.
    def exitBlock_statement(self, ctx:GrammarParser.Block_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#single_statement.
    def enterSingle_statement(self, ctx:GrammarParser.Single_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#single_statement.
    def exitSingle_statement(self, ctx:GrammarParser.Single_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#if_statement.
    def enterIf_statement(self, ctx:GrammarParser.If_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#if_statement.
    def exitIf_statement(self, ctx:GrammarParser.If_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#loop_statement.
    def enterLoop_statement(self, ctx:GrammarParser.Loop_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#loop_statement.
    def exitLoop_statement(self, ctx:GrammarParser.Loop_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#for_statement.
    def enterFor_statement(self, ctx:GrammarParser.For_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#for_statement.
    def exitFor_statement(self, ctx:GrammarParser.For_statementContext):
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


    # Enter a parse tree produced by GrammarParser#for_each_statement.
    def enterFor_each_statement(self, ctx:GrammarParser.For_each_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#for_each_statement.
    def exitFor_each_statement(self, ctx:GrammarParser.For_each_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#printing_statement.
    def enterPrinting_statement(self, ctx:GrammarParser.Printing_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#printing_statement.
    def exitPrinting_statement(self, ctx:GrammarParser.Printing_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#print_statement.
    def enterPrint_statement(self, ctx:GrammarParser.Print_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#print_statement.
    def exitPrint_statement(self, ctx:GrammarParser.Print_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#println_statement.
    def enterPrintln_statement(self, ctx:GrammarParser.Println_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#println_statement.
    def exitPrintln_statement(self, ctx:GrammarParser.Println_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#printf_statement.
    def enterPrintf_statement(self, ctx:GrammarParser.Printf_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#printf_statement.
    def exitPrintf_statement(self, ctx:GrammarParser.Printf_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#method_call.
    def enterMethod_call(self, ctx:GrammarParser.Method_callContext):
        pass

    # Exit a parse tree produced by GrammarParser#method_call.
    def exitMethod_call(self, ctx:GrammarParser.Method_callContext):
        pass


    # Enter a parse tree produced by GrammarParser#function_call.
    def enterFunction_call(self, ctx:GrammarParser.Function_callContext):
        pass

    # Exit a parse tree produced by GrammarParser#function_call.
    def exitFunction_call(self, ctx:GrammarParser.Function_callContext):
        pass


    # Enter a parse tree produced by GrammarParser#pass_statement.
    def enterPass_statement(self, ctx:GrammarParser.Pass_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#pass_statement.
    def exitPass_statement(self, ctx:GrammarParser.Pass_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#return_statement.
    def enterReturn_statement(self, ctx:GrammarParser.Return_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#return_statement.
    def exitReturn_statement(self, ctx:GrammarParser.Return_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#expression.
    def enterExpression(self, ctx:GrammarParser.ExpressionContext):
        pass

    # Exit a parse tree produced by GrammarParser#expression.
    def exitExpression(self, ctx:GrammarParser.ExpressionContext):
        pass


    # Enter a parse tree produced by GrammarParser#logical_expression.
    def enterLogical_expression(self, ctx:GrammarParser.Logical_expressionContext):
        pass

    # Exit a parse tree produced by GrammarParser#logical_expression.
    def exitLogical_expression(self, ctx:GrammarParser.Logical_expressionContext):
        pass


    # Enter a parse tree produced by GrammarParser#arithmetic_expression.
    def enterArithmetic_expression(self, ctx:GrammarParser.Arithmetic_expressionContext):
        pass

    # Exit a parse tree produced by GrammarParser#arithmetic_expression.
    def exitArithmetic_expression(self, ctx:GrammarParser.Arithmetic_expressionContext):
        pass


    # Enter a parse tree produced by GrammarParser#single_expression.
    def enterSingle_expression(self, ctx:GrammarParser.Single_expressionContext):
        pass

    # Exit a parse tree produced by GrammarParser#single_expression.
    def exitSingle_expression(self, ctx:GrammarParser.Single_expressionContext):
        pass


    # Enter a parse tree produced by GrammarParser#logical_operator.
    def enterLogical_operator(self, ctx:GrammarParser.Logical_operatorContext):
        pass

    # Exit a parse tree produced by GrammarParser#logical_operator.
    def exitLogical_operator(self, ctx:GrammarParser.Logical_operatorContext):
        pass


    # Enter a parse tree produced by GrammarParser#and.
    def enterAnd(self, ctx:GrammarParser.AndContext):
        pass

    # Exit a parse tree produced by GrammarParser#and.
    def exitAnd(self, ctx:GrammarParser.AndContext):
        pass


    # Enter a parse tree produced by GrammarParser#or.
    def enterOr(self, ctx:GrammarParser.OrContext):
        pass

    # Exit a parse tree produced by GrammarParser#or.
    def exitOr(self, ctx:GrammarParser.OrContext):
        pass


    # Enter a parse tree produced by GrammarParser#xor.
    def enterXor(self, ctx:GrammarParser.XorContext):
        pass

    # Exit a parse tree produced by GrammarParser#xor.
    def exitXor(self, ctx:GrammarParser.XorContext):
        pass


    # Enter a parse tree produced by GrammarParser#not.
    def enterNot(self, ctx:GrammarParser.NotContext):
        pass

    # Exit a parse tree produced by GrammarParser#not.
    def exitNot(self, ctx:GrammarParser.NotContext):
        pass


    # Enter a parse tree produced by GrammarParser#single_declaration.
    def enterSingle_declaration(self, ctx:GrammarParser.Single_declarationContext):
        pass

    # Exit a parse tree produced by GrammarParser#single_declaration.
    def exitSingle_declaration(self, ctx:GrammarParser.Single_declarationContext):
        pass


    # Enter a parse tree produced by GrammarParser#block_declaration.
    def enterBlock_declaration(self, ctx:GrammarParser.Block_declarationContext):
        pass

    # Exit a parse tree produced by GrammarParser#block_declaration.
    def exitBlock_declaration(self, ctx:GrammarParser.Block_declarationContext):
        pass


    # Enter a parse tree produced by GrammarParser#variable_declaration.
    def enterVariable_declaration(self, ctx:GrammarParser.Variable_declarationContext):
        pass

    # Exit a parse tree produced by GrammarParser#variable_declaration.
    def exitVariable_declaration(self, ctx:GrammarParser.Variable_declarationContext):
        pass


    # Enter a parse tree produced by GrammarParser#container_declaration.
    def enterContainer_declaration(self, ctx:GrammarParser.Container_declarationContext):
        pass

    # Exit a parse tree produced by GrammarParser#container_declaration.
    def exitContainer_declaration(self, ctx:GrammarParser.Container_declarationContext):
        pass


    # Enter a parse tree produced by GrammarParser#function_definition.
    def enterFunction_definition(self, ctx:GrammarParser.Function_definitionContext):
        pass

    # Exit a parse tree produced by GrammarParser#function_definition.
    def exitFunction_definition(self, ctx:GrammarParser.Function_definitionContext):
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


    # Enter a parse tree produced by GrammarParser#comparator.
    def enterComparator(self, ctx:GrammarParser.ComparatorContext):
        pass

    # Exit a parse tree produced by GrammarParser#comparator.
    def exitComparator(self, ctx:GrammarParser.ComparatorContext):
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


    # Enter a parse tree produced by GrammarParser#data_type.
    def enterData_type(self, ctx:GrammarParser.Data_typeContext):
        pass

    # Exit a parse tree produced by GrammarParser#data_type.
    def exitData_type(self, ctx:GrammarParser.Data_typeContext):
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


    # Enter a parse tree produced by GrammarParser#void.
    def enterVoid(self, ctx:GrammarParser.VoidContext):
        pass

    # Exit a parse tree produced by GrammarParser#void.
    def exitVoid(self, ctx:GrammarParser.VoidContext):
        pass


    # Enter a parse tree produced by GrammarParser#container_type.
    def enterContainer_type(self, ctx:GrammarParser.Container_typeContext):
        pass

    # Exit a parse tree produced by GrammarParser#container_type.
    def exitContainer_type(self, ctx:GrammarParser.Container_typeContext):
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


    # Enter a parse tree produced by GrammarParser#assign_statement.
    def enterAssign_statement(self, ctx:GrammarParser.Assign_statementContext):
        pass

    # Exit a parse tree produced by GrammarParser#assign_statement.
    def exitAssign_statement(self, ctx:GrammarParser.Assign_statementContext):
        pass


    # Enter a parse tree produced by GrammarParser#assign_operator.
    def enterAssign_operator(self, ctx:GrammarParser.Assign_operatorContext):
        pass

    # Exit a parse tree produced by GrammarParser#assign_operator.
    def exitAssign_operator(self, ctx:GrammarParser.Assign_operatorContext):
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


    # Enter a parse tree produced by GrammarParser#increment.
    def enterIncrement(self, ctx:GrammarParser.IncrementContext):
        pass

    # Exit a parse tree produced by GrammarParser#increment.
    def exitIncrement(self, ctx:GrammarParser.IncrementContext):
        pass


    # Enter a parse tree produced by GrammarParser#decrement.
    def enterDecrement(self, ctx:GrammarParser.DecrementContext):
        pass

    # Exit a parse tree produced by GrammarParser#decrement.
    def exitDecrement(self, ctx:GrammarParser.DecrementContext):
        pass


    # Enter a parse tree produced by GrammarParser#assign.
    def enterAssign(self, ctx:GrammarParser.AssignContext):
        pass

    # Exit a parse tree produced by GrammarParser#assign.
    def exitAssign(self, ctx:GrammarParser.AssignContext):
        pass


    # Enter a parse tree produced by GrammarParser#arith_operator.
    def enterArith_operator(self, ctx:GrammarParser.Arith_operatorContext):
        pass

    # Exit a parse tree produced by GrammarParser#arith_operator.
    def exitArith_operator(self, ctx:GrammarParser.Arith_operatorContext):
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



del GrammarParser