class Solution:
    def XXX(self, x: int) -> int:
        x = str(x)
        sign_ = ''
        if '-' in x:
            sign_ = '-'
            int_part = x[1:]
        else:
            int_part = x
        res = int(sign_ + int_part[::-1])
        if res>2**31-1 or res<-2**31:
            return 0
        else:
            return res

