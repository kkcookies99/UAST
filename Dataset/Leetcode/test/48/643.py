 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        n = len(matrix)
        # 先按主对角线对称
        for i in range(n - 1):
            for j in range(i + 1, n):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        # 再左右对称
        for i in range(n):
            for j in range(n // 2):
                matrix[i][j], matrix[i][n - j - 1] = matrix[i][n - j - 1], matrix[i][j]

