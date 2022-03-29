 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dict={}
        for i in range(len(nums)):
            dict[nums[i]]=i
        for j in range(len(nums)):
            if (target-nums[j] in dict) and (dict[target-nums[j]]!=j) :
                return [j,dict[target-nums[j]]]

