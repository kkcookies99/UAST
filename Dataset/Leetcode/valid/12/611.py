 class Solution:
    def XXX(self, num: int) -> str:
        temp = ''
        r_map = {1000: 'M', 900: 'CM', 500: 'D', 400: 'CD', 100: 'C', 90: 'XC', 50: 'L', 40: 'XL', 10: 'X', 9: 'IX', 5: 'V', 4: 'IV', 1: 'I'}
        while num > 0:
            for key, value in r_map.items():
                if num >= key:
                    temp += value
                    num -= key
                    break
        return temp

