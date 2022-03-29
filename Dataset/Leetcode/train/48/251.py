class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        # 模拟旋转即可
        # 一层一层地旋转
        n = len(matrix)
        for i in range(n//2):
            for j in range(i,n-i-1):
                buf = matrix[i][j]
                x, y = i, j
                for k in range(4):
                    x, y = y, n-x-1
                    matrix[x][y], buf = buf, matrix[x][y]

