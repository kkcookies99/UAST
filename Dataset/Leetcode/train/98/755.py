 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        self.res = []
        self.flag = True
        def dfs(root):
            if not root:
                return 
            else:
                dfs(root.left)
                if self.res:
                    if root.val <= self.res[-1]:
                        self.flag = False
                        return 
                self.res.append(root.val)
                dfs(root.right)
                return 
        dfs(root)
        return self.flag

