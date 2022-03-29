class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        ml = len(matrix)
        # 替换行
        start = 0
        end = ml - 1
        while start < end:
            matrix[start], matrix[end] = matrix[end], matrix[start]
            start += 1
            end -= 1
        # 依次替换单个坐标
        for i in range(ml):
            for j in range(i+1, ml) :
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


