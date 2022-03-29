 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        rows =[[] for i in range(numRows)]
        n, row, down = len(s), 0, True
        for i in range(n):
            rows[row].append(s[i])
            if down:
                row += 1
                if row == numRows:
                    down = False
                    row = (row - 2) % numRows
            else:
                row -= 1
                if row == -1:
                    down = True
                    row = (row + 2) % numRows
        return ''.join([''.join(i) for i in rows])

