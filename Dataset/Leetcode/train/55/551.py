 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n=len(nums)
        vis=[0 for _ in range(n)]
        for i in range(min(nums[0]+1,n)):
            vis[i]=1
        for i in range(1,n-1):
            if vis[i]:    #此位置可以达到
                if i+nums[i]>=n-1:
                    return True
                for j in range(nums[i-1],nums[i]+1):
                    if vis[i+j]==0:
                        vis[i+j]=1
        if vis[-1]==1:
            return True
        else:
            return False

