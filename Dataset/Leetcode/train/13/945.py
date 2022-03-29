 class Solution(object):
    RM_VALUES = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000,
    }
    
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        ans = 0
        for i in range(len(s) - 1):
            ans = self.RM_VALUES[s[i]] >= self.RM_VALUES[s[i+1]] and ans + self.RM_VALUES[s[i]] or ans - self.RM_VALUES[s[i]]

        ans += self.RM_VALUES[s[-1]]

        return ans

