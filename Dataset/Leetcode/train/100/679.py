 class Solution(object):
    def XXX(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if not p and not q:
            return True
        elif not p or not q:
            return False
        else:
            if self.XXX(p.left,q.left) and self.XXX(p.right,q.right) and p.val==q.val:
                return True
            else:
                return False

