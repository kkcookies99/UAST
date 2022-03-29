 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        try:
            self.check_balance(root)
        except:
            return False
        
        return True
    
    def check_balance(self, node):
        if not node:
            return 0
        
        left_height = self.check_balance(node.left)
        right_height = self.check_balance(node.right)
        
        assert abs(left_height - right_height) <= 1, 'unblance'
        
        return 1 + max(left_height, right_height)

