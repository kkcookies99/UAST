 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        ret = ['' for _ in range(numRows)]
        L = len(s)
        div = 2*numRows - 2
        for i in range(L):
            tmp = i % div
            if tmp < numRows:
                ret[tmp] += s[i]
            else:
                ret[numRows-tmp-2] += s[i]
        r = ''
        for i in range(numRows):
            r += ret[i]
        return r

