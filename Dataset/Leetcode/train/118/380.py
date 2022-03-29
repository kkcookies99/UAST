 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        result = []
        if numRows>0:
            result.append([1])
        for i in range(1, numRows):
            temp = [0] + result[-1] + [0]
            nex = []
            for j in range(0, len(temp)-1):
                nex.append(temp[j]+temp[j+1])
            result.append(nex)
        return result

