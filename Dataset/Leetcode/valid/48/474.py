 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """

        dim = len(matrix)
        matrix_new = [[0 for _ in range(dim)] for _ in range(dim)]

        for i in range(dim):
            for j in range(dim):
                matrix_new[j][dim - i - 1] = matrix[i][j]

        matrix[:] = matrix_new


