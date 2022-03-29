 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        root_left = root.left
        root_right = root.right
        return self.helper(root_left, root_right)
        
    def helper(self, root_left, root_right):
        if not root_left and not root_right: return True
        if not root_left or not root_right: return False
        if root_left.val != root_right.val: return False
        return self.helper(root_left.left, root_right.right) and self.helper(root_left.right, root_right.left)

