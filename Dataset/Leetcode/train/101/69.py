 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def isSame(p,q):
            if p and q and p.val==q.val:
                return isSame(p.left,q.right) and isSame(p.right,q.left)
            if not p:
                return not q
            return False
        if not root:
            return True
        return isSame(root.left,root.right)

