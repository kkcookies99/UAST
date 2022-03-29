 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        return [[math.comb(i, j) for j in range(i + 1)] for i in range(numRows)]

