class Solution:
    def XXX(self, root: TreeNode, sum: int) -> bool:
        if not root:
            return False
        if sum == root.val and not root.left and not root.right:
            return True
        return self.XXX(root.left, sum-root.val) or self.XXX(root.right, sum-root.val)

