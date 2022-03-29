 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        d = {}
        for i in range(0,len(nums)):
            if d.get(target - nums[i]) != None:
                return [d.get(target - nums[i]), i]
            d[nums[i]] = i

