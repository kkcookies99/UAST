 class Solution(object):
    def XXX(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if p is None and q is None:
            return True
        if p is not None and q is not None:
            return self.XXX(p.left, q.left) and self.XXX(p.right, q.right) and p.val == q.val
        return False

