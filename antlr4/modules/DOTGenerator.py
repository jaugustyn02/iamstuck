from antlr4.tree.Tree import TerminalNodeImpl


class DOTGenerator:
    def __init__(self, rule_names, literal_names, symbolic_names):
        self.rule_names = rule_names
        self.literal_names = literal_names
        self.symbolic_names = symbolic_names
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
        
    def to_dot(self, tree):
        dot = ['digraph ParseTree {', 'node [shape=plaintext];']

        def visit(node):
            current_node_id = self.next_node()
            dot.append(f'  {current_node_id} [label="{self.get_label(node)}"];')

            for i in range(node.getChildCount()):
                child = node.getChild(i)
                child_id = visit(child)
                dot.append(f'  {current_node_id} -> {child_id};')

            return current_node_id

        visit(tree)
        dot.append('}')

        return '\n'.join(dot)