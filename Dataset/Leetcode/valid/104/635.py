 class Solution:
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        if root.left or root.right:
            return max(self.XXX(root.left)+1,self.XXX(root.right)+1)
        else:
            return 1

