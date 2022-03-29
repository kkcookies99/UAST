 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        i = 0
        while i <= len(haystack):
            if haystack[i:i+len(needle)] == needle:
                return i
            i += 1
        return -1

