class Solution(object):
    def XXX(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: void Do not return anything, modify matrix in-place instead.
        """
        c = len(matrix)
        matrix[:] = [[matrix[c-i-1][j] for i in range(c)] for j in range(c)]

