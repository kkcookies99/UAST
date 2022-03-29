 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        numColomn = numRows - 1
        block_num = numRows + numColomn - 1
        blocks = int(len(s) / block_num) + 1
        # sblock_index = [[len(s)] * blocks * numColomn] * numRows
        s_result = list(" " * blocks * numColomn * numRows)
        rotate_flag = True
        x = 0
        y = 0
        for i in range(len(s)):

            s_result[(x * blocks * numColomn + y)] = s[i]
            if i % (numRows - 1) == 0:
                rotate_flag = not rotate_flag
            if rotate_flag == False:
                x = x + 1
                y = y
            if rotate_flag:
                x = x - 1
                y = y + 1
        s_result = ''.join(s_result)
        s_result = s_result.replace(' ', '')
        return  s_result


