class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """

        ## 旋转题目 找规律 简单的
        ## 时间99.5 按层向内旋转

        left = 0
        right = len(matrix)-1
        temp = [0 for i in range(len(matrix))]
        while left<right:
            for i in range(right-left+1):
                temp[i] = matrix[left][left+i]

            for i in range(right-left+1):
                matrix[left][right-i] = matrix[left+i][left]
            
            for i in range(right-left+1):
                matrix[left+i][left] = matrix[right][left+i]

            for i in range(right-left+1):
                matrix[right][left+i] = matrix[right-i][right]

            for i in range(right-left+1):
                matrix[left+i][right] = temp[i] 
            
            left = left+1
            right = right-1

