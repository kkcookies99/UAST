class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n=len(nums)
        res=[]
        if n==0:    return res
        path=[]
        used=[False]*n
        def dfs(nums,len,depth,path,used,res):
            if depth==len:
                res.append(path[:])
                return
            for i in range(len):
                if used[i]==True:   continue
                path.append(nums[i])
                used[i]=True
                dfs(nums,len,depth+1,path,used,res)
                used[i]=False
                path.pop()
        dfs(nums,n,0,path,used,res)
        return res

