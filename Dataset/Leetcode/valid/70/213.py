class Solution:
    memo = []

    # 动态规划法
    def calcWays2(self, n):
        # 直接修改memo初始值，而不是通过return
        self.memo[0] = 1
        self.memo[1] = 1
        # 自底向上，先算出每一个memo[i]的值
        for i in range(2, n + 1):
            self.memo[i] = self.memo[i-1] +self.memo[i-2]
        return self.memo[n]


    def XXX(self, n):
        # 注意要开辟n+1块区域，因为最后一个是memo[n]
        self.memo = [-1] * (n + 1)
        return self.calcWays2(n)

