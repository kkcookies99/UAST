 class Solution(object):
    def XXX(self, n):
        if n == 1:
            return "1"
        res = ""
        s = "1"
        c = ''
        count = 0
        for i in range(1, n):
            res = ""
            for ch in s:
                if not c:
                    c = ch
                    count = 1
                elif ch == c:
                    count = count + 1
                else:
                    res = res + str(count) + c
                    c = ch
                    count = 1
            res = res + str(count) + c
            c = ''
            count = 0
            s = res
        return res


