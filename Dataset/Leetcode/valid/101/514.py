 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        if not root:
            return True
        def lr(r1,r2):
            if not r1 and not r2:
                return True
            if not r1 or not r2:
                return False
            if r1.val !=r2.val:
                return False
            return lr(r1.left,r2.right) and lr(r1.right,r2.left)
        return lr(root.left,root.right)

