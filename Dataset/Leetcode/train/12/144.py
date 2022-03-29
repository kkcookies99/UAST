 class Solution:
    def XXX(self, num: int) -> str:
        if num < 1 or num > 3999:
            return False
        a = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        b = ['M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I']
        r = []
        for i in range(len(a)):
            k = num//a[i]
            if k != 0:
                r.extend(b[i]*k)
                num %= a[i]
        return ''.join(r)

