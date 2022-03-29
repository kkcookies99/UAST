 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        lo, hi = 0, len(nums)-1
        while lo < hi:
            mi = (lo + hi)//2
            if nums[mi] < target:
                lo = mi + 1
            else:
                hi = mi
        if nums[lo] < target:
            return lo + 1
        return lo

