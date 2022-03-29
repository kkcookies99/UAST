 class Solution:
    def XXX(self, n: int) -> List[str]:
        ans=[]
        
        def dfs(s,L,R):
            if L<R or L>n or R>n:#保证左括号>=右括号，并且不超过n
                return
            if L==n and R==n:
                ans.append(str(s))
                return
            #左括号
            dfs(s+"(",L+1,R)
            #右括号
            dfs(s+")",L,R+1)
        
        dfs("",0,0)
        return ans

