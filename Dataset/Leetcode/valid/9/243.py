class Solution:
    def XXX(self, x: int) -> bool:
        if x < 0:
            return False
        res,x_ = 0,x
        while x:
            x, k = x//10, x%10
            res = res*10 + k
        return res == x_

