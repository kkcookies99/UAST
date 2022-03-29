 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows==1:
            return s
        index=list(range(numRows))
        index=index[:-1]+index[-1:0:-1]
        rs=[[] for _ in range(numRows)]
        for i,c in enumerate(s):
            rs[index[i%len(index)]].append(c)
        return ''.join([''.join(r) for r in rs])

