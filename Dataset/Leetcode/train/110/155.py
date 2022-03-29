class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root is None:
            return True
        
        if 1 < abs(self.maxDepth(root.left) - self.maxDepth(root.right)):
            return False

        return self.XXX(root.left) and self.XXX(root.right)
    
    def maxDepth(self, root: TreeNode) -> int:
            # 当当前根为空时返回：空树
            if root is None:
                return 0
            # 当还能继续往下钻
            return max(self.maxDepth(root.left), self.maxDepth(root.right))+1

