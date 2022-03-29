 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if not p and not q:
            return True
        elif not p or not q:
            return False
        else:
            if p.val != q.val:
                return False
            else:
                return self.XXX(p.left, q.left) and self.XXX(p.right, q.right)
    

