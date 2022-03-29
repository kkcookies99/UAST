class Solution(object):
    def XXX(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """ 

        n = len(matrix)
        for i in range(n):
            for j in range(n):
                matrix[j][n-1-i] = matrix[i][j]

