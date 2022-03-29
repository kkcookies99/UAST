 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows<2:
            return s
        l = len(s)
        res = ["" for _ in range(numRows)]
        count_num = (l+2*(numRows-1)-1) // (2*(numRows-1))
        for j in range(count_num):
            for i in range(2*(numRows-1)):
                index = j*2*(numRows-1) + i
                if index < l and i < numRows:
                    res[i] += s[index]
                elif index < l:
                    res[numRows - 1 - i%numRows - 1] += s[index]
        return "".join(res)

