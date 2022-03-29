 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        
        res = [[0]*i for i in range(1, numRows+1)]
    
        for i in range(numRows):
            res[i][0], res[i][-1] = 1, 1
            j,  pre= 1, 0
            
            while j<i:
                
                res[i][j] = res[i-1][pre] + res[i-1][pre+1]
                j, pre = j+1, pre+1
                
        return res

