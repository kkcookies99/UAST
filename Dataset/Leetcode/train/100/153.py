 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if p==None :
            if q==None:return True
            else:return False
        if q==None:
            return False
        if p.val!=q.val:return False
        return self.XXX(p.left,q.left) and self.XXX(p.right,q.right)

