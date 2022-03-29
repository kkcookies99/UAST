class Solution:
    def XXX(self, x: int) -> int:
        if x <= 1:
            return x
        else:
            for i in range(x+1):
                if i*i > x:
                    return i-1

