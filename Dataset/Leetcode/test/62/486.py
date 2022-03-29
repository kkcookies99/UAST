class Solution:
    def XXX(self, m: int, n: int) -> int:
        def dfs(i,j,ans,res):
//中止条件
            if i>=m or j>=n:
                return;
            if i==m-1 and j==n-1:
                res.append(ans)
                return 
//递归调用
            dfs(i+1,j,ans,res)
            ans.append([i+1,j])
            dfs(i,j+1,ans,res)
            ans.pop()
            ans.append([i,j+1])
        ans=[]
        res=[]
        dfs(0,0,ans,res)
        return len(res)



