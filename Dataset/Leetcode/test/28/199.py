 class Solution:
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle == "":
            return 0
        if haystack == needle:
            return 0
        if needle not in haystack:
            return -1
        else:
            h = haystack.split(needle)
            return len(h[0])

