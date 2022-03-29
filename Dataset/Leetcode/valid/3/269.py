 class Solution:
    def XXX(self, s: str) -> int:
        hs = {}
        j, ans = 0, 0
        for i in range(len(s)):
            if s[i] not in hs: 
                hs[s[i]] = 1
            else:
                while j < i and s[j] != s[i]:
                    hs.pop(s[j])
                    j += 1
                j += 1
            ans = max(ans, i - j + 1)
        if ans == 0: return len(s)
        return ans

