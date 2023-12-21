import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarListener import GrammarListener


def print_token(name, ctx):
    if 'exit' in name:
        return
    token_type = ctx.start.type
    token_name = GrammarParser.symbolicNames[token_type]
    if token_name == '<INVALID>':
        token_name = 'No name'
    token_text = ctx.start.text
    print(f'[{name}] Token: {token_name} - "{token_text}"')


class TokenPrintListener(GrammarListener):
    def __init__(self):
        self.result = {}
    def enterStart_(self, ctx:GrammarParser.Start_Context):
        print_token('enterStart_', ctx)

    # Exit a parse tree produced by GrammarParser#start_.
    def exitStart_(self, ctx:GrammarParser.Start_Context):
        print_token('exitStart_', ctx)


    # Enter a parse tree produced by GrammarParser#expr.
    def enterExpr(self, ctx:GrammarParser.ExprContext):
        print_token("enterExpr", ctx)

    # Exit a parse tree produced by GrammarParser#expr.
    def exitExpr(self, ctx:GrammarParser.ExprContext):
        print_token("exitExpr", ctx)


    # Enter a parse tree produced by GrammarParser#declare.
    def enterDeclare(self, ctx:GrammarParser.DeclareContext):
        print_token("enterDeclare", ctx)

    # Exit a parse tree produced by GrammarParser#declare.
    def exitDeclare(self, ctx:GrammarParser.DeclareContext):
        print_token("exitDeclare", ctx)


    # Enter a parse tree produced by GrammarParser#arith_opr.
    def enterArith_opr(self, ctx:GrammarParser.Arith_oprContext):
        print_token("enterArith_opr", ctx)

    # Exit a parse tree produced by GrammarParser#arith_opr.
    def exitArith_opr(self, ctx:GrammarParser.Arith_oprContext):
        print_token("exitArith_opr", ctx)


    # Enter a parse tree produced by GrammarParser#arith_assign_opr.
    def enterArith_assign_opr(self, ctx:GrammarParser.Arith_assign_oprContext):
        print_token("enterArith_assign_opr", ctx)

    # Exit a parse tree produced by GrammarParser#arith_assign_opr.
    def exitArith_assign_opr(self, ctx:GrammarParser.Arith_assign_oprContext):
        print_token("exitArith_assign_opr", ctx)


    # Enter a parse tree produced by GrammarParser#assign.
    def enterAssign(self, ctx:GrammarParser.AssignContext):
        print_token("enterAssign", ctx)

    # Exit a parse tree produced by GrammarParser#assign.
    def exitAssign(self, ctx:GrammarParser.AssignContext):
        print_token("exitAssign", ctx)


    # Enter a parse tree produced by GrammarParser#comparator.
    def enterComparator(self, ctx:GrammarParser.ComparatorContext):
        print_token("enterComparator", ctx)

    # Exit a parse tree produced by GrammarParser#comparator.
    def exitComparator(self, ctx:GrammarParser.ComparatorContext):
        print_token("exitComparator", ctx)


    # Enter a parse tree produced by GrammarParser#condition.
    def enterCondition(self, ctx:GrammarParser.ConditionContext):
        print_token("enterCondition", ctx)

    # Exit a parse tree produced by GrammarParser#condition.
    def exitCondition(self, ctx:GrammarParser.ConditionContext):
        print_token("exitCondition", ctx)


    # Enter a parse tree produced by GrammarParser#declaration.
    def enterDeclaration(self, ctx:GrammarParser.DeclarationContext):
        print_token("enterDeclaration", ctx)

    # Exit a parse tree produced by GrammarParser#declaration.
    def exitDeclaration(self, ctx:GrammarParser.DeclarationContext):
        print_token("exitDeclaration", ctx)


    # Enter a parse tree produced by GrammarParser#variable_declaration.
    def enterVariable_declaration(self, ctx:GrammarParser.Variable_declarationContext):
        print_token("enterVariable_declaration", ctx)

    # Exit a parse tree produced by GrammarParser#variable_declaration.
    def exitVariable_declaration(self, ctx:GrammarParser.Variable_declarationContext):
        print_token("exitVariable_declaration", ctx)


    # Enter a parse tree produced by GrammarParser#structure_declaration.
    def enterStructure_declaration(self, ctx:GrammarParser.Structure_declarationContext):
        print_token("enterStructure_declaration", ctx)

    # Exit a parse tree produced by GrammarParser#structure_declaration.
    def exitStructure_declaration(self, ctx:GrammarParser.Structure_declarationContext):
        print_token("exitStructure_declaration", ctx)


    # Enter a parse tree produced by GrammarParser#assignment_statement.
    def enterAssignment_statement(self, ctx:GrammarParser.Assignment_statementContext):
        print_token("enterAssignment_statement", ctx)

    # Exit a parse tree produced by GrammarParser#assignment_statement.
    def exitAssignment_statement(self, ctx:GrammarParser.Assignment_statementContext):
        print_token("exitAssignment_statement", ctx)


    # Enter a parse tree produced by GrammarParser#statement.
    def enterStatement(self, ctx:GrammarParser.StatementContext):
        print_token("enterStatement", ctx)

    # Exit a parse tree produced by GrammarParser#statement.
    def exitStatement(self, ctx:GrammarParser.StatementContext):
        print_token("exitStatement", ctx)


    # Enter a parse tree produced by GrammarParser#for_statement.
    def enterFor_statement(self, ctx:GrammarParser.For_statementContext):
        print_token("enterFor_statement", ctx)

    # Exit a parse tree produced by GrammarParser#for_statement.
    def exitFor_statement(self, ctx:GrammarParser.For_statementContext):
        print_token("exitFor_statement", ctx)


    # Enter a parse tree produced by GrammarParser#if_statement.
    def enterIf_statement(self, ctx:GrammarParser.If_statementContext):
        print_token("enterIf_statement", ctx)

    # Exit a parse tree produced by GrammarParser#if_statement.
    def exitIf_statement(self, ctx:GrammarParser.If_statementContext):
        print_token("exitIf_statement", ctx)


    # Enter a parse tree produced by GrammarParser#while_statement.
    def enterWhile_statement(self, ctx:GrammarParser.While_statementContext):
        print_token("enterWhile_statement", ctx)

    # Exit a parse tree produced by GrammarParser#while_statement.
    def exitWhile_statement(self, ctx:GrammarParser.While_statementContext):
        print_token("exitWhile_statement", ctx)


    # Enter a parse tree produced by GrammarParser#for_range_statement.
    def enterFor_range_statement(self, ctx:GrammarParser.For_range_statementContext):
        print_token("enterFor_range_statement", ctx)

    # Exit a parse tree produced by GrammarParser#for_range_statement.
    def exitFor_range_statement(self, ctx:GrammarParser.For_range_statementContext):
        print_token("exitFor_range_statement", ctx)


    # Enter a parse tree produced by GrammarParser#pass_statement.
    def enterPass_statement(self, ctx:GrammarParser.Pass_statementContext):
        print_token("enterPass_statement", ctx)

    # Exit a parse tree produced by GrammarParser#pass_statement.
    def exitPass_statement(self, ctx:GrammarParser.Pass_statementContext):
        print_token("exitPass_statement", ctx)


    # Enter a parse tree produced by GrammarParser#constant.
    def enterConstant(self, ctx:GrammarParser.ConstantContext):
        print_token("enterConstant", ctx)

    # Exit a parse tree produced by GrammarParser#constant.
    def exitConstant(self, ctx:GrammarParser.ConstantContext):
        print_token("exitConstant", ctx)


    # Enter a parse tree produced by GrammarParser#data_types.
    def enterData_types(self, ctx:GrammarParser.Data_typesContext):
        print_token("enterData_types", ctx)

    # Exit a parse tree produced by GrammarParser#data_types.
    def exitData_types(self, ctx:GrammarParser.Data_typesContext):
        print_token("exitData_types", ctx)


    # Enter a parse tree produced by GrammarParser#data_structures.
    def enterData_structures(self, ctx:GrammarParser.Data_structuresContext):
        print_token("enterData_structures", ctx)
    # Exit a parse tree produced by GrammarParser#data_structures.
    def exitData_structures(self, ctx:GrammarParser.Data_structuresContext):
        print_token("exitData_structures", ctx)
