 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        mapSingleRoman2Int = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        mapDoubleRoman2Int = {
            "IV": 4,
            "IX": 9,
            "XL": 40,
            "XC": 90,
            "CD": 400,
            "CM": 900
        }
        res = 0
        i = 0
        while i <= len(s)-1:
            if i != len(s)-1 and s[i:i+2] in mapDoubleRoman2Int.keys():
                res += mapDoubleRoman2Int[s[i:i+2]]
                i += 2
            else:
                res += mapSingleRoman2Int[s[i]]
                i += 1
        return res

