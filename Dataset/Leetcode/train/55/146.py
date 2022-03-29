class Solution:
    def XXX(self, nums: List[int]) -> bool:
        ## DP
#         dp = [0 for i in range(len(nums))]
#         for i in range(1, len(nums)):
#             dp[i] = max(dp[i-1], nums[i-1])-1
#             if(dp[i]<0):
#                 return False
#         return True
        
        reach = 0
        ## 贪心
        if(len(nums) == 1):
            return True
        for i in range(len(nums)-1):
            if(i > reach):
                return False
            reach = max(reach, nums[i]+i)
            if(reach >= len(nums)-1):
                return True
        return False

