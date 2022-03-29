 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        num1=set(nums)
        return 2*sum(num1)-sum(nums)

