class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        if not root.left:
            return self.XXX(root.right)+1
        if not root.right:
            return self.XXX(root.left)+1
        return min(self.XXX(root.left),self.XXX(root.right))+1

