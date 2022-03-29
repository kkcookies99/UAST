 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if haystack == needle:
            return 0
        i = 0
        while i < len(haystack) - len(needle)+1:
            if haystack[i:i+len(needle)] == needle:
                return i
            i += 1
        return -1

