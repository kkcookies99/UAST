class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        l,r = self.XXX(root.left),self.XXX(root.right)
        if not root.left:
            return 1+r
        if not root.right:
            return 1+l
        return 1+min(l,r)

