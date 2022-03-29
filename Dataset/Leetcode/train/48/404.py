 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        #0,0 -> 0,3 - > 3,3 -> 3,0 -> 0,0
        #0,1 -> 1,3 -> 3,2 -> 2,0-> 0,1
        #0,2 -> 2,3 -> 3,1 -> 1,0 -> 0,2
        n = len(matrix)
        for i in range(n//2):
            for j in range(i,n-i-1):
                temp = matrix[i][j]
                matrix[i][j] = matrix[n-1-j][i]
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j]
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i]
                matrix[j][n-1-i] = temp
        return matrix

