 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        i = 0
        lim1 = numRows
        lim2 = (numRows-1)*2
        ans = ["" for i in range(numRows)]
        for c in s:
            if i < lim1:
                ans[i] += c
            else:
                ans[lim2-i] += c
            i += 1
            if i >= lim2:
                i = 0
        return ''.join(ans)

