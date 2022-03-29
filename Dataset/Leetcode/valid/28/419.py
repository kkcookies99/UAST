 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle == "":
            return 0
        for i in range(len(haystack)):
            if haystack[i:i+len(needle)] == needle:
                return i
        return -1


