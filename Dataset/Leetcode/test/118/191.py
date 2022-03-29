 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        #动态规划法，每一层的数组为numRows[i]
        #
        if numRows == 0:
            return []
        #首先建立一个所有元素都是1的数组   例如：[1]*5 为 [1,1,1,1,1]
        res = [[1]*i for i in range(1,numRows+1)]
        for i in range(2,len(res)):
            for j in range(i+1):
                if j == 0 or j == i:
                    res[i][j] = 1
                else:
                    value = res[i-1][j-1] + res[i-1][j]
                    res[i][j] = value
        return res

