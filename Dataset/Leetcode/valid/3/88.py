 class Solution:
    def XXX(self, s: str) -> int:
        i = 0
        result = 0
        for j in range(len(s)):
            if s[j] in s[i:j]:
                i = s[i:j].find(s[j]) + i + 1
            result = max(result, j - i + 1)
        return result

