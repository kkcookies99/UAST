 class Solution:
    def XXX(self, m: int, n: int) -> int:
        dp = [[0 for i in range(n)] for j in range (m)]
        for i in range(m):
            for j in range(n):
                if i==0 or j==0:
                   dp[i][j] = 1
                else:
                    dp[i][j] = dp[i-1][j] + dp[i][j-1]
        
        print(dp)
        return dp[m-1][n-1] 

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


