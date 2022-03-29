 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans = [[1],[1,1]] 
        if numRows<=2:
            return ans[:numRows] 
        for i in range(2,numRows):
            tmplist = [1]
            for j in range(len(ans[-1])-1):
                tmplist.append(ans[-1][j]+ans[-1][j+1]) 
            tmplist.append(1) 
            ans.append(tmplist) 
        return ans 

