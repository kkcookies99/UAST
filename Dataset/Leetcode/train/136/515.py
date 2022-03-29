 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        a=0
        for num in nums:
            a^=num
        return a

