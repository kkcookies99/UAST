 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans = []

        for i in range(1, numRows+1):
            if i == 1:
                ans.append([1])
            elif i == 2:
                ans.append([1, 1])
            else:
                vec = []
                for j in range(i):
                    if j == 0 or j == i-1:
                        vec.append(1)
                    else:
                        vec.append(ans[i-2][j] + ans[i-2][j-1])
                
                ans.append(vec)

        return ans

