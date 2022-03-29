 class Solution:
    def XXX(self, nums: List[int]) -> int:
        # dp[i] 表示以 i 结尾的最大和连续子数组的和
        dp = [0 for _ in nums]
        dp[0] = nums[0]
        for i in range(1, len(nums)):
            dp[i] = nums[i] + max(0, dp[i-1])
        return max(dp)

