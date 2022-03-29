class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        transpose = [[row[col] for row in matrix] for col in range(len(matrix[0]))]
        for line in transpose:
            line.reverse()
        matrix[:] = transpose 


