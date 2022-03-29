class Solution:
    def XXX(self, n: int) -> int:
        res = 0
        for i in range(n // 2 + 1):
            res += math.factorial(n - i) / (math.factorial(i) * math.factorial(n - 2*i))
        return int(res) if n >= 2 else 1

