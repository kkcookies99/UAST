 class Solution:
    def __init__(self):
        self.last = None
    def XXX(self, root: TreeNode) -> bool:
        def dfs(root):
            if not root: return True
            if not dfs(root.left): return False
            if self.last and self.last.val >= root.val: return False
            self.last = root
            return dfs(root.right)
        return dfs(root)

