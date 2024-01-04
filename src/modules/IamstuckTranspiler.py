from modules.CodeGenerator import CodeGenerator as Codegen
from antlr4.tree.Tree import TerminalNodeImpl
from modules.TreeNode import TreeNode


class PrimeNodes:
    def __init__(self):
        self.includes_node = self.init_includes()
        self.containers_node = self.init_containers()
        self.functions_node = self.init_functions()
        self.main_function_node = self.init_main_function()

        self.prime_nodes: list[TreeNode] = [self.includes_node, self.containers_node, self.functions_node, self.main_function_node]

    def init_includes(self):
        node = TreeNode(None, "includes", False)
        node.add_child(TreeNode(node, "#include <iostream>", True, right_sep="\n"))
        node.add_child(TreeNode(node, "#include \"containers.h\"", True, right_sep="\n\n"))
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
    
    def add_function(self, node: TreeNode):
        node.add_child(TreeNode(node, "}", True, right_sep="\n\n"))
        node.parent = self.functions_body
        self.functions_body.add_child(node)
    
    def add_container(self, node: TreeNode):
        node.add_child(TreeNode(node, ";", True, right_sep="\n"))
        node.parent = self.containers_body
        self.containers_body.add_child(node)

    def add_main_func_body(self, node: TreeNode):
        self.main_function_body.add_child(node)

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

        # 2. Generate C++ code from AST
        cpp_code = Codegen.generate(cpp_tree)
        return cpp_code

#################################################################

    def generate_cpp_tree(self, tree):
        def get_label(node):
            if isinstance(node, TerminalNodeImpl):
                return node.symbol.text
            if node is None:
                return ""
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
            
            return TreeNode(parent, label, True, right_sep=right_sep, indentation=indentation)
        
        def handle_if_statement(cpp_node, node, if_start_index=0):
            cpp_node.add_child(TreeNode(cpp_node, "if", True, right_sep=" "))
            cpp_node.add_child(TreeNode(cpp_node, "(", True, right_sep=""))
            cpp_node.add_child(transpile_node(node.getChild(if_start_index+1), cpp_node))
            cpp_node.add_child(TreeNode(cpp_node, ")", True))
            cpp_node.add_child(TreeNode(cpp_node, "{", True, right_sep="\n"))

            skip_next_terminal = False
            for i in range(if_start_index+3, node.getChildCount()):
                if get_label(node.getChild(i)) == "ELIF":
                    cpp_node.add_child(TreeNode(cpp_node, "}", True, right_sep=" "))
                    cpp_node.add_child(TreeNode(cpp_node, "else", True, right_sep=" "))
                    handle_if_statement(cpp_node, node, i)
                    break
                elif get_label(node.getChild(i)) == "ELSE":
                    cpp_node.add_child(TreeNode(cpp_node, "}", True, right_sep=" "))
                    cpp_node.add_child(TreeNode(cpp_node, "else", True, right_sep=""))
                    cpp_node.add_child(TreeNode(cpp_node, "{", True, right_sep="\n"))
                    skip_next_terminal = True # skip '{'
                elif not skip_next_terminal:
                    cpp_node.add_child(transpile_node(node.getChild(i), cpp_node, indentation=True))
                else:
                    skip_next_terminal = False

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
            cpp_node.add_child(TreeNode(cpp_node, 'cout << ', True, right_sep=""))
            arg = node.getChild(2)
            for i in range(arg.getChildCount()):
                if get_label(arg.getChild(i)) == ",":
                    cpp_node.add_child(TreeNode(cpp_node, " << ", True, right_sep=""))
                else:
                    cpp_node.add_child(transpile_node(arg.getChild(i), cpp_node))
            return cpp_node
        
        def handle_println_statement(cpp_node, node):
            cpp_node.add_child(TreeNode(cpp_node, 'cout << ', True, right_sep=""))
            arg = node.getChild(2)
            for i in range(arg.getChildCount()):
                if get_label(arg.getChild(i)) == ",":
                    cpp_node.add_child(TreeNode(cpp_node, " << ", True, right_sep=""))
                else:
                    cpp_node.add_child(transpile_node(arg.getChild(i), cpp_node))
            cpp_node.add_child(TreeNode(cpp_node, ' << endl', True, right_sep=""))
            return cpp_node
        
        def handle_printf_statement(cpp_node, node):
            cpp_node.add_child(TreeNode(cpp_node, "cout << ", True, right_sep=""))
            childreen = node.getChild(4)
            licznik = 0
            s = get_label(node.getChild(2))
            for i in range(len(s)):
                if s[i] == "{" and s[i+1] == "}":
                    cpp_node.add_child(TreeNode(cpp_node, "\" << ", True, right_sep=""))
                    cpp_node.add_child(transpile_node(childreen.getChild(licznik), cpp_node))
                    licznik += 2
                    if i != len(s)-2:
                        cpp_node.add_child(TreeNode(cpp_node, " << \"", True, right_sep=""))
                elif i>0 and s[i-1] == "{" and s[i] == "}":
                    pass
                else:
                    cpp_node.add_child(TreeNode(cpp_node, s[i], True, right_sep=""))
            return cpp_node

        def handle_variable_declaration(cpp_node, node):
            cpp_node.add_child(transpile_node(node.getChild(0), cpp_node))
            cpp_node.add_child(TreeNode(cpp_node, " ", True, right_sep=""))
            for i in range(1, node.getChildCount()):
                cpp_node.add_child(transpile_node(node.getChild(i), cpp_node))
            return cpp_node
        
        def handle_container_declaration(cpp_node, node):
            for i in range(4):
                cpp_node.add_child(transpile_node(node.getChild(i), cpp_node))
            cpp_node.add_child(TreeNode(cpp_node, " ", True, right_sep=""))
            for i in range(4, node.getChildCount()):
                cpp_node.add_child(transpile_node(node.getChild(i), cpp_node))
            prime_nodes.add_container(cpp_node)
            return None

        def handle_return_statement(cpp_node, node):
            cpp_node.add_child(TreeNode(cpp_node, "return ", True, right_sep=""))
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

            func_body_node = TreeNode(cpp_node, "func_body", False)
            for child_index in range(var_decl_start_index + 2, node.getChildCount()):
                func_body_node.add_child(transpile_node(node.getChild(child_index), cpp_node, indentation=True))
            cpp_node.add_child(func_body_node)

            prime_nodes.add_function(cpp_node)
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
            elif cpp_node.label == "container_declaration":
                return handle_container_declaration(cpp_node, node)
            elif cpp_node.label == "printf_statement":
                return handle_printf_statement(cpp_node, node)
            elif cpp_node.label == "return_statement":
                return handle_return_statement(cpp_node, node)
            else:
                for i in range(node.getChildCount()):
                    child = node.getChild(i)
                    node_transpiled = transpile_node(child, cpp_node)
                    if node_transpiled is not None:
                        cpp_node.add_child(node_transpiled)

            if cpp_node.get_children_count() == 0:
                return None
            if cpp_node.label == "statement" and cpp_node.get_children_count() <= 1:
                return None
            
            # Return node only if it was not added to functions or containers and is not a empty statement
            return cpp_node
            
        
        prime_nodes = PrimeNodes()
        main_body = transpile_node(tree)
        main_body.identation=True
        prime_nodes.add_main_func_body(main_body)

        cpp_tree = TreeNode(None, "program", False)
        for node in prime_nodes.get_prime_nodes():
            cpp_tree.add_child(node)
        return cpp_tree
