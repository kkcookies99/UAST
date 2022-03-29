 class Solution:
    def XXX(self, s: str) -> int:
        if len(s)==0: return 0
        dp=[[0 for i in range(len(s))] for j in range(len(s))]
        ans=1
        for i in range(len(s)):
            dp[i][i]=1
        for i in range(len(s)):
            for j in range(i+1,len(s)):
                if s[j] in s[i:j]:
                    dp[i][j]=0
                else:
                    dp[i][j]=dp[i][j-1]+1
                    if(dp[i][j]>ans):
                        ans=dp[i][j]
        return ans

