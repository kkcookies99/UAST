 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans = [[1]]
        for i in range(1, numRows):
            lst = [0 for _ in range(i+1)]
            lst[0], lst[-1] = 1, 1
            for j in range(1,i):  
                lst[j] = ans[i-1][j-1] + ans[i-1][j]
            ans.append(lst)
        return ans


