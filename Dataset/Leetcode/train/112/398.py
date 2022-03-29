 class Solution:
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        def dfs(node, sumn):
            if not node:
                return False
            if not node.left and not node.right and sumn + node.val == targetSum:
                return True
            left = dfs(node.left, sumn+node.val)
            right = dfs(node.right, sumn+node.val)
            return True if left or right else False
        return dfs(root, 0)

