 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        right = len(nums) - 1
        for i in range(right - 1, -1, -1):
            if nums[i] + i >= right:
                right = i
        return right == 0

