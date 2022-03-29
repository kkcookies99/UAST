 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def recursion(root, lower, upper):
            return True if not root or root.val > lower and root.val < upper and recursion(root.left, lower, root.val) and recursion(root.right, root.val, upper) else False
        return recursion(root, float('-inf'), float('inf'))

