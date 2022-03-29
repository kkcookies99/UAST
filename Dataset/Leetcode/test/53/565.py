 class Solution:
    def XXX(self, nums: List[int]) -> int:
        n = len(nums)
        # dp[i] = 以 nums[i] 为结尾时的最大连续子数组
        dp = [0] * n
        dp[0] = nums[0]
        res = dp[0]

        for i in range(1, n):
            # nums[i] 自成一派或者或者与前面结合，取最大值
            dp[i] = max(nums[i], nums[i] + dp[i - 1])
            # 整个数组的最大连续子数组，就是 dp[0...n - 1] 取最大值
            res = max(res, dp[i])
        
        return res

