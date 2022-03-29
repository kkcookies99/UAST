 class Solution:
    # 28 ms(98.33 %)  15 MB(78.27 %)
    def XXX(self, n: int) -> List[str]:
        res = self.gent([], n, n)
        return res

    def gent(self, s:List , l , r) -> List[str]:
        res = []
        if l == 0 or r == 0:
            # 补全
            s = s + [')'] *r
            res.append(''.join(s))
            return res
        if l == r:
            res += self.gent(s + ['('], l-1, r)
        else:
            if l > 0:
                res += self.gent(s + ['('], l-1, r)
            res += self.gent(s + [')'], l, r-1)
        return res

