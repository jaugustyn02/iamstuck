import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarListener import GrammarListener


class ListenerGrammar(GrammarListener):
    def __init__(self):
        self.result = {}
    def enterStart_(self, ctx:GrammarParser.Start_Context):
        print("enterStart_")

    # Exit a parse tree produced by GrammarParser#start_.
    def exitStart_(self, ctx:GrammarParser.Start_Context):
        print("exitStart_")


    # Enter a parse tree produced by GrammarParser#expr.
    def enterExpr(self, ctx:GrammarParser.ExprContext):
        print("enterExpr")

    # Exit a parse tree produced by GrammarParser#expr.
    def exitExpr(self, ctx:GrammarParser.ExprContext):
        print("exitExpr")


    # Enter a parse tree produced by GrammarParser#declare.
    def enterDeclare(self, ctx:GrammarParser.DeclareContext):
        print("enterDeclare")

    # Exit a parse tree produced by GrammarParser#declare.
    def exitDeclare(self, ctx:GrammarParser.DeclareContext):
        print("exitDeclare")


    # Enter a parse tree produced by GrammarParser#arith_opr.
    def enterArith_opr(self, ctx:GrammarParser.Arith_oprContext):
        print("enterArith_opr")

    # Exit a parse tree produced by GrammarParser#arith_opr.
    def exitArith_opr(self, ctx:GrammarParser.Arith_oprContext):
        print("exitArith_opr")


    # Enter a parse tree produced by GrammarParser#arith_assign_opr.
    def enterArith_assign_opr(self, ctx:GrammarParser.Arith_assign_oprContext):
        print("enterArith_assign_opr")

    # Exit a parse tree produced by GrammarParser#arith_assign_opr.
    def exitArith_assign_opr(self, ctx:GrammarParser.Arith_assign_oprContext):
        print("exitArith_assign_opr")


    # Enter a parse tree produced by GrammarParser#assign.
    def enterAssign(self, ctx:GrammarParser.AssignContext):
        print("enterAssign")

    # Exit a parse tree produced by GrammarParser#assign.
    def exitAssign(self, ctx:GrammarParser.AssignContext):
        print("exitAssign")


    # Enter a parse tree produced by GrammarParser#comparator.
    def enterComparator(self, ctx:GrammarParser.ComparatorContext):
        print("enterComparator")

    # Exit a parse tree produced by GrammarParser#comparator.
    def exitComparator(self, ctx:GrammarParser.ComparatorContext):
        print("exitComparator")


    # Enter a parse tree produced by GrammarParser#condition.
    def enterCondition(self, ctx:GrammarParser.ConditionContext):
        print("enterCondition")

    # Exit a parse tree produced by GrammarParser#condition.
    def exitCondition(self, ctx:GrammarParser.ConditionContext):
        print("exitCondition")


    # Enter a parse tree produced by GrammarParser#declaration.
    def enterDeclaration(self, ctx:GrammarParser.DeclarationContext):
        print("enterDeclaration")

    # Exit a parse tree produced by GrammarParser#declaration.
    def exitDeclaration(self, ctx:GrammarParser.DeclarationContext):
        print("exitDeclaration")


    # Enter a parse tree produced by GrammarParser#variable_declaration.
    def enterVariable_declaration(self, ctx:GrammarParser.Variable_declarationContext):
        print("enterVariable_declaration")

    # Exit a parse tree produced by GrammarParser#variable_declaration.
    def exitVariable_declaration(self, ctx:GrammarParser.Variable_declarationContext):
        print("exitVariable_declaration")


    # Enter a parse tree produced by GrammarParser#structure_declaration.
    def enterStructure_declaration(self, ctx:GrammarParser.Structure_declarationContext):
        print("enterStructure_declaration")

    # Exit a parse tree produced by GrammarParser#structure_declaration.
    def exitStructure_declaration(self, ctx:GrammarParser.Structure_declarationContext):
        print("exitStructure_declaration")


    # Enter a parse tree produced by GrammarParser#assignment_statement.
    def enterAssignment_statement(self, ctx:GrammarParser.Assignment_statementContext):
        print("enterAssignment_statement")

    # Exit a parse tree produced by GrammarParser#assignment_statement.
    def exitAssignment_statement(self, ctx:GrammarParser.Assignment_statementContext):
        print("exitAssignment_statement")


    # Enter a parse tree produced by GrammarParser#statement.
    def enterStatement(self, ctx:GrammarParser.StatementContext):
        print("enterStatement")

    # Exit a parse tree produced by GrammarParser#statement.
    def exitStatement(self, ctx:GrammarParser.StatementContext):
        print("exitStatement")


    # Enter a parse tree produced by GrammarParser#for_statement.
    def enterFor_statement(self, ctx:GrammarParser.For_statementContext):
        print("enterFor_statement")

    # Exit a parse tree produced by GrammarParser#for_statement.
    def exitFor_statement(self, ctx:GrammarParser.For_statementContext):
        print("exitFor_statement")


    # Enter a parse tree produced by GrammarParser#if_statement.
    def enterIf_statement(self, ctx:GrammarParser.If_statementContext):
        print("enterIf_statement")

    # Exit a parse tree produced by GrammarParser#if_statement.
    def exitIf_statement(self, ctx:GrammarParser.If_statementContext):
        print("exitIf_statement")


    # Enter a parse tree produced by GrammarParser#while_statement.
    def enterWhile_statement(self, ctx:GrammarParser.While_statementContext):
        print("enterWhile_statement")

    # Exit a parse tree produced by GrammarParser#while_statement.
    def exitWhile_statement(self, ctx:GrammarParser.While_statementContext):
        print("exitWhile_statement")


    # Enter a parse tree produced by GrammarParser#for_range_statement.
    def enterFor_range_statement(self, ctx:GrammarParser.For_range_statementContext):
        print("enterFor_range_statement")

    # Exit a parse tree produced by GrammarParser#for_range_statement.
    def exitFor_range_statement(self, ctx:GrammarParser.For_range_statementContext):
        print("exitFor_range_statement")


    # Enter a parse tree produced by GrammarParser#pass_statement.
    def enterPass_statement(self, ctx:GrammarParser.Pass_statementContext):
        print("enterPass_statement")

    # Exit a parse tree produced by GrammarParser#pass_statement.
    def exitPass_statement(self, ctx:GrammarParser.Pass_statementContext):
        print("exitPass_statement")


    # Enter a parse tree produced by GrammarParser#constant.
    def enterConstant(self, ctx:GrammarParser.ConstantContext):
        print("enterConstant")

    # Exit a parse tree produced by GrammarParser#constant.
    def exitConstant(self, ctx:GrammarParser.ConstantContext):
        print("exitConstant")


    # Enter a parse tree produced by GrammarParser#data_types.
    def enterData_types(self, ctx:GrammarParser.Data_typesContext):
        print("enterData_types")

    # Exit a parse tree produced by GrammarParser#data_types.
    def exitData_types(self, ctx:GrammarParser.Data_typesContext):
        print("exitData_types")


    # Enter a parse tree produced by GrammarParser#data_structures.
    def enterData_structures(self, ctx:GrammarParser.Data_structuresContext):
        print("enterData_structures")
    # Exit a parse tree produced by GrammarParser#data_structures.
    def exitData_structures(self, ctx:GrammarParser.Data_structuresContext):
        print("exitData_structures")