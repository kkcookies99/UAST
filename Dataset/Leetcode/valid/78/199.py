class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans=[]
        
        def dfs(lst,nums,pos):
            
            ans.append(lst[:])
            for i in range(pos,len(nums)):
                lst.append(nums[i])
                dfs(lst,nums,i+1)
                lst.pop()
        
        dfs([],nums,0)
        
        return ans

