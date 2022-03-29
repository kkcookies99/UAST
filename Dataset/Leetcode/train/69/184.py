class Solution:
    def XXX(self, x: int) -> int:
        l, r = 0, x
        while l < r:
            m = (l + r) // 2
            if x >= m * m  and (m + 1) * (m + 1) > x:
                return m
            elif m * m < x:
                l = m + 1
            else:
                r = m 
        return l