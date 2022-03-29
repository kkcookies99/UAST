 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        a=set(nums)
        S1=sum(a)
        S2=sum(nums)
        return 2*S1-S2

