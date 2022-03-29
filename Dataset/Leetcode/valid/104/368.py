class Solution:
    def XXX(self, root):
        if not root:
            return 0
        else:
            return 1 + max(self.XXX(root.left), self.XXX(root.right))

