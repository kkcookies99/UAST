 class Solution:
    def XXX(self, num: int) -> str:
        from collections import deque

        roman = {1: 'I', 4: 'IV', 5: 'V', 9: 'IX', 10: 'X', 40: 'XL', 50: 'L', 90: 'XC',
                 100: 'C', 400: 'CD', 500: 'D', 900: 'CM', 1000: 'M'}
        q = deque()

        i = 0
        while num:
            num, digit = divmod(num, 10)
            times = pow(10, i)
            digit *= times
            i += 1
            if digit in roman:
                q.appendleft(roman[digit])
            elif digit >= 5 * times:
                q.appendleft(roman[times] * ((digit - 5 * times) // times))
                q.appendleft(roman[5 * times])
            else:
                q.appendleft(roman[times] * (digit // times))

        return ''.join(q)

