 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle == '':return 0
        len_h = len(haystack)
        len_n = len(needle)
        for i in range(len_h):
            if haystack[i] == needle[0]:
                if i+len_n <= len_h and haystack[i:i+len_n] == needle:
                    return i
        return -1

