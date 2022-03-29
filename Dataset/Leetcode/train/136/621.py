 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums=sorted(nums)
        return [i for i in nums if nums.count(i)==1][0]

