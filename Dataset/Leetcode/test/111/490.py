    def XXX(self, root: TreeNode) -> int:
        if not root:return 0
        if root.left and root.right:
            return min(self.XXX(root.left),self.XXX(root.right))+1
        return self.XXX(root.left) + self.XXX(root.right) + 1

