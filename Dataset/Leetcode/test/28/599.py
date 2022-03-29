 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0
        m, n = len(haystack), len(needle)
        p = [0] * n
        p[0] = -1
        for i in range(2, n):
            j = p[i-1]
            while j > 0 and needle[i-1] != needle[j]:
                j = p[j]
            if needle[i-1] == needle[j]:
                j += 1
            p[i] = j
        i = j = 0
        while i < m and j < n:
            if haystack[i] == needle[j]:
                i += 1
                j += 1
            else:
                if p[j] == -1:
                    i += 1
                    j = 0
                else:
                    j = p[j]
        return i - n if j == n else -1

