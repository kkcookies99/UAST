class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root == None: 
            return 0 
        self.ans = 0
        self.dfs(root, 1)
        return self.ans

    def dfs(self, root, path):
        if not root.right and not root.left:
            self.ans = max(self.ans, path)
        else:
            if root.left:
                self.dfs(root.left, path + 1)
            if root.right:
                self.dfs(root.right, path + 1)

