 class Solution:
    def XXX(self, s: str) -> str:
        dp = [0 for i in range(len(s))]
        max_start = 0
        max_end = 0

        start = 0
        end = 0
        # 两字母回文
        for i in range(len(s) - 1):
            if s[i] == s[i + 1]:
                dp[i] = 1
                max_start = i
                max_end = i+1

        for i in range(len(dp)):
            if dp[i] != 1:
                continue

            j = 1
            while i - j >= 0 and i + j + 1 <= len(s) - 1:
                if s[i - j] == s[i + j + 1]:
                    start = i - j
                    end = i + j + 1
                    if end - start > max_end - max_start:
                        max_end = end
                        max_start = start
                    j += 1
                else:
                    break

        # 三字回文
        for i in range(len(s) - 2):
            if s[i] == s[i + 2]:
                dp[i] = 2
                if max_end - max_start < 2:
                    max_start = i
                    max_end = i + 2

        for i in range(len(dp)):
            if dp[i] != 2:
                continue

            j = 1
            while i - j >= 0 and i + j + 2 <= len(s) - 1:
                if s[i - j] == s[i + j + 2]:
                    start = i - j
                    end = i + j + 2
                    if end - start > max_end - max_start:
                        max_end = end
                        max_start = start
                    j += 1
                else:
                    break
        return s[max_start:max_end+1]

