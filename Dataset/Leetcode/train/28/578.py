 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if needle == "": return 0
        i, j = 0, 0
        while j < len(haystack):
            if len(needle) > len(haystack) - i: return -1
            while j < len(haystack) and haystack[j] == needle[j - i]: 
                j += 1
                if j - i == len(needle):
                    return i
            i += 1
            j = i
        return -1

