class Solution:
    def XXX(self, x: int) -> int:
        if x < 0 :#将负数的转换成正数再进行翻转然后再转为负数
            c = 0
            c = c - x
            a = int(str(c)[::-1])
            a = -a
        else:    #正数直接翻转
            a = int(str(x)[::-1])
        if a < -(2**31) or a > 2**31 :#大小溢出返回0
            return 0
        return a

