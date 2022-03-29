 class Solution(object):
    def singleNumber(self, nums):
        for i in nums:
            if nums.count(i) == 1:
                return i
