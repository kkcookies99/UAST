 class Solution(object):
    def XXX(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        dp = [[int(i == 0) or int(j == 0) for i in range(m)] for j in range(n)]
        for i in range(1,m):
            for j in range(1,n):
                dp[j][i] = dp[j-1][i] +dp[j][i-1]
        return dp[-1][-1]


