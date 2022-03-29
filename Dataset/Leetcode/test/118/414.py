 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        def fun(n):
            v = [1] * n
            if n > 2:
                for i in range(1, n-1):
                    v[i] = fun(n-1)[i-1] + fun(n-1)[i]
            return v
        ans = []
        for i in range(1, numRows + 1):
            ans.append(fun(i))
        return ans

