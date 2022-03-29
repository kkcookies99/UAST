 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if not p and not q:
            return True
        elif not p or not q:
            return False
        return p.val == q.val and self.XXX(p.left, q.left) and self.XXX(p.right, q.right)

