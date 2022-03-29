 class Solution(object):
    def XXX(self, s):
        length = len(s)
        if length < 2:
            return '' if length==0 else s
        dp = [[0] * length for i in range(length)]
        start = 0
        end = 0
        #Base Case 长度为1和长度为2
        for i in range(length-1):
            dp[i][i] = 1
            if s[i]==s[i+1]:
                dp[i][i+1] = 1
                start = i
                end = i+1
        # 枚举子串的长度
        for l in range(3,length+1):
            low = 0
            while low+l-1 < length:
                high = low + l -1
                if s[low] == s[high] and dp[low+1][high-1]:
                    dp[low][high] = 1
                    start = low
                    end = high
                low+=1
        return s[start:end+1]

