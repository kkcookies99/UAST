 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if len(needle) == 0 or needle == haystack:
            return 0
        if needle in haystack:
            for i in range(len(haystack)-1):
                if haystack[i:i+len(needle)] == needle:
                    return i
        else:
            return -1
            

