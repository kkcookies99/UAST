class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        if matrix is None or len(matrix) == 0:
            return
        n = len(matrix)
        is_swap = [[False] * n for i in range(n)]
        for row in range(n):
            for col in range(n):
                if not is_swap[row][col]:
                    temp = matrix[row][col]

                    matrix[row][col] = matrix[n - 1 - col][row]
                    is_swap[row][col] = True

                    matrix[n - 1 - col][row] = matrix[n - 1 - row][n - 1 - col]
                    is_swap[n - 1 - col][row] = True

                    matrix[n - 1 - row][n - 1 - col] = matrix[col][n - 1 - row]
                    is_swap[n - 1 - row][n - 1 - col] = True

                    matrix[col][n - 1 - row] = temp
                    is_swap[col][n - 1 - row] = True


