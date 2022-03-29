class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n = len(nums)
        dp = [False] * n
        dp[0] = True

        for i in range(n):
            if dp[i] == True:
                if i + nums[i] >= n - 1:
                    dp[-1] = True
                    break
                for j in range(i + nums[i], i, -1):
                    if dp[j] == True:
                        break
                    dp[j] = True

        return dp[-1]

