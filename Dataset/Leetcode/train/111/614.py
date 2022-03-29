 class Solution:
    def XXX(self, root: TreeNode) -> int:
        def depth(root):
            if not root: return 0
            if not root.left: return depth(root.right) + 1
            if not root.right: return depth(root.left) + 1
            depth_left = depth(root.left)
            depth_right = depth(root.right)
            return min(depth_left, depth_right) + 1
        return depth(root)

