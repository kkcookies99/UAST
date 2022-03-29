 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if target in nums:
            return nums.index(target)
        for index, value in enumerate(nums):
            if value > target:
                return index
        return len(nums)

