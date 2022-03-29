class Solution:
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root==None:
            return 0
        return max(self.XXX(root.left),self.XXX(root.right))+1

