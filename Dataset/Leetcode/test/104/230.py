class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        leftDepth = self.XXX(root.left)
        rightDepth = self.XXX(root.right)
        return max(leftDepth, rightDepth) + 1

