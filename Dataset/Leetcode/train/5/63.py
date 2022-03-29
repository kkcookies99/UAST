 class Solution(object):
    def XXX(self, s):
        if len(s) <= 1:
            return s
        dp = [0] * len(s)
        dp[0] = 1
        for i in range(1, len(dp)):
            if i-1-dp[i-1] >= 0 and s[i] == s[i-1-dp[i-1]]:
                dp[i] = dp[i-1]+2
            else:
                dp[i] = 1
                for j in range(i-1-dp[i-1]+1, i):
                    if s[j:i+1] == s[j:i+1][::-1]:
                        dp[i] = i-j+1
                        break
        
        max_len = 0
        max_id = 0
        for i in range(len(dp)):
            if dp[i] > max_len:
                max_id = i
                max_len = dp[i]

        return s[max_id-max_len+1:max_id+1]

