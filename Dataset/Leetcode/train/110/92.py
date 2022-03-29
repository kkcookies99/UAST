class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def maxDepth(node):
            if node == None:
                return 0
            else:
                return 1 + max(maxDepth(node.left), maxDepth(node.right))

        if root == None:
            return True

        return self.XXX(root.left) and self.XXX(root.right) and abs(maxDepth(root.left) - maxDepth(root.right)) <= 1

