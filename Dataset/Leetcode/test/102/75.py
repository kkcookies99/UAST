class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        self.result = []
        self._dfs(root, 0)
        return self.result
        
    def _dfs(self, node, level):
        if not node:
            return
        if len(self.result) < level + 1:
            self.result.append([])
        self.result[level].append(node.val)
        self._dfs(node.left, level + 1)
        self._dfs(node.right, level + 1)

