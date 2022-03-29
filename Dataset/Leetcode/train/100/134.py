 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if p and q and p.val==q.val:
            return self.XXX(p.left,q.left) and self.XXX(p.right,q.right)
        if not p:
            return not q
        return False

