 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if not p and not q:
            return True
        elif p and q:
            if p.val != q.val:
                return False
            return self.XXX(p.left, q.left) and self.XXX(p.right, q.right)
        else:
            return False

