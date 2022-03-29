 class Solution:
    def XXX(self, num: int) -> str:
        lookup = {
            1:'I',
            4:'IV',
            5:'V',
            9:'IX',
            10:'X',
            40:'XL',
            50:'L',
            90:'XC',
            100:'C',
            400:'CD',
            500:'D',
            900:'CM',
            1000:'M'     
        }
        res = ""
        for key in sorted(lookup.keys())[::-1]:
            a = num // key
            if a == 0:
                continue
            res += (lookup[key] * a)
            num -= a * key
            if num == 0:
                break
        return res

