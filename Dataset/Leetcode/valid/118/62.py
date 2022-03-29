 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        ans = []
        # 遍历每一层
        for i in range(1,numRows+1):
            tmp_lis = []
            # 遍历一层中的每一个元素
            for j in range(i):
                if j == 0 or j == i-1:
                    tmp_lis.append(1)
                else:
                    tmp_lis.append(ans[i-2][j-1] + ans[i-2][j])
            ans.append(tmp_lis)
        return ans

