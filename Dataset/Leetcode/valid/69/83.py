class Solution:
    def XXX(self, x: int) -> int:
        if x==0 or x==1:
            return x
        n=x
        while 1:
            m = x/n
            n = (m+n)/2
            if n-m<1:
                break
        return int(n)

