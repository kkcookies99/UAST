 class Solution:
    def XXX(self, root: 'TreeNode') -> 'bool':
        if not root:
            return True
        if abs(self.maxDepth(root.left)-self.maxDepth(root.right))<=1:
            # 这一点原本想错了        
            return self.XXX(root.left) and self.XXX(root.right)
        return False
        
    def maxDepth(self, p):
        if not p:
            return 0
        else:
            return max(self.maxDepth(p.left),self.maxDepth(p.right))+1

