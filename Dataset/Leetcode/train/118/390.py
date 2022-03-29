 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        dp = [[1]]
        for i in range(1,numRows):
            dp.append([])
            for j in range(i+1):
                if j == 0 or j == i:
                    dp[i].append(1)
                else:
                    dp[i].append(dp[i-1][j-1] + dp[i-1][j])
        return dp

