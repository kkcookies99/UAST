 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows == 1:
            return [[1]]
        
        ans = [[1],[1,1]]
        for i in range(2,numRows):
            tmp = [1]*(i+1)
            for j in range(1,i):
                tmp[j] = ans[i-1][j-1]+ans[i-1][j]
            ans.append(tmp)
        return ans

