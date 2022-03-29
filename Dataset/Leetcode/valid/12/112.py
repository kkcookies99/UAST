 class Solution:
    def XXX(self, num: int) -> str:
        """
        s = ""
        # 1000 +
        s += 'M' * (num // 1000)
        num = num % 1000
        # 100 ~ 999
            # 900 +
        if num >= 900 :
            s += 'CM'
            # 500 ~ 899
        elif num >= 500 :
            s += 'D' + 'C' * (num // 100 - 5)
            num -= 500
            # 400 ~ 499
            # 处理后可能还大于100
        elif num >= 400 :
            s += 'CD'
            # 100 ~ 399
        else :
            s += 'C' * (num // 100)
        num = num % 100
        # 10 ~ 100
            # 90 +
        if num >= 90 :
            s += 'XC'
            # 50 ~ 89
        elif num >= 50 :
            s += 'L' + 'X' * (num // 10 - 5)
            # 40 ~ 49
        elif num >= 40 :
            s += 'XL'
            # 10 ~ 39
        else :
            s += 'X' * (num // 10)
        num = num % 10
        # 1 ~ 10
            # 9 
        if num == 9 :
            s += 'IX'
            # 5 ~ 8
        elif num >= 5 :
            s += 'V'
            s += 'I' * (num - 5)
            # 40 ~ 49
        elif num == 4 :
            s += 'IV'
            num -= 4
            # 10 ~ 39
        else :
            s += 'I' * num
        return s 
        """
        CardinalNumber = { 
             1000 : ['', 'M', 'MM', 'MMM'] ,
             100 : ['', 'C', 'CC', 'CCC', 'CD', 'D', 'DC', 'DCC', 'DCCC', 'CM'] , 
             10 : ['', 'X', 'XX', 'XXX', 'XL', 'L', 'LX', 'LXX', 'LXXX', 'XC']  , 
             1 : ['', 'I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX']  
        }
        return CardinalNumber[1000][num//1000] + CardinalNumber[100][num//100%10] + CardinalNumber[10][num//10%10] + CardinalNumber[1][num%10]

