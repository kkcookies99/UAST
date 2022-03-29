 class Solution:
    def XXX(self, s: str, numRows: int):
        row = min(len(s), numRows)
        new_s = ''
        if len(s)<=numRows:
            new_s = s
        else:
            currow = 0
            rows = [''] * row
            change = False
            for c in s:
                rows[currow] += c
                if currow == 0:
                    change = True
                elif currow == row - 1:
                    change = False
                if change:
                    currow += 1
                else:
                    currow -= 1
            for i in rows:
                new_s += i
        return new_s

