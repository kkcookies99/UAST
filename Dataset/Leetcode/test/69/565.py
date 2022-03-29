class Solution:
    def XXX(self, x: int) -> int:
        l, r = 0, x + 1 # 问题1: r为什么等于x+1而不是x
        while l < r:
            mid = (l + r) // 2
            if mid*mid <= x: l = mid + 1 # 问题2: 为什么取等号
            else: r = mid
        return l - 1 #问题3: 为什么要 -1

