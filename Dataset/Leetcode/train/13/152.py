class Solution:
    def XXX(self, s: str) -> int:
        dict_roman = {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        n = len(s)
        ans = dict_roman[s[n-1]]
        for i in range(1,n):
            if dict_roman[s[-i-1]] < dict_roman[s[-i]]:
                ans = ans - dict_roman[s[-i-1]]
            else:
                ans = ans + dict_roman[s[-i-1]]
        return ans

