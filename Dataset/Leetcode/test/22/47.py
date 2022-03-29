 class Solution:
    def XXX(self, n: int) -> List[str]:
        dp = [[] for _ in range(n+1)]
        dp[0].append("")
        for i in range(1, n+1):
            for j in range(0, i):
                for p in range(len(dp[j])):
                    for q in range(len(dp[i-1-j])):
                        dp[i].append("(" + dp[j][p] + ")" + dp[i-1-j][q])
        return dp[n]

