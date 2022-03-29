 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if p == None and q == None:
            return True
        if p == None or q == None:
            return False
        if p.val == q.val:
            return self.XXX(p.left, q.left) and self.XXX(p.right, q.right)
        else:
            return False

