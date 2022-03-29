 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans = [[1]]
        for i in range(1,numRows):
            tmp = list()
            for j in range(i+1):
                if j==0:
                    tmp.append(ans[i-1][0])
                elif j==i:
                    tmp.append(ans[i-1][-1])
                elif i>1:
                        a = ans[i-1][j-1]
                        if j+1>i-1:
                            b = ans[i-1][-1]
                        else:
                            b = ans[i-1][j]
                        tmp.append(a+b)
            ans.append(tmp)
        return ans 

