 class Solution:
    def XXX(self, s: str) -> int:
        romandict= {
                "I" : 1,
                "V" : 5,
                "X" : 10,
                "L" : 50,
                "C" : 100,
                "D" : 500,
                "M" : 1000,
            }
        romanspecdict = {
            "IV": 4,
            "IX": 9,
            "XL": 40,
            "XC": 90,
            "CD": 400,
            "CM": 900,
        }
        tmp = 0
        for k,v in romanspecdict.items():
            if k in s:
                tmp+=v
                s = s.replace(k,'')

        for i in s:
            tmp+=romandict[i]
        return tmp



