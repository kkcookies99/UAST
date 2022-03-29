 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        row = []
        tri = []
        for i in range(numRows):
            for j in range(i-1,0,-1):
                row[j] += row[j-1]
            row.append(1)
            tri.append(row[:])
        return tri

