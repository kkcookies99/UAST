 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)
        i,j = 0,n-1
        while i < j:
            matrix[i],matrix[j] = matrix[j],matrix[i]
            i,j = i+1,j-1

        for i in range(n):
            for j in range(i,n):
                matrix[i][j],matrix[j][i] = matrix[j][i],matrix[i][j]

        return matrix

