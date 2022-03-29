 class Solution:
    def XXX(self, n: int) -> List[str]:
        q = collections.deque([('', 0, 0)])
        res = []
        while q:
            c, l, r = q.popleft()
            if l < n:
                q.append((c+'(', l+1, r))
            if r < l:
                q.append((c+')', l, r+1))
            if l == r == n:
                res.append(c)
        return res

