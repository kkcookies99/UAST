 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1 or len(s) <= numRows:
            return s

        cur_row, step = 0, 1
        str_list = [''] * numRows

        for char in s:
            str_list[cur_row] += char
            if cur_row == 0:
                step = 1
            elif cur_row == numRows - 1:
                step = -1
            cur_row += step
        return ''.join(str_list)

