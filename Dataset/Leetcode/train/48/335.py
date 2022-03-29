class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        matrix[::] = [[row[i] for row in matrix][::-1] for i in range(len(matrix[0]))]

