 class Solution:
    def XXX(self, root: TreeNode) -> int:
        """
        深度优先遍历，后序遍历，左右根
        """
        if root is None:
            return 0
        
        ans = self.dfs(root)
        return ans

    def dfs(self, node):
        if node is None:
            return 0
        
        # 先左，再右，最后返回以后是根
        left = self.dfs(node.left)
        right = self.dfs(node.right)
        curr = 1 + max(left, right)
        return curr

