 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        dp = []
        dp.append([1])
        dp.append([1,1])
        for i in range(2, numRows):
            tmp = []
            for j in range(i+1):
                if j == 0 or j == i:
                    tmp.append(1)
                else:
                    tmp.append(dp[i-1][j-1]+dp[i-1][j])
            dp.append(tmp[:])
        return dp[:numRows]

