 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        n=len(needle)
        m=len(haystack)
        if n==0:
            return 0
        if m==0:
            return -1
        for i in range(m):
            if haystack[i]==needle[0]:
                if haystack[i:i+n]==needle:
                    return i
            if m-i<=n:
                return -1

