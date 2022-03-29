 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        res = []
        pre = []
        for i in range(numRows):
            now = pre + [1]
            if i >= 2:
                for j in range(1, i):
                    now[j] = pre[j] + pre[j-1]
            pre = now
            res.append(now)
        return res


