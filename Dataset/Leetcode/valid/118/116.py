 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        # 动态规划方法
        ans = []
        for rowId in range(numRows):
            # 先为当前行生成空列表并将首尾设为1
            row = [None for _ in range(rowId+1)] 
            row[0], row[-1] = 1, 1
            # 再利用动态规划基于上一行生成当前行
            for i in range(1, len(row)-1):
                row[i] = ans[rowId-1][i-1] + ans[rowId-1][i]
            ans.append(row)
        return ans

