 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        roman1 = ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX']  # 1-9
        roman2 = ['', 'X', 'XX', 'XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC']  # 10-90
        roman3 = ['', 'C', 'CC', 'CCC', 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM']  # 100-900
        roman4 = ['', 'M', 'MM', 'MMM']  # 1000-3000
        # 3999
        roman_str = roman4[num // 1000] + roman3[num // 100 % 10] + roman2[num // 10 % 10] + roman1[num % 10]
        return roman_str

