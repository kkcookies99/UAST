 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if p.val != q.val:
            return False
        else:
            return self.XXX(p.left, q.left) and self.XXX(p.right, q.right)

