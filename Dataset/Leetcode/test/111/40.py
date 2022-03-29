class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        self.ans = float('inf')
        self._dfs(root, 0)
        return self.ans
        
        
    def _dfs(self, node, level):
        if not node:
            return
        if node.left is None and node.right is None:
            if self.ans > level + 1:
                self.ans = level + 1
            return
        self._dfs(node.left, level + 1)
        self._dfs(node.right, level + 1)

