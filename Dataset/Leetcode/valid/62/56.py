 class Solution:
    def XXX(self, m: int, n: int) -> int:
        if n==0 or m==0:return 1
        path = [[1]*m]*n
        for i in range(1,n):
            for j in range(1,m):
                path[i][j] = path[i][j-1]+path[i-1][j]
        return path[n-1][m-1]

