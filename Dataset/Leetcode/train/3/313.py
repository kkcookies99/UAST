 class Solution:
    def XXX(self, s: str) -> int:
        dp = [0 for i in range(len(s)+1)]
        res = {}
        l = 0
        for i in range(len(s)):
            if s[i] in s[l:i]:
                l = res[s[i]]+1
            res[s[i]] = i
            dp[i+1] = max(dp[i], i-l+1)
        return max(dp)

