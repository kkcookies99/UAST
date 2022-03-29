 class Solution:
    def XXX(self, x: int) -> bool:
        # 存放x的每一位
        digits = []
        # 负数不是回文数
        if x < 0:
            return False
        elif x < 10:
            return True
        else: # > 10
            while x >= 10:
                res = x % 10
                digits.append(res)
                x = x // 10
            digits.append(x)

            # 逆序的列表
            reversed_digits = []
            for i in range(len(digits)-1, -1, -1):
                reversed_digits.append(digits[i])

            if digits == reversed_digits:
                return True
            else:
                return False



