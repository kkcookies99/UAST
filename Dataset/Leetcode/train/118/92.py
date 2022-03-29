 class Solution(object):
    def XXX(self, numRows):
        if numRows == 0:
            return []
        if numRows == 1:
            return [[1]]
        if numRows == 2:
            return [[1],[1,1]]
        ret = [[1],[1,1]]
        for i in range(3,numRows+1):
            stack = [1]
            for j in range(1,i-1):
                stack.append(ret[-1][j-1]+ret[-1][j])
            stack.append(1)
            ret.append(stack)
        return ret

