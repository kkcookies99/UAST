class Solution:
    def XXX(self, x: int) -> int:
        ans = int(str(abs(x))[::-1])
        return 0 if abs(ans) >= 2**31 else ans if x >= 0 else -ans

