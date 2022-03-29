 class Solution:
    def XXX(self, s: str) -> int:
        table = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        ans = 0
        for i in range(len(s)):
            ans = ans - table[s[i]] if i < len(s) - 1 and table[s[i]] < table[s[i+1]] else ans + table[s[i]]
        return ans

