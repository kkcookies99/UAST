 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        s = list(s)
        length = len(s)
        rows = ['']*min([numRows,length])
        goingdown = False
        curRow = 0
        for i in range(length):
            rows[curRow]+=s[i]
            if curRow == 0 or curRow == numRows - 1:
                goingdown = False if goingdown else True
            curRow += 1 if goingdown else -1
        return ''.join(rows)

