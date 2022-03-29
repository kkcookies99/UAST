class Solution:
    def XXX(self, root: TreeNode) -> int:
        return 1+min([self.XXX(root.left),self.XXX(root.right)]) if root and root.left and root.right else 1+self.XXX(root.left) if root and root.left else 1+self.XXX(root.right) if root and root.right else 1 if root else 0

