 class Solution(object):
    def XXX(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if p==None and q==None:
            return True
        elif p==None and q!=None:
            return False
        elif p!=None and q==None:
            return False
        if p.val!=q.val:
            return False
        left = self.XXX(p.left,q.left)
        right = self.XXX(p.right, q.right)
        return left and right

