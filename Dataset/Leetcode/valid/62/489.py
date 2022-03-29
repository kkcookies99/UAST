class Solution(object):
    def XXX(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        dp = [1]*n
        dp = [dp]*m
        for i in range(m):
            for j in range(n):
                if i!=0 and j!=0:
                    dp[i][j] = dp[i-1][j] + dp[i][j-1]
        return dp[m-1][n-1]                    

