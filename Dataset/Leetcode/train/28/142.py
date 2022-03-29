 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle=='':
            return 0
        n = len(needle)
        for i in range(len(haystack)-n+1):
            if haystack[i: i+n]==needle:
                return i
        return -1

