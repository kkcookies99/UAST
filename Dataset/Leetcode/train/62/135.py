 class Solution(object):
    def XXX(self, m, n):
        """
        :type m: int
        :type n: int
        :rtype: int
        """
        # 求dp[i][j]
        # dp[i][j] = dp[i-1][j] + dp[i][j-1]
        
        dp = [[0 for i in range(m)] for i in range(n)]
        
        for i in range(m):
            dp[0][i] = 1
        for i in range(n):
            dp[i][0] = 1
            
        for i in range(1,n):
            for j in range(1,m):
                dp[i][j] = dp[i-1][j]+dp[i][j-1]
        
        return dp[n-1][m-1]

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


