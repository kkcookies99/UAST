 class Solution:
    def XXX(self, num: int) -> str:
        tbl = {
            1:'I',
            5:'V',
            10:'X',
            50:'L',
            100:'C',
            500:'D',
            1000:'M',
            4:'IV',
            9:'IX',
            40:'XL',
            90:'XC',
            400:'CD',
            900:'CM',
        }
        res = ''
        for k in sorted(tbl.keys(), reverse=True):
            if num >= k:
                m = num // k
                num %= k
                res += tbl[k] * m
        return res

