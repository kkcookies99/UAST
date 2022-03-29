class Solution:
    def XXX(self, m: int, n: int) -> int:
        f = [ [0] * n  for _ in range(m)]

        f[0][0] = 1
        for i in range(m):
            for j in range(n):
                if i > 0:
                    f[i][j] +=  f[i - 1][j]
                if j > 0:
                    f[i][j] +=  f[i][j - 1]
        
        return f[m - 1][n - 1]

