 class Solution:
    def XXX(self, root: TreeNode) -> int:
        def depth(root, d):
            if root.left and not root.right: 
                d = depth(root.left, d) + 1
            if not root.left and root.right:
                d = depth(root.right, d) + 1
            if root.left and root.right:
                d1 = depth(root.left, d) + 1
                d2 = depth(root.right, d) + 1
                d = min(d1, d2)
            return d
            
        if root == None: return 0
        d =1
        return depth(root, d)

