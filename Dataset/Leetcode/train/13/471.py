 class Solution:
    def XXX(self, s: str) -> int:
        d = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        s += 'I'; rst = 0
        for i in range(len(s)-1):
            rst = rst + d[s[i]] if d[s[i]] >= d[s[i+1]] else rst - d[s[i]]
        return rst

