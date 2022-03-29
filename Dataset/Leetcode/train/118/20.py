 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans, row = [], [1]
        for _ in range(numRows):
            ans.append(row)
            row = [*map(sum, zip([0] + row, row + [0]))]
        return ans

