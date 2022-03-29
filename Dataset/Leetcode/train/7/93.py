class Solution:
    def XXX(self, x: int) -> int:
        def solve(x):
            a = list(map(int,str(x)))
            p = {}
            d=0
            for ind, val in enumerate(a):
                p[ind] = val
            for i, v in p.items():
                d += v*(10**i)
            if (2**31 - 1>= d >= -(2**31)):
                return d
            else:
                return 0
        if x>=0:
            return (solve(x))
        if x<0:
            x = -x
            return (-solve(x))

