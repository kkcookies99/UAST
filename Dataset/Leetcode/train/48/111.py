class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m = len(matrix)
        for i in range(m):
            for j in range(i+1,m):
                matrix[i][j],matrix[j][i] = matrix[j][i],matrix[i][j]
        for i in range(m):
            for j in range(m//2):
                matrix[i][j],matrix[i][m-j-1] = matrix[i][m-j-1],matrix[i][j]

