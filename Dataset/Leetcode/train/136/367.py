 class Solution(object):
    def singleNumber(self, nums):
        if not nums:
            return 
        res = nums[0]
        for num in nums[1:]:
            res ^= num
        return res

