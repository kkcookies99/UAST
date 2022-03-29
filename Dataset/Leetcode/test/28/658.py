 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle == "":
            return 0
        len_needle = len(needle)
        for i in range(len(haystack)-len_needle+1):
            if haystack[i:len_needle+i] == needle:
                return i
        else:
            return -1

