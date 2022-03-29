 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        i = 0
        dic = {}
        for item in nums:
            if target - item in dic:
                return [i, dic[target-item]]
            dic[item] = i
            i += 1

