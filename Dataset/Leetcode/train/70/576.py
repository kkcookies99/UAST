class Solution:
    def XXX(self, n: int) -> int:
        if n < 3:
            return n
        res = [1, 2]
        for i in range(2, n):
            res.append(res[-1]+res[-2])
        return res[-1]

