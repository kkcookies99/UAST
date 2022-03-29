 class Solution(object):
    def XXX(self, root):
        if not root:
            return True
        _, isB = self.getHeight(root)
        return isB

    def getHeight(self, root):
        if not root:
            return 0, True
        lH, lB = self.getHeight(root.left)
        rH, rB = self.getHeight(root.right)
        return max(lH, rH) + 1, abs(lH - rH) <= 1 and lB and rB

