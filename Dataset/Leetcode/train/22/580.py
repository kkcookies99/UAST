 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n == 0: return []
        res = []
        def backtrack(l, r, tmp):
            if r < l:
                return 
            if l < 0 or r < 0:
                return
            if l == 0 and r == 0:
                res.append(''.join(tmp))
            tmp.append('(')  
            backtrack(l - 1, r, tmp)
            tmp.pop()

            tmp.append(')')
            backtrack(l, r - 1, tmp)
            tmp.pop()

        backtrack(n, n, [])
        return res

