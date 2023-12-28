from modules.CodeGenerator import CodeGenerator as Codegen
from antlr4.tree.Tree import TerminalNodeImpl
from modules.TreeNode import TreeNode


class PrimeNodes:
    def __init__(self):
        self.includes_node = self.init_includes()
        self.functions_node = self.init_functions()
        self.containers_node = self.init_containers()
        self.main_function_node = self.init_main_function()

        self.prime_nodes: list[TreeNode] = [self.includes_node, self.containers_node, self.functions_node, self.main_function_node]

    def init_includes(self):
        node = TreeNode(None, "includes", False)
        node.add_child(TreeNode(node, "#include <iostream>", True, right_sep="\n"))
        node.add_child(TreeNode(node, "#include <containers.h>", True, right_sep="\n\n\n"))
        return node
    
    def init_functions(self):
        node = TreeNode(None, "functions", False)
        self.functions_body = TreeNode(node, "functions_body", False)
        node.add_child(self.functions_body)
        return node
        
    def init_containers(self):
        node = TreeNode(None, "containers", False)
        self.containers_body = TreeNode(node, "containers_body", False)
        node.add_child(self.containers_body)
        node.add_child(TreeNode(node, "", True, right_sep="\n"))
        return node

    def init_main_function(self):
        node = TreeNode(None, "main_function", False)
        node.add_child(TreeNode(node, "int main()", True))
        node.add_child(TreeNode(node, "{", True, right_sep="\n"))

        self.main_function_body = TreeNode(node, "function_body", False)
        node.add_child(self.main_function_body)

        node.add_child(TreeNode(node, "return 0;", True, right_sep="\n"))
        node.add_child(TreeNode(node, "}", True, right_sep="\n"))
        return node

    def get_prime_nodes(self):
        return self.prime_nodes
    
    def add_child(self, node):
        if node.label == "function_definition":
            node.add_child(TreeNode(node, "}", True, right_sep="\n\n"))
            node.parent = self.functions_node
            self.functions_body.add_child(node)
            return True
        elif node.label == "container_declaration":
            node.add_child(TreeNode(node, ";", True, right_sep="\n"))
            node.parent = self.containers_node
            self.containers_body.add_child(node)
            return True
        return False

label_map = {
            'IF': 'if',
            'ELIF': 'else if',
            'ELSE': 'else',
            'WHILE': 'while',
            'FOR': 'for',
            'RETURN': 'return',
            'BREAK': 'break',
            ':': '{',
            'END': '}',
            'PASS': 'pass',
            'STACK': 'Stack',
            'QUEUE': 'Queue',
            'DEQUE': 'Deque',
            '<EOF>': '',
        }

defalt_separator = ' '
separator_map = {
    '(': '',
    ')': '',
    '[': '',
    '{': '\n',
    '}': '\n',
    ';': '\n',
    ' ': '',
    '': '',
}


# Transpiler for Iamstuck language to C++
class IamstuckTranspiler:
    def __init__(self, rule_names):
        self.rule_names = rule_names
        self.node_counter = 1


    def transpile(self, tree) -> str:
        # 1. Translate to C++ AST
        cpp_tree = self.generate_cpp_tree(tree)

        # print(cpp_tree)
        # Codegen.print_tree(cpp_tree)

        # 2. Generate C++ code from AST
        cpp_code = Codegen.generate(cpp_tree)
        return cpp_code

#################################################################

    def generate_cpp_tree(self, tree):
        def get_label(node):
            if isinstance(node, TerminalNodeImpl):
                return node.symbol.text
                # text = node.symbol.text.replace('"', '\\"')
                # return f'\\"{text}\\"' if " " in text else text
            else:
                return f"{self.rule_names[node.getRuleIndex()]}"
            
        def transpile_node(node, parent=None, indentation_tabs=0):
            if isinstance(node, TerminalNodeImpl):
                label = get_label(node)
                label = label_map[label] if label in label_map else label
                right_sep = separator_map.get(label, defalt_separator)
                return TreeNode(parent, label, True, indent_tabs=indentation_tabs, right_sep=right_sep)
            else:
                cpp_node = TreeNode(parent, get_label(node), False)
                for i in range(node.getChildCount()):
                    child = node.getChild(i)
                    node_transpiled = transpile_node(child, cpp_node, indentation_tabs)
                    if node_transpiled is not None:
                        cpp_node.add_child(node_transpiled)
                
                if not prime_nodes.add_child(cpp_node) and cpp_node.get_children_count() > 0:
                    if cpp_node.label != "statement" or cpp_node.get_children_count() > 1:
                        return cpp_node
                return None

        prime_nodes = PrimeNodes()
        prime_nodes.main_function_body.add_child(transpile_node(tree))

        cpp_tree = TreeNode(None, "program", False)
        for node in prime_nodes.get_prime_nodes():
            cpp_tree.add_child(node)
        return cpp_tree
