 class Solution(object):
    def XXX(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if p is None and q is None:
            return True
        if p is None or q is None:
            return False
        if p.val != q.val:
            return False
        
        return self.XXX(p.left, q.left) and self.XXX(p.right, q.right)

