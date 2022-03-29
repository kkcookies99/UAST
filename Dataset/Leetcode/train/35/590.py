 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        left, right = 0, len(nums) -1
        while left < right:
            mid = left + (right - left) // 2
            if target == nums[mid]:
                return mid
            if target < nums[mid]:
                right = mid
            else:
                left = mid + 1
        if nums[left] >= target:
            return left
        else:
            return left + 1
       ```

