 class Solution:
    def XXX(self, s: str) -> int:
        roman = {'IV':4, 'IX':9, 'XL':40, 'XC':90, 'CD':400, 'CM':900, 'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        res = 0
        while s:
            for i in roman:
                if i in s:
                    res += roman[i]
                    s = s.replace(i, '', 1)
        return res

