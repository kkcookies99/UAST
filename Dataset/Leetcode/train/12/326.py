 class Solution:
    def XXX(self, num: int) -> str:
        s_to_num = [('M', 1000), ('CM', 900), ('D', 500), ('CD', 400), ('C', 100), ('XC', 90), ('L', 50), ('XL', 40),
                    ('X', 10), ('IX', 9), ('V', 5), ('IV', 4), ('I', 1)]
        res = ''
        for c, n in s_to_num:
            chu = num // n
            res += (c * chu)
            num = num % n
            if num == 0:
                break
        return res

