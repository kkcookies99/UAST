 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root is None:
            return True
        if self.XXX(root.left) \
            and self.XXX(root.right)\
            and math.fabs(self.maxDepth(root.left) - self.maxDepth(root.right)) <= 1:
            return True
        else:
            return False
    def maxDepth(self,root):
        if root is None:
            return 0
        return 1 + max(self.maxDepth(root.left),self.maxDepth(root.right))

