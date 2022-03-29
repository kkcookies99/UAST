 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        ans = [[] for _ in range(numRows)]
        index, flag = 0, True
        for c in s:
            ans[index].append(c)
            index = (index + 1) % (numRows) if flag else (index - 1) % (numRows)
            if index == 0 or index == numRows - 1: flag = not flag
        return ''.join([''.join(a) for a in ans])

