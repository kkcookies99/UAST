 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        self.ans = True
        
        def helper(root):
            if not root:
                return 0
            
            left = helper(root.left) + 1
            right = helper(root.right) + 1
            if abs(left-right) > 1:
                self.ans = False
            return  max(left,right)
            
        helper(root)
        return  self.ans
        

