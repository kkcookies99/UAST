class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root==None:
            return 0
        l = self.XXX(root.left)
        r = self.XXX(root.right)
        return 1+max(l,r)

