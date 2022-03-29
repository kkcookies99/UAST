 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0 
        m, n = len(haystack), len(needle)
        i, j, count = 0, 0, 0
        while i < m:
            if haystack[i] == needle[j]:
                count += 1
                if count == n:
                    return i - n + 1
                i += 1
                j += 1
            else:
                i -= (count-1)
                count = 0
                j = 0
        return  - 1

