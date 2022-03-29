 class Solution:
    def XXX(self, s: str) -> str:
        '''
        dp[i][j] = s[i]==s[j] and (j-i<=2 or dp[i+1][j-1])
        因为dp依赖j-1，所以先对j进行遍历，在j的基础上遍历i
        '''
        n = len(s)
        dp = [[False for _ in range(n)] for _ in range(n)]
        maxlen = 0
        res = ''

        for j in range(n):
            for i in range(j+1):
                dp[i][j] = s[i]==s[j] and (j-i<=2 or dp[i+1][j-1])
                if dp[i][j] and j-i+1>maxlen:
                    maxlen = j-i+1
                    res = s[i:j+1]

        return res

