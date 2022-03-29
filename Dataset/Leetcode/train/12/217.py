 class Solution:
    def XXX(self, num: int) -> str:
        match_list = [
        (1000, 'M'),
        (900, 'CM'),
        (500, 'D'),
        (400, 'CD'),
        (100, 'C'),
        (90, 'XC'),
        (50, 'L'),
        (40, 'XL'),
        (10, 'X'),
        (9, 'IX'),
        (5, 'V'),
        (4, 'IV'),
        (1, 'I')
        ]

        res = ''
        for k, v in match_list:
            digit = num // k
            num = num - k * digit
            res += digit * v
        return res

