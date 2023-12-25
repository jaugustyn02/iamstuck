import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarListener import GrammarListener


def print_token(_name, ctx):
    rule_id = ctx.getRuleIndex()
    rule_name = GrammarParser.ruleNames[rule_id]
    token_type = ctx.start.type
    token_name = GrammarParser.symbolicNames[token_type]
    if token_name == '<INVALID>':
        token_name = ''
    token_text = ctx.start.text
    print(f'[Rule: {rule_name} - Token name: {token_name} - Token text: "{token_text}"]')


class TokenPrintListener(GrammarListener):
    def __init__(self):
        self.result = {}

    # Enter a parse tree produced by GrammarParser#start_.
    def enterStart_(self, ctx:GrammarParser.Start_Context):
        print_token('enterStart_', ctx)

    # Exit a parse tree produced by GrammarParser#start_.
    def exitStart_(self, ctx:GrammarParser.Start_Context):
        print_token('exitStart_', ctx)

    # Enter a parse tree produced by GrammarParser#statement.
    def enterStatement(self, ctx:GrammarParser.StatementContext):
        print_token('enterStatement', ctx)

    # Exit a parse tree produced by GrammarParser#statement.
    def exitStatement(self, ctx:GrammarParser.StatementContext):
        print_token('exitStatement', ctx)


    # Enter a parse tree produced by GrammarParser#block_statement.
    def enterBlock_statement(self, ctx:GrammarParser.Block_statementContext):
        print_token('enterBlock_statement', ctx)

    # Exit a parse tree produced by GrammarParser#block_statement.
    def exitBlock_statement(self, ctx:GrammarParser.Block_statementContext):
        print_token('exitBlock_statement', ctx)


    # Enter a parse tree produced by GrammarParser#single_statement.
    def enterSingle_statement(self, ctx:GrammarParser.Single_statementContext):
        print_token('enterSingle_statement', ctx)

    # Exit a parse tree produced by GrammarParser#single_statement.
    def exitSingle_statement(self, ctx:GrammarParser.Single_statementContext):
        print_token('exitSingle_statement', ctx)


    # Enter a parse tree produced by GrammarParser#if_statement.
    def enterIf_statement(self, ctx:GrammarParser.If_statementContext):
        print_token('enterIf_statement', ctx)

    # Exit a parse tree produced by GrammarParser#if_statement.
    def exitIf_statement(self, ctx:GrammarParser.If_statementContext):
        print_token('exitIf_statement', ctx)


    # Enter a parse tree produced by GrammarParser#loop_statement.
    def enterLoop_statement(self, ctx:GrammarParser.Loop_statementContext):
        print_token('enterLoop_statement', ctx)

    # Exit a parse tree produced by GrammarParser#loop_statement.
    def exitLoop_statement(self, ctx:GrammarParser.Loop_statementContext):
        print_token('exitLoop_statement', ctx)


    # Enter a parse tree produced by GrammarParser#for_statement.
    def enterFor_statement(self, ctx:GrammarParser.For_statementContext):
        print_token('enterFor_statement', ctx)

    # Exit a parse tree produced by GrammarParser#for_statement.
    def exitFor_statement(self, ctx:GrammarParser.For_statementContext):
        print_token('exitFor_statement', ctx)


    # Enter a parse tree produced by GrammarParser#while_statement.
    def enterWhile_statement(self, ctx:GrammarParser.While_statementContext):
        print_token('enterWhile_statement', ctx)

    # Exit a parse tree produced by GrammarParser#while_statement.
    def exitWhile_statement(self, ctx:GrammarParser.While_statementContext):
        print_token('exitWhile_statement', ctx)


    # Enter a parse tree produced by GrammarParser#for_range_statement.
    def enterFor_range_statement(self, ctx:GrammarParser.For_range_statementContext):
        print_token('enterFor_range_statement', ctx)

    # Exit a parse tree produced by GrammarParser#for_range_statement.
    def exitFor_range_statement(self, ctx:GrammarParser.For_range_statementContext):
        print_token('exitFor_range_statement', ctx)


    # Enter a parse tree produced by GrammarParser#for_each_statement.
    def enterFor_each_statement(self, ctx:GrammarParser.For_each_statementContext):
        print_token('enterFor_each_statement', ctx)

    # Exit a parse tree produced by GrammarParser#for_each_statement.
    def exitFor_each_statement(self, ctx:GrammarParser.For_each_statementContext):
        print_token('exitFor_each_statement', ctx)


    # Enter a parse tree produced by GrammarParser#printing_statement.
    def enterPrinting_statement(self, ctx:GrammarParser.Printing_statementContext):
        print_token('enterPrinting_statement', ctx)

    # Exit a parse tree produced by GrammarParser#printing_statement.
    def exitPrinting_statement(self, ctx:GrammarParser.Printing_statementContext):
        print_token('exitPrinting_statement', ctx)


    # Enter a parse tree produced by GrammarParser#print_statement.
    def enterPrint_statement(self, ctx:GrammarParser.Print_statementContext):
        print_token('enterPrint_statement', ctx)

    # Exit a parse tree produced by GrammarParser#print_statement.
    def exitPrint_statement(self, ctx:GrammarParser.Print_statementContext):
        print_token('exitPrint_statement', ctx)


    # Enter a parse tree produced by GrammarParser#println_statement.
    def enterPrintln_statement(self, ctx:GrammarParser.Println_statementContext):
        print_token('enterPrintln_statement', ctx)

    # Exit a parse tree produced by GrammarParser#println_statement.
    def exitPrintln_statement(self, ctx:GrammarParser.Println_statementContext):
        print_token('exitPrintln_statement', ctx)


    # Enter a parse tree produced by GrammarParser#printf_statement.
    def enterPrintf_statement(self, ctx:GrammarParser.Printf_statementContext):
        print_token('enterPrintf_statement', ctx)

    # Exit a parse tree produced by GrammarParser#printf_statement.
    def exitPrintf_statement(self, ctx:GrammarParser.Printf_statementContext):
        print_token('exitPrintf_statement', ctx)


    # Enter a parse tree produced by GrammarParser#method_call.
    def enterMethod_call(self, ctx:GrammarParser.Method_callContext):
        print_token('enterMethod_call', ctx)

    # Exit a parse tree produced by GrammarParser#method_call.
    def exitMethod_call(self, ctx:GrammarParser.Method_callContext):
        print_token('exitMethod_call', ctx)


    # Enter a parse tree produced by GrammarParser#function_call.
    def enterFunction_call(self, ctx:GrammarParser.Function_callContext):
        print_token('enterFunction_call', ctx)

    # Exit a parse tree produced by GrammarParser#function_call.
    def exitFunction_call(self, ctx:GrammarParser.Function_callContext):
        print_token('exitFunction_call', ctx)


    # Enter a parse tree produced by GrammarParser#pass_statement.
    def enterPass_statement(self, ctx:GrammarParser.Pass_statementContext):
        print_token('enterPass_statement', ctx)

    # Exit a parse tree produced by GrammarParser#pass_statement.
    def exitPass_statement(self, ctx:GrammarParser.Pass_statementContext):
        print_token('exitPass_statement', ctx)


    # Enter a parse tree produced by GrammarParser#return_statement.
    def enterReturn_statement(self, ctx:GrammarParser.Return_statementContext):
        print_token('enterReturn_statement', ctx)

    # Exit a parse tree produced by GrammarParser#return_statement.
    def exitReturn_statement(self, ctx:GrammarParser.Return_statementContext):
        print_token('exitReturn_statement', ctx)


    # Enter a parse tree produced by GrammarParser#expression.
    def enterExpression(self, ctx:GrammarParser.ExpressionContext):
        print_token('enterExpression', ctx)

    # Exit a parse tree produced by GrammarParser#expression.
    def exitExpression(self, ctx:GrammarParser.ExpressionContext):
        print_token('exitExpression', ctx)


    # Enter a parse tree produced by GrammarParser#condition.
    def enterCondition(self, ctx:GrammarParser.ConditionContext):
        print_token('enterCondition', ctx)

    # Exit a parse tree produced by GrammarParser#condition.
    def exitCondition(self, ctx:GrammarParser.ConditionContext):
        print_token('exitCondition', ctx)


    # Enter a parse tree produced by GrammarParser#single_declaration.
    def enterSingle_declaration(self, ctx:GrammarParser.Single_declarationContext):
        print_token('enterSingle_declaration', ctx)

    # Exit a parse tree produced by GrammarParser#single_declaration.
    def exitSingle_declaration(self, ctx:GrammarParser.Single_declarationContext):
        print_token('exitSingle_declaration', ctx)


    # Enter a parse tree produced by GrammarParser#block_declaration.
    def enterBlock_declaration(self, ctx:GrammarParser.Block_declarationContext):
        print_token('enterBlock_declaration', ctx)

    # Exit a parse tree produced by GrammarParser#block_declaration.
    def exitBlock_declaration(self, ctx:GrammarParser.Block_declarationContext):
        print_token('exitBlock_declaration', ctx)


    # Enter a parse tree produced by GrammarParser#variable_declaration.
    def enterVariable_declaration(self, ctx:GrammarParser.Variable_declarationContext):
        print_token('enterVariable_declaration', ctx)

    # Exit a parse tree produced by GrammarParser#variable_declaration.
    def exitVariable_declaration(self, ctx:GrammarParser.Variable_declarationContext):
        print_token('exitVariable_declaration', ctx)


    # Enter a parse tree produced by GrammarParser#container_declaration.
    def enterContainer_declaration(self, ctx:GrammarParser.Container_declarationContext):
        print_token('enterContainer_declaration', ctx)

    # Exit a parse tree produced by GrammarParser#container_declaration.
    def exitContainer_declaration(self, ctx:GrammarParser.Container_declarationContext):
        print_token('exitContainer_declaration', ctx)


    # Enter a parse tree produced by GrammarParser#function_definition.
    def enterFunction_definition(self, ctx:GrammarParser.Function_definitionContext):
        print_token('enterFunction_definition', ctx)

    # Exit a parse tree produced by GrammarParser#function_definition.
    def exitFunction_definition(self, ctx:GrammarParser.Function_definitionContext):
        print_token('exitFunction_definition', ctx)


    # Enter a parse tree produced by GrammarParser#constant.
    def enterConstant(self, ctx:GrammarParser.ConstantContext):
        print_token('enterConstant', ctx)

    # Exit a parse tree produced by GrammarParser#constant.
    def exitConstant(self, ctx:GrammarParser.ConstantContext):
        print_token('exitConstant', ctx)


    # Enter a parse tree produced by GrammarParser#char_literal.
    def enterChar_literal(self, ctx:GrammarParser.Char_literalContext):
        print_token('enterChar_literal', ctx)

    # Exit a parse tree produced by GrammarParser#char_literal.
    def exitChar_literal(self, ctx:GrammarParser.Char_literalContext):
        print_token('exitChar_literal', ctx)
    # Enter a parse tree produced by GrammarParser#string_literal.
    def enterString_literal(self, ctx:GrammarParser.String_literalContext):
        print_token("enterString_literal", ctx)

    # Exit a parse tree produced by GrammarParser#string_literal.
    def exitString_literal(self, ctx:GrammarParser.String_literalContext):
        print_token("exitString_literal", ctx)


    # Enter a parse tree produced by GrammarParser#bool_literal.
    def enterBool_literal(self, ctx:GrammarParser.Bool_literalContext):
        print_token("enterBool_literal", ctx)

    # Exit a parse tree produced by GrammarParser#bool_literal.
    def exitBool_literal(self, ctx:GrammarParser.Bool_literalContext):
        print_token("exitBool_literal", ctx)


    # Enter a parse tree produced by GrammarParser#null_literal.
    def enterNull_literal(self, ctx:GrammarParser.Null_literalContext):
        print_token("enterNull_literal", ctx)

    # Exit a parse tree produced by GrammarParser#null_literal.
    def exitNull_literal(self, ctx:GrammarParser.Null_literalContext):
        print_token("exitNull_literal", ctx)


    # Enter a parse tree produced by GrammarParser#comparator.
    def enterComparator(self, ctx:GrammarParser.ComparatorContext):
        print_token("enterComparator", ctx)

    # Exit a parse tree produced by GrammarParser#comparator.
    def exitComparator(self, ctx:GrammarParser.ComparatorContext):
        print_token("exitComparator", ctx)


    # Enter a parse tree produced by GrammarParser#equal.
    def enterEqual(self, ctx:GrammarParser.EqualContext):
        print_token("enterEqual", ctx)

    # Exit a parse tree produced by GrammarParser#equal.
    def exitEqual(self, ctx:GrammarParser.EqualContext):
        print_token("exitEqual", ctx)


    # Enter a parse tree produced by GrammarParser#not_equal.
    def enterNot_equal(self, ctx:GrammarParser.Not_equalContext):
        print_token("enterNot_equal", ctx)

    # Exit a parse tree produced by GrammarParser#not_equal.
    def exitNot_equal(self, ctx:GrammarParser.Not_equalContext):
        print_token("exitNot_equal", ctx)


    # Enter a parse tree produced by GrammarParser#greater.
    def enterGreater(self, ctx:GrammarParser.GreaterContext):
        print_token("enterGreater", ctx)

    # Exit a parse tree produced by GrammarParser#greater.
    def exitGreater(self, ctx:GrammarParser.GreaterContext):
        print_token("exitGreater", ctx)


    # Enter a parse tree produced by GrammarParser#lesser.
    def enterLesser(self, ctx:GrammarParser.LesserContext):
        print_token("enterLesser", ctx)

    # Exit a parse tree produced by GrammarParser#lesser.
    def exitLesser(self, ctx:GrammarParser.LesserContext):
        print_token("exitLesser", ctx)


    # Enter a parse tree produced by GrammarParser#greater_equal.
    def enterGreater_equal(self, ctx:GrammarParser.Greater_equalContext):
        print_token("enterGreater_equal", ctx)

    # Exit a parse tree produced by GrammarParser#greater_equal.
    def exitGreater_equal(self, ctx:GrammarParser.Greater_equalContext):
        print_token("exitGreater_equal", ctx)


    # Enter a parse tree produced by GrammarParser#lesser_equal.
    def enterLesser_equal(self, ctx:GrammarParser.Lesser_equalContext):
        print_token("enterLesser_equal", ctx)

    # Exit a parse tree produced by GrammarParser#lesser_equal.
    def exitLesser_equal(self, ctx:GrammarParser.Lesser_equalContext):
        print_token("exitLesser_equal", ctx)


    # Enter a parse tree produced by GrammarParser#greater_equal.
    def enterGreater_equal(self, ctx:GrammarParser.Greater_equalContext):
        print_token("enterGreater_equal", ctx)

    # Exit a parse tree produced by GrammarParser#greater_equal.
    def exitGreater_equal(self, ctx:GrammarParser.Greater_equalContext):
        print_token("exitGreater_equal", ctx)


    # Enter a parse tree produced by GrammarParser#lesser_equal.
    def enterLesser_equal(self, ctx:GrammarParser.Lesser_equalContext):
        print_token("enterLesser_equal", ctx)

    # Exit a parse tree produced by GrammarParser#lesser_equal.
    def exitLesser_equal(self, ctx:GrammarParser.Lesser_equalContext):
        print_token("exitLesser_equal", ctx)


    # Enter a parse tree produced by GrammarParser#data_type.
    def enterData_type(self, ctx:GrammarParser.Data_typeContext):
        print_token("enterData_type", ctx)

    # Exit a parse tree produced by GrammarParser#data_type.
    def exitData_type(self, ctx:GrammarParser.Data_typeContext):
        print_token("exitData_type", ctx)


    # Enter a parse tree produced by GrammarParser#integer.
    def enterInteger(self, ctx:GrammarParser.IntegerContext):
        print_token("enterInteger", ctx)

    # Exit a parse tree produced by GrammarParser#integer.
    def exitInteger(self, ctx:GrammarParser.IntegerContext):
        print_token("exitInteger", ctx)


    # Enter a parse tree produced by GrammarParser#double.
    def enterDouble(self, ctx:GrammarParser.DoubleContext):
        print_token("enterDouble", ctx)

    # Exit a parse tree produced by GrammarParser#double.
    def exitDouble(self, ctx:GrammarParser.DoubleContext):
        print_token("exitDouble", ctx)


    # Enter a parse tree produced by GrammarParser#char.
    def enterChar(self, ctx:GrammarParser.CharContext):
        print_token("enterChar", ctx)

    # Exit a parse tree produced by GrammarParser#char.
    def exitChar(self, ctx:GrammarParser.CharContext):
        print_token("exitChar", ctx)


    # Enter a parse tree produced by GrammarParser#string.
    def enterString(self, ctx:GrammarParser.StringContext):
        print_token("enterString", ctx)

    # Exit a parse tree produced by GrammarParser#string.
    def exitString(self, ctx:GrammarParser.StringContext):
        print_token("exitString", ctx)


    # Enter a parse tree produced by GrammarParser#bool.
    def enterBool(self, ctx:GrammarParser.BoolContext):
        print_token("enterBool", ctx)

    # Exit a parse tree produced by GrammarParser#bool.
    def exitBool(self, ctx:GrammarParser.BoolContext):
        print_token("exitBool", ctx)


    # Enter a parse tree produced by GrammarParser#float.
    def enterFloat(self, ctx:GrammarParser.FloatContext):
        print_token("enterFloat", ctx)

    # Exit a parse tree produced by GrammarParser#float.
    def exitFloat(self, ctx:GrammarParser.FloatContext):
        print_token("exitFloat", ctx)


    # Enter a parse tree produced by GrammarParser#void.
    def enterVoid(self, ctx:GrammarParser.VoidContext):
        print_token("enterVoid", ctx)

    # Exit a parse tree produced by GrammarParser#void.
    def exitVoid(self, ctx:GrammarParser.VoidContext):
        print_token("exitVoid", ctx)


    # Enter a parse tree produced by GrammarParser#container_type.
    def enterContainer_type(self, ctx:GrammarParser.Container_typeContext):
        print_token("enterContainer_type", ctx)

    # Exit a parse tree produced by GrammarParser#container_type.
    def exitContainer_type(self, ctx:GrammarParser.Container_typeContext):
        print_token("exitContainer_type", ctx)


    # Enter a parse tree produced by GrammarParser#stack.
    def enterStack(self, ctx:GrammarParser.StackContext):
        print_token("enterStack", ctx)

    # Exit a parse tree produced by GrammarParser#stack.
    def exitStack(self, ctx:GrammarParser.StackContext):
        print_token("exitStack", ctx)


    # Enter a parse tree produced by GrammarParser#queue.
    def enterQueue(self, ctx:GrammarParser.QueueContext):
        print_token("enterQueue", ctx)

    # Exit a parse tree produced by GrammarParser#queue.
    def exitQueue(self, ctx:GrammarParser.QueueContext):
        print_token("exitQueue", ctx)


    # Enter a parse tree produced by GrammarParser#deque.
    def enterDeque(self, ctx:GrammarParser.DequeContext):
        print_token("enterDeque", ctx)

    # Exit a parse tree produced by GrammarParser#deque.
    def exitDeque(self, ctx:GrammarParser.DequeContext):
        print_token("exitDeque", ctx)


    # Enter a parse tree produced by GrammarParser#assign_statement.
    def enterAssign_statement(self, ctx:GrammarParser.Assign_statementContext):
        print_token("enterAssign_statement", ctx)

    # Exit a parse tree produced by GrammarParser#assign_statement.
    def exitAssign_statement(self, ctx:GrammarParser.Assign_statementContext):
        print_token("exitAssign_statement", ctx)


    # Enter a parse tree produced by GrammarParser#assign_operator.
    def enterAssign_operator(self, ctx:GrammarParser.Assign_operatorContext):
        print_token("enterAssign_operator", ctx)

    # Exit a parse tree produced by GrammarParser#assign_operator.
    def exitAssign_operator(self, ctx:GrammarParser.Assign_operatorContext):
        print_token("exitAssign_operator", ctx)


    # Enter a parse tree produced by GrammarParser#add_assign.
    def enterAdd_assign(self, ctx:GrammarParser.Add_assignContext):
        print_token("enterAdd_assign", ctx)

    # Exit a parse tree produced by GrammarParser#add_assign.
    def exitAdd_assign(self, ctx:GrammarParser.Add_assignContext):
        print_token("exitAdd_assign", ctx)


    # Enter a parse tree produced by GrammarParser#sub_assign.
    def enterSub_assign(self, ctx:GrammarParser.Sub_assignContext):
        print_token("enterSub_assign", ctx)

    # Exit a parse tree produced by GrammarParser#sub_assign.
    def exitSub_assign(self, ctx:GrammarParser.Sub_assignContext):
        print_token("exitSub_assign", ctx)


    # Enter a parse tree produced by GrammarParser#mul_assign.
    def enterMul_assign(self, ctx:GrammarParser.Mul_assignContext):
        print_token("enterMul_assign", ctx)

    # Exit a parse tree produced by GrammarParser#mul_assign.
    def exitMul_assign(self, ctx:GrammarParser.Mul_assignContext):
        print_token("exitMul_assign", ctx)


    # Enter a parse tree produced by GrammarParser#div_assign.
    def enterDiv_assign(self, ctx:GrammarParser.Div_assignContext):
        print_token("enterDiv_assign", ctx)

    # Exit a parse tree produced by GrammarParser#div_assign.
    def exitDiv_assign(self, ctx:GrammarParser.Div_assignContext):
        print_token("exitDiv_assign", ctx)


    # Enter a parse tree produced by GrammarParser#mod_assign.
    def enterMod_assign(self, ctx:GrammarParser.Mod_assignContext):
        print_token("enterMod_assign", ctx)

    # Exit a parse tree produced by GrammarParser#mod_assign.
    def exitMod_assign(self, ctx:GrammarParser.Mod_assignContext):
        print_token("exitMod_assign", ctx)


    # Enter a parse tree produced by GrammarParser#increment.
    def enterIncrement(self, ctx:GrammarParser.IncrementContext):
        print_token("enterIncrement", ctx)

    # Exit a parse tree produced by GrammarParser#increment.
    def exitIncrement(self, ctx:GrammarParser.IncrementContext):
        print_token("exitIncrement", ctx)


    # Enter a parse tree produced by GrammarParser#decrement.
    def enterDecrement(self, ctx:GrammarParser.DecrementContext):
        print_token("enterDecrement", ctx)

    # Exit a parse tree produced by GrammarParser#decrement.
    def exitDecrement(self, ctx:GrammarParser.DecrementContext):
        print_token("exitDecrement", ctx)


    # Enter a parse tree produced by GrammarParser#assign.
    def enterAssign(self, ctx:GrammarParser.AssignContext):
        print_token("enterAssign", ctx)

    # Exit a parse tree produced by GrammarParser#assign.
    def exitAssign(self, ctx:GrammarParser.AssignContext):
        print_token("exitAssign", ctx)


    # Enter a parse tree produced by GrammarParser#arith_operator.
    def enterArith_operator(self, ctx:GrammarParser.Arith_operatorContext):
        print_token("enterArith_operator", ctx)

    # Exit a parse tree produced by GrammarParser#arith_operator.
    def exitArith_operator(self, ctx:GrammarParser.Arith_operatorContext):
        print_token("exitArith_operator", ctx)


    # Enter a parse tree produced by GrammarParser#two_arg_arith_operator.
    def enterTwo_arg_arith_operator(self, ctx:GrammarParser.Two_arg_arith_operatorContext):
        print_token("enterTwo_arg_arith_operator", ctx)

    # Exit a parse tree produced by GrammarParser#two_arg_arith_operator.
    def exitTwo_arg_arith_operator(self, ctx:GrammarParser.Two_arg_arith_operatorContext):
        print_token("exitTwo_arg_arith_operator", ctx)


    # Enter a parse tree produced by GrammarParser#add.
    def enterAdd(self, ctx:GrammarParser.AddContext):
        print_token("enterAdd", ctx)

    # Exit a parse tree produced by GrammarParser#add.
    def exitAdd(self, ctx:GrammarParser.AddContext):
        print_token("exitAdd", ctx)


    # Enter a parse tree produced by GrammarParser#sub.
    def enterSub(self, ctx:GrammarParser.SubContext):
        print_token("enterSub", ctx)

    # Exit a parse tree produced by GrammarParser#sub.
    def exitSub(self, ctx:GrammarParser.SubContext):
        print_token("exitSub", ctx)


    # Enter a parse tree produced by GrammarParser#mul.
    def enterMul(self, ctx:GrammarParser.MulContext):
        print_token("enterMul", ctx)

    # Exit a parse tree produced by GrammarParser#mul.
    def exitMul(self, ctx:GrammarParser.MulContext):
        print_token("exitMul", ctx)


    # Enter a parse tree produced by GrammarParser#div.
    def enterDiv(self, ctx:GrammarParser.DivContext):
        print_token("enterDiv", ctx)

    # Exit a parse tree produced by GrammarParser#div.
    def exitDiv(self, ctx:GrammarParser.DivContext):
        print_token("exitDiv", ctx)


    # Enter a parse tree produced by GrammarParser#mod.
    def enterMod(self, ctx:GrammarParser.ModContext):
        print_token("enterMod", ctx)

    # Exit a parse tree produced by GrammarParser#mod.
    def exitMod(self, ctx:GrammarParser.ModContext):
        print_token("exitMod", ctx)