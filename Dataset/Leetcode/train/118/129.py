 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        res = []
        for i in range(numRows):
            temp = [1]*(i+1)
            for x in range(1,len(temp)-1):
                temp[x] = res[-1][x-1]+res[-1][x]
            res.append(temp)
        return res

