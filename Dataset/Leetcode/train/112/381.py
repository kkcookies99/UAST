 class Solution:
    def XXX(self, root: TreeNode, targetSum: int) -> bool:
        def PathSum(root,curSum):
            if not root:
                return False
            if not root.left and not root.right:
                return (curSum + root.val) == targetSum
            curSum += root.val
            return PathSum(root.left, curSum) or PathSum(root.right, curSum)
        if not root:
            return False
        return PathSum(root,0)

