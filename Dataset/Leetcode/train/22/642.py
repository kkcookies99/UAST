 class Solution:
    def XXX(self, n: int) -> List[str]:
        def dfs(i,count):
            if i == 2*n:
                res.append(''.join(tmp))
                return
            if count < n:
                tmp.append('(')
                dfs(i+1,count+1)
                tmp.pop()
            if count > i - count:
                tmp.append(')')
                dfs(i+1,count)
                tmp.pop()
        tmp = []
        res = []
        dfs(0,0)
        return res

