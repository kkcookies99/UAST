class Solution:
    def __init__(self):
        def func(n):
            if n in self.d:
                return self.d[n]
            res = func(n - 1) + func(n -2)
            self.d[n] = res
            return res
        self.d = {1:1,2:2}
        for i in range(1,46):
            func(i)
    def XXX(self, n: int) -> int:
        return self.d[n]

