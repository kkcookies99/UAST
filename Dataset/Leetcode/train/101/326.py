 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def balance(left, right):
            if left is None and right is None:
                return True
            elif (left is not None and right is None) or (left is None and right is not None):
                return False
            a = balance(left.left, right.right)
            b = balance(left.right, right.left)
            if left.val == right.val and a and b:
                return True
            else:
                return False
        return balance(root, root)

