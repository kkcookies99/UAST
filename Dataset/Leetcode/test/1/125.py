 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hasha = {}
        for i in range(len(nums)):
            temp = target - nums[i] #求差值，判断差值是否存在在字典中，若无则将差值保存在字典中
            if temp in hasha:
                return [hasha[temp], i]
            hasha[nums[i]] = i

