 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        lenth=len(needle)
        if lenth==0:
            return 0
        for i in range(len(haystack)-lenth+1):
            if haystack[i:i+lenth]==needle:
                return i
        return -1

