class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        count = len(matrix)   # matrix count * count
        length = count - 1  # 边长
        for i in range(0, count//2):
            for j in range(i, length - i):
                num = matrix[i][j]
                matrix[i][j] = matrix[length-j][i]
                matrix[length-j][i] = matrix[length-i][length-j]
                matrix[length-i][length-j] = matrix[j][length-i]
                matrix[j][length-i] = num

