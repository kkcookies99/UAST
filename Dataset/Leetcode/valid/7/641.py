 class Solution:
    def XXX(self, x: int) -> int:
        """
        思路：
            - 先转换为正数，并记录符号位；
            - 
        """
        # 定义一个标志符，记录x的符号为正还是负
        is_posi = True
        # 定义一个列表，存放各位数
        digit = []
        # 保存结果
        result = 0

        if x == 0: 
            return 0
        if x < 10 and x > -10:
            return x
        
        if x < 0:
            is_posi = False
            x = - x
        
        # 1230
        while x >= 10:
            res = x % 10
            digit.append(res)
            # 整数除法
            x = x // 10
        digit.append(x)

        x_len = len(digit)
        for idx, elem in enumerate(digit):
            # 位权
            weight = (10 ** (x_len - idx - 1))
            result += weight * elem

        if not is_posi:
            result = - result

        if result > 2**31 - 1 or result < -2**31:
            return 0
        
        return result

