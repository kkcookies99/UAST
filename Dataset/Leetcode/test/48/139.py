class Solution:
    def XXX(self, matrix) -> None:
        # #思路1:  1/从外层至内层依次旋转。
        #         2/每层分为两个循环
        #           第一个循环遍历从当前层顶行的左上角元素至当前层顶行的倒数第二个元素
        #           第二个循环遍历第一个循环所对应需要旋转90度时，变化的4个元素
        #           使用temp作为临时空间，存储被覆盖的元素。
        # #思路2:     不用temp
        #         1/从外层至内层依次旋转。
        #         2/每层分为一个循环
        #           第一个循环遍历从当前层顶行的左上角元素至当前层顶行的倒数第二个元素
        #           直接交换当前对应的4个元素
        if matrix == []:
            return
        max_matrixlen = len(matrix[0])
        for i in range((max_matrixlen + 1)//2):#层遍历
            for j in range(0,max_matrixlen - i*2 - 1):#第一个循环/左上角开始
                matrix[i + j][max_matrixlen - i - 1], matrix[max_matrixlen - i - 1][max_matrixlen - i - j - 1], matrix[max_matrixlen - i - j - 1][i],matrix[i][i+j] = \
                matrix[i][i+j],matrix[i+j][max_matrixlen-i-1],matrix[max_matrixlen-i-1][max_matrixlen-i-j-1],matrix[max_matrixlen-i-j-1][i]
        return


