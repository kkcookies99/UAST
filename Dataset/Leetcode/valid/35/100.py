 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if not nums:
            return 0
        left = 0
        right = len(nums) - 1
        while left <= right:
            mid = left + (right - left) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] < target:
                left = mid + 1
            else:
                right = mid - 1
        return left

