 class Solution:
    def XXX(self,nums,target):
        for i in range(len(nums)):
            for j in range(len(nums)):
                if nums[i]+nums[j]==target and i != j:
                    return [i,j]

