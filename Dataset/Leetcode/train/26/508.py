 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums:
            i = 0
            for num in nums[i:]:
                if num != nums[i]:
                    i += 1
                    nums[i] = num
            return i+1
        return 0

