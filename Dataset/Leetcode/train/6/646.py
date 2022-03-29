 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        #主动拒绝掉nR==1的情况
        if numRows == 1:
            return s
    ##周期：2(nR-1)
        St = []
        outp = ""
        if numRows > 0:
            for i in range(numRows):
                St.append('')
        cp = 0
        cy = (numRows - 1)
    #循环
        for i in range(len(s)):
            St[cp] += s[i]
            if numRows > 1 and (int(i/(numRows-1)) + 1)%2 == 1:
                cp+=1
            else :cp-=1
        for st in St:
            outp += st
        return outp

