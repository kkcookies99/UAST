 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if not p or not q: return True if not p and not q else False
        return True if p.val == q.val and self.XXX(p.left, q.left) and self.XXX(p.right, q.right) else False

