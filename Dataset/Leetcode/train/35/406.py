 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        n = len(nums)
        for i,v in enumerate(nums):
            if v >= target:
                return i 
            elif i == n-1:
                return n

