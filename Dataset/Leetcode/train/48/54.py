class Solution(object):
    def XXX(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        m = len(matrix)-1
        max_i = len(matrix)//2
        max_j = len(matrix)-max_i
        for i in range(max_i):
            for j in range(max_j):
                t = matrix[i][j]
                matrix[i][j] = matrix[m-j][i]
                matrix[m-j][i] = matrix[m-i][m-j]
                matrix[m-i][m-j] = matrix[j][m-i]
                matrix[j][m-i] = t

