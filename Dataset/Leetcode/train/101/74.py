 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        return self.isMirror(root,root)
    def isMirror(self,t1,t2):
        if not t1 and not t2:
            return True
        elif t1 != None and t2 != None:
            if t1.val == t2.val:
                return self.isMirror(t1.right,t2.left) and self.isMirror(t1.left,t2.right)
            else:   
                return False
        else:
            return False

