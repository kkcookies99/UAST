 class Solution:
    def mySqrt(self, x: int) -> int:
        if x <= 1:
            return x
        x_sqrt = x # a random number
        while (x/x_sqrt < x_sqrt):
            x_sqrt = int((x_sqrt + x/x_sqrt) /2)
        return x_sqrt

