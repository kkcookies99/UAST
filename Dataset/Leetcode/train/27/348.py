 class Solution(object):
    def XXX(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        while nums.count(val)>0:
            nums.remove(val)
        return len(nums)

