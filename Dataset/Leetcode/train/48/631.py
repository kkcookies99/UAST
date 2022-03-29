 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        for i in range(n):
            for j in range(i+1):
                if i == j: continue
                else:
                    matrix[i][j] , matrix[j][i] = matrix[j][i] , matrix[i][j]
        for i in range(n):
            for j in range(n//2):
                matrix[i][j] , matrix[i][n-j-1] = matrix[i][n-j-1] , matrix[i][j]

