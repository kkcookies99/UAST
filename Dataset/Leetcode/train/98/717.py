 class Solution:
    def helper(self, node, lower=float('-inf'), upper=float('inf')):
        if not node:
            return True

        if node.val <= lower or node.val >= upper:
            return False

        return self.helper(node.left, lower, node.val) and\
                self.helper(node.right, node.val, upper)

    def XXX(self, root: TreeNode) -> bool:
        return self.helper(root)

