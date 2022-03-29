 class Solution:
    def XXX(self, num: int) -> str:
        res = ''
        symbols = zip(('M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I'),
                      (1000, 900, 500, 400,  100,   90,  50,   40,  10,    9,   5,    4,  1))
        for symbol, value in symbols:
            while num >= value:
                res += symbol
                num -= value
        return res


