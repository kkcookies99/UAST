 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        #上下翻转
        n = len(matrix)
        for i in range(n//2):
            for j in range(n):
                matrix[i][j], matrix[n-1-i][j] =  matrix[n-1-i][j], matrix[i][j]
        #左对角线反转
        for i in range(1, n):
            for j in range(i):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

