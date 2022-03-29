 class Solution:
    def XXX(self, n: int) -> str:
        # 简单的递归
        # dp[i] = describe(dp[i-1]) 
        def describe(s):  
            res = ''
            if s == '1':
                return '11'
            
            i = 0 
            while i < len(s):
                n = 1  # 记录每个数字出现的次数 
                tmp = s[i] # 记录每个数字
                while i < len(s) - 1 and s[i] == s[i+1]:   # 统计相同的数字 
                    n += 1
                    i += 1 
                res += (str(n)+tmp)
                i += 1
                n = 0  # 复位，统计下一个 
            return res

        dp = ['']*(n+1)
        dp[1] = '1'
        for i in range(2, n+1):
            dp[i] = describe(dp[i-1])
        return dp[n]

        

