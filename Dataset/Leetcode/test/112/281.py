 class Solution:
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        if not root:
            return False
        if not root.left and not root.right:
            return root.val == targetSum
        return self.XXX(root.left, targetSum-root.val) or self.XXX(root.right, targetSum-root.val)```

