 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows == 0:
            return []

        ans = []
        for l in range(numRows):
            if l < 2:
                ans.append([1] * (l + 1))
            else:
                level = []
                for i in range(l + 1):
                    if i == 0 or i == l:
                        level.append(1)
                    else:
                        level.append(ans[l - 1][i - 1] + ans[l - 1][i])
                ans.append(level)

        return ans

