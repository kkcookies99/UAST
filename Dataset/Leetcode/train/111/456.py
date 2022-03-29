class Solution:
    def XXX(self, root: TreeNode) -> int:
        if not root:
            return 0
        elif not root.left and not root.right:
            return 1
        elif root.left and root.right:
            return min(self.XXX(root.left),self.XXX(root.right))+1
        elif root.left:
            return self.XXX(root.left)+1
        else:
            return self.XXX(root.right)+1

