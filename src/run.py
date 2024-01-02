from modules.IamstuckTranspiler import IamstuckTranspiler
from antlr.GrammarLexer import GrammarLexer
from antlr.GrammarParser import GrammarParser
from antlr4 import FileStream, CommonTokenStream
import sys

CONTAINERS_DIR = "containers/"
OUTPUT_DIR = "output/"


def saveToFile(file_path: str, file_content: str):
    with open(file_path, 'w+') as file:
        file.write(file_content)
    print(f"File {file_path.split('/')[-1]} created successfuly")
    return True


def run(argv):
    if len(argv) < 2:
        print("Not enough arguments!")
        return False
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
        saveToFile(CONTAINERS_DIR + 'main.cpp', code)
    return True




if __name__ == "__main__":
    run(sys.argv)
