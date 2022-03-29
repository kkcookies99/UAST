 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        dp = [[1], [1,1]]
        for i in range(2, numRows, 1):
            n = [1] + [dp[-1][idx-1]+dp[-1][idx] for idx in range(1, len(dp[-1]),1)] + [1]
            dp.append(n)
        return dp[:numRows]

