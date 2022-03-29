 class Solution:
    def XXX(self, root):#: TreeNode) -> int:
        if root is None:
            return 0
        return 1 + max(self.XXX(root.left),self.XXX(root.right))

