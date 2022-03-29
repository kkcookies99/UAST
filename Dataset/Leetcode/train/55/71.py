class Solution:
    def XXX(self, nums: List[int]) -> bool:
        dp = [False] * len(nums)
        dp[0] = True
        for i in range(1, len(nums)):
            dp[i] = dp[i - 1] and nums[i - 1] > 0
            nums[i] = max(nums[i], nums[i - 1] - 1)
        return dp[-1]