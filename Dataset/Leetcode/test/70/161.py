class Solution:
    def XXX(self, n: int) -> int:
        if n == 1 or n == 2:
            return n
        else:
            a, b, count = 1, 2, 3
            while count <= n:
                a, b = b, a+b
                count += 1
        return b

