class Solution(object):
    def XXX(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """

        matrix.reverse()
        res = list(map(list, zip(*matrix)))
        matrix[:] = res


