 class Solution:
    mapping = {
    'I' : 1,
    'V' : 5,
    'X' : 10,
    'L' : 50,
    'C' : 100,
    'D' : 500,
    'M' : 1000,}
    def XXX(self, s: str) -> int:
        ans = 0
        for i, v in enumerate(s):
            if i+1 == len(s):
                ans += self.mapping[v]
                return ans
            elif self.mapping[v] >= self.mapping[s[i+1]]:
                ans += self.mapping[v]
            else:
                ans -= self.mapping[v]
        return ans

