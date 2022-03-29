 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if not s: return ''
        if numRows == 1: return s
        v = numRows-2+1
        n = numRows + numRows-2
        n_v = math.ceil(len(s) / n) * v
        dp = [['']*n_v for _ in range(numRows)]
        i, j, k= 0,0, 0
        while k< len(s):

            while k<len(s) and i < numRows:
                dp[i][j] = s[k]
                i,k = i+1, k+1
            i, j = i-2,j+1
            while k< len(s) and i>0:
                dp[i][j] = s[k]
                i,k,j = i-1, k+1, j+1
        res = ''
        for i in range(len(dp)):
            for j in range(len(dp[0])):
                if dp[i][j]: res += dp[i][j]
        return res
                

