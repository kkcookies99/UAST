class Solution:
    def dfs(self, root):
        if not root:
            return 0
        return max(self.dfs(root.left),self.dfs(root.right)) + 1
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        if abs(self.dfs(root.left) - self.dfs(root.right)) <= 1:
            return self.XXX(root.left) and self.XXX(root.right)
        else:
            return False

