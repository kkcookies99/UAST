 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        res = ''
        output = ['' for i in range(numRows)]
        i = 0
        t = -1
        for ch in s:
            if i == 0 or i == numRows-1:
                t = -t
            output[i] += ch
            i += t
        for out in output:
            res += out
        return res

