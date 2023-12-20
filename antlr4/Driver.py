import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarLexer import GrammarLexer
from GrammarListener import GrammarListener
from TokenPrintListener import TokenPrintListener


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = GrammarLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.start_()
    if parser.getNumberOfSyntaxErrors() > 0:
        print("syntax errors")
    else:
        # linterp = GrammarListener()
        linterp = TokenPrintListener()
        walker = ParseTreeWalker()
        walker.walk(linterp, tree)

if __name__ == '__main__':
    main(sys.argv)