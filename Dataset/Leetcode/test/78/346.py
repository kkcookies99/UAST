class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def dfs(nums,index,ans,cur=[]):
            ans.append(cur)
            for i in range(index,len(nums)):# 剪枝后树的大小有限
                dfs(nums,i+1,ans,cur+[nums[i]])
        ans = []
        dfs(nums,0,ans)
        return ans

