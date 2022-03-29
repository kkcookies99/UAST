class Solution:
    def XXX(self, n: int) -> str:
        #dp法
        dp = ['']*(n+1)
        #base case 
        dp[1] = '10'  #巧妙处理  最后加零防止后面的元素读不到
        for i in range(2, n+1):
            j = 0
            le = 1  #标度
            while j + le < len(dp[i-1]):
                if dp[i-1][j] == dp[i-1][j+le]:
                    le += 1
                else:
                    dp[i] += '{}'.format(le) + dp[i-1][j]
                    j += le
                    le = 1
            dp[i] += '0'
        return dp[-1][:-1]

