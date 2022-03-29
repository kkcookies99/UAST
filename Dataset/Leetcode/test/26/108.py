 class Solution(object):
    def XXX(self, nums):
        for i in range(len(nums)-2,-1,-1):
            if nums[i]==nums[i+1]:
                nums.pop(i) 
        return len(nums)

