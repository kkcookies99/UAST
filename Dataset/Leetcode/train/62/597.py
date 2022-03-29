class Solution:
    def XXX(self, m: int, n: int) -> int:
        matrix = [[1]*m for i in range(n)]
        for i in range(0,n-1):
            for j in range(0,m-1):
                matrix[i+1][j+1] = matrix[i][j+1] + matrix[i+1][j]
        return matrix[-1][-1]

