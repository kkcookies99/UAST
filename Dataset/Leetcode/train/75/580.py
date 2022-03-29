 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left, cur, right = 0, 0, len(nums) - 1
        while cur <= right:
            if nums[cur] > 1:
                nums[cur], nums[right] = nums[right], nums[cur]
                right -= 1
            elif nums[cur] < 1:
                nums[cur], nums[left] = nums[left], nums[cur]
                left, cur = left + 1, cur + 1
            else:
                cur += 1

