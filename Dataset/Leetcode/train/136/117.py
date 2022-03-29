 class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        while len(nums) > 0:
            temp = nums[0]
            nums.remove(temp)
            if temp in nums:
                nums.remove(temp)
            else:
                return temp

