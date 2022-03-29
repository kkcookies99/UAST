def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root:
            if root.left and root.right:
                return 1+min(self.XXX(root.left),self.XXX(root.right))
            elif root.left:
                return 1+self.XXX(root.left)
            elif root.right:
                return 1+self.XXX(root.right)
            else:
                return 1
        else:
            return 0

