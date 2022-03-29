 class Solution:
    def issub(self, root1 ,root2):
        if root1==None and root2==None:
            return True
        if (root1==None and root2!=None) or (root1!=None and root2==None):
            return False
        if root1.val != root2.val:
            return False
        if self.issub(root1.left, root2.right)==False or self.issub(root1.right, root2.left)==False:
            return False
        return True

    def XXX(self, root):
        if root==None: return True
        return self.issub(root.left, root.right)

