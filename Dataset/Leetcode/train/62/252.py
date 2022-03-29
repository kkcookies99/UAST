 class Solution(object):
    def XXX(self, m, n):
        """
        # 方法一：递归回溯法（超时）
        if m < 1 or n < 1:
            return 0
        if m == 1 and n == 1:
            return 1
        else:
            return self.XXX(m,n-1)+self.XXX(m-1,n)
        """
        """
        # 方法二：排列组合法（80%+）
        # 路径必然有m-1次向下和n-1次向右，即共有m+n-2步，其中有m-1步为向下
        # 即：计算在m+n-2的总数中取出m-1个数为“向下”的组合数，C(m+n-2)(m-1)
        c0, c1, time = 1, 1, min(m-1, n-1)
        for i in range(time):
            c0 = c0*(m+n-2-i)
            c1 = c1*(i+1)
        return c0/c1
        """
        dp = []
        for col in range(m):
            if col == 0:
                dp.append([1]*n)
            else:
                dp.append([1]+[0]*(n-1))
        for i in range(1,m):
            for j in range(1,n):
                dp[i][j] = dp[i-1][j]+dp[i][j-1]
        return dp[m-1][n-1]

