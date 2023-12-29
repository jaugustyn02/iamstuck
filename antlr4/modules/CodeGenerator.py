

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
            children =  [visit(child) for child in node.get_children()]
            text = node.left_sep + get_ident(node) + ("".join(children[:-1])).replace('\n', '\n'+get_ident(node)) +  children[-1] + node.right_sep         
            return text

        cpp_code = visit(tree)
    
        return cpp_code

    @staticmethod
    def print_tree(tree):
        def visit(node):
            print(node)
            for child in node.get_children():
                visit(child)

        visit(tree)
