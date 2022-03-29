class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n=len(matrix)
        for i in range(n//2):
            for j in range(i,n-i-1):
                matrix[i][j],matrix[j][n-1-i],matrix[n-1-i][n-j-1],matrix[n-j-1][i]=matrix[n-j-1][i],matrix[i][j],matrix[j][n-1-i],matrix[n-1-i][n-j-1]

