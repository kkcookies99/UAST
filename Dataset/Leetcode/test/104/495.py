class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        return max (self.XXX(root.left)+1 , self.XXX(root.right)+1)

