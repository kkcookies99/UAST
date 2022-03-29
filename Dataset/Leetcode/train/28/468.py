 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not haystack and not  needle:
            return 0
        if haystack and not  needle:
            return 0
        if not haystack and needle:
            return -1
        ln = len(haystack)
        rn = len(needle)
        if rn>ln:
            return -1
        
        for i in range(ln-rn+1):
            if haystack[i:i+rn]==needle:
                return i
        return -1

