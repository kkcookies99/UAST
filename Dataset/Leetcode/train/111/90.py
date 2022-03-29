class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root is None:
            return 0 
        if root.left is None and root.right is None:
            return 1 
        min_deep=float("inf")
        if root.left:
            min_deep=min(self.XXX(root.left),min_deep)
        if root.right:
            min_deep=min(self.XXX(root.right),min_deep)
        return min_deep+1

