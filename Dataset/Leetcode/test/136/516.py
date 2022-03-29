 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        a = itertools.accumulate(nums,lambda t,x:t^x)
        return list(a)[-1]

