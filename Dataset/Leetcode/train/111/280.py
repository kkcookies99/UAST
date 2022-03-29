class Solution:
    def XXX(self, root: TreeNode) -> int:
        # 分四种情况
        if not root:
            return 0
        if not root.left and not root.right:
            return 1
        elif not root.left and root.right:
            right_depth = self.XXX(root.right)
            return right_depth + 1
        elif not root.right and root.left:
            left_depth = self.XXX(root.left)
            return left_depth + 1
        else:
            left_depth = self.XXX(root.left)
            right_depth = self.XXX(root.right)
            return min(left_depth, right_depth) + 1

