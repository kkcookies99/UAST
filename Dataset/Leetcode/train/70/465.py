class Solution:
    def XXX(self, n: int) -> int:
        res = []
        if n == 1:
            return 1
        if n == 2:
            return 2
        dp = [1, 2]
        while n - 2:
            dp[0], dp[1] = dp[1], dp[0] + dp[1]
            n -= 1
        
        return dp[1]

