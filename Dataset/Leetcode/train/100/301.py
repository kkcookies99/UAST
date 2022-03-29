 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        """
        if p is None and q is None:
            return True
        elif p is None or q is None:
            return False
        """
        #"""
        if p is None or q is None:
            return p == q 
        #"""
        if p.val != q.val:
            return False
        
        return self.XXX(p.left,q.left) and self.XXX(p.right,q.right)

