 class Solution:
    def maxLength(self, p:TreeNode) -> int:
            if not p:
                return 0
            return max(self.maxLength(p.left), self.maxLength(p.right)) + 1

    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        if not self.XXX(root.left) or not self.XXX(root.right):
            return False
        if abs(self.maxLength(root.left) - self.maxLength(root.right)) <= 1:
            return True
        else:
            return False
