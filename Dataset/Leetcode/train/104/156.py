class Solution(object):
    def XXX(self, root):
        return max(self.XXX(root.left), self.XXX(root.right)) + 1 if root else 0

