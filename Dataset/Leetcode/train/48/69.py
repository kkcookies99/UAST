class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        left,right = 0,len(matrix[0])-1
        while left<right:
            i = 0
            while i<right-left:
                matrix[left][left+i],matrix[left+i][right]=matrix[left+i][right],matrix[left][left+i]
                matrix[right][right-i],matrix[right-i][left]=matrix[right-i][left],matrix[right][right-i]
                matrix[left][left+i],matrix[right][right-i]=matrix[right][right-i],matrix[left][left+i]
                i+=1
            left+=1
            right-=1

