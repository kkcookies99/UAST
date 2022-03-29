class Solution:
    def XXX(self, n: int) -> str:
        dp = '1'
        for i in range(n-1):
            s, cur_char, cnt, dp = dp, dp[0], 0, ''
            for index in range(len(s)):
                if s[index] == cur_char: cnt += 1
                else:
                    dp += str(cnt) + cur_char
                    cur_char = s[index]
                    cnt = 1
            dp += str(cnt) + cur_char
        return dp

