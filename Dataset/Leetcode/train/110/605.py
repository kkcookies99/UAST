 class Solution:
    def maxleght(self, root: TreeNode):
        if not root:
            return 0
        ldeepth = self.maxleght(root.left)
        rdeepth = self.maxleght(root.right)
        return max(ldeepth + 1, rdeepth + 1)

    def minleght(self, root: TreeNode):
        if not root:
            return 0
        ldeepth = self.maxleght(root.left)
        rdeepth = self.maxleght(root.right)
        return min(ldeepth + 1, rdeepth + 1)

    def gaplegth(self, root:TreeNode):
        a = self.maxleght(root)
        b = self.minleght(root)
        return a-b

    def XXX(self, root: TreeNode):
        if not root:
            return True
        a = [root]
        while a:
            curr = a.pop()
            if self.gaplegth(curr) >= 2:
                return False
            if curr.left :
                a.append(curr.left)
            if curr.right :
                a.append(curr.right)
        return True

