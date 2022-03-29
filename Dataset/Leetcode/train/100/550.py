 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if p==None and q==None:
            return True
        elif (p==None and q!=None) or(p!=None and q==None):
            return False
        elif p!=None and q!=None:
            return p.val==q.val and self.XXX(p.left, q.left) and self.XXX(p.right, q.right)

