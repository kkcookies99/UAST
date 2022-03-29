class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        if len(matrix) <= 1:
            return
        
        n = len(matrix)
        level = (n+1)//2

        def changeLevel(l):
            r, c = l, l
            totalNum = n-2*l  # total nums in this level
            for i in range(totalNum-1):
                matrix[r][c+i], matrix[r+i][r+totalNum-1], matrix[r+totalNum-1][r+totalNum-1-i],\
                matrix[r+totalNum-1-i][c] = matrix[r+totalNum-1-i][c], matrix[r][c+i], \
                matrix[r+i][r+totalNum-1], matrix[r+totalNum-1][r+totalNum-1-i]

        for i in range(level):
            changeLevel(i)

