 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        a = {}
        for i, num in enumerate(nums):
            if target - num in a:
                return [a[target-num], i]
            else:
                a[num] = i

