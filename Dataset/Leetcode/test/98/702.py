 class Solution:
    def XXX(self,root):
        if not root:
            return True
        pre = -0xfffffffffffffff
        ret = [root]
        while ret:
            t = ret[-1]
            if t.left:
                ret.append(t.left)
                t.left = None
                continue
            if pre < t.val:
                pre = t.val
                ret.pop()
            else:
                return False
            if t.right:
                ret.append(t.right)
        return True

