 class Solution:
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(len(nums) - 1):
            for j in range(len(nums) - i -1):
                if nums[i] + nums[i + j + 1] == target:
                    return [i, i + j + 1]
        return []

