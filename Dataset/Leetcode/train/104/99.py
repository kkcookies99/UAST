class Solution:
    def XXX(self, root: TreeNode) -> int:
    
        self.maxleftlength = 0
        self.maxrightlength = 0 
        return self.dp(root)

    def dp(self,root):
        if(root is None):
            return 0
        
        self.maxleftlength = self.dp(root.left)
        self.maxrightlength = self.dp(root.right)
        return max(self.maxleftlength,self.maxrightlength)+1

