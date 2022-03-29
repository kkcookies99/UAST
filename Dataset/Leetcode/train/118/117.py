 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        # 使用map的累加法
        if numRows < 1:
            return []
        ans = [[1]]
        for i in range(1,numRows):
            # print("map(x+y,", ans[-1]+[0],',', [0]+ans[-1], ')->', end='')
            ans += [list(map(lambda x, y:x+y, ans[-1]+[0], [0]+ans[-1]))] # map的后两个参数是匿名函数lambda的两个输入
            # print(ans[-1])
        return ans

