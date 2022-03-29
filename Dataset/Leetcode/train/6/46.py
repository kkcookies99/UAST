 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1: return s
        zero_mat = [[] for row in range(numRows)]
        index = []
        simlation = list(range(numRows)) + list(reversed(range(numRows)))[1:-1]

        r = 2*numRows - 2
        for i in range(0, len(s), r):
            if len(s) - i < r:
                index += simlation[:len(s)-i]
            else:
                index += simlation[:]
        for i in range(len(s)):
            zero_mat[index[i]].append(s[i])
        res = ''
        for row in zero_mat:
            res += ''.join(row)
        return res

