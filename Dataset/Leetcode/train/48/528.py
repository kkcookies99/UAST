 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        matrix2 = [[j for j in i] for i in matrix]
        n = len(matrix)
        if n == 0:
            return
        for i in range(n):
            for j in range(n):
                matrix[i][j] = matrix2[n -1 - j][i]

