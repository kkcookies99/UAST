class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        ##先转置
        ##再上下翻转
        m = len(matrix)
        n = len(matrix[0])
        for i in range(m):
            for j in range(i+1,n):
                matrix[i][j],matrix[j][i] = matrix[j][i],matrix[i][j] 
        for i in range(m):
            for j in range(n//2):
                matrix[i][j],matrix[i][n-j-1] = matrix[i][n-j-1],matrix[i][j]

