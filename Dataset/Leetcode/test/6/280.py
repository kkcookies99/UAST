 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        lst = [[] for i in range(numRows)]
        i, j, m, n = 0, 0, 1, 0
        for sub in s:
            lst[i].append(sub)
            if i == numRows-1 and m == 1:
                m, n = -1, 1
            elif i == 0 and m == -1:
                m, n = 1, 0
            i += m
            j += n
        return ''.join([''.join(l) for l in lst])

