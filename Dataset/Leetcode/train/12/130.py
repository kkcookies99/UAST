 class Solution:
    def XXX(self, num: int) -> str:
        # 处理千位
        thousand_times = int(num/1000)
        s = thousand_times*'M'
        # 处理百位
        num = num % 1000
        if int(num/100) == 9:
            s += 'CM'
        elif int(num/100) == 4:
            s += 'CD'
        elif num>=100:
            if num >= 500:
                s += 'D'
                s += 'C' * int((num-500)/100)
            else:
                s += 'C' * int(num/100)
        # 处理十位
        num = num % 100
        if int(num/10) == 9:
            s += 'XC'
        elif int(num/10) == 4:
            s += 'XL'
        elif num>=10:
            if num >= 50:
                s += 'L'
                s += 'X' * int((num-50)/10)
            else:
                s += 'X' * int(num/10)
        # 处理个位
        num = num % 10
        if num == 9:
            s += 'IX'
        elif num == 4:
            s += 'IV'
        else:
            if num >= 5:
                s += 'V'
                s += 'I' * (num-5)
            else:
                s += 'I' * num
        return s

