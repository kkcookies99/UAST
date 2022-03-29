class Solution(object):
    def XXX(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        n = len(matrix)

        for r in range(n // 2):
            ai, aj = r, r
            bi, bj = n - r - 1, r

            for _ in range((n - 2 * r - 1) * 3):
                matrix[ai][aj], matrix[bi][bj] = matrix[bi][bj], matrix[ai][aj]
                ai, aj = self.next_loc(ai, aj, n, r)
                bi, bj = self.next_loc(bi, bj, n, r)

    def next_loc(self, i, j, n, r):
        if i == r and j > r:
            j -= 1
        elif j == r and i < n - r - 1:
            i += 1
        elif i == n - r - 1 and j < n - r - 1:
            j += 1
        elif j == n - r - 1 and i > r:
            i -= 1

        return i, j

