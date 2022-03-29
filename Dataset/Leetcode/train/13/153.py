class Solution:
    def XXX(self, s: str) -> int:
        lookup = {
            "I":1,
            "IV":4,
            "V":5,
            "VI":6,
            "IX":9,
            "X":10,
            "XL":40,
            "L":50,
            "XC":90,
            "C":100,
            "CD":400,
            "D":500,
            "CM":900,
            "M":1000, 
        }
        n = len(s)
        i = 0
        res = 0
        while i < n:
            if i < n - 1 and s[i:i+2] in lookup:
                res += lookup[s[i:i+2]]
                i += 2
            elif s[i] in lookup:
                res += lookup[s[i]]
                i += 1
        return res

