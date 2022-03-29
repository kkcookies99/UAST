 class Solution(object):
    def singleNumber(self, nums):
        return sum(set(nums))*2-sum(nums)

