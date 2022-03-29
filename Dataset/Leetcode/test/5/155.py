 def XXX(self, s: str) -> str:
    str_length = len(s)
    dp = [ [False  for i in range(str_length)] for j in range(str_length)]
    maxlen = 0
    start = 0
    end = 0

    for i in range(0,str_length):
        for j in range(0,i+1):
            if i == j:
                dp[j][i] = True
            if i - j < 2:
                dp[j][i] = (s[j] == s[i])
                if dp[j][i] is True:
                    if i - j + 1 >= maxlen:
                        maxlen = i - j + 1
                        start = j
                        end = i
            else:
                dp[j][i] = (s[j] == s[i] and dp[j+1][i-1])
                if dp[j][i] is True:
                    if i - j + 1 >= maxlen:
                        maxlen = i - j + 1
                        start = j
                        end = i
    return s[start:end+1]
