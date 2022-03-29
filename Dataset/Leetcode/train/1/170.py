 class Solution:
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        n = len(nums)
        lookup = {}
        for i in range(n):
            tmp = target - nums[i]
            if tmp in lookup:
                return [lookup[tmp], i]
            lookup[nums[i]] = i

