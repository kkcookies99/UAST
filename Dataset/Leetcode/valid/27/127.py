 class Solution(object):
    def XXX(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        #方法一
        i = 0
        while i<len(nums):
            if nums[i] == val:
                nums.pop(i)
            else:
                i+=1
        return len(nums) 

