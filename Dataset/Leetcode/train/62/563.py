class Solution:
    def XXX(self, m: int, n: int) -> int:
        @functools.lru_cache()
        def dfs(x,y) : 
            if (x,y) == (m-1,n-1) :
                return 1
            elif x>=m or y>=n :
                return 0 
            else :
                return dfs(x+1,y) + dfs(x,y+1)
        
        return dfs(0,0) 

