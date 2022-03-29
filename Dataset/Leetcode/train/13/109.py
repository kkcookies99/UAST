class Solution:
    def XXX(self, s: str) -> int:
        VALUE_SYMBOLS = {'M': 1000,
                         'CM': 900,
                         'D': 500,
                         'CD': 400,
                         'C': 100,
                         'XC': 90,
                         'L': 50,
                         'XL': 40,
                         'X': 10,
                         'IX': 9,
                         'V': 5,
                         'IV': 4,
                         'I': 1}
z
        index = res = 0
        while index < len(s):
            if index < len(s) - 1 and s[index] + s[index + 1] in VALUE_SYMBOLS:
                res += VALUE_SYMBOLS[s[index] + s[index + 1]]
                index += 2
            elif s[index] in VALUE_SYMBOLS:
                res += VALUE_SYMBOLS[s[index]]
                index += 1
        return res
