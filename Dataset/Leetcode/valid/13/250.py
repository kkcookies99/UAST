class Solution:
    def XXX(self, s: str) -> int:
        dic = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        pre = 1001
        out = 0
        for ch in s:
            if dic[ch]<=pre:
                out+=dic[ch]
            else:
                out = out+dic[ch]-2*pre
            pre = dic[ch]
        return out

