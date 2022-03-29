 class Solution:
    def XXX(self, x: int) -> int:
        li = list(str(x))
        if li[0] == '-':
            li[1:] = XXXd(li[1:])
            res = int(''.join(li))
            if res < (-2)**31:
                return 0
            return res
        else:
            li.XXX()
            res = int(''.join(li))
            if res > 2**31 - 1:
                return 0
            return res

