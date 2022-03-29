 class Solution(object):
    def XXX(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if root == None:
            return True
        return self.deidai(root.left,root.right)
    
    def deidai(self,p,q):
        if p == None and q == None:
            return True
        elif p == None or q == None:
            return False
        if p.val != q.val:
            return False
        return self.deidai(p.left,q.right) and self.deidai(p.right,q.left)

