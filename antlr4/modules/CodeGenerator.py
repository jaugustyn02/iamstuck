

class CodeGenerator:
    def __init__(self):
        pass

    @staticmethod
    def generate(tree) -> str:
        def visit(node):
            if node.isTerminal:
                return node.get_text()
            return "".join([visit(child) for child in node.get_children()])

        cpp_code = visit(tree)
        # cpp_code = cpp_code.replace(";", ";\n").replace("{", "{\n").replace("}", "}\n\n")
    
        return cpp_code

    @staticmethod
    def print_tree(tree):
        def visit(node):
            print(node)
            for child in node.get_children():
                visit(child)

        visit(tree)
