import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarLexer import GrammarLexer
from GrammarListener import GrammarListener
# from TokenPrintListener import TokenPrintListener

from antlr4.tree.Trees import Trees
from antlr4.tree.Tree import ParseTreeVisitor
from graphviz import Source

from modules.DOTGenerator import DOTGenerator
from IamstuckTranspiler import IamstuckTranspiler

class PrintVisitor(ParseTreeVisitor):
    def visitTerminal(self, node):
        print(Trees.getNodeText(node, GrammarParser.ruleNames))
        return super().visitTerminal(node)


def render_tree(tree, parser, name="tree"):
    dot_generator = DOTGenerator(parser.ruleNames, GrammarParser.literalNames, GrammarParser.symbolicNames)
    dot_data = dot_generator.to_dot(tree)

    graph = Source(dot_data, format="svg")  # You can change the format to other supported formats like "pdf", "svg", etc.
    graph.render("tree_graphs/"+name, view=True)
    

def main(argv):
    file_name = argv[1].split("/")[-1].split(".")[0]

    input_stream = FileStream(argv[1])
    lexer = GrammarLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.program()
    if parser.getNumberOfSyntaxErrors() > 0:
        print("syntax errors")
    else:
        linterp = GrammarListener()
        # linterp = TokenPrintListener()
        walker = ParseTreeWalker()
        walker.walk(linterp, tree)
        render_tree(tree, parser, file_name)

    # print(Trees.toStringTree(tree, None, parser))


def test_transpiler(argv):
    input_stream = FileStream(argv[1])
    lexer = GrammarLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = GrammarParser(stream)
    tree = parser.program()
    if parser.getNumberOfSyntaxErrors() > 0:
        print("syntax errors")
    else:
        transpiler = IamstuckTranspiler(parser.ruleNames)
        code = transpiler.transpile(tree)
        print(code)
    

if __name__ == '__main__':
    # main(sys.argv)
    test_transpiler(sys.argv)