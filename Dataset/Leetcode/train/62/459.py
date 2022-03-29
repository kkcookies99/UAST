class Solution:
    def XXX(self, m: int, n: int) -> int:
        count = [[1]*n for _ in range(m)]
        for i in range(1,m):
            for j in range(1,n):
                count[i][j] = count[i-1][j] + count[i][j-1]
        return count[-1][-1]

