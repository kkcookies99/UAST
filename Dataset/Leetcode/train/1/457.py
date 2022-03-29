 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        d = {}
        
        for i in range(len(nums)):
            left = target - nums[i]
            if left in d:
                return [d[left], i]
            d[nums[i]] = i

        return None

