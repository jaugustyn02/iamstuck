

class CodeGenerator:
    def __init__(self):
        pass

    @staticmethod
    def generate(tree) -> str:
        def visit(node):
            if node.isTerminal:
                return node.get_text()
            return "    "*node.identation + "".join([visit(child) for child in node.get_children()])

        cpp_code = visit(tree)
    
        return cpp_code

    @staticmethod
    def print_tree(tree):
        def visit(node):
            print(node)
            for child in node.get_children():
                visit(child)

        visit(tree)
