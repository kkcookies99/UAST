 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        res = [[] for _ in range(numRows)]
        for i in range(numRows):
            li = [1]*(i+1)
            for j in range(1,i):
                li[j] = res[i-1][j-1] + res[i-1][j]
            res[i] = li
        return res

