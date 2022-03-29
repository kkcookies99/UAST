 class Solution(object):
    def XXX(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        def ergodic(p, q):
            if p is None:
                return q is None
            if q is None:
                return p is None
            return p.val == q.val and ergodic(p.left, q.left) and ergodic(p.right, q.right)
        return ergodic(p, q)

