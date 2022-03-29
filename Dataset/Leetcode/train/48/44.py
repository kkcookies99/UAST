class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        for i in range(n//2):  ## 行
            for j in range(i, n-i-1):  ## 列
                matrix[j][n-1-i], matrix[n-1-i][n-1-j], matrix[n-1-j][i], matrix[i][j] = matrix[i][j], matrix[j][n-1-i], matrix[n-1-i][n-1-j], matrix[n-1-j][i]
                #等价
                # matrix[j][n-1-i] = matrix[i][j]
                # matrix[n-1-i][n-1-j] = matrix[j][n-1-i]
                # matrix[n-1-j][i] = matrix[n-1-i][n-1-j]
                # matrix[i][j] = matrix[n-1-j][i]```

