 class Solution(object):
    def XXX(self, haystack, needle):
        i = 0
        if needle == "":
            return 0
        while i <= len(haystack) - len(needle):
            if haystack[i: i + len(needle)] == needle:
                return i
            i += 1
        return -1

