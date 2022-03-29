 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        target = 0
        for a in nums:
            target ^= a
        return target

