 class Solution:
    def XXX(self, x: int) -> int:
        if x == 0:
            return 0
        s = list(str(x))
        isMinus = False
        if s[0] == '-':
            s.pop(0)
            isMinus = True
        if s[-1] == '0':
            s.pop(-1)
        s.XXX()
        result = ""
        if isMinus:
            result = "-"
        for one in s:
            result = result + one
        result = int(result)
        upperBound = 2147483647
        lowerBound = -2147483648
        if result > upperBound:
            return 0
        if result < lowerBound:
            return 0
        else:
            return result

