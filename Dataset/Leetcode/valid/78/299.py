class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = [[]]
        for item in nums:
            for tmp in result[:]:
                result.append(tmp + [item])
        return result

