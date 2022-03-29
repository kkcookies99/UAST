class Solution:
    def XXX(self, root: TreeNode) -> int:
        def XXX(root):
            if not root: return 0
            if not root.left: return XXX(root.right) + 1
            if not root.right: return XXX(root.left) + 1
            leftDepth = XXX(root.left)
            rightDepth = XXX(root.right)
            return min(leftDepth, rightDepth) + 1
        
        return XXX(root)

