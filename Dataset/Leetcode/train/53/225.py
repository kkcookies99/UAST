class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        max_b = [nums[0]]
        for j in range(1, len(nums)):
            max_b.append(max(max_b[j-1]+nums[j], nums[j]))
        max_b.sort()
        return max_b[-1]

