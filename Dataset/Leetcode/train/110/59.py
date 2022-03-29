class Solution:
    def depth(self, root: TreeNode) -> int:
        if not root:
            return 0
        return max(self.depth(root.left), self.depth(root.right)) + 1
        
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        if not self.XXX(root.left) or not self.XXX(root.right):
            return False
        
        depth_left, depth_right = self.depth(root.left), self.depth(root.right)
        if abs(depth_left - depth_right) < 2:
            return True
        else:
            return False

