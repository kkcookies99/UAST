 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root: return True
        def func(left,right):
            if not left and not right: return True
            if not left or not right: return False
            if left.val==right.val:
                return func(left.left,right.right) and func(left.right,right.left)
        return func(root.left,root.right)

