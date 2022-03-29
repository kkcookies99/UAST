 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not haystack and not needle:
            return 0
        else : 
            m, n = len(haystack), len(needle)
            ans = 0
            for i in range(0, m):
                if haystack[i: i + n ] == needle:
                    return i 
            return -1 

