 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        # 先对矩阵转置
        n = len(matrix)
        for i in range(n):
            for j in range(i):
                matrix[i][j],matrix[j][i] = matrix[j][i],matrix[i][j]
        
        # 然后按列翻转
        for i in range(n):
            for j in range(n//2):
                matrix[i][j],matrix[i][n-1-j] = matrix[i][n-1-j],matrix[i][j]

