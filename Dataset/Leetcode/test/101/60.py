 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if root:
            return self.is_same(root.left,root.right)
        else:
            return True

    def is_same(self,root1,root2):
        if root1==root2==None:
            return True
        if root1 and root2 and root1.val==root2.val:
            return self.is_same(root1.left,root2.right) and self.is_same(root1.right,root2.left)
        else:
            return False

