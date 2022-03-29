class Solution:
    def XXX(self, nums: List[int]) -> bool:
        ans=[]
        def dfs(nums,i,ans):
            if nums[i]+i>=len(nums)-1:
                ans.append(1)                 
                return True            
            if nums[i]==0 and i!=len(nums)-1:                 
                return               
            for j in range(1,nums[i]+1):                 
                dfs(nums,i+j,ans)
             
        dfs(nums,0,ans)

        
        return bool(ans)

