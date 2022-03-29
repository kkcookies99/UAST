 class Solution:
    def XXX(self, nums: List[int]) -> int:
        n=len(nums)
        dp=[0]*n
        dp[0]=nums[0]
        for i in range(1,n):
            dp[i]=max(dp[i-1]+nums[i],nums[i])

        return max(dp)

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


