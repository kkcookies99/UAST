class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root: return 0
        return 1 + max(self.XXX(root.right), self.XXX(root.left))

