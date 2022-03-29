 class Solution:
    def height(self,root):
        if not root:
            return 0
        else:
            return max(self.height(root.left),self.height(root.right))+1
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        left = self.height(root.left)
        right = self.height(root.right)
        if (abs(left-right)<=1 and self.XXX(root.left) and self.XXX(root.right)):
            return True
        else:
            return False

