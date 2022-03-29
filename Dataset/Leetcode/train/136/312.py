 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        single = 0
        for i in range(len(nums)):
            single ^= nums[i]
        return single

