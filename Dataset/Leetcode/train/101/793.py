 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        
        return self.isMirror(root, root)
    
    def isMirror(self, x, y ):
        if x == None and y == None: return True
        if x == None or y == None: return False
            
        if x.val == y.val:
            return self.isMirror(x.left, y.right) and self.isMirror(x.right, y.left)
        else:
            return False

