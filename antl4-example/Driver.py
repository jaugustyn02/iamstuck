import sys
from antlr4 import *
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from GrammarParser import GrammarParser
from GrammarLexer import GrammarLexer
from GrammarListener import GrammarListener
from ListenerInterp import ListenerInterp
from ListenerGrammar import ListenerGrammar


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = ExprLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = ExprParser(stream)
    tree = parser.start_()
    if parser.getNumberOfSyntaxErrors() > 0:
        print("syntax errors")
    else:
        linterp = ListenerInterp()
        walker = ParseTreeWalker()
        walker.walk(linterp, tree)

def main2(argv):
    input_stream = FileStream(argv[1])
    lexer = GrammarLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.start_()
    if parser.getNumberOfSyntaxErrors() > 0:
        print("syntax errors")
    else:
        linterp = GrammarListener()
        walker = ParseTreeWalker()
        walker.walk(linterp, tree)

if __name__ == '__main__':
    main2(sys.argv)