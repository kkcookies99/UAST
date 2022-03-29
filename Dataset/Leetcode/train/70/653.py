class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: int

        核心思想：
                采用动态规划
                dp[i]表示爬到第i个阶梯所有需要的方法数
                题目分析（只考虑一步达到的情况）:
                    因为每次只能爬一个或者两个台阶
                    当处于i-1时则爬一阶可以从i-1爬到i
                    当处于i-2时则爬两阶可以从i-2爬到i
                    其余的情况均不能一步到达i
                综上所述：dp[i] =  dp[i-1] + dp[i-2]
        """
        dp = [0 for i in range(n+1)]
        dp[0] = 1
        dp[1] = 1
        for i in range(2,n+1):
            dp[i] = dp[i-1] + dp[i-2]
        
        return dp[-1]

if __name__ == '__main__':
    s = Solution()
    print(s.XXX(4))

