 class Solution:
    def XXX(self, num: int) -> str:
        roman = [
            ['', "M", "MM", "MMM"],
            ['', "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"],
            ['', "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"],
            ['', "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"],
        ]
        num_l = [1000, 100, 10, 1]
        roman_num = ''

        for k, v in enumerate(num_l):
            roman_num += roman[k][num//v]
            num %= v
        return roman_num

