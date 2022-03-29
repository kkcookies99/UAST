 class Solution:
    def XXX(self, num: int) -> str:
        roman = [
                    ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX'],
                    ['', 'X', 'XX', 'XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC'],
                    ['', 'C', 'CC', 'CCC', 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM'],
                    ['', 'M', 'MM', 'MMM']
                ]

        result = ''
        i = 0
        while num > 0:
            yu = num % 10
            num //=10
            result = roman[i][yu] + result
            i += 1
        return result

