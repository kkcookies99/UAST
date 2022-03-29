class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        i = 0
        j = 0
        while (i < (n-1)/2 ):
            j = 0
            while (j < n/2 ):
                tmp = matrix[i][j] 
                matrix[i][j]         = matrix[n-j-1][i]         
                matrix[n-j-1][i]     = matrix[n-i-1][n-j-1]  
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1]  
                matrix[j][n-i-1] = tmp                         
                j += 1
            i += 1

