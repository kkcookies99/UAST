 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        # 建一个表：30行，每行的列数等于行数
        dp = [[0] * i for i in range(1, 31)]
        # 每一行的首尾  等于1
        for i in range(30):
            dp[i][0] = 1
            dp[i][-1] = 1
        # 计算每一行其他的数
        for i in range(2, numRows):
            for j in range(1, i):
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]

        return dp[:numRows]

