 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def recur(node1, node2):
            if not node1 and not node2:
                return True
            if not node1 or not node2:
                return False
            return node1.val == node2.val and recur(node1.left, node2.right) and recur(node1.right, node2.left)
        return recur(root, root)

