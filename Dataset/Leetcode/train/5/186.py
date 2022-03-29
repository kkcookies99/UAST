 def XXX(self, s: str) -> str:
        n = len(s)
        if n<2:
            return s
        max_len = 1
        begin=0
        dp = [[False]*n for _ in range(n)]
        for i in range(n):
            dp[i][i] = True 
        # 字串的长度从2到n
        for N in range(2,n+1):
            for i in range(n):
                #右边界
                j = N+i-1
                if j>=n:
                    break
                if s[i]!=s[j]:
                    dp[i][j]=False
                else:
                    if j-i<3:
                        dp[i][j]=True
                    else:
                        dp[i][j]=dp[i+1][j-1]
                
                if dp[i][j] and j-i+1>max_len:
                    begin = i 
                    max_len=j-i+1
        return s[begin:begin+max_len]

