 class Solution:
    def XXX(self, s: str) -> str:
        res=''
        maxlength=0
        dp=[[True]*len(s) for _ in range(len(s))]
        for gap in range(1,len(s)):
            for l in range(len(s)-gap):
                r=l+gap
                dp[l][r]=dp[l+1][r-1] and s[l]==s[r]
                if dp[l][r] and gap>maxlength:
                    res=s[l:r+1]
                    maxlength=gap
        return res if s=='' or maxlength!=0 else s[0] 

