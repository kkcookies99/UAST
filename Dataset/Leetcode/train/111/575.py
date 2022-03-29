class Solution:
    def XXX(self, root: TreeNode) -> int:

        if root is None:
            return 0

        l = self.XXX(root.left)
        r = self.XXX(root.right)
        if l == 0:
            return r + 1
        if r == 0:
            return l + 1
        return min(l, r) + 1

