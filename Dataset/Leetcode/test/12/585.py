 class Solution:
    def XXX(self, num: int) -> str:
        di = {4: 'IV', 9: 'IX', 40: 'XL', 90: 'XC', 400: 'CD', 900: 'CM', 1: 'I', 5: 'V', 10: 'X', 50:'L', 100: 'C', 500: 'D', 1000: 'M'}
        ans = ''
        digit = 1
        while num:
            num, remianeder = divmod(num, 10)
            remianeder *= digit
            if remianeder in di: ans = di.get(remianeder) + ans
            else:
                if remianeder > 5 * digit:
                    ans = di[5 * digit] + di[digit] * (remianeder // digit - 5) + ans
                else:
                    ans = di[digit] * (remianeder // digit) + ans
            digit *= 10
        return ans

