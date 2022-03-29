 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans = []
        for i in range(1, numRows+1):
            ans.append([1]*i)
            for j in range(1,i-1):
                ans[-1][j] = ans[-2][j] + ans[-2][j-1]
        return ans

