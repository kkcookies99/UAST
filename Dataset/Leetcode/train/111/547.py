class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root==None:
            return 0
        r=self.XXX(root.right)
        l=self.XXX(root.left)
        return (min(r,l) if min(r,l) else max(r,l))+1

