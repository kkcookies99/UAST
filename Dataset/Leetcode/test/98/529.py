 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root: return True
        # 左右都不为空
        if root.left and root.right:
            return root.left.val < root.val and root.right.val > root.val and self.XXX(root.left) and self.XXX(root.right)
        # 左为空，右不为空
        elif root.left is None and root.right is not None:
            return root.val < root.right.val and self.XXX(root.right)
        # 右为空，左不为空
        elif root.right is None and root.left is not None:
            return root.val > root.left.val and self.XXX(root.left)
        # 左右都为空
        else:
            return True

