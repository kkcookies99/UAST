 class Solution(object):
    def XXX(self, s, numRows):
        if numRows == 1:
            return s
        rows = [''] * numRows
        curRow = 0
        goingDown = -1
        for s_part in s:
            rows[curRow] += s_part
            if curRow == 0 or curRow == numRows - 1:
                goingDown = -goingDown
            curRow += goingDown
        return ''.join( rows)

