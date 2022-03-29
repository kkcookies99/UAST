 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        r = []
        if numRows == 0:
            return r
        r = [[1]]
        if numRows == 1:
            return r
        def next(t):
            r  = [0] + t
            for i in range(len(t)):
                r[i] += t[i]
            return r
        while numRows > 1:
            r.append(next(r[-1]))
            numRows -= 1
        return r

