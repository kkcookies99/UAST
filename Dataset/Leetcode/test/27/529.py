 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        if len(nums) == 0:
            return 0
        left = right = s = 0
        for i in range(len(nums)):
            if nums[right] != val:
                nums[left],nums[right] = nums[right],nums[left]
                left += 1
            right += 1
        return left

