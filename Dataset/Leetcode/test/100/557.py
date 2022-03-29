 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if p is None and q is None:
            return True
        if p is not None and q is not None and p.val == q.val and self.XXX(p.left, q.left) and  self.XXX(p.right, q.right):
            return True
        return False

