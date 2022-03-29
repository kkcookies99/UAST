class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if not root:
            return 0
        if not root.left and root.right != None:
            return 1 + self.XXX(root.right)
        elif not root.right and root.left != None:
            return 1 + self.XXX(root.left)
            
        return 1 + min(self.XXX(root.left), self.XXX(root.right))

