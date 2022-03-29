class Solution:
    def XXX(self, nums):
        n=len(nums)
        dp=[False]*n
        dp[-1]=True #最后一项已经到达了，初始化为True
        temp=n-1   
        for i in range(n-2,-1,-1):  #从后往前遍历
            if dp[temp] and nums[i] >= temp-i:
                dp[i]=True
                temp=i
        return dp[0]

