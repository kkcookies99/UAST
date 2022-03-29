 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        return p.val == q.val and self.XXX(p.left, q.left) and self.XXX(p.right, q.right) if p and q else p == q

