class Solution(object):
    def XXX(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        self.m=False
        def dfs(node,s):
            if not node:
                return 
            else:
                s+=node.val
                dfs(node.left,s)
                dfs(node.right,s)
                if not node.left and not node.right and s==sum:
                    self.m=True

        dfs(root,0)
        return self.m

