 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """

        # 3 2 1
        # 6 5 4
        # 9 8 7 
        # 左右翻转  
        for i in range(len(matrix)):
            for j in range(len(matrix)//2): 
                matrix[i][j],matrix[i][len(matrix)-j-1]=matrix[i][len(matrix)-j-1],matrix[i][j]

        # 按对角线翻转 
        for i in range(len(matrix)):
            for j in range(len(matrix)-i):
                matrix[i][j],matrix[len(matrix)-1-j][len(matrix)-1-i] =matrix[len(matrix)-1-j][len(matrix)-1-i],matrix[i][j] 

