class Solution:
    def XXX(self, n: int) -> str:
        dp = [''] * n
        dp[0] = '1'
        for i in range(1, n):
            s = dp[i - 1][::-1]
            count = 1
            dp[i] += s[0]
            for j in range(1, len(s)):
                if s[j] != s[j - 1]:
                    dp[i] += str(count)
                    dp[i] += s[j]
                    count = 1
                else:
                    count += 1
            dp[i] += str(count)
            dp[i] = dp[i][::-1]

        return dp[-1]

