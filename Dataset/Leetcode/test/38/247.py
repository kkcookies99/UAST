class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """
        dp = {1:'1'}
        for i in range(2, n+1):
            if not i in dp:
                dp[i] = self.say(dp[i-1])
        return dp[n]
        
    def say(self, numstr):
        res = ''
        tmp = ''
        i = 0
        while i < len(numstr):
            if numstr[i] in tmp or not tmp:
                tmp += numstr[i]
            elif not numstr[i]==tmp[0]:
                res += str(len(tmp)) + tmp[0]
                tmp = numstr[i]
            i += 1
        if tmp: res += str(len(tmp)) + tmp[0]
        return res

