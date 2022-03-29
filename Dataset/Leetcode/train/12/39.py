 class Solution:
    def XXX(self, num: int) -> str:
        res = ''
        maps = {2:['M', 'D', 'C'], 1:['C', 'L', 'X'], 0:['X', 'V', 'I']}

        for i in range(2, -1, -1):
            digit = 10**i
            if num < 4*digit:
                continue
            ten, five = 10 * digit, 5 * digit
            n1, n2, n3 = maps[i] # notations
            ms = num // ten
            num %= ten
            res += n1 * ms 
            if num >= 9*digit:
                num -= 9*digit
                res += (n3+n1)
            ds = num // five
            num %= five
            res += n2 * ds 
            if num >= (4*digit):
                num -= 4*digit
                res += (n3+n2)
        res += 'I'*num 
        return res

