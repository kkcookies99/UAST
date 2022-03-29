
class Solution(object):
    # 判断是否回文
    def isHuiwen(self, arrs):
        i, j = 0, len(arrs) - 1
        while i < j:
            if arrs[i] != arrs[j]:
                return False
            i += 1
            j -= 1
        return True

    def XXX(self, s):
        if not s:
            return None
        n = len(s)
        if n < 2:
            return s
        # 最长回文字串
        res = 0
        # 最大回文长度
        maxLen = 1
        # DP数组，动规实际上就是在维护一个二维数组。
        # 本题的dp数组是用来记录下标之间的字符串是否回文，因此只用填写对角线上半部分即可。
        dp = [[0 for _ in range(n)] for _ in range(n)]
        # 先填写对角线元素,打草稿发现对角线元素并没有用，所以这一步可以省略
        for k in range(n):
            dp[k][k] = 1
        for j in range(1, n):
            for i in range(0, j):
                if s[i] != s[j]:
                    dp[i][j] = 0
                else:
                    if j - i < 3:
                        dp[i][j] = 1
                    else:
                        dp[i][j] = dp[i + 1][j - 1]
                # 只要dp[i][j]=1，则i~j的字符构成回文串，只需记录开始位置和最大回文长度即可。
                if dp[i][j] and j - i + 1 > maxLen:
                    maxLen = j - i + 1
                    res = i
        print("dp =", dp)
        return s[res:res + maxLen]

