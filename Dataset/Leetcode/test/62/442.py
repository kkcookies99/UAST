class Solution:
    def XXX(self, m: int, n: int) -> int:
        f = [[0 for c in range(n+1)] for r in range(m+1)]
        f[1][1] = 1
        for r in range(1,m+1):
            for c in range(1,n+1):
                f[r][c] = f[r][c] + f[r-1][c] + f[r][c-1]
        return f[m][n]

