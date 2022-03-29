 class Solution:
    def XXX(self, m, n):
        f = lambda x: f(x - 1) * x if x >= 2 else 1
        return int(f(m + n - 2)/(f(m - 1) * f(n - 1)))

