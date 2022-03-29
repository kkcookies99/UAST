 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        d = dict()
        length = len(nums)
        for i,v in enumerate(nums):
            to_add = target - v
            if v in d:
                return [d[v], i]
            else:
                d[to_add] = i
            
        return None


