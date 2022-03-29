 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if target in nums:
            return nums.index(target)
        n = len(nums)
        l = 0
        if nums[n-1] < target: return n
        if nums[0] > target: return 0
        for i in range(n):
            if nums[i] < target and nums[i+1] > target:
                return i+1

