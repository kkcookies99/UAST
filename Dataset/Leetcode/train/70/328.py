class Solution:
    @functools.lru_cache(100)
    def XXX(self, n: int) -> int:
        if n <=2:
            return n
        a = 1
        b = 2
        for i in range(3,n+1):
            a,b = b,a+b
        return b

