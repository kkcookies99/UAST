 class Solution:
    def XXX(self, num: int) -> str:
        t_ = num // 1000 # 取整
        h_ = num % 1000 // 100
        w_ = num % 100 // 10
        d_ = num % 10

        def convert(s, charRo, tag=False):
            if not s:
                return ''
            if tag:
                return charRo[0] * s
            else:
                if s == 9:
                    return '{}{}'.format(charRo[2], charRo[0])
                if s > 4:
                    return '{}{}'.format(charRo[1], charRo[2] * (s-5))
                elif s == 4:
                    return '{}{}'.format(charRo[2], charRo[1])
                else:
                    return '{}'.format(charRo[2] * s)
        return convert(t_, ['M'], tag = True) + convert(h_, ['M', 'D', 'C']) + convert(w_, ['C', 'L', 'X']) + convert(d_, ['X', 'V', 'I'])

