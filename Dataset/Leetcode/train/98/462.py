 class Solution(object):
    def XXX(self, root):
        return self.XXX1(root,None,None)

    def XXX1(self,root,min,max):
        if root == None:
            return True
        if min!=None and root.val<=min.val:
            return False
        if max!=None and root.val >= max.val:
            return False
        return self.XXX1(root.left,min,root) and self.XXX1(root.right,root,max)

