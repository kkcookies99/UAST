class Solution(object):
    def XXX(self, root):
        self.maxl=0
        if not root:
            return 0
        self.maxl=1+max(self.XXX(root.left),self.XXX(root.right))
        return self.maxl

