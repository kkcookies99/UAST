 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if min(nums) > target:
            return 0
        if max(nums) < target:
            return len(nums)

        left, right = 0, len(nums) - 1
        while left <= right:
            mid = int((left + right) / 2)
            if nums[mid] == target:
                return mid
            if target > nums[mid]:
                left = mid + 1
            if target < nums[mid]:
                right = mid - 1
        return left

