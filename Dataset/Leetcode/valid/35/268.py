 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
    
        if target in nums:
            return nums.index(target)
        elif target not in nums:
            if target > nums[len(nums)-1]:
                return len(nums)
            else:
                for i in range(len(nums)):
                    if target <= nums[i]:
                        return i
            

