class Solution(object):
    def XXX(self, n):
        # 要跳到台阶n，有两种方法：从n-1台阶跳一格；从n-2台阶跳两格
        # 因此到台阶n的方法数 = 到台阶n-1的方法数 + 到台阶n-2的方法数
        # dp[n] = dp[n-1]+dp[n-2]，dp[1] = 1，dp[2] = 2 --> 斐波那契数列
        dp = [1, 2]
        if n <= 2: return dp[n-1]
        for i in range(2, n):
            dp.append(dp[i-1]+dp[i-2])
        return dp[n-1]

