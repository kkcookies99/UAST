 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans = list()
        temp_ans = list()

        for i in range (1, numRows + 1):
            temp_ans.clear()
            if i == 1:
                ans.append([1])
                continue
            if i == 2:
                ans.append([1,1])
                continue
            else:
                for k in range(i - 2):
                    temp_ans.append(ans[i - 2][k] + ans[i - 2][k + 1])
                temp_ans.insert(0, 1)
                temp_ans.append(1)
                ans.append(temp_ans.copy())
                
        return ans

