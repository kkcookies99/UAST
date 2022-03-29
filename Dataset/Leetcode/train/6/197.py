 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if s == '':
            return ''
        if numRows == 1:
            return s
        ziglist = [ [0] * (len(s)//2+1) for i in range(numRows)]
        i = 0
        for col in range(len(ziglist[0])):
            for row in range(len(ziglist)):
                if i < len(s):
                    if col % (numRows - 1) == 0:
                        ziglist[row][col] = s[i]
                        i += 1
                    elif col % (numRows - 1) + row == numRows - 1:
                        ziglist[row][col] = s[i]
                        i += 1
                    else:
                        ziglist[row][col] = ' '

        zig = ''
        for i in range(len(ziglist)):
            for j in range(len(ziglist[0])):
                if ziglist[i][j] != 0 and ziglist[i][j] != ' ':
                    zig += ziglist[i][j]
        return zig

