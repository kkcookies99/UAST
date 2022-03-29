 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def f(l, r):
            if not(l or r):
                return True
            if not(l and r):
                return False
            return l.val == r.val and f(l.left, r.right) and f(l.right, r.left)
        return f(root, root)

