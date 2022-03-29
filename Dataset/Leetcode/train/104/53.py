class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root is None:
            return 0
        
        lep = self.XXX(root.left)
        rep = self.XXX(root.right)
        
        return max(lep,rep)+1

