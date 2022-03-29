 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []
        def dfs(i, j, temp):
            if i < j or i > n or j > n:
                return
            if i == j and i == n:
                res.append(temp)
            dfs(i+1, j, temp+'(')
            dfs(i, j+1, temp+')')
        dfs(0, 0, '')
        return res

