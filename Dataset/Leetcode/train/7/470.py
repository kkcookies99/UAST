 class Solution:
    def XXX(self, x: int) -> int:
        
        if x > pow(2, 31)-1 or x < -pow(2, 31):
            return 0
        
        s = ''
        is_f = False
        if x > 0:
            s = str(x)
        else:
            s = str(abs(x))
            is_f = True

        b = ''
        for i in s:
            b = i + b
        
        c = 0
        if is_f:
            c = -int(b)
        else:
            c = int(b)
        
        if c > pow(2, 31)-1 or c < -pow(2, 31):
            return 0
        else:
            return c
        

