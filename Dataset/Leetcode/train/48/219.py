class Solution(object):
    def XXX(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        matrix[:] = [[matrix[i][j] for i in range(len(matrix))][::-1] for j in range(len(matrix))]

