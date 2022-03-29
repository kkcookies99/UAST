 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        n = numRows

        # 特殊情况
        if len(s) <= n:  # 不够排成2列的情况
            return s
        if n == 1:  # 只排成一行
            return s
        
        # 一般情况
        # 行数为n时，一个周期有 2n-2个数
        k = len(s) % (2*n-2)  # 余数
        if k == 0:
            m = int( len(s)/(2*n-2) )  # m是周期数
        else:
            m = int( len(s)/(2*n-2) ) + 1
        
        col = m*(n-1)  # 列数
        arr = [["" for j in range(col)] for i in range(n)]  # 创建n*col的矩阵

        # 按规律填进对应位置，按列进行遍历
        for j in range(col):
            mod = j % (n-1)  # 余数
            if mod == 0:  # 在很多字符的那一竖列上
                k = int(j/(n-1))*(2*n-2)  # 这一列之前已经填过的字符数
                i = 0
                while i < n and k+i < len(s):  # for i in range(n):
                    arr[i][j] = s[k+i]
                    i += 1
            else:  # 在只有一个字符的竖列上
                k = int(j/(n-1))*(2*n-2) + n + mod-1  # 这一列之前已经填过的字符数
                if k < len(s):
                    arr[n-1-mod][j] = s[k]
        # print(arr)
        res = ''
        for i in range(n):
            for j in range(col):
                res += arr[i][j]

        return res

