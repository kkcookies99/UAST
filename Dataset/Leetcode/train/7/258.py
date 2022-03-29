class Solution:
    def XXX(self, x: int) -> int:
        if x < 0:
            n =  0 - int(str(x).split("-")[1][::-1])
        else:
            n = int(str(x)[::-1])
        if -2147483648 <= n <=  2147483647:
            return n
        else:
            return 0

