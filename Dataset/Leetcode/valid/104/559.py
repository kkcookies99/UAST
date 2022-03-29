class Solution(object):
    def XXX(self, root):
        if not root:
            return 0
        return max(self.XXX(root.left), self.XXX(root.right)) + 1

