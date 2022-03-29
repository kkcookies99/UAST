class Solution:
    def XXX(self, x: int) -> int:
        res0 = 2
        while True:
            res1 = res0 - (res0 * res0 - x) / (2 * res0)
            if abs(res1 - res0) < 0.001:
                return floor(res1)
            res0 = res1

