 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n=len(nums)
        dp=[0]*n
        dp[0]=True
        for i in range(1,n):
            j=1
            while i-j>=0:
                dp[i]=dp[i-j] and nums[i-j]>=j
                j+=1
                if dp[i]:
                    break
        return dp[-1]


