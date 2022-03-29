class Solution:
    def XXX(self, matrix):
        m = len(matrix)

        for i in range(1, m + 1):
            matrix.append([matrix[j][i - 1] for j in range(m-1, -1, -1)])  # 倒着遍历整个列表
        for _ in range(m):
            matrix.pop(0)

