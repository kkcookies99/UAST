class Solution:
    def XXX(self, root: TreeNode) -> int:
        return 1 + max(self.XXX(root.left), self.XXX(root.right)) if root else 0

