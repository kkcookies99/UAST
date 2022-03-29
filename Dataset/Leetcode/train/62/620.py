class Solution:
    def XXX(self, m: int, n: int) -> int:
        # 计算 C(m+n-2,m-1)
        return math.factorial(m+n-2)//(math.factorial(m-1)*math.factorial(n-1))

