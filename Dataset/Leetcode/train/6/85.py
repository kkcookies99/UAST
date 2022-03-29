 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1 or len(s) <= numRows:
            return s

        cur_row, step = 0, 1
        nums = [''] * numRows
        for i in s:
            nums[cur_row] += i
            if cur_row == numRows - 1:
                setp = -1
            if cur_row == 0:
                setp = 1
            cur_row += setp
        return ''.join(nums)

