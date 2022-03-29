class Solution:
    def XXX(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
                return False
        def childsum(root,targetSum):
            if root.left is None and root.right is None:
                return root.val==targetSum
            if root.left and root.right:
                return childsum(root.left,targetSum-root.val) or childsum(root.right,targetSum-root.val)
            if root.left or root.right:
                return childsum(root.left,targetSum-root.val) if root.left else childsum(root.right,targetSum-root.val)

        return childsum(root,targetSum)

