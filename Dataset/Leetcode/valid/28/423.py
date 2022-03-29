 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle == '':
            return 0
        haystack = list(haystack)
        needle   = list(needle)
        length = len(needle)
        for i in range (0,len(haystack)):
            if i+length-1 < len(haystack) and haystack[i:i+length] == needle:
                return i 
        return -1

