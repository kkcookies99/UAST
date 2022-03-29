 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        return (not p and not q) or (p and q and p.val == q.val and self.XXX(p.left,q.left) and self.XXX(p.right,q.right))

