 class Solution:
    def XXX(self, p: TreeNode, q: TreeNode) -> bool:
        if not p and not q: return True
        elif not p or not q: return False
        else:
            return (self.XXX(p.left, q.left))&(self.XXX(p.right, q.right))&(p.val==q.val)

