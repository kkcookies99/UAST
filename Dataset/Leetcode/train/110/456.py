class Solution:
    def XXX(self, root: TreeNode) -> bool:
        
        self.flag = True
        self.travel(root)
        return self.flag
        
    
    def travel(self, root: TreeNode) -> int:
        # 剪枝判定
        if self.flag:
            if not root:
                return 0
            left = self.travel(root.left)
            right = self.travel(root.right)
            
            if abs(right-left) >= 2:
                self.flag = False
                return 0
            
            return 1 + max(left, right)
        
        return 0

