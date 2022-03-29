 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root:
            return self.mirror(root.left,root.right)
        return True
    def mirror(self,t1:TreeNode,t2:TreeNode)->bool:
        if t1 and t2:
            if t1.val!=t2.val:
                return False
            return self.mirror(t1.left,t2.right) and self.mirror(t1.right,t2.left)
        elif not t1 and not t2:
            return True
        else:
            return False 
   

