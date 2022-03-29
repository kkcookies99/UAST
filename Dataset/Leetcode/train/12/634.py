 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        # 1. 初始千位数
        roman_str = 'M' * (num // 1000)  
        # 2. 百位数
        residue = num // 100 % 10
        if residue <= 3:
            roman_str += 'C' * residue
        elif residue == 4:
            roman_str += 'CD'
        elif 5 <= residue <= 8:
            roman_str += "D%s" % ('C' * (residue - 5))
        elif residue == 9:
            roman_str += 'CM'
        # 3. 十位数
        residue = num // 10 % 10
        if residue <= 3:
            roman_str += 'X' * residue
        elif residue == 4:
            roman_str += 'XL'
        elif 5 <= residue <= 8:
            roman_str += "L%s" % ('X' * (residue - 5))
        elif residue == 9:
            roman_str += 'XC'
        # 4. 个位数
        residue = num % 10
        if residue <= 3:
            roman_str += 'I' * residue
        elif residue == 4:
            roman_str += 'IV'
        elif 5 <= residue <= 8:
            roman_str += "V%s" % ('I' * (residue - 5))
        elif residue == 9:
            roman_str += 'IX'

        return roman_str

