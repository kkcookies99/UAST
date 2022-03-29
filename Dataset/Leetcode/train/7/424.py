 class Solution:
    def XXX(self, x: int) -> int:
        s = str(x)
        l = list(s)
        flag = 1
        if l[0] == '-':
            flag = -1
            l.pop(0)
        res = 0
        t = 0
        for i in l:
            res += int(i) * (10 ** t)
            t += 1
            if(t>=len(l)):
                break
        if res*flag < -2**31 or res*flag > 2**31-1:
            return 0
        else:
            return res*flag

