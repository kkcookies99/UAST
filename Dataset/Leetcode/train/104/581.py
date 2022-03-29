class Solution(object):
    def XXX(self, root):
        return 0 if not root else  max(self.XXX(root.left),self.XXX(root.right))+1

