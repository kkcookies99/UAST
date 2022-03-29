 class Solution:
    def XXX(self, nums: List[int]) -> int:
        length = len(nums)
        dp = [0] * length
        dp[0] = nums[0]
        for i in range(1, length):
            dp[i]= max(nums[i], dp[i-1]+nums[i])
        return max(dp)

