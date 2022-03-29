 class Solution:
    def XXX(self, s: str) -> str:
        if s == s[::-1]: return s
        maxLen = 0
        for i in range(len(s)):
            if i - maxLen >= 1 and s[i - maxLen - 1:i + 1] == s[i - maxLen - 1:i + 1][::-1]:
                maxLen += 2
                end = i
                continue
            if i - maxLen >= 0 and s[i - maxLen:i + 1] == s[i - maxLen:i + 1][::-1]:
                maxLen += 1
                end=i
        return s[end-maxLen+1:end+1]

