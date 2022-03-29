class Solution:
    def XXX(self, root: TreeNode) -> int:
        def dfs(root, level):
            if not root: return 
            if self.res < level + 1:
                self.res  = level + 1
            if root.left: dfs(root.left, level + 1)
            if root.right: dfs(root.right, level + 1)
        
        if not root: return 0
        self.res = 0 # 深度
        dfs(root, 0)
        return self.res

