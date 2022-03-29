 class Solution(object):
    def XXX(self, haystack, needle):
        if haystack == needle:
            return 0
        for i in range(0, len(haystack)+1):
            if needle in haystack[0:i]:
                return i - len(needle)
        return -1

