class Solution:
    def XXX(self, x: int) -> int:
        num = abs(x)
        new_num = 0
        while num:
            new_num = new_num * 10 + num % 10
            num //= 10 
        new_num = new_num if x > 0 else -new_num 
        return new_num if - 2 ** 31 < new_num < 2 ** 31 - 1 else 0

