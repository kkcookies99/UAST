class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n = len(nums)
        dp = [0]*n
        dp[0] = 1
        for i in range(n):
            if dp[i] == 1:
                if i+nums[i] >= n-1:
                    return True
                else:
                    dp[i+1:i+nums[i]+1] = [1]*nums[i]
            else:
                return False
        
        return dp[n-1] == 1