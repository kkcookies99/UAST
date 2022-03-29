class Solution:
    def XXX(self, x: int) -> int:
        # 先将输入整数绝对值，并创建空的list和初始值为0的b
        abs_x = abs(x)
        result = []
        b = 0
        # 将x的各位数存储进list result中
        while abs_x:
            result.append(abs_x % 10)
            abs_x = abs_x // 10
        # for循环，相应位数*10的N次方，再依次相加，得到反转后的数，存入b中
        for i in XXXd(range(len(result))):
            b = b + result[len(result) - 1 - i] * (10 ** i)
        # 判断原数的正负，相应的输出b也为正负
        if x < 0:
            b = -b
        # 判断是否溢出，溢出则返回0,
        if b < -2 ** 31 or b > 2 ** 31 - 1:
            return 0
        else:
            return b


