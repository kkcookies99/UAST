 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle == '':
            return 0
        hl = len(haystack)
        nl = len(needle)
        for i in range(hl - nl + 1):
            if haystack[i] == needle[0]:
                if haystack[i:i + nl] == needle:
                    return i
        return -1

