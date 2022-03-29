 class Solution:
    def XXX(self, num: int) -> str:
        assert 1 <= num <= 3999
        dict = ('I', 'V', 'X', 'L', 'C', 'D', 'M')
        res, digit = '', 0
        while num > 0:
            cur, num = num % 10, num // 10
            if 0 <= cur <= 3:
                res = dict[digit]*cur + res
            elif 5 <= cur <= 8:
                res = dict[digit+1] + dict[digit]*(cur-5) + res
            else:  # 4 or 9
                res = dict[digit] + dict[digit+ cur//5 + 1] + res
            digit += 2
        return res

