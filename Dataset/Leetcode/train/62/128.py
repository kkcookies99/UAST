 class Solution:
    def XXX(self, m: int, n: int) -> int:
        dp = [[1 for _ in range(n)] for _ in range(m)] # m行n列
        for i in range(m-2,-1,-1):
            for j in range(n-2,-1,-1):
                dp[i][j] = dp[i+1][j] + dp[i][j+1]
        return dp[0][0]

