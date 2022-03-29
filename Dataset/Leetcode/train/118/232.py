 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows == 1: # 只有一行
            result = [[1]]
        else: # 大于两行时，初始化第一，二行
            result = [[1],[1,1]]

        for row in range(2,numRows): # 从第三行开始
            row_result = [1]*(row+1) # 第三行初始化全1
            for col in range(1,row): # 第一列和最后一列保持为1，替换其他列
                row_result[col] = result[row-1][col-1]+result[row-1][col]
                
            result.append(row_result) # 把该行加入最终列表

        return result

