 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        if nums.count(target)!=0:
            return nums.index(target)
        elif target<nums[0]:
            return 0
        elif target>nums[-1]:
            return len(nums)
        else:
            return [[-1,1][each>target] for each in nums].index(1)

