 class Solution:
    def XXX(self, n: int) -> List[str]:
        import itertools
        L = list(itertools.combinations([i for i in range(1,2*n)],n-1))
        out = []
        for c in L:
            st = [')' for i in range(2*n)]
            temp = 0
            c = [0]+list(c)
            for i in range(2*n):
                if i in c:
                    st[i] = '('
                    temp += 1
                else:
                    temp -= 1
                    if temp<0:
                        break
            if temp==0:
                out.append(''.join(st))
        return out


