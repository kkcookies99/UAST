class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        self.min_depth = float('inf')
        def dfs(root, depth):
            if not root:
                return 
            if not root.left and not root.right:
                self.min_depth = min(self.min_depth, depth)
            dfs(root.left, depth+1)
            dfs(root.right, depth+1)
        dfs(root, 1)
        return self.min_depth

