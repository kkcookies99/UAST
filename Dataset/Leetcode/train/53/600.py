 class Solution:
    def XXX(self, nums):
        dp = [0] * len(nums)
        dp[0] = nums[0]

        for i in range(1, len(nums)):
            if nums[i] + dp[i-1] > nums[i]:   # 如果加入前面的序列会比自身大， 那就加入， 如果加入之后比自身还小了， 就从自己开始
                dp[i] = nums[i] + dp[i-1]

            else:
                dp[i] = nums[i]

        return max(dp)

