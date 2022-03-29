class Solution:
    def XXX(self, nums: List[int]) -> int:
        if len(nums)==1:
            return nums[0]
        dp=[0 for _ in range(len(nums))]
        dp[0]=nums[0]
        res=min(nums)
        for i in range(len(nums)):
            a=nums[i]+dp[i-1]
            b=nums[i]
            dp[i]=max(a,b)
            res=max(dp[i],res)
        return res

