 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s) == 0: return 0
        ans = 1
        for i in range(len(s)-1):
            j = i + 1
            temp = [s[i]]

            while(j<len(s)):
                if s[j] not in temp:
                    temp.append(s[j])
                    j = j + 1
                else:
                    break
            if len(temp) > ans: ans = len(temp)
        return ans

