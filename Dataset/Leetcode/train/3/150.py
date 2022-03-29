 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not len(s): return 0
        dp=[1]*len(s)
        tmp=s[0]
        for i in range(1,len(s)):
            if s[i] in tmp:
                idx=tmp.index(s[i])
                tmp=tmp[idx+1:]+s[i]
            else:
                tmp+=s[i]
            dp[i]=max(len(tmp),dp[i])
        return max(dp)

