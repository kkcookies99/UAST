 class Solution:
    def XXX(self, s: str) -> int:
        d = {}
        p1 = ans = 0
        for p2, ch in enumerate(s):
            # 如果有和当前字符相同的字符在s[p1:p2]内,则更新p1
            if ch in d and d[ch] >= p1:
                p1 = d[ch]+1 
            d[ch] = p2
            ans = max(ans, p2-p1+1)
        return ans

