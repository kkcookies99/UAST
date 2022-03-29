 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root: return True
        return self.check(root.left, root.right)

    def check(self, left, right):
        if not left or not right:
            return not left and not right
        return left.val == right.val and self.check(left.left, right.right) and self.check(right.left, left.right)

