 class Solution:
    def XXX(self, root: TreeNode) -> List[List[int]]:
        d = collections.defaultdict(list)
        def f(r, i):
            if r:
                d[i].append(r.val)
                f(r.left, i + 1)
                f(r.right, i + 1)
        f(root, 0)
        return d.values()

