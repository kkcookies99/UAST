 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0:
            return 0
            
        ans = 0
        temp = []
        for i in range(len(s)):
            if s[i] in temp:
                temp.append(s[i])
                idx = temp.index(s[i])
                temp = temp[idx+1:]
            if s[i] not in temp:
                temp.append(s[i])
                ans = max(ans,len(temp))
        return ans

