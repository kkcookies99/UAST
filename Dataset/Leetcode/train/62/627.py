class Solution:
    def XXX(self, m: int, n: int) -> int:
        # 子问题
        # dp[i] 从左上角到当前层第i个点的路径个数
        # 初始化
        # dp[0]=1
        # 递推式
        # dp[i] = dp[i-1] + dp[i]

        dp = [1 for _ in range(n)]
        
        for l in range(1, m):
            for i in range(1, n):
                dp[i] = dp[i-1] + dp[i]
        return dp[n-1]

