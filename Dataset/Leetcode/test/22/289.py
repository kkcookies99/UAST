 class Solution:
    def XXX(self, n: int) -> List[str]:
        def dfs(combination,x,y):#x是左括号数，y是右括号数
            if len(combination) == n*2 and x==y:
                res.append(combination)
            else:
                if x<n:
                    dfs(combination+'(',x+1,y)
                if x>y:
                    dfs(combination+')',x,y+1)
                
        res = []
        dfs('',0,0)
        return res


