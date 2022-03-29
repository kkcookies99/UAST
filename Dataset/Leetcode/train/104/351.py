class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0

        return self.helper(root, 1)
    
    def helper(self, root, level):
        if not root:
            return level - 1
        
        lev_left = self.helper(root.left, level+1)
        lev_right = self.helper(root.right, level+1)

        return max(lev_left, lev_right)

