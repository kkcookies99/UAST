class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        length = len(matrix)
        if length == 1: return
        for row in range(int(length/2)):
            start = row
            end = length - 1 - row 
            for col in range(start, end):
                tmp = matrix[row][col]
                matrix[row][col] = matrix[-1-col][row]
                matrix[-1-col][row]=matrix[-1-row][length-1-col]
                matrix[-1-row][length-1-col] = matrix[col][-1-row]
                matrix[col][-1-row]=tmp

