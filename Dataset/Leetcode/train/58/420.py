class Solution:
    def XXX(self, s: str) -> int:

        length = len(s)
        res = 0
        i = length-1
        while i>=0 and s[i]==' ':
            i -= 1
        
        while i>=0 and s[i]!=' ':
            res += 1
            i -= 1
        return res

