 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        n, m = len(haystack), len(needle)
        if m == 0: return 0
        ne = [-1] * m
        j = -1
        for i in range(1, m):
            while j != -1 and needle[i] != needle[j+1]: j = ne[j]
            if needle[i] == needle[j + 1]: j += 1
            ne[i] = j
        j = -1
        for i in range(n):
            while j != -1 and needle[j+1] != haystack[i]: j = ne[j]
            if haystack[i] == needle[j+1]: j += 1
            if j == m -1 : return i - j
        return -1

