class Solution:
    def XXX(self, n: int) -> int:
        # 定义阶乘，求C的值要用
        def f(a: int):
            if a == 0:
                return 1
            elif a == 1:
                return 1
            else:
                return a * f(a - 1)

        # 对步数C进行求和
        target = 0
        for y in range(n // 2 + 1):
            x = n - 2 * y
            # C(y,x+y)公式展开=f(x + y) / (f(x) * f(y))就得到这个了
            target += f(x + y) / (f(x) * f(y))
        return int(target)


