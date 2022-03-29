 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle=="":
            return 0
        if needle not in haystack:
            return -1
        sliderSize = len(needle)
        for i,v in enumerate(haystack):
            cur = i
            if haystack[i:i+sliderSize] == needle:
                return i

