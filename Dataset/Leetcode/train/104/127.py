class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root is None:
            return 0
        leftLen = self.XXX(root.left)
        rightLen = self.XXX(root.right)
        return max(leftLen,rightLen) + 1

