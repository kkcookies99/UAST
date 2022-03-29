 class Solution(object):
    def XXX(self, nums, val):
        i=0
        while i <len(nums):
            if nums[i] ==val:
                nums.remove(nums[i])
                i-=1      
            i+=1
        return len(nums)

