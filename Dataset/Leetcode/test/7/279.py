class Solution:
    def XXX(self, x: int) -> int:
        if x == 0:
            return 0
        res = str(x)
        sign = 1
        if res[0] == '-':
            res = res[1:]
            sign = -1
        res = res[::-1]
        if res[0] == '0':
            res = res[1:]
        
        resint = int(res)*sign

        if(resint<-2147483648 or resint>2147483647):
            return 0
        else:
            return resint


