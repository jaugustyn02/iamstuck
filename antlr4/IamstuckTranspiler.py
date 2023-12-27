from modules.CppCodeGenerator import CppCodeGenerator as CppCodegen
from antlr4.tree.Tree import TerminalNodeImpl


# Transpiler for Iamstuck language to C++
class IamstuckTranspiler:
    def __init__(self, rule_names):
        self.rule_names = rule_names
        self.node_counter = 1

    def next_node(self):
        node_id = self.node_counter
        self.node_counter += 1
        return node_id
    
    def get_label(self, node):
        if isinstance(node, TerminalNodeImpl):
            text = node.symbol.text.replace('"', '\\"')
            return f'\\"{text}\\"' if " " in text else text
        else:
            return f"{self.rule_names[node.getRuleIndex()]}"

    def generate_cpp_tree(self, tree):
        # empty tree
        cpp_tree = []

        def visit(node):
            current_node_id = self.next_node()
            # code.append(f'  {current_node_id} [label="{self.get_label(node)}"];')

            for i in range(node.getChildCount()):
                child = node.getChild(i)
                child_id = visit(child)
                # code.append(f'  {current_node_id} -> {child_id};')

            return current_node_id
        
        visit(tree)
        return cpp_tree

    def saveToFile(self, code: str, file_path: str):
        with open(file_path, "w") as f:
            f.write(code)

    def transpile(self, tree, file_path="output.cpp"):
        # 1. Translate to C++ AST
        cpp_tree = self.generate_cpp_tree(tree)

        print(cpp_tree)

        # 2. Generate C++ code from AST
        # cpp_code = CppCodegen.generate(cpp_tree)

        # 3. Save C++ code to file
        # self.saveToFile(cpp_code, file_path)