class Solution:
    def XXX(self, root: TreeNode) -> int:
        def dfs(root):
            if root and not root.left and not root.right: return 1
            left = 1+dfs(root.left) if root.left else float('inf')
            right = 1+dfs(root.right) if root.right else float('inf')
            return min(left,right)
        if not root: return 0
        return dfs(root)

