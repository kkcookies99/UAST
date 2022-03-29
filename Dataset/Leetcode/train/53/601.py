 class Solution:
    def XXX(self, nums: List[int]) -> int:
        # 先搞特殊情况
        if len(nums) == 1:
            return nums[0]
        
        # 一般情况
        dp = [0 for i in range(len(nums))]  # dp[i]表示以i结尾的最大子序列和
        dp[0] = nums[0]
        for i in range(1,len(nums)):
            dp[i] = max(dp[i-1]+nums[i], nums[i])
        return max(dp)

