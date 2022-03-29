class Solution:
    def XXX(self, root: TreeNode) -> int:
        return 0 if not root else 1 + max(self.XXX(root.left),self.XXX(root.right))

