 class Solution:
    def XXX(self, nums, target):
        nums2=[]
        for i,v in enumerate(nums):
            u=target-v
            nums2=nums[:]
            nums2[i]=None
            if u in nums2:
                return [i,nums2.index(u)]
        return None

