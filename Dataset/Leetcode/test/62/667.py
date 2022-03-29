class Solution:
    def XXX(self, m: int, n: int) -> int:
        # 组合 计算C(m+n-2,m-1)
        return factorial(m+n-2)//(factorial(m-1)*factorial(n-1))
        # 动态规划
        # if m==0 or n==0:
        #     return 0
        # if m==1 or n==1:
        #     return 1
        # dp = [[0]*(m+1) for _ in range(n+1)]
        # dp[0][2]=1
        # dp[2][0]=1
        # for i in range(1,n+1):
        #     for j in range(1,m+1):
        #         dp[i][j] = dp[i-1][j]+dp[i][j-1]
        # return dp[-1][-1]

