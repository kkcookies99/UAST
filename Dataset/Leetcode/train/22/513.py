 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []
        def fun(n, l, r, tmp):
            if l > n or r > n or r > l:
                return
            if l == n and r == n:
                res.append(tmp)
                return
            fun(n, l+1, r, tmp + "(")
            fun(n, l, r+1, tmp + ")")
        fun(n, 0, 0, "")
        return res


