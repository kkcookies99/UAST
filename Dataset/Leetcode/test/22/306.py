 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []
        def dp(i,j,res,st):
            if i<0 or j<0 or i > j:return #剪枝条件
            if i ==0 and j==0:
                res.append(st)
            dp(i-1,j,res,st+'(')
            dp(i,j-1,res,st+')')
            
        dp(n,n,res,'')
        return res

