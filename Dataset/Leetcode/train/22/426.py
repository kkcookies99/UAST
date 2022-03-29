 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n == 1:
            return ["()"]
        res = ["()"]
        def func():
            re = []
            for j in range(len(res)):
                m = len(res[j])
                for k in range(m):
                    re.append(res[j][0:k]+"()"+res[j][k:m])
            return re
        for i in range(2,n+1):
            # 用set()进行去重
            res = set(func())
            res = list(res)
        return res

