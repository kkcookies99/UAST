class Solution:
    def fib(self):
        a, b = 0, 1
        while True:
            a, b = b, a+b
            yield b
            
    def XXX(self, n: int) -> int:
        fib = self.fib()
        while n:
            ret = next(fib)
            n -= 1
        return ret

