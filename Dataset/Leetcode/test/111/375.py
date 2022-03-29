class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        if not root.left and not root.right:
            return 1
        if not root.left and root.right:
            return self.XXX(root.right) + 1
        if root.left and not root.right:
            return self.XXX(root.left) + 1
           
        L = self.XXX(root.left) + 1
        R = self.XXX(root.right) + 1
        ans = min(L, R)
        return ans

