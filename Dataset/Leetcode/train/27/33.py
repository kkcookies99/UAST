 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        left = 0
        right = 0
        while right<len(nums):
            if nums[right] != val:
                nums[left],nums[right] = nums[right],nums[left]
                left+=1
            right+=1
        return left

