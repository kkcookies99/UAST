 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []
        temp = []
        def go(temp, i, step):
            if len(temp) == 2*n and i == 0:
                s = ''.join(temp)
                if s not in res:
                    res.append(s)
            if step <= 2*n:
                if i == 0:
                    go(temp+['('],i+1,step+1)
                elif i < n:
                    go(temp+['('],i+1,step+1)
                    go(temp+[')'],i-1,step+1)
                elif i == n:
                    go(temp+[')'],i-1,step+1)
        go(temp,0,1)
        return res

