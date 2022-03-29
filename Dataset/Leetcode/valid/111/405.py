class Solution:

    def traverse(self, node: TreeNode, deep: int):
        if node is None: return deep
        deep += 1
        if node.left is None:
            return self.traverse(node.right, deep)
        elif node.right is None:
            return self.traverse(node.left, deep)
        else:
            left_deep = self.traverse(node.left, deep)
            right_deep = self.traverse(node.right, deep)
            return min(left_deep, right_deep)

    def XXX(self, root: TreeNode) -> int:
        return self.traverse(root, 0)

