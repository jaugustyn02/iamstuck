

class CodeGenerator:
    identation_symbol = "    "

    def __init__(self):
        pass

    @staticmethod
    def generate(tree) -> str:
        def get_ident(node):
            return CodeGenerator.identation_symbol*node.identation

        def visit(node):
            if node.isTerminal:
                return get_ident(node) + node.get_text()
            return get_ident(node) + node.left_sep + "".join([visit(child) for child in node.get_children()]) + node.right_sep

        cpp_code = visit(tree)
    
        return cpp_code

    @staticmethod
    def print_tree(tree):
        def visit(node):
            print(node)
            for child in node.get_children():
                visit(child)

        visit(tree)
