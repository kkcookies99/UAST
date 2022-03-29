 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans = [[1]]
        for i in range(1,numRows):
            res = [1]
            for i in range(len(ans[-1]) - 1):
                res.append(ans[-1][i] + ans[-1][i + 1])
            res.append(1)
            ans.append(res)
        return ans

