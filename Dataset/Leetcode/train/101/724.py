 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        def check(l, r):
            if l and r and l.val == r.val:
                return check(l.left, r.right) and check(l.right, r.left)
            return l == r
        return check(root, root)

