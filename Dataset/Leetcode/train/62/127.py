 class Solution:
    def XXX(self, m: int, n: int) -> int:
        """ 
            不同路径 
            
            输入: m = 3, n = 2
            输出: 3
            解释:
            从左上角开始，总共有 3 条路径可以到达右下角。
            1. 向右 -> 向右 -> 向下
            2. 向右 -> 向下 -> 向右
            3. 向下 -> 向右 -> 向右
        """
        return self.combination(m + n - 2, n - 1)


    def combination(self, n, m):
        """ 计算组合C(n, m) """
        return self.factorial(n) // self.factorial(m) // self.factorial(n - m)


    def factorial(self, n):
        """ 计算阶乘 """
        c = 1
        for i in range(1, n + 1):
            c = c * i
        return c

