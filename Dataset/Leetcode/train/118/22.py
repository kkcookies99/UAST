 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        row = numRows

        ans = []
        for a in range(1,row+1):
            ans.append([1]*a)
        
        for i in range(2,row):
            for j in range(1,i):
                ans[i][j] = ans[i-1][j-1] + ans[i-1][j]
        
        return ans

