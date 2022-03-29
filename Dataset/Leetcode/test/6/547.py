 class Solution(object):
    def XXX(self, s, numRows):
        if numRows == 1:
            return s
        cur_row = 0
        rows = ['']*min(numRows, len(s))
        going_down = False
        for c in s:
            rows[cur_row] += c
            if cur_row in [0, numRows - 1]:
                # c为第一个字符时, cur_row==0, 所以 going_down变成了True
                going_down = not going_down
            cur_row += 1 if going_down else -1
        return ''.join(rows)

