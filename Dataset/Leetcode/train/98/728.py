 class Solution:
    def XXX(self, root):
        if root!=None and self.judge(root, -(1<<32), (1<<32))==False:
            return False
        return True

    def judge(self, cur, leftrange, rightrange):
        if not (cur.val>leftrange and cur.val<rightrange):
            return False
        if cur.left!=None and self.judge(cur.left, leftrange, min(rightrange, cur.val))==False:
            return False
        if cur.right!=None and self.judge(cur.right, max(leftrange, cur.val), rightrange)==False:
            return False
        return True

