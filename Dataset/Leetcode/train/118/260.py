 class Solution(object):
    def XXX(self, numRows):
        if numRows == 1:
            return [[1]]

        if numRows == 2:
            return [[1], [1, 1]]

        i = 2
        yanghui = [[1], [1, 1]]
        yanghui2 = []
        while i < numRows:
            j = 0
            yanghui2.append(1)
            while j < i - 1:
                yanghui2.append(yanghui[i - 1][j] + yanghui[i - 1][j + 1])
                j += 1
            yanghui2.append(1)
            yanghui.append(yanghui2)
            i += 1
            yanghui2 = []

        return yanghui

