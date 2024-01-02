import sys
from antlr4 import *
from GrammarParser import GrammarParser
from GrammarLexer import GrammarLexer
from GrammarListener import GrammarListener
from graphviz import Source
from DOTGenerator import DOTGenerator


def render_tree(tree, parser, name="tree"):
    dot_generator = DOTGenerator(parser.ruleNames, GrammarParser.literalNames, GrammarParser.symbolicNames)
    dot_data = dot_generator.to_dot(tree)

    graph = Source(dot_data, format="svg")  # You can change the format to other supported formats like "pdf", "svg", etc.
    graph.render("graphs/"+name, view=True)
    

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
        walker = ParseTreeWalker()
        walker.walk(linterp, tree)
        render_tree(tree, parser, file_name)



if __name__ == '__main__':
    main(sys.argv)

