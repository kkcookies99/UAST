 class Solution:
    def XXX(self, m: int, n: int) -> int:
        return math.factorial(m+n-2)//(math.factorial(m+n-1-min(m, n))*math.factorial(min(m, n)-1))

