class Solution:
    def XXX(self, s: str) -> int:
        single = {
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000
        }

        double = ('IV', 'IX', 'XL', 'XC', 'CD', 'CM')

        res = 0

        for i, ch in enumerate(s):
            if s[i:i+2] in double:
                res = res - single[ch]
            else:
                res = res + single[ch]
        
        return res

