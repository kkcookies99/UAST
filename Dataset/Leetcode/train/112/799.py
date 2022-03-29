 class Solution(object):
    def XXX(self, root, sum):
        def check(t, val):
            if not t:
                return False
            if t.val == val and not t.left and not t.right:
                return True
            else:
                return check(t.left, val-t.val) or check(t.right, val-t.val)
        return check(root, sum)

