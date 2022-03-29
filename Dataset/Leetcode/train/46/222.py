class Solution(object):
    def XXX(self, nums):
        ans = []
        n = len(nums)
        def getXXX(i,x,nums):
            if i==n:
                ans.append(x)
                return
            for j,num in enumerate(nums):
                getXXX(i+1,x+[num],nums[:j]+nums[j+1:])
        getXXX(0,[],nums)
        return ans

