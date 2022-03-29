 class Solution:
    prev = float(-inf)
    
    def XXX(self, root: TreeNode) -> bool:
        
        if root is None:
            return True
        if not self.XXX(root.left):
            return False
        if root.val <= prev:
            return False
        prev = root.val
        return self.XXX(root.right)

