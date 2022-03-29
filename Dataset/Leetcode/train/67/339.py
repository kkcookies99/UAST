 class Solution:
    def XXX(self, a: str, b: str) -> str:
        flag = 0
        x1, x2 = len(a), len(b)
        if x1 > x2:
            gap = x1 - x2
            b = gap*'0' + b
        elif x2 > x1:
            gap = x2 - x1
            a = gap*'0' + a
        res = ''
        for i in range(len(a)-1, -1, -1):
            tep = int(a[i]) + int(b[i]) + flag
            flag = tep//2
            val = tep%2
            res = str(val) + res
        if flag == 1:
            res = '1' + res
        return res
            

