class Solution:
    def XXX(self, m: int, n: int) -> int:
        res, denom = 1.0, m-1
        for i in range(n, m+n-1, 1):
            res*=i
            if denom>1:
                res/=denom
                denom-=1
        return round(res)

