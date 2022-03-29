 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        l = len(matrix)
        for x in range(l//2):
            for y in range(x, l-1-x):
                tmp = matrix[x][y]
                matrix[x][y] = matrix[l-1-y][x]
                matrix[l-1-y][x] = matrix[l-1-x][l-1-y]
                matrix[l-1-x][l-1-y] = matrix[y][l-1-x]
                matrix[y][l-1-x] = tmp

