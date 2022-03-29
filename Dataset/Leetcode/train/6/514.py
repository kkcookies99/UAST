 class Solution:

    def XXX(self, s: str, numRows: int) -> str:
        if numRows < 2:
            return s
        res = ["" for _ in range(numRows)]
        i, direction = 0, 1
        for c in s:
            res[i] += c
            if i == numRows - 1:
                direction = -1
            if i == 0:
                direction = 1
            i = i + direction
        return "".join(res)

