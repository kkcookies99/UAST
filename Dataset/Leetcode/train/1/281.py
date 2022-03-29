 class Solution:
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        d = dict()
        length = len(nums)
        for i in range(length):
            to_add = target - nums[i]
            if nums[i] in d:
                return [d[nums[i]], i]
            else:
                d[to_add] = i
        return None

