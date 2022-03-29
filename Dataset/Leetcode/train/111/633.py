 class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root:
            if root.left and not root.right:
                return 1+self.XXX(root.left)
            elif not root.left and root.right:
                return 1+self.XXX(root.right)
            else:
                return 1+min(self.XXX(root.left),self.XXX(root.right))
        else:
            return 0

