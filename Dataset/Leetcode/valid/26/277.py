 class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums[:]=sorted(list(set(nums)))
        return len(nums)

