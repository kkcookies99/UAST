 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n == 0: return []
        res = []
        def dfs(cur, l, r):
            if l < r:
                return 

            if l == n and r == n:
                res.append(cur)
            if l < n:
                dfs(cur + "(", l + 1, r)
            if r < n:
                dfs(cur + ")", l, r + 1)
        dfs("", 0, 0)
        return res

