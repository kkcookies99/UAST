 class Solution:
    def XXX(self, s: str) -> int:
        l=len(s)
        if ' ' not in s:
            return l
        for i in range(l-1,-1,-1):           
            if s[i]==' ':
                return l-i-1

