 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        result = [[1]]
        for i in range(numRows-1):
            pre = result[i]
            if len(pre) == 1:
                result.append([1,1])
            else:
                result.append([1] + [pre[i] + pre[i+1] for i in range(len(pre)-1)] + [1])
        
        return result


