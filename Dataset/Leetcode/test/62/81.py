 class Solution(object):
    def XXX(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        递归思想-动态规划
        """
        dp = [[0]*n]*m
        for i in range(0, m):
            for j in range(0, n):
                if i == 0 or j == 0:
                    dp[i][j] = 1
                else:
                    dp[i][j] = dp[i-1][j]+dp[i][j-1]
        return dp[m-1][n-1]

