class Solution:
    def XXX(self, x: int) -> int:
        n = 0
        if x>=0:
            while x != 0:
                n = n*10 + x%10
                x = x//10
        else:
            x = -x
            while x != 0:
                n = n*10 + x%10
                x = x//10
            n = -n
        return n if -2147483648<n<2147483647 else 0

