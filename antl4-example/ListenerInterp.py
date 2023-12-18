import sys
from antlr4 import *
from ExprParser import ExprParser
from ExprListener import ExprListener

class ListenerInterp(ExprListener):
    def __init__(self):
        self.result = {}

    def exitAtom(self, ctx:ExprParser.AtomContext):
        self.result[ctx] = int(ctx.getText())

    def exitExpr(self, ctx:ExprParser.ExprContext):
        if ctx.getChildCount() == 3:
            if ctx.getChild(0).getText() == "(":
                self.result[ctx] = self.result[ctx.getChild(1)]
            else:
                opc = ctx.getChild(1).getText()
                v1 = self.result[ctx.getChild(0)]
                v2 = self.result[ctx.getChild(2)]
                if opc == "+":
                    self.result[ctx] = v1 + v2
                elif opc == "-":
                    self.result[ctx] = v1 - v2
                elif opc == "*":
                    self.result[ctx] = v1 * v2
                elif opc == "/":
                    self.result[ctx] = v1 / v2
                else:
                    ctx.result[ctx] = 0
        elif ctx.getChildCount() == 2:
            opc = ctx.getChild(0).getText()
            if opc == "+":
                v = self.result[ctx.getChild(1)]
                self.result[ctx] = v
            elif opc == "-":
                v = self.result[ctx.getChild(1)]
                self.result[ctx] = - v
        elif ctx.getChildCount() == 1:
            self.result[ctx] = self.result[ctx.getChild(0)]

    def exitStart_(self, ctx:ExprParser.Start_Context):
        for i in range(0, ctx.getChildCount(), 2):
            print(self.result[ctx.getChild(i)])