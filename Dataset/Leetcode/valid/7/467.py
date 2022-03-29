 class Solution:
    def XXX(self, x: int) -> int:
        # 避免python负数取模的特性，改为对正数取整
        num: int = x if x > 0 else -x
        ans: int = 0

        MAX_VALUE = 2147483647
        MIN_VALUE = -2147483648

        while(num != 0):
            pop: int = num % 10
            if x > 0:
                if (ans > MAX_VALUE // 10) or (ans == MAX_VALUE // 10 and pop > 7):
                    # 正溢出
                    return 0
            elif x < 0:
                if (ans > -MIN_VALUE // 10) or (ans == -MAX_VALUE // 10 and pop > 8):
                    # 负溢出
                    return 0

            ans = ans * 10 + pop
            num //= 10

        return ans if x > 0 else -ans

