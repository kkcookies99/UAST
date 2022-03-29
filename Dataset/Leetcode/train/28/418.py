 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle not in haystack:
            return -1
        lth = len(needle)
        for i in range(len(haystack) - lth+1):
            if haystack[i:i+lth] == needle:
                return i


