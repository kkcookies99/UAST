 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        # 暴力解法
        if not s or numRows <= 1:
            return s
        T = ["" for i in range(numRows)]
        row, next = 0, 1
        for i in range(len(s)):
            T[row] += s[i]
            row += next
            if row == 0 or row == numRows - 1:
                next = -next
        return "".join(T)

