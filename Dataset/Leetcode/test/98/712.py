 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        self.ans=True
        self.prev=None
        def dfs(root):
            if not root:
                return
            dfs(root.left)
            if self.prev and root.val<=self.prev.val:
                self.ans=False
            self.prev=root
            dfs(root.right)
        dfs(root)
        return self.ans

