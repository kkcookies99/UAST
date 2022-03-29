 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        n1=len(haystack)
        n2=len(needle)
        if n2>n1:
            return -1
        if haystack==needle:
            return 0
        if needle in haystack:
            for i in range(n1):
                if haystack[i:i+n2]==needle:
                    return i
        else:
            return -1

