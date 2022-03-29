 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        while left < right:
            pivot = left + (right-left)//2
            if nums[pivot] == target:
                return pivot
            elif nums[pivot] > target:
                if pivot == 0:
                    right = 0
                else:
                    right = pivot - 1
            else:
                left = pivot + 1
        if nums[right] < target:
            return right + 1
        else:
            return right

