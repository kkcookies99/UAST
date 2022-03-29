class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.res = 0
        
        def dfs(node, length):
            if not node:
                self.res = max(self.res, length)
                return
            dfs(node.left, length + 1)
            dfs(node.right, length + 1)
        
        dfs(root, 0)
        return self.res

