class Solution:
    def XXX(self, root: TreeNode) -> int:
        return 1 + max(map(self.XXX, (root.left, root.right))) if root else 0

