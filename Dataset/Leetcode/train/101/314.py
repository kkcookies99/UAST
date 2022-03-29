 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True

        def helper(left, right):
            if not left and not right:
                return True
            
            if not left or not right or left.val != right.val:
                return False

            return helper(left.left, right.right) and helper(left.right, right.left)

        return helper(root.left, root.right)

