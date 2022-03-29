 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        result = []
        d = dict()
        for i in range(len(nums)):
            complement = target - nums[i]
            if str(complement) in d and d.get(str(complement)) != i:
                result.append(d.get(str(complement)))
                result.append(i)
                return result
            else:
                d[str(nums[i])] = i

