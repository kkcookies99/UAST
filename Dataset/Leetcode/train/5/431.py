 class Solution:
    def is_Palindrome(self, s, dp, i, j):
        if dp[i][j]>-1:
            return dp[i][j]
        if i == j:
            dp[i][j] = 1
            return 1
        if i == j-1:
            if s[i] == s[j]:
                dp[i][j] = 1
                return 1
            else:
                dp[i][j] = 0
                return 0
        
        if s[i] == s[j] and self.is_Palindrome(s, dp, i+1, j-1):
            dp[i][j] = 1
            return 1
        else:
            dp[i][j] = 0
            return 0
    
    def XXX(self,s):
        dp = [[-1 for i in xrange(len(s))] for j in xrange(len(s))]
        n = len(s)
        max = 1
        start = 0
        for i in xrange(1,n):
            if i > max and self.is_Palindrome(s, dp, i-max-1, i):
                start = i - max - 1
                max += 2
                continue
            if self.is_Palindrome(s, dp, i-max, i):
                start = i - max
                max += 1
        return s[start:start + max]

