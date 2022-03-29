 class Solution:
    def XXX(self, root: TreeNode) -> bool:
        a, f = [], lambda r: r and (f(r.left) or a.append(r.val) or f(r.right))
        return f(root) or all(a[i] < j for i, j in enumerate(a[1: ]))

