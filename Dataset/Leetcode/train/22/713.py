 class Solution:
    def XXX(self, n: int) -> List[str]:

        def backtrace():
            lcnt = path.count('(')
            if len(path) == 2*n:
                if lcnt == n:
                    res.append(''.join(path))
                return
            if lcnt < len(path) - lcnt or lcnt > n:
                return
            for c in ['(', ')']:
                path.append(c)
                backtrace()
                path.pop()
        
        path = []
        res = []
        backtrace()
        return res
undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


