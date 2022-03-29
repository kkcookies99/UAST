 class Solution:
    def XXX(self, n: int) -> str:
        res = '1'
        for i in range(2, n + 1):
            cnt = 0
            cur = None
            tmp = []
            for c in res:
                if cur is None:
                    cur = c
                    cnt = 1
                elif cur == c:
                    cnt += 1
                else:
                    tmp.append(str(cnt))
                    tmp.append(cur)
                    cur = c
                    cnt = 1
            tmp.append(str(cnt))
            tmp.append(cur)
            res, tmp = ''.join(tmp), None
        return res

