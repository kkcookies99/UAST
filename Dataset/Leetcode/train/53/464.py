 class Solution:
    def XXX(self, nums: List[int]) -> int:
        n = len(nums)
        dp = [num for num in nums]
        maxl = dp[0]
        for i in range(1, n):
            dp[i] = max(dp[i], dp[i - 1] + nums[i])
            if dp[i] > maxl:
                maxl = dp[i]
        return maxl

