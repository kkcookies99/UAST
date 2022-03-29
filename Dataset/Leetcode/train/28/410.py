 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        haystack = haystack.replace(needle,'-')
        for i in range(len(haystack)):
            if haystack[i] == '-':
                return i
        return -1

