 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if nums[0] > target:
            return 0
        elif nums[-1] < target:
            return len(nums)
        for i in range(len(nums)):
            if nums[i] == target:
                return i
            elif target > nums[i] and target < nums[i + 1]:
                return (i + 1)