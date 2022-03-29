 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if len(needle) < 1: return 0
        nxt = [0] * len(needle)
        j = 0
        for i in range(1, len(needle)):
            while j > 0 and needle[j] != needle[i]: j = nxt[j - 1]
            if needle[j] == needle[i]:
                j += 1              
            nxt[i] = j
        j = 0
        for i in range(len(haystack)):        
            while j > 0 and haystack[i] != needle[j]:
                j = nxt[j - 1]
            if haystack[i] == needle[j]:
                j += 1
            if j == len(needle):
                return i - len(needle) + 1
        return -1

