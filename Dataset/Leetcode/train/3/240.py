 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        l, max_length = 0, 0
        for i, e in enumerate(s):
            if e in s[l:i]:
                l += s[l:i].index(e) + 1
            max_length = max(i - l + 1, max_length)        
        return max_length