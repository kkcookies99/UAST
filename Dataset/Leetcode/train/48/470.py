 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        执行用时：32 ms, 在所有 Python3 提交中击败了93.47%的用户
        内存消耗：14.7 MB, 在所有 Python3 提交中击败了70.41%的用户
        """
        n = len(matrix)

        # 上三角矩阵沿沿主对角线做对称变换
        for i in range(n):
            for j in range(i, n):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

        # 左半矩阵沿着列中位线做对称变换
        for i in range(n):
            for j in range(n // 2):
                matrix[i][j], matrix[i][n - j - 1] = matrix[i][n - j - 1], matrix[i][j]

