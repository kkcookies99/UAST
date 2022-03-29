 class Solution:
    def getNext(self, s: str):
        n = len(s)
        next = list()
        for i in range(n):
            next.append('')
        j = 0
        next[0] = 0
        for i in range(1, n):
            while j > 0 and s[i] != s[j]:
                j = next[j - 1]
            if s[i] == s[j]:
                j += 1
            next[i] = j

    def XXX(self, haystack: str, needle: str) -> int:
        a = len(needle)
        b = len(haystack)
        if a == 0:
            return 0
        next = self.getNext(needle)
        j = 0
        for i in range(b):
            while j > 0 and haystack[i] != needle[j]:
                j = next[j - 1]
            if haystack[i] == needle[j]:
                j += 1
            if j == a:
                return i - j + 1
        return -1

