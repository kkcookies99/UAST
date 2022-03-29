 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:

        if not p or not q:
            return p == q
        return p.val == q.val and self.XXX(p.left, q.left) and self.XXX(p.right, q.right)


