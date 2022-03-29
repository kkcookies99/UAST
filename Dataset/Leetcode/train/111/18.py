class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root == None:
            return 0
        if root.left == None:
            return 1 + self.XXX(root.right)
        if root.right == None:
            return 1 + self.XXX(root.left)
        return 1 + min(self.XXX(root.left), self.XXX(root.right))

