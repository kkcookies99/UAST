class Solution:
    def XXX(self, s: str) -> int:
        s = s.replace('CM', 'Q')
        s = s.replace('CD', 'W')
        s = s.replace('XC', 'E')
        s = s.replace('XL', 'R')
        s = s.replace('IX', 'T')
        s = s.replace('IV', 'Y')

        keys = {
            'Q' : 900,
            'W' : 400,
            'E' : 90,
            'R' : 40,
            'T' : 9,
            'Y' : 4,
            'M' : 1000,
            'D' : 500,
            'C' : 100,
            'L' : 50,
            'X' : 10,
            'V' : 5,
            'I' : 1
        }

        ans = 0
        for ch in s:
            ans += keys[ch]
        
        return ans
        

