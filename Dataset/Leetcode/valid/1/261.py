 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # 暴力枚举
        result = []
        for i in range(len(nums)):
             for j in range(i + 1, len(nums)):
                 if nums[j] == target - nums[i]:
                     result.append(i)
                     result.append(j)
                     return result

