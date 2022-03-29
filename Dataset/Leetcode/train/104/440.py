class Solution(object):
    def XXX(self, root):
        if not root:
            return 0
        d = collections.defaultdict(list)
        def f(r, i):
            if r:
                d[i].append(r.val)
                if r.left:
                    f(r.left, i+1)
                if r.right:
                    f(r.right, i+1)
        f(root, 0)
        return len(d)

