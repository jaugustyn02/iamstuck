

from typing import Any


class TreeNode:
    def __init__(self, parent, label, isTerminal, left_sep = "", right_sep="", indentation = False):
        self.parent = parent
        self.children: list[TreeNode] = []
        self.label = label
        self.isTerminal = isTerminal
        self.right_sep = right_sep
        self.left_sep = left_sep
        self.identation = indentation
    
    def add_child(self, child):
        self.children.append(child)

    def get_children(self):
        return self.children
    
    def get_children_count(self):
        return len(self.children)
    
    def get_child(self, index):
        return self.children[index]
    
    def get_text(self):
        return self.left_sep + self.label + self.right_sep
    
    def __str__(self):
        return f"label: {self.label}, parent: {self.parent.label if self.parent is not None else None}, is_terminal: {self.isTerminal}"