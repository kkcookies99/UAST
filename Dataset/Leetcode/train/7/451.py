 class Solution:

    MAX_VALUE = 2147483647
    MIN_VALUE = -2147483648

    def XXX(self, x: int) -> int:
        res = 0
        sign = -1 if x < 0 else 1
        x = x * sign
        while x != 0:
            res = res * 10 + x % 10
            x = x // 10
        # 判断是否越界
        res = res * sign
        return res if (self.MIN_VALUE <= res <= self.MAX_VALUE) else 0

