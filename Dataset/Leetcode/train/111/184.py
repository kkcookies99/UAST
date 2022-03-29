class Solution:
    def XXX(self, root: TreeNode) -> int:
        if root is None:
            return 0
        
        if root.left and root.right:
            left_mindepth=self.XXX(root.left)
            right_min_depth=self.XXX(root.right)
            return 1+min(left_mindepth,right_min_depth)
        elif not root.left:
            return 1+self.XXX(root.right)
        elif not root.right:
            return 1+self.XXX(root.left)

