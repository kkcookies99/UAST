 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans = [[1]]
        i = 0
        while i + 1 < numRows:
            length = len(ans[i])
            j = 0
            newRow = []
            while j + 1 < length:
                newRow.append(ans[i][j] + ans[i][j + 1])
                j += 1
            newRow.insert(0, 1)
            newRow.append(1)
            ans.append(newRow)
            i += 1
        return ans

