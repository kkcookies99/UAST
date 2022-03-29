 class Solution:
    def XXX(self, n: int) -> List[str]:
        ans = list()
        path = list()
        def dfs(cur, a):
            if cur == 2*n:
                if a == n: ans.append("".join(path))
                return
     
            for i in range(2):
                if 2*a >= cur:
                    if i == 0:
                        path.append('(')
                        dfs(cur + 1, a + 1)
                    else:
                        path.append(')')
                        dfs(cur + 1, a)
                    path.pop()
            
        
        dfs(0, 0)
        return ans




