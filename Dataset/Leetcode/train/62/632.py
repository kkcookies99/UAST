class Solution(object):
    def XXX(self, m, n):
        maps = [[0 for _ in range(n+1)] for _ in range(m+1)]
        maps[m-1][n] = 1
        for i in range(m-1,-1,-1):
            for j in range(n-1,-1,-1):
                maps[i][j] = maps[i+1][j] + maps[i][j+1]
        return maps[0][0]

