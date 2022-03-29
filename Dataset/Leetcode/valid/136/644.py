 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        return functools.reduce(int.__xor__,nums)

