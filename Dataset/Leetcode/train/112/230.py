 class Solution:
    def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if root == None:
            return False
        if root.val == targetSum and root.left == None and root.right == None:
            return True
        return self.XXX(root.left, targetSum - root.val) or self.XXX(root.right, targetSum - root.val)

