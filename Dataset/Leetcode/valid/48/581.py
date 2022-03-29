 class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        #1 上下翻转
        start = 0
        end = len(matrix)-1
        while start <= end :
            matrix[start],matrix[end] = matrix[end],matrix[start]
            start+=1
            end -=1      
        #2 对角线翻转
        for i in range(1,len(matrix)):
            for j in range(i):
                matrix[i][j],matrix[j][i] = matrix[j][i],matrix[i][j]


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


