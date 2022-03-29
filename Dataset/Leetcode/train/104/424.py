class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root==None:
            return 0
        else:
            return 1+max(self.XXX(root.left),self.XXX(root.right))

