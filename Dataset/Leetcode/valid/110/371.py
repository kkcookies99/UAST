class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def maxheight(root):
            if not root:
                return 0
            leftheight = maxheight(root.left)
            rightheight = maxheight(root.right)
            if leftheight < 0 or rightheight < 0:
                return -1
            return 1 + max(leftheight, rightheight) if abs(leftheight - rightheight) <= 1 else -1
        return maxheight(root) >= 0

