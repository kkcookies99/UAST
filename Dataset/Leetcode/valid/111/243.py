class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        elif root.left and root.right:
            left = self.XXX(root.left)
            right = self.XXX(root.right)
            return min(left, right) + 1
        elif root.left or root.right:
            if root.left:
                return self.XXX(root.left) + 1
            if root.right:
                return self.XXX(root.right) + 1
        else:
            return 1

