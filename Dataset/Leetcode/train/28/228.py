 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        len1 = len(haystack)
        len2 = len(needle)
        if len1 == 0 and len2 > 0:
            return -1
        elif len1*len2 == 0:
            return 0
        for i in range(len1-len2+1):
            if haystack[i:i+len2] == needle:
                return i
        return -1

