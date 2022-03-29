 class Solution(object):
    def XXX(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """

        while val in nums:
            nums.remove(val)
        
        return len(nums)

