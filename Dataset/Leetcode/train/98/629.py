 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        pre = float('-inf')
        def dfs(root):
            nonlocal pre
            if not root: return True
            if not dfs(root.left): return False
            if root.val <= pre: return False
            pre = root.val
            return dfs(root.right)
        return dfs(root)

