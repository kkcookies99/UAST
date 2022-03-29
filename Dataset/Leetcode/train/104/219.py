class Solution:
    def XXX(self, root: TreeNode) -> int: 
        if not root:
            return 0
        return max(1+self.XXX(root.left),1+self.XXX(root.right))

