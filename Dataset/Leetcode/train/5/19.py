 class Solution:
    def XXX(self, s: str) -> str:
        if s == s[::-1]: return s
        s = s + 'A'
        max = ''
        for i in range(len(s)):
            for j in range(i+1, len(s)):
                if s[i:j][::-1] == s[i:j] and len(s[i:j]) > len(max):
                    max = s[i:j]
        return max

