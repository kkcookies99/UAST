 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if target > nums[-1]:
            return len(nums)
        if target < nums[0]:
            return 0
        if nums[0] <= target <= nums[-1]:
            for i in range(len(nums)):
                if nums[i] == target:
                    return i
                elif nums[i] < target < nums[i+1]:
                    return i+1   

