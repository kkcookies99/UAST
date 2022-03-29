 class Solution:
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        if not root:
            return False
        if root.val == targetSum and not root.left and not root.right:
            return True
        targetSum -= root.val
        return self.XXX(root.left, targetSum) or self.XXX(root.right, targetSum)

