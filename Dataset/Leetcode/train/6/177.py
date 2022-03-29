 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows < 2:
            return s
        ls, div = range(len(s)), 2*numRows-2
        res_l = [ '' for i in range(numRows) ]
        for i in ls:
            p = i % div
            p = p if p < numRows else div-p
            res_l[p] += s[i]
        
        return ''.join(res_l)

