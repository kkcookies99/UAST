 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        numSlash = numRows - 2
        numGroup = numSlash + numRows
        reList = [''] * numRows
        for i in range(0, len(s), numGroup):
            for j in range(numRows):
                if i + j >= len(s):
                    break
                reList[j] += s[i + j]
            for j in range(numRows - 2, 0, -1):
                if i + 2 * numRows - 2 - j >= len(s):
                    break
                reList[j] += s[i + 2 * numRows - 2 - j]
        return ''.join(reList)

