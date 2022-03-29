class Solution:
    def XXX(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        n=len(matrix)
        if n==1:return
        #旋转几个环2-1,3-1,4-2,5-2,6-3,从外到里
        for i in range(int(n/2)):
            #从外到里第i个环要移几个数，4-0-3，4-1-1，5-0-4，5-1-2，6-0-5，6-1-4，6-2-1
            for j in range(n-1-i*2):
                #上1，顺时针编号
                idx_1=i
                idy_1=i+1+j
                
                idx_2=idy_1
                idy_2=(n-1)-idx_1
                
                idx_3=idy_2
                idy_3=(n-1)-idy_1
                
                idx_4=idy_3
                idy_4=idx_1

                #三次互换
                #1，2互换； 1，4互换；3，4互换
                matrix[idx_1][idy_1],matrix[idx_2][idy_2]=matrix[idx_2][idy_2],matrix[idx_1][idy_1]
                matrix[idx_1][idy_1],matrix[idx_4][idy_4]=matrix[idx_4][idy_4],matrix[idx_1][idy_1]
                matrix[idx_3][idy_3],matrix[idx_4][idy_4]=matrix[idx_4][idy_4],matrix[idx_3][idy_3]

