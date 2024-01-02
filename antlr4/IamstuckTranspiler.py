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
        node.add_child(TreeNode(node, "#include <containers.h>", True, right_sep="\n\n"))
        node.add_child(TreeNode(node, "using namespace std;", True, right_sep="\n\n\n"))
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

# Iamstuck keywords to C++ keywords
cpp_terminal = {
            'IF': '',
            'ELIF': 'else if',
            'ELSE': 'else',
            'WHILE': 'while',
            'FOR': 'for',
            'RETURN': 'return',
            'BREAK': 'break',
            ':': '{',
            'END': '}',
            'PASS': '',
            'STACK': 'Stack',
            'QUEUE': 'Queue',
            'DEQUE': 'Deque',
            'AND': '&&',
            'OR': '||',
            'NOT': '!',
            'XOR': '^',
            '<EOF>': '',
        }

defalt_separator = ''
terminal_separator = {
    '{': '\n',
    '}': '\n',
    ';': '\n',
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
            else:
                return f"{self.rule_names[node.getRuleIndex()]}"
            
        def get_first_terminal(node):
            if isinstance(node, TerminalNodeImpl):
                return node
            else:
                return get_first_terminal(node.getChild(0))
            
        def handle_terminal(node, parent, indentation=False):
            label = get_label(node)
            label = cpp_terminal.get(label, label)
            right_sep = terminal_separator.get(label, defalt_separator)
            if label == "":
                return None
            
            return TreeNode(parent, label, True, right_sep=right_sep, indentation=indentation)
        
        def handle_if_statement(cpp_node, node, if_start_index=0):
            cpp_node.add_child(TreeNode(cpp_node, "if", True, right_sep=""))
            cpp_node.add_child(TreeNode(cpp_node, "(", True, right_sep=""))
            cpp_node.add_child(transpile_node(node.getChild(if_start_index+1), cpp_node))
            cpp_node.add_child(TreeNode(cpp_node, ")", True))
            cpp_node.add_child(TreeNode(cpp_node, "{", True, right_sep="\n"))
            cpp_node.add_child(transpile_node(node.getChild(if_start_index+3), cpp_node, indentation=True))

            if node.getChildCount() > if_start_index + 4:
                cpp_node.add_child(TreeNode(cpp_node, "}", True, right_sep=" "))
                cpp_node.add_child(TreeNode(cpp_node, "else", True, right_sep=" "))
                if get_label(node.getChild(if_start_index + 4)) == "ELIF":
                    handle_if_statement(cpp_node, node, if_start_index+4)
                else: # label == 'ELSE'
                    cpp_node.add_child(TreeNode(cpp_node, "{", True, right_sep="\n"))
                    cpp_node.add_child(transpile_node(node.getChild(if_start_index+6), cpp_node, indentation=True))
            return cpp_node
        
        def handle_for_each_statement(cpp_node, node):
            cpp_node.add_child(TreeNode(cpp_node, "for", True, right_sep=""))
            cpp_node.add_child(TreeNode(cpp_node, "(", True, right_sep=""))
            cpp_node.add_child(TreeNode(cpp_node, "auto", True, right_sep=" "))
            cpp_node.add_child(transpile_node(node.getChild(1), cpp_node))
            cpp_node.add_child(TreeNode(cpp_node, ":", True,left_sep=" " ,right_sep=" "))
            cpp_node.add_child(transpile_node(node.getChild(3), cpp_node))
            cpp_node.add_child(TreeNode(cpp_node, ")", True, right_sep=""))
            cpp_node.add_child(TreeNode(cpp_node, "{", True, right_sep="\n"))
            cpp_node.add_child(transpile_node(node.getChild(5), cpp_node, True))
            return cpp_node
        
        def handle_for_range_statement(cpp_node, node):
            iterator = transpile_node(node.getChild(1), cpp_node)
            cpp_node.add_child(TreeNode(cpp_node, "for", True, right_sep=""))
            cpp_node.add_child(TreeNode(cpp_node, "(", True, right_sep=""))
            if get_label(node.getChild(4)) == ")":
                cpp_node.add_child(TreeNode(cpp_node, "auto ", True, right_sep=""))
                cpp_node.add_child(iterator)
                cpp_node.add_child(TreeNode(cpp_node, "=0;", True, right_sep=""))
                cpp_node.add_child(iterator)
                cpp_node.add_child(TreeNode(cpp_node, "<", True, right_sep=""))
                cpp_node.add_child(transpile_node(node.getChild(3), cpp_node))
                cpp_node.add_child(TreeNode(cpp_node, "; i++)", True, right_sep=""))
                cpp_node.add_child(TreeNode(cpp_node, "{", True, right_sep="\n"))
                cpp_node.add_child(transpile_node(node.getChild(6), cpp_node, True))
            elif get_label(node.getChild(6)) == ")":
                cpp_node.add_child(TreeNode(cpp_node, "auto ", True, right_sep=""))
                cpp_node.add_child(iterator)
                cpp_node.add_child(TreeNode(cpp_node, "=", True, right_sep=""))
                cpp_node.add_child(transpile_node(node.getChild(3), cpp_node))
                cpp_node.add_child(TreeNode(cpp_node, ";", True, right_sep=""))
                cpp_node.add_child(iterator)
                cpp_node.add_child(TreeNode(cpp_node, "<", True, right_sep=""))
                cpp_node.add_child(transpile_node(node.getChild(5), cpp_node))
                cpp_node.add_child(TreeNode(cpp_node, ";", True, right_sep=""))
                cpp_node.add_child(iterator)
                cpp_node.add_child(TreeNode(cpp_node, "++)", True, right_sep=""))
                cpp_node.add_child(TreeNode(cpp_node, "{", True, right_sep="\n"))
                cpp_node.add_child(transpile_node(node.getChild(8), cpp_node, True))
            elif get_label(node.getChild(8)):
                cpp_node.add_child(TreeNode(cpp_node, "auto ", True, right_sep=""))
                cpp_node.add_child(iterator)
                cpp_node.add_child(TreeNode(cpp_node, " = ", True, right_sep=""))
                cpp_node.add_child(transpile_node(node.getChild(3), cpp_node))
                cpp_node.add_child(TreeNode(cpp_node, ";(", True, right_sep=""))
                cpp_node.add_child(transpile_node(node.getChild(7), cpp_node))
                cpp_node.add_child(TreeNode(cpp_node, "<0 ? ", True, right_sep=""))
                cpp_node.add_child(iterator)
                cpp_node.add_child(TreeNode(cpp_node, " > ", True, right_sep=""))
                cpp_node.add_child(transpile_node(node.getChild(5), cpp_node))
                cpp_node.add_child(TreeNode(cpp_node, ": ", True, right_sep=""))
                cpp_node.add_child(iterator)
                cpp_node.add_child(TreeNode(cpp_node, " < ", True, right_sep=""))
                cpp_node.add_child(transpile_node(node.getChild(5), cpp_node))
                cpp_node.add_child(TreeNode(cpp_node, ");", True, right_sep=""))
                cpp_node.add_child(iterator)
                cpp_node.add_child(TreeNode(cpp_node, "+=", True, right_sep=""))
                cpp_node.add_child(transpile_node(node.getChild(7), cpp_node))
                cpp_node.add_child(TreeNode(cpp_node, ")", True, right_sep=""))
                cpp_node.add_child(TreeNode(cpp_node, "{", True, right_sep="\n"))
                cpp_node.add_child(transpile_node(node.getChild(10), cpp_node, True))
            return cpp_node
        
        def handle_while_statement(cpp_node, node):
            cpp_node.add_child(TreeNode(cpp_node, 'while(', True, right_sep=""))
            cpp_node.add_child(transpile_node(node.getChild(1), cpp_node))
            cpp_node.add_child(TreeNode(cpp_node, '){', True, right_sep="\n"))
            cpp_node.add_child(transpile_node(node.getChild(3), cpp_node, True))
            return cpp_node
        
        def handle_print_statement(cpp_node, node):
            cpp_node.add_child(TreeNode(cpp_node, 'cout<<', True, right_sep=""))
            cpp_node.add_child(transpile_node(node.getChild(2), cpp_node))
            return cpp_node
        
        def handle_println_statement(cpp_node, node):
            cpp_node.add_child(TreeNode(cpp_node, 'cout<<', True, right_sep=""))
            cpp_node.add_child(transpile_node(node.getChild(2), cpp_node))
            cpp_node.add_child(TreeNode(cpp_node, '<<endl', True, right_sep=""))
            return cpp_node
        
        def handle_variable_declaration(cpp_node, node):
            cpp_node.add_child(transpile_node(node.getChild(0), cpp_node))
            cpp_node.add_child(TreeNode(cpp_node, " ", True, right_sep=""))
            for i in range(1, node.getChildCount()):
                cpp_node.add_child(transpile_node(node.getChild(i), cpp_node))
            return cpp_node

        def handle_function_definition(cpp_node, node):
            type_spec_node = transpile_node(node.getChild(1), cpp_node)
            type_spec_node.right_sep = " "
            cpp_node.add_child(type_spec_node)
            
            func_name_node = transpile_node(node.getChild(2), cpp_node)
            cpp_node.add_child(func_name_node)

            cpp_node.add_child(TreeNode(cpp_node, "(", True, right_sep=""))
            # function arguments declaration
            var_decl_start_index = 4
            while get_label(node.getChild(var_decl_start_index)) != ")":
                var_type = transpile_node(node.getChild(var_decl_start_index), cpp_node)
                var_type.right_sep = " "
                cpp_node.add_child(var_type)
                var_name = transpile_node(node.getChild(var_decl_start_index+1), cpp_node)
                cpp_node.add_child(var_name)
                if get_label(node.getChild(var_decl_start_index+2)) == ",":
                    cpp_node.add_child(TreeNode(cpp_node, ",", True, right_sep=" "))
                    var_decl_start_index += 3
                else:
                    var_decl_start_index += 2

            cpp_node.add_child(TreeNode(cpp_node, ")", True))

            cpp_node.add_child(TreeNode(cpp_node, "{", True, right_sep="\n"))

            func_body_node = transpile_node(node.getChild(var_decl_start_index + 2), cpp_node, indentation=True)
            cpp_node.add_child(func_body_node)

            prime_nodes.add_child(cpp_node)
            return None

            
        def transpile_node(node, parent=None, indentation=False):
            if isinstance(node, TerminalNodeImpl):
                return handle_terminal(node, parent, indentation)
            
            cpp_node = TreeNode(parent, get_label(node), isTerminal=False, indentation=indentation)

            if cpp_node.label == "if_statement":
                return handle_if_statement(cpp_node, node)
            elif cpp_node.label == "function_definition":
                return handle_function_definition(cpp_node, node)
            elif cpp_node.label == "for_each_statement":
                return handle_for_each_statement(cpp_node, node)
            elif cpp_node.label == "for_range_statement":
                return handle_for_range_statement(cpp_node, node)
            elif cpp_node.label == "while_statement":
                return handle_while_statement(cpp_node, node)
            elif cpp_node.label == "print_statement":
                return handle_print_statement(cpp_node, node)
            elif cpp_node.label == "println_statement":
                return handle_println_statement(cpp_node, node)
            elif cpp_node.label == "variable_declaration":
                return handle_variable_declaration(cpp_node, node)
            else:
                for i in range(node.getChildCount()):
                    child = node.getChild(i)
                    node_transpiled = transpile_node(child, cpp_node)
                    if node_transpiled is not None:
                        cpp_node.add_child(node_transpiled)

            if prime_nodes.add_child(cpp_node): # cpp_node.label in ("function_definition", "container_declaration")
                return None
            if cpp_node.get_children_count() == 0:
                return None
            if cpp_node.label == "statement" and cpp_node.get_children_count() <= 1:
                return None
            
            # Return node only if it was not added to functions or containers and is not a empty statement
            return cpp_node
            
        
        prime_nodes = PrimeNodes()
        prime_nodes.main_function_body.add_child(transpile_node(tree))

        cpp_tree = TreeNode(None, "program", False)
        for node in prime_nodes.get_prime_nodes():
            cpp_tree.add_child(node)
        return cpp_tree
