 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ## 解法一 利用set的唯一性
        return sum(set(nums)) * 2 - sum(nums)

