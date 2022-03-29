class Solution(object):
    def XXX(self, root):

        def isB(root):
            if not root:return True,0
            lb,ls = isB(root.left)
            rb,rs = isB(root.right)
            return lb and rb and abs(ls - rs) <= 1, max(ls, rs) + 1

        return isB(root)[0]


