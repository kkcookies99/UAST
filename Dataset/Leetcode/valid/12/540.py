 class Solution:
    def XXX(self, num: int) -> str:
        res = ''
        v_c = {
            1000: 'M',
            900: 'CM',
            500: 'D',
            400: 'CD',
            100: 'C',
            90: 'XC',
            50: 'L',
            40: 'XL',
            10: 'X',
            9: 'IX',
            5: 'V',
            4: 'IV',
            1: 'I'
        }

        for x in v_c:
            res += num // x * v_c[x]
            num %= x
        return res

