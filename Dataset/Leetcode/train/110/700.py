 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        return self.blance(root) != -1
    
    def blance(self, node):
        if not node:
            return 0
        
        lh = self.blance(node.left)
        if lh == -1:
            return -1
        
        rh = self.blance(node.right)
        if rh == -1:
            return -1
        
        if abs(lh - rh) > 1:
            return -1
        
        return 1 + max(lh, rh)

