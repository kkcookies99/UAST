 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows <= 1: return s
        l = [[] for i in range(numRows)]
        cutter = numRows * 2 - 2
        for ind, T in enumerate(s):
            l[ind % cutter if ind % cutter < numRows else numRows - 2 - ind % cutter % numRows].append(T)
        return "".join(["".join(i) for i in l])

