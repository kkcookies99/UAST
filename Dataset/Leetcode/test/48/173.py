class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m = len(matrix)
        n = len(matrix[0])
        for j in range(m-1):
            for i in range(j,n-1-j):
                matrix[j][i], matrix[i][n-j-1], matrix[m-j-1][n-1-i], matrix[m-1-i][j] = \
                matrix[m-1-i][j], matrix[j][i], matrix[i][n-j-1], matrix[m-j-1][n-1-i]

