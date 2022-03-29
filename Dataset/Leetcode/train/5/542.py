 class Solution:
    def XXX(self, s: str) -> str:
        n = len(s)
        dp = [[0]*n for _ in range(n)]
        mi, mj = n-1, n-1
        for i in range(n-1, -1, -1):
            for j in range(i, n):
                if s[i]==s[j]:
                    if j-i <= 1:
                        dp[i][j] = j-i+1
                        if j-i>mj-mi:
                            mi, mj = i, j
                    elif dp[i+1][j-1]:
                        dp[i][j] = dp[i+1][j-1]+2
                        if j-i> mj-mi:
                            mi, mj = i, j
        return s[mi:mj+1]

